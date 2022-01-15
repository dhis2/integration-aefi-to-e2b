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
package org.hisp.dhis.integration.aefi.common;

import lombok.Data;
import org.hisp.dhis.integration.aefi.domain.icsr21.Ichicsr;
import org.hisp.dhis.integration.aefi.domain.icsr21.Ichicsrmessageheader;
import org.hisp.dhis.integration.aefi.domain.icsr21.Messagedate;
import org.hisp.dhis.integration.aefi.domain.icsr21.Messagedateformat;
import org.hisp.dhis.integration.aefi.domain.icsr21.Messageformatrelease;
import org.hisp.dhis.integration.aefi.domain.icsr21.Messageformatversion;
import org.hisp.dhis.integration.aefi.domain.icsr21.Messagenumb;
import org.hisp.dhis.integration.aefi.domain.icsr21.Messagereceiveridentifier;
import org.hisp.dhis.integration.aefi.domain.icsr21.Messagesenderidentifier;
import org.hisp.dhis.integration.aefi.domain.icsr21.Messagetype;
import org.hisp.dhis.integration.aefi.domain.icsr21.Safetyreport;
import org.hisp.dhis.integration.aefi.domain.icsr21.Safetyreportversion;
import org.hisp.dhis.integration.aefi.domain.tracker.DataValue;
import org.hisp.dhis.integration.aefi.domain.tracker.Enrollment;
import org.hisp.dhis.integration.aefi.domain.tracker.Event;
import org.hisp.dhis.integration.aefi.domain.tracker.TrackedEntityAttribute;
import org.hisp.dhis.integration.aefi.domain.tracker.TrackedEntityInstance;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public final class IchicsrUtils
{
    public static Ichicsr createIchicsr()
    {
        Ichicsr ichicsr = new Ichicsr();
        ichicsr.setLang( "en" );

        return ichicsr;
    }

    public static Ichicsrmessageheader createIchicsrmessageheader(
        String messageNumber,
        String senderId,
        String receiverId )
    {
        Messagetype messagetype = new Messagetype();
        messagetype.setvalue( "ichicsr" );

        Messageformatversion messageformatversion = new Messageformatversion();
        messageformatversion.setvalue( "2.1" );

        Messageformatrelease messageformatrelease = new Messageformatrelease();
        messageformatrelease.setvalue( "2.0" );

        Messagenumb messagenumb = new Messagenumb();
        messagenumb.setvalue( messageNumber );

        Messagesenderidentifier messagesenderidentifier = new Messagesenderidentifier();
        messagesenderidentifier.setvalue( senderId );

        Messagereceiveridentifier messagereceiveridentifier = new Messagereceiveridentifier();
        messagereceiveridentifier.setvalue( receiverId );

        Messagedateformat messagedateformat = new Messagedateformat();
        messagedateformat.setvalue( "204" );

        Messagedate messagedate = new Messagedate();
        messagedate.setvalue( DateUtils.nowDateFormat204() );

        Ichicsrmessageheader ichicsrmessageheader = new Ichicsrmessageheader();
        ichicsrmessageheader.setMessagetype( messagetype );
        ichicsrmessageheader.setMessageformatversion( messageformatversion );
        ichicsrmessageheader.setMessageformatrelease( messageformatrelease );
        ichicsrmessageheader.setMessagenumb( messagenumb );
        ichicsrmessageheader.setMessagesenderidentifier( messagesenderidentifier );
        ichicsrmessageheader.setMessagereceiveridentifier( messagereceiveridentifier );
        ichicsrmessageheader.setMessagedateformat( messagedateformat );
        ichicsrmessageheader.setMessagedate( messagedate );

        return ichicsrmessageheader;
    }

    public static Safetyreport createSafetyreport( TrackedEntityInstance trackedEntityInstance )
    {
        MappedTrackedEntityInstance map = createMappedTrackedEntityInstance( trackedEntityInstance );
        System.err.println( map );

        Safetyreport safetyreport = new Safetyreport();

        Safetyreportversion safetyreportversion = new Safetyreportversion();
        safetyreportversion.setvalue( "1" );

        return safetyreport;
    }

    private static MappedTrackedEntityInstance createMappedTrackedEntityInstance( TrackedEntityInstance trackedEntityInstance )
    {
        MappedTrackedEntityInstance map = new MappedTrackedEntityInstance();

        for ( TrackedEntityAttribute attribute : trackedEntityInstance.getAttributes() )
        {
            map.getAttributes().put( attribute.getAttribute(), attribute.getValue() );
        }

        // TODO this does not really properly handle multiple AEFI enrollments (but that's not a concern right now)
        for ( Enrollment enrollment : trackedEntityInstance.getEnrollments() )
        {
            map.setEnrollmentDate( enrollment.getEnrollmentDate() );
            map.setIncidentDate( enrollment.getIncidentDate() );
            map.setOrgUnit( enrollment.getOrgUnit() );

            for ( TrackedEntityAttribute attribute : enrollment.getAttributes() )
            {
                map.getAttributes().put( attribute.getAttribute(), attribute.getValue() );
            }

            for ( Event event : enrollment.getEvents() )
            {
                for ( DataValue dataValue : event.getDataValues() )
                {
                    map.getDataValues().put( dataValue.getDataElement(), dataValue.getValue() );
                }
            }
        }

        return map;
    }

    private IchicsrUtils()
    {
    }
}

@Data
class MappedTrackedEntityInstance
{
    private LocalDateTime enrollmentDate;

    private LocalDateTime incidentDate;

    private String orgUnit;

    private Map<String, String> attributes = new HashMap<>();

    private Map<String, String> dataValues = new HashMap<>();
}