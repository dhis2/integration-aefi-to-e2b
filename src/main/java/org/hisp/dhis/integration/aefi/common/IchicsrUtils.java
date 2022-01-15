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

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Data;

import org.hisp.dhis.integration.aefi.domain.icsr21.Additionaldocument;
import org.hisp.dhis.integration.aefi.domain.icsr21.Drug;
import org.hisp.dhis.integration.aefi.domain.icsr21.Ichicsr;
import org.hisp.dhis.integration.aefi.domain.icsr21.Ichicsrmessageheader;
import org.hisp.dhis.integration.aefi.domain.icsr21.Medicalhistoryepisode;
import org.hisp.dhis.integration.aefi.domain.icsr21.Messagedate;
import org.hisp.dhis.integration.aefi.domain.icsr21.Messagedateformat;
import org.hisp.dhis.integration.aefi.domain.icsr21.Messageformatrelease;
import org.hisp.dhis.integration.aefi.domain.icsr21.Messageformatversion;
import org.hisp.dhis.integration.aefi.domain.icsr21.Messagenumb;
import org.hisp.dhis.integration.aefi.domain.icsr21.Messagereceiveridentifier;
import org.hisp.dhis.integration.aefi.domain.icsr21.Messagesenderidentifier;
import org.hisp.dhis.integration.aefi.domain.icsr21.Messagetype;
import org.hisp.dhis.integration.aefi.domain.icsr21.Occurcountry;
import org.hisp.dhis.integration.aefi.domain.icsr21.Patient;
import org.hisp.dhis.integration.aefi.domain.icsr21.Patientbirthdate;
import org.hisp.dhis.integration.aefi.domain.icsr21.Patientbirthdateformat;
import org.hisp.dhis.integration.aefi.domain.icsr21.Patientinitial;
import org.hisp.dhis.integration.aefi.domain.icsr21.Patientmedicalcomment;
import org.hisp.dhis.integration.aefi.domain.icsr21.Patientsex;
import org.hisp.dhis.integration.aefi.domain.icsr21.Primarysource;
import org.hisp.dhis.integration.aefi.domain.icsr21.Primarysourcecountry;
import org.hisp.dhis.integration.aefi.domain.icsr21.Qualification;
import org.hisp.dhis.integration.aefi.domain.icsr21.Reaction;
import org.hisp.dhis.integration.aefi.domain.icsr21.Receiptdate;
import org.hisp.dhis.integration.aefi.domain.icsr21.Receiptdateformat;
import org.hisp.dhis.integration.aefi.domain.icsr21.Receivedate;
import org.hisp.dhis.integration.aefi.domain.icsr21.Receivedateformat;
import org.hisp.dhis.integration.aefi.domain.icsr21.Receiver;
import org.hisp.dhis.integration.aefi.domain.icsr21.Receivercountrycode;
import org.hisp.dhis.integration.aefi.domain.icsr21.Receiverorganization;
import org.hisp.dhis.integration.aefi.domain.icsr21.Receivertype;
import org.hisp.dhis.integration.aefi.domain.icsr21.Reportercomment;
import org.hisp.dhis.integration.aefi.domain.icsr21.Reportergivename;
import org.hisp.dhis.integration.aefi.domain.icsr21.Reporterorganization;
import org.hisp.dhis.integration.aefi.domain.icsr21.Reporttype;
import org.hisp.dhis.integration.aefi.domain.icsr21.Safetyreport;
import org.hisp.dhis.integration.aefi.domain.icsr21.Safetyreportid;
import org.hisp.dhis.integration.aefi.domain.icsr21.Safetyreportversion;
import org.hisp.dhis.integration.aefi.domain.icsr21.Sender;
import org.hisp.dhis.integration.aefi.domain.icsr21.Senderorganization;
import org.hisp.dhis.integration.aefi.domain.icsr21.Serious;
import org.hisp.dhis.integration.aefi.domain.icsr21.Seriousnesscongenitalanomali;
import org.hisp.dhis.integration.aefi.domain.icsr21.Seriousnessdeath;
import org.hisp.dhis.integration.aefi.domain.icsr21.Seriousnessdisabling;
import org.hisp.dhis.integration.aefi.domain.icsr21.Seriousnesshospitalization;
import org.hisp.dhis.integration.aefi.domain.icsr21.Seriousnesslifethreatening;
import org.hisp.dhis.integration.aefi.domain.icsr21.Seriousnessother;
import org.hisp.dhis.integration.aefi.domain.icsr21.Summary;
import org.hisp.dhis.integration.aefi.domain.icsr21.Transmissiondate;
import org.hisp.dhis.integration.aefi.domain.icsr21.Transmissiondateformat;
import org.hisp.dhis.integration.aefi.domain.tracker.DataValue;
import org.hisp.dhis.integration.aefi.domain.tracker.Enrollment;
import org.hisp.dhis.integration.aefi.domain.tracker.Event;
import org.hisp.dhis.integration.aefi.domain.tracker.TrackedEntityAttribute;
import org.hisp.dhis.integration.aefi.domain.tracker.TrackedEntityInstance;

