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
package org.hisp.dhis.integration.aefi.config;

import static org.springframework.http.HttpStatus.Series.CLIENT_ERROR;
import static org.springframework.http.HttpStatus.Series.SERVER_ERROR;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.Marshaller;

import org.hisp.dhis.integration.aefi.config.properties.Dhis2Properties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.converter.xml.MarshallingHttpMessageConverter;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableCaching
@EnableConfigurationProperties
public class MainConfiguration
{
    private final Dhis2Properties dhis2Properties;

    public MainConfiguration( Dhis2Properties dhis2Properties )
    {
        this.dhis2Properties = dhis2Properties;
    }

    @Bean
    public MarshallingHttpMessageConverter marshallingMessageConverter()
    {
        MarshallingHttpMessageConverter messageConverter = new MarshallingHttpMessageConverter();
        messageConverter.setMarshaller( jaxb2Marshaller() );
        messageConverter.setUnmarshaller( jaxb2Marshaller() );

        return messageConverter;
    }

    @Bean
    public Jaxb2Marshaller jaxb2Marshaller()
    {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan( "org.hisp.dhis.integration.aefi.domain.icsr21" );
        marshaller.setSupportDtd( true );

        Map<String, Object> properties = new HashMap<>();
        properties.put( Marshaller.JAXB_FORMATTED_OUTPUT, true );
        properties.put( Marshaller.JAXB_FRAGMENT, true );
        properties.put( "com.sun.xml.bind.xmlHeaders",
            "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>" +
                "\n<!DOCTYPE ichicsr SYSTEM \"http://eudravigilance.ema.europa.eu/dtd/icsr21xml.dtd\">" );

        marshaller.setMarshallerProperties( properties );

        return marshaller;
    }

    @Bean
    public RestTemplate restTemplate()
    {
        // TODO replace with WebClient (RestTemplate will be deprecated)
        return new RestTemplateBuilder().defaultMessageConverters()
            .defaultHeader( "Content-Type", MediaType.APPLICATION_JSON_VALUE )
            .defaultHeader( "Accept", MediaType.APPLICATION_JSON_VALUE )
            .errorHandler( new RestTemplateResponseErrorHandler() )
            .basicAuthentication( dhis2Properties.getUsername(),
                dhis2Properties.getPassword(), StandardCharsets.UTF_8 )
            .build();
    }
}

class RestTemplateResponseErrorHandler implements ResponseErrorHandler
{
    @Override
    public boolean hasError( ClientHttpResponse httpResponse )
        throws IOException
    {
        return (httpResponse.getStatusCode().series() == CLIENT_ERROR
            || httpResponse.getStatusCode().series() == SERVER_ERROR);
    }

    @Override
    public void handleError( ClientHttpResponse httpResponse )
        throws IOException
    {
        if ( httpResponse.getStatusCode()
            .series() == HttpStatus.Series.SERVER_ERROR )
        {
            throw new HttpClientErrorException( HttpStatus.BAD_GATEWAY );
        }
        else if ( httpResponse.getStatusCode()
            .series() == HttpStatus.Series.CLIENT_ERROR )
        {
            if ( httpResponse.getStatusCode() == HttpStatus.NOT_FOUND )
            {
                throw new HttpClientErrorException( HttpStatus.NOT_FOUND );
            }
        }
    }
}