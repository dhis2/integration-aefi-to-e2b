/*
 * Copyright (c) 2004-2022, University of Oslo
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 * Neither the name of the HISP project nor the names of its contributors may
 * be used to endorse or promote products derived from this software without
 * specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.hisp.dhis.integration.aefi.service;

import static org.springframework.util.StringUtils.hasText;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.List;
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import org.hisp.dhis.integration.aefi.Main;
import org.hisp.dhis.integration.aefi.config.properties.MailProperties;
import org.hisp.dhis.integration.aefi.domain.icsr21.Ichicsr;
import org.hisp.dhis.integration.aefi.domain.tracker.TrackedEntities;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.MediaType;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MailService
{
    private final MailProperties mailProperties;

    private final JavaMailSender mailSender;

    private final TrackerService trackerService;

    private final Jaxb2Marshaller jaxb2Marshaller;

    private final AefiService aefiService;

    @Scheduled( cron = "${aefi-to-e2b.mail.schedule}" )
    void sendMail()
    {
        if ( !mailProperties.isActive() || !hasText( mailProperties.getTo() ) || !hasText( mailProperties.getFrom() ) )
        {
            return;
        }

        LocalDate lastUpdated = getLastUpdated();

        TrackerSearchParams params = TrackerSearchParams.of( List.of(), lastUpdated );
        TrackedEntities trackedEntities = trackerService.search( params );

        if ( trackedEntities.getTrackedEntities().isEmpty() )
        {
            return;
        }

        try
        {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper messageHelper = new MimeMessageHelper( message, true );
            messageHelper.setTo( mailProperties.getTo() );
            messageHelper.setFrom( mailProperties.getFrom() );

            messageHelper.setSubject( "Latest AEFI updates." );
            messageHelper.setText(
                "Got " + trackedEntities.getTrackedEntities().size() + " new AEFI cases since " + lastUpdated + "." );

            String xmlAttachment = getAsXml( aefiService.getFromTrackedEntities( trackedEntities ) );
            messageHelper.addAttachment( "aefi-cases.xml",
                new ByteArrayResource( xmlAttachment.getBytes( StandardCharsets.UTF_8 ) ),
                MediaType.APPLICATION_XML_VALUE );

            mailSender.send( message );
            setLastUpdated( LocalDate.now() );

            log.info( "Mail with new cases successfully sent to '" + mailProperties.getTo() + "'." );
        }
        catch ( MessagingException ex )
        {
            log.error( "Message creation error: " + ex.getMessage() );
        }
        catch ( MailException ex )
        {
            log.error( "Mail sending error: " + ex.getMessage() );
        }
    }

    @SneakyThrows
    private LocalDate getLastUpdated()
    {
        Properties properties = new Properties();
        properties.load( new FileInputStream( Main.PROPERTY_FILENAME ) );
        return LocalDate.parse( properties.get( Main.PROPERTY_MAIL_LAST_UPDATED ).toString() );
    }

    @SneakyThrows
    private void setLastUpdated( LocalDate lastUpdated )
    {
        Properties properties = new Properties();
        properties.load( new FileInputStream( Main.PROPERTY_FILENAME ) );
        properties.put( Main.PROPERTY_MAIL_LAST_UPDATED, lastUpdated.toString() );
        properties.store( new FileOutputStream( Main.PROPERTY_FILENAME ), null );
    }

    private String getAsXml( Ichicsr ichicsr )
    {
        StringWriter sw = new StringWriter();
        Result result = new StreamResult( sw );
        jaxb2Marshaller.marshal( ichicsr, result );

        return sw.toString();
    }
}