public final class IchicsrUtils
{
    public static Ichicsr createIchicsr()
    {
        Ichicsr ichicsr = new Ichicsr();
        ichicsr.setLang( "en" );

        return ichicsr;
    }

    public static Ichicsrmessageheader createIchicsrmessageheader( String messageNumber, String senderId,
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
        MappedTrackedEntityInstance te = createMappedTrackedEntityInstance( trackedEntityInstance );

        Safetyreport safetyreport = new Safetyreport();

        Safetyreportversion safetyreportversion = new Safetyreportversion();
        safetyreportversion.setvalue( "1" );
        safetyreport.setSafetyreportversion( safetyreportversion );

        Safetyreportid safetyreportid = new Safetyreportid();
        safetyreportid.setvalue( "XXX" );
        safetyreport.setSafetyreportid( safetyreportid );

        Primarysourcecountry primarysourcecountry = new Primarysourcecountry();
        primarysourcecountry.setvalue( "XXX" );
        safetyreport.setPrimarysourcecountry( primarysourcecountry );

        Occurcountry occurcountry = new Occurcountry();
        occurcountry.setvalue( "XXX" );
        safetyreport.setOccurcountry( occurcountry );

        Transmissiondateformat transmissiondateformat = new Transmissiondateformat();
        transmissiondateformat.setvalue( "102" );
        safetyreport.setTransmissiondateformat( transmissiondateformat );

        Transmissiondate transmissiondate = new Transmissiondate();
        transmissiondate.setvalue( "XXX" );
        safetyreport.setTransmissiondate( transmissiondate );

        Reporttype reporttype = new Reporttype();
        reporttype.setvalue( "1" );
        safetyreport.setReporttype( reporttype );

        Serious serious = new Serious();
        serious.setvalue( "XXX" );
        safetyreport.setSerious( serious );

        Seriousnessdeath seriousnessdeath = new Seriousnessdeath();
        seriousnessdeath.setvalue( "XXX" );
        safetyreport.setSeriousnessdeath( seriousnessdeath );

        Seriousnesslifethreatening seriousnesslifethreatening = new Seriousnesslifethreatening();
        seriousnesslifethreatening.setvalue( "XXX" );
        safetyreport.setSeriousnesslifethreatening( seriousnesslifethreatening );

        Seriousnesshospitalization seriousnesshospitalization = new Seriousnesshospitalization();
        seriousnesshospitalization.setvalue( "XXX" );
        safetyreport.setSeriousnesshospitalization( seriousnesshospitalization );

        Seriousnessdisabling seriousnessdisabling = new Seriousnessdisabling();
        seriousnessdisabling.setvalue( "XXX" );
        safetyreport.setSeriousnessdisabling( seriousnessdisabling );

        Seriousnesscongenitalanomali seriousnesscongenitalanomali = new Seriousnesscongenitalanomali();
        seriousnesscongenitalanomali.setvalue( "XXX" );
        safetyreport.setSeriousnesscongenitalanomali( seriousnesscongenitalanomali );

        Seriousnessother seriousnessother = new Seriousnessother();
        seriousnessother.setvalue( "XXX" );
        safetyreport.setSeriousnessother( seriousnessother );

        Receivedateformat receivedateformat = new Receivedateformat();
        receivedateformat.setvalue( "102" );
        safetyreport.setReceivedateformat( receivedateformat );

        Receivedate receivedate = new Receivedate();
        receivedate.setvalue( "XXX" );
        safetyreport.setReceivedate( receivedate );

        Receiptdateformat receiptdateformat = new Receiptdateformat();
        receiptdateformat.setvalue( "102" );
        safetyreport.setReceiptdateformat( receiptdateformat );

        Receiptdate receiptdate = new Receiptdate();
        receiptdate.setvalue( "XXX" );
        safetyreport.setReceiptdate( receiptdate );

        Additionaldocument additionaldocument = new Additionaldocument();
        additionaldocument.setvalue( "2" );
        safetyreport.setAdditionaldocument( additionaldocument );

        safetyreport.getPrimarysource().add( createPrimarySource( te ) );
        safetyreport.setSender( createSender( te ) );
        safetyreport.setReceiver( createReceiver( te ) );
        safetyreport.setPatient( createPatient( te ) );

        return safetyreport;
    }

    private static Patient createPatient( MappedTrackedEntityInstance te )
    {
        Patient patient = new Patient();

        Patientinitial patientinitial = new Patientinitial();
        patientinitial.setvalue( "XXX" );
        patient.setPatientinitial( patientinitial );

        Patientbirthdateformat patientbirthdateformat = new Patientbirthdateformat();
        patientbirthdateformat.setvalue( "102" );
        patient.setPatientbirthdateformat( patientbirthdateformat );

        Patientbirthdate patientbirthdate = new Patientbirthdate();
        patientbirthdate.setvalue( "XXX" );
        patient.setPatientbirthdate( patientbirthdate );

        Patientsex patientsex = new Patientsex();
        patientsex.setvalue( "XXX" );
        patient.setPatientsex( patientsex );

        patient.getMedicalhistoryepisode().add( createMedicalHistoryEpisode( te ) );

        patient.getReaction().addAll( createReactions( te ) );
        patient.getDrug().addAll( createDrugs( te ) );

        patient.setSummary( createSummary( te ) );

        return patient;
    }

    private static List<Reaction> createReactions( MappedTrackedEntityInstance te )
    {
        return new ArrayList<>();
    }

    private static List<Drug> createDrugs( MappedTrackedEntityInstance te )
    {
        return new ArrayList<>();
    }

    private static Summary createSummary( MappedTrackedEntityInstance te )
    {
        Summary summary = new Summary();

        Reportercomment reportercomment = new Reportercomment();
        reportercomment.setvalue( "XXX" );

        return summary;
    }

    private static Medicalhistoryepisode createMedicalHistoryEpisode( MappedTrackedEntityInstance te )
    {
        Medicalhistoryepisode medicalhistoryepisode = new Medicalhistoryepisode();

        Patientmedicalcomment patientmedicalcomment = new Patientmedicalcomment();
        patientmedicalcomment.setvalue( "XXX" );

        return medicalhistoryepisode;
    }

    private static Primarysource createPrimarySource( MappedTrackedEntityInstance te )
    {
        Primarysource primarysource = new Primarysource();

        Reportergivename reportergivename = new Reportergivename();
        reportergivename.setvalue( "XXX" );
        primarysource.setReportergivename( reportergivename );

        Reporterorganization reporterorganization = new Reporterorganization();
        reporterorganization.setvalue( "XXX" );
        primarysource.setReporterorganization( reporterorganization );

        Qualification qualification = new Qualification();
        qualification.setvalue( "XXX" );
        primarysource.setQualification( qualification );

        return primarysource;
    }

    private static Receiver createReceiver( MappedTrackedEntityInstance te )
    {
        Receiver receiver = new Receiver();

        Receivertype receivertype = new Receivertype();
        receivertype.setvalue( "4" );
        receiver.setReceivertype( receivertype );

        Receiverorganization receiverorganization = new Receiverorganization();
        receiverorganization.setvalue( "XXX" );
        receiver.setReceiverorganization( receiverorganization );

        Receivercountrycode receivercountrycode = new Receivercountrycode();
        receivercountrycode.setvalue( "XXX" );
        receiver.setReceivercountrycode( receivercountrycode );

        return receiver;
    }

    private static Sender createSender( MappedTrackedEntityInstance te )
    {
        Sender sender = new Sender();

        Senderorganization senderorganization = new Senderorganization();
        senderorganization.setvalue( "DHIS2" );
        sender.setSenderorganization( senderorganization );

        return sender;
    }

    private static MappedTrackedEntityInstance createMappedTrackedEntityInstance(
        TrackedEntityInstance trackedEntityInstance )
    {
        MappedTrackedEntityInstance te = new MappedTrackedEntityInstance();

        for ( TrackedEntityAttribute attribute : trackedEntityInstance.getAttributes() )
        {
            te.getAttributes().put( attribute.getAttribute(), attribute.getValue() );
        }

        // TODO this does not really properly handle multiple AEFI enrollments
        // (but that's not a concern right now)
        for ( Enrollment enrollment : trackedEntityInstance.getEnrollments() )
        {
            te.setEnrollmentDate( enrollment.getEnrollmentDate() );
            te.setIncidentDate( enrollment.getIncidentDate() );
            te.setOrgUnit( enrollment.getOrgUnit() );

            for ( TrackedEntityAttribute attribute : enrollment.getAttributes() )
            {
                te.getAttributes().put( attribute.getAttribute(), attribute.getValue() );
            }

            for ( Event event : enrollment.getEvents() )
            {
                for ( DataValue dataValue : event.getDataValues() )
                {
                    te.getDataValues().put( dataValue.getDataElement(), dataValue.getValue() );
                }
            }
        }

        return te;
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