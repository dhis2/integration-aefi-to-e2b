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

import static org.springframework.util.StringUtils.hasText;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import lombok.Data;

import org.hisp.dhis.integration.aefi.config.properties.AefiMappingProperties;
import org.hisp.dhis.integration.aefi.config.properties.AefiProperties;
import org.hisp.dhis.integration.aefi.domain.OrganisationUnit;
import org.hisp.dhis.integration.aefi.domain.TrackerDataValue;
import org.hisp.dhis.integration.aefi.domain.icsr21.Additionaldocument;
import org.hisp.dhis.integration.aefi.domain.icsr21.Drug;
import org.hisp.dhis.integration.aefi.domain.icsr21.Drugadditional;
import org.hisp.dhis.integration.aefi.domain.icsr21.Drugbatchnumb;
import org.hisp.dhis.integration.aefi.domain.icsr21.Drugcharacterization;
import org.hisp.dhis.integration.aefi.domain.icsr21.Drugdosagetext;
import org.hisp.dhis.integration.aefi.domain.icsr21.Drugenddate;
import org.hisp.dhis.integration.aefi.domain.icsr21.Drugenddateformat;
import org.hisp.dhis.integration.aefi.domain.icsr21.Drugstartdate;
import org.hisp.dhis.integration.aefi.domain.icsr21.Drugstartdateformat;
import org.hisp.dhis.integration.aefi.domain.icsr21.Ichicsr;
import org.hisp.dhis.integration.aefi.domain.icsr21.Ichicsrmessageheader;
import org.hisp.dhis.integration.aefi.domain.icsr21.Medicalhistoryepisode;
import org.hisp.dhis.integration.aefi.domain.icsr21.Medicinalproduct;
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
import org.hisp.dhis.integration.aefi.domain.icsr21.Patientautopsyyesno;
import org.hisp.dhis.integration.aefi.domain.icsr21.Patientbirthdate;
import org.hisp.dhis.integration.aefi.domain.icsr21.Patientbirthdateformat;
import org.hisp.dhis.integration.aefi.domain.icsr21.Patientdeath;
import org.hisp.dhis.integration.aefi.domain.icsr21.Patientdeathdate;
import org.hisp.dhis.integration.aefi.domain.icsr21.Patientdeathdateformat;
import org.hisp.dhis.integration.aefi.domain.icsr21.Patientinitial;
import org.hisp.dhis.integration.aefi.domain.icsr21.Patientmedicalcomment;
import org.hisp.dhis.integration.aefi.domain.icsr21.Patientsex;
import org.hisp.dhis.integration.aefi.domain.icsr21.Primarysource;
import org.hisp.dhis.integration.aefi.domain.icsr21.Primarysourcecountry;
import org.hisp.dhis.integration.aefi.domain.icsr21.Primarysourcereaction;
import org.hisp.dhis.integration.aefi.domain.icsr21.Qualification;
import org.hisp.dhis.integration.aefi.domain.icsr21.Reaction;
import org.hisp.dhis.integration.aefi.domain.icsr21.Reactionmeddrallt;
import org.hisp.dhis.integration.aefi.domain.icsr21.Reactionmeddraversionllt;
import org.hisp.dhis.integration.aefi.domain.icsr21.Reactionoutcome;
import org.hisp.dhis.integration.aefi.domain.icsr21.Reactionstartdate;
import org.hisp.dhis.integration.aefi.domain.icsr21.Reactionstartdateformat;
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
import org.hisp.dhis.integration.aefi.domain.tracker.TrackedEntity;
import org.hisp.dhis.integration.aefi.domain.tracker.TrackedEntityAttribute;

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

    public static Safetyreport createSafetyreport( AefiProperties aefiProperties,
        TrackedEntity trackedEntity, Function<String, OrganisationUnit> orgUnitResolver )
    {
        MappedTrackedEntityInstance te = createMappedTrackedEntityInstance( trackedEntity );

        Safetyreport safetyreport = new Safetyreport();

        Safetyreportversion safetyreportversion = new Safetyreportversion();
        safetyreportversion.setvalue( "1" );
        safetyreport.setSafetyreportversion( safetyreportversion );

        Safetyreportid safetyreportid = new Safetyreportid();
        safetyreportid.setvalue( aefiProperties.getE2b().getCountry() );

        String patientId = te.getTrackerDataValue( aefiProperties.getDhis2().getMapping().getPatient_id() );

        if ( hasText( patientId ) )
        {
            safetyreportid.setvalue( aefiProperties.getE2b().getCountry() + "-" + patientId );
        }

        safetyreport.setSafetyreportid( safetyreportid );

        Primarysourcecountry primarysourcecountry = new Primarysourcecountry();
        primarysourcecountry.setvalue( aefiProperties.getE2b().getCountry() );
        safetyreport.setPrimarysourcecountry( primarysourcecountry );

        Occurcountry occurcountry = new Occurcountry();
        occurcountry.setvalue( aefiProperties.getE2b().getCountry() );
        safetyreport.setOccurcountry( occurcountry );

        Transmissiondateformat transmissiondateformat = new Transmissiondateformat();
        transmissiondateformat.setvalue( "102" );
        safetyreport.setTransmissiondateformat( transmissiondateformat );

        Transmissiondate transmissiondate = new Transmissiondate();
        transmissiondate.setvalue( DateUtils.nowDateFormat102() );
        safetyreport.setTransmissiondate( transmissiondate );

        Reporttype reporttype = new Reporttype();
        reporttype.setvalue( "1" );
        safetyreport.setReporttype( reporttype );

        Serious serious = new Serious();
        serious.setvalue( getYesNo( te.getTrackerDataValue( aefiProperties.getDhis2().getMapping().getSerious() ) ) );
        safetyreport.setSerious( serious );

        Seriousnessdeath seriousnessdeath = new Seriousnessdeath();
        seriousnessdeath.setvalue(
            getYesNo( te.getTrackerDataValue( aefiProperties.getDhis2().getMapping().getSeriousness_death() ) ) );
        safetyreport.setSeriousnessdeath( seriousnessdeath );

        Seriousnesslifethreatening seriousnesslifethreatening = new Seriousnesslifethreatening();
        seriousnesslifethreatening.setvalue( getYesNo(
            te.getTrackerDataValue( aefiProperties.getDhis2().getMapping().getSeriousness_life_threatening() ) ) );
        safetyreport.setSeriousnesslifethreatening( seriousnesslifethreatening );

        Seriousnesshospitalization seriousnesshospitalization = new Seriousnesshospitalization();
        seriousnesshospitalization.setvalue( getYesNo(
            te.getTrackerDataValue( aefiProperties.getDhis2().getMapping().getSeriousness_hospitalization() ) ) );
        safetyreport.setSeriousnesshospitalization( seriousnesshospitalization );

        Seriousnessdisabling seriousnessdisabling = new Seriousnessdisabling();
        seriousnessdisabling.setvalue(
            getYesNo( te.getTrackerDataValue( aefiProperties.getDhis2().getMapping().getSeriousness_disabling() ) ) );
        safetyreport.setSeriousnessdisabling( seriousnessdisabling );

        Seriousnesscongenitalanomali seriousnesscongenitalanomali = new Seriousnesscongenitalanomali();
        seriousnesscongenitalanomali.setvalue( getYesNo(
            te.getTrackerDataValue( aefiProperties.getDhis2().getMapping().getSeriousness_congenital_anomali() ) ) );
        safetyreport.setSeriousnesscongenitalanomali( seriousnesscongenitalanomali );

        Seriousnessother seriousnessother = new Seriousnessother();
        seriousnessother.setvalue(
            getYesNo( te.getTrackerDataValue( aefiProperties.getDhis2().getMapping().getSeriousness_other() ) ) );
        safetyreport.setSeriousnessother( seriousnessother );

        Receivedateformat receivedateformat = new Receivedateformat();
        receivedateformat.setvalue( "102" );
        safetyreport.setReceivedateformat( receivedateformat );

        Receivedate receivedate = new Receivedate();
        receivedate.setvalue( DateUtils.nowDateFormat102() );
        safetyreport.setReceivedate( receivedate );

        Receiptdateformat receiptdateformat = new Receiptdateformat();
        receiptdateformat.setvalue( "102" );
        safetyreport.setReceiptdateformat( receiptdateformat );

        Receiptdate receiptdate = new Receiptdate();
        receiptdate.setvalue( DateUtils.nowDateFormat102() );
        safetyreport.setReceiptdate( receiptdate );

        Additionaldocument additionaldocument = new Additionaldocument();
        additionaldocument.setvalue( "2" );
        safetyreport.setAdditionaldocument( additionaldocument );

        safetyreport.getPrimarysource().add( createPrimarySource( aefiProperties, te, orgUnitResolver ) );
        safetyreport.setSender( createSender( aefiProperties, te ) );
        safetyreport.setReceiver( createReceiver( aefiProperties, te ) );
        safetyreport.setPatient( createPatient( aefiProperties, te ) );

        return safetyreport;
    }

    private static Patient createPatient( AefiProperties aefiProperties, MappedTrackedEntityInstance te )
    {
        Patient patient = new Patient();

        Patientinitial patientinitial = new Patientinitial();
        patientinitial.setvalue( getPatientName( aefiProperties, te ) );
        patient.setPatientinitial( patientinitial );

        Patientbirthdateformat patientbirthdateformat = new Patientbirthdateformat();
        patientbirthdateformat.setvalue( "102" );
        patient.setPatientbirthdateformat( patientbirthdateformat );

        String patientBirthdate = getPatientBirthdate( aefiProperties, te );

        if ( hasText( patientBirthdate ) )
        {
            Patientbirthdate patientbirthdate = new Patientbirthdate();
            patientbirthdate.setvalue( patientBirthdate );
            patient.setPatientbirthdate( patientbirthdate );
        }

        Patientsex patientsex = new Patientsex();
        patientsex.setvalue( getPatientGender( aefiProperties, te ) );
        patient.setPatientsex( patientsex );

        patient.getMedicalhistoryepisode().add( createMedicalHistoryEpisode( aefiProperties, te ) );

        if ( isTrue( te.getTrackerDataValue( aefiProperties.getDhis2().getMapping().getSeriousness_death() ) ) )
        {
            Patientdeath patientdeath = new Patientdeath();

            String deathDate = te
                .getTrackerDataValue( aefiProperties.getDhis2().getMapping().getSeriousness_death_date() );
            String deathAutopsy = te
                .getTrackerDataValue( aefiProperties.getDhis2().getMapping().getSeriousness_death_autopsy() );

            if ( hasText( deathDate ) )
            {
                LocalDateTime dateTime = LocalDateTime.parse( deathDate + "T00:00:00" );

                Patientdeathdateformat patientdeathdateformat = new Patientdeathdateformat();
                patientdeathdateformat.setvalue( "102" );
                patientdeath.setPatientdeathdateformat( patientdeathdateformat );

                Patientdeathdate patientdeathdate = new Patientdeathdate();
                patientdeathdate.setvalue( DateUtils.dateFormat102( dateTime ) );
                patientdeath.setPatientdeathdate( patientdeathdate );
            }

            if ( hasText( deathAutopsy ) )
            {
                Patientautopsyyesno patientautopsyyesno = new Patientautopsyyesno();

                if ( "Autopsy done".equals( deathAutopsy ) )
                {
                    patientautopsyyesno.setvalue( "1" );
                }
                else
                {
                    patientautopsyyesno.setvalue( "2" );
                }

                patientdeath.setPatientautopsyyesno( patientautopsyyesno );
            }

            patient.setPatientdeath( patientdeath );
        }

        patient.getDrug().addAll( createDrugs( aefiProperties, te ) );
        patient.getReaction().addAll( createReactions( aefiProperties, te ) );

        patient.setSummary( createSummary( aefiProperties, te ) );

        return patient;
    }

    private static boolean isTrue( String value )
    {
        return "true".equals( value );
    }

    private static List<Drug> createDrugs( AefiProperties aefiProperties, MappedTrackedEntityInstance te )
    {
        List<Drug> drugs = new ArrayList<>();
        AefiMappingProperties mapping = aefiProperties.getDhis2().getMapping();

        createDrug( drugs, te.getTrackerDataValue( mapping.getVaccine1_name() ),
            te.getTrackerDataValue( mapping.getVaccine1_brand() ),
            te.getTrackerDataValue( mapping.getVaccine1_date() ), te.getTrackerDataValue( mapping.getVaccine1_time() ),
            te.getTrackerDataValue( mapping.getVaccine1_batch() ), te.getTrackerDataValue( mapping.getVaccine1_dose() ),
            te.getTrackerDataValue( mapping.getVaccine1_expiry() ),
            te.getTrackerDataValue( mapping.getDiluent1_name() ),
            te.getTrackerDataValue( mapping.getDiluent1_batch() ),
            te.getTrackerDataValue( mapping.getDiluent1_expiry() ),
            te.getTrackerDataValue( mapping.getDiluent1_dor() ), te.getTrackerDataValue( mapping.getDiluent1_tor() ) );

        createDrug( drugs, te.getTrackerDataValue( mapping.getVaccine2_name() ),
            te.getTrackerDataValue( mapping.getVaccine2_brand() ),
            te.getTrackerDataValue( mapping.getVaccine2_date() ), te.getTrackerDataValue( mapping.getVaccine2_time() ),
            te.getTrackerDataValue( mapping.getVaccine2_batch() ), te.getTrackerDataValue( mapping.getVaccine2_dose() ),
            te.getTrackerDataValue( mapping.getVaccine2_expiry() ),
            te.getTrackerDataValue( mapping.getDiluent2_name() ),
            te.getTrackerDataValue( mapping.getDiluent2_batch() ),
            te.getTrackerDataValue( mapping.getDiluent2_expiry() ),
            te.getTrackerDataValue( mapping.getDiluent2_dor() ), te.getTrackerDataValue( mapping.getDiluent2_tor() ) );

        createDrug( drugs, te.getTrackerDataValue( mapping.getVaccine3_name() ),
            te.getTrackerDataValue( mapping.getVaccine3_brand() ),
            te.getTrackerDataValue( mapping.getVaccine3_date() ), te.getTrackerDataValue( mapping.getVaccine3_time() ),
            te.getTrackerDataValue( mapping.getVaccine3_batch() ), te.getTrackerDataValue( mapping.getVaccine3_dose() ),
            te.getTrackerDataValue( mapping.getVaccine3_expiry() ),
            te.getTrackerDataValue( mapping.getDiluent3_name() ),
            te.getTrackerDataValue( mapping.getDiluent3_batch() ),
            te.getTrackerDataValue( mapping.getDiluent3_expiry() ),
            te.getTrackerDataValue( mapping.getDiluent3_dor() ), te.getTrackerDataValue( mapping.getDiluent3_tor() ) );

        createDrug( drugs, te.getTrackerDataValue( mapping.getVaccine4_name() ),
            te.getTrackerDataValue( mapping.getVaccine4_brand() ),
            te.getTrackerDataValue( mapping.getVaccine4_date() ), te.getTrackerDataValue( mapping.getVaccine4_time() ),
            te.getTrackerDataValue( mapping.getVaccine4_batch() ), te.getTrackerDataValue( mapping.getVaccine4_dose() ),
            te.getTrackerDataValue( mapping.getVaccine4_expiry() ),
            te.getTrackerDataValue( mapping.getDiluent4_name() ),
            te.getTrackerDataValue( mapping.getDiluent4_batch() ),
            te.getTrackerDataValue( mapping.getDiluent4_expiry() ),
            te.getTrackerDataValue( mapping.getDiluent4_dor() ), te.getTrackerDataValue( mapping.getDiluent4_tor() ) );

        return drugs;
    }

    private static void createDrug( List<Drug> drugs, String vaccine_name, String vaccine_brand, String vaccine_date,
        String vaccine_time, String vaccine_batch, String vaccine_dose, String vaccine_expiry, String diluent_name,
        String diluent_batch,
        String diluent_expiry, String diluent_dor, String diluent_tor )
    {
        if ( !hasText( vaccine_name ) )
        {
            return;
        }

        Drug drug = new Drug();
        Drugcharacterization drugcharacterization = new Drugcharacterization();
        drugcharacterization.setvalue( "1" );
        drug.setDrugcharacterization( drugcharacterization );

        Medicinalproduct medicinalproduct = new Medicinalproduct();

        if ( hasText( vaccine_brand ) )
        {
            medicinalproduct.setvalue( vaccine_name + " " + vaccine_brand );
        }
        else
        {
            medicinalproduct.setvalue( vaccine_name );
        }

        drug.setMedicinalproduct( medicinalproduct );

        Drugbatchnumb drugbatchnumb = new Drugbatchnumb();
        drugbatchnumb.setvalue( vaccine_batch );
        drug.setDrugbatchnumb( drugbatchnumb );

        List<String> druginfo = new ArrayList<>();

        if ( hasText( vaccine_dose ) )
        {
            druginfo.add( vaccine_dose );
        }

        if ( hasText( vaccine_expiry ) )
        {
            druginfo.add( ", Expiry: " + vaccine_expiry );
        }

        if ( !druginfo.isEmpty() )
        {
            Drugdosagetext drugdosagetext = new Drugdosagetext();
            drugdosagetext.setvalue( String.join( ",", druginfo ) );
            drug.setDrugdosagetext( drugdosagetext );
        }

        if ( hasText( vaccine_date ) )
        {
            // TODO do we care about time? we are currently using 102 format
            if ( !hasText( vaccine_time ) )
            {
                vaccine_time = "00:00:00";
            }

            LocalDateTime dateTime = LocalDateTime.parse( vaccine_date + "T" + vaccine_time );

            Drugstartdateformat drugstartdateformat = new Drugstartdateformat();
            drugstartdateformat.setvalue( "102" );
            drug.setDrugstartdateformat( drugstartdateformat );

            Drugstartdate drugstartdate = new Drugstartdate();
            drugstartdate.setvalue( DateUtils.dateFormat102( dateTime ) );
            drug.setDrugstartdate( drugstartdate );

            Drugenddateformat drugenddateformat = new Drugenddateformat();
            drugenddateformat.setvalue( "102" );
            drug.setDrugenddateformat( drugenddateformat );

            Drugenddate drugenddate = new Drugenddate();
            drugenddate.setvalue( DateUtils.dateFormat102( dateTime ) );
            drug.setDrugenddate( drugenddate );
        }

        if ( hasText( diluent_name ) )
        {
            List<String> diluentinfo = new ArrayList<>();

            diluentinfo.add( "N: " + diluent_name );

            if ( hasText( diluent_batch ) )
            {
                diluentinfo.add( "B: " + diluent_batch );
            }

            if ( hasText( diluent_expiry ) )
            {
                diluentinfo.add( "EX: " + diluent_expiry );
            }

            if ( hasText( diluent_dor ) )
            {
                diluentinfo.add( "DR: " + diluent_dor );
            }

            if ( hasText( diluent_tor ) )
            {
                diluentinfo.add( "TR: " + diluent_tor );
            }

            Drugadditional drugadditional = new Drugadditional();
            drugadditional.setvalue( String.join( ",", diluentinfo ) );
            drug.setDrugadditional( drugadditional );
        }

        drugs.add( drug );
    }

    private static List<Reaction> createReactions( AefiProperties aefiProperties, MappedTrackedEntityInstance te )
    {
        List<Reaction> reactions = new ArrayList<>();
        AefiMappingProperties mapping = aefiProperties.getDhis2().getMapping();

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_severe_local_reaction() ) ) )
        {
            List<String> reactionList = new ArrayList<>();
            reactionList.add( "Severe local reaction" );

            if ( hasText( te.getTrackerDataValue( mapping.getReaction_above_3_days() ) ) )
            {
                reactionList.add( ">3 days" );
            }

            if ( hasText( te.getTrackerDataValue( mapping.getReaction_beyond_nearest_joint() ) ) )
            {
                reactionList.add( "beyond nearest joint" );
            }

            reactions.add( createReaction( aefiProperties, te, reactionList, "10059080" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_seizures() ) ) )
        {
            String seizureType = te.getTrackerDataValue( mapping.getReaction_seizures_type() );

            if ( hasText( seizureType ) )
            {
                switch ( seizureType )
                {
                case "AFEBRILE":
                    reactions.add( createReaction( aefiProperties, te, "Seizure afebrile", "10001436" ) );
                    break;
                case "FEBRILE":
                    reactions.add( createReaction( aefiProperties, te, "Seizure febrile", "10016290" ) );
                    break;
                }
            }
            else
            {
                reactions.add( createReaction( aefiProperties, te, "Seizures", "10039906" ) );
            }
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_abscess() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Abscess", "10069556" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_sepsis() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Sepsis", "10040047" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_encephalopathy() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Encephalopathy", "10014602" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_toxic_shock_syndrome() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Toxic shock syndrome", "10044248" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_thrombocytopenia() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Thrombocytopenia", "10043554" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_anaphylaxis() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Anaphylaxis", "10002218" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_fever_above_38() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Fever ≥38°C", "10016558" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_headache() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Headache", "10019211" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_irritability() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Irritability", "10057224" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_sore_throat() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Sore Throat", "10041367" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_joint_pain() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Joint Pain", "10023222" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_abdominal_pain() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Abdominal Pain", "10000081" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_cough() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Cough", "10011224" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_nausea() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Nausea", "10028813" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_diarrhoea() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Diarrhoea", "10012735" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_fatigue() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Fatigue", "10016256" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_vomiting() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Vomiting", "10047700" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_injection_site_soreness() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Injection site soreness", "10068879" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_injection_site_tenderness() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Injection site tenderness", "10069631" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_skin_rash() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Skin rash", "10040913" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_itchingh() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Itching", "10023084" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_muscle_pain() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Muscle pain", "10028322" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_persistent_crying() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Persistent crying", "10069592" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_poor_breast_feeding() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Poor breast feeding", "10006248" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_loss_of_apetite() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Loss of appetite", "10003028" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_chills() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Chills", "10008531" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_fainting() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Fainting", "10016169" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_mild_fever() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Mild fever", "10041021" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_tiredness() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Tiredness", "10043890" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_nasal_congestion() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Nasal congestion", "10028735" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_lymph_node_enlargement() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Lymph node enlargement", "10014847" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_dizziness() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Dizziness", "10013573" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_drowsiness() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Drowsiness", "10013649" ) );
        }

        if ( hasText( te.getTrackerDataValue( mapping.getReaction_other() ) ) )
        {
            reactions
                .add( createReaction( aefiProperties, te, te.getTrackerDataValue( mapping.getReaction_other() ) ) );
        }

        return reactions;
    }

    private static Reaction createReaction( AefiProperties aefiProperties, MappedTrackedEntityInstance te,
        String reaction, String mdCode )
    {
        return createReaction( aefiProperties, te, List.of( reaction ), mdCode );
    }

    private static Reaction createReaction( AefiProperties aefiProperties, MappedTrackedEntityInstance te,
        String reaction )
    {
        return createReaction( aefiProperties, te, List.of( reaction ), null );
    }

    private static Reaction createReaction( AefiProperties aefiProperties, MappedTrackedEntityInstance te,
        List<String> reactionList, String mdCode )
    {
        Reaction reaction = new Reaction();

        Primarysourcereaction primarysourcereaction = new Primarysourcereaction();
        primarysourcereaction.setvalue( String.join( " ", reactionList ) );
        reaction.setPrimarysourcereaction( primarysourcereaction );

        Reactionmeddraversionllt reactionmeddraversionllt = new Reactionmeddraversionllt();
        reactionmeddraversionllt.setvalue( "24.1" );
        reaction.setReactionmeddraversionllt( reactionmeddraversionllt );

        Reactionmeddrallt reactionmeddrallt = new Reactionmeddrallt();
        reactionmeddrallt.setvalue( mdCode );
        reaction.setReactionmeddrallt( reactionmeddrallt );

        Reactionstartdateformat reactionstartdateformat = new Reactionstartdateformat();
        reactionstartdateformat.setvalue( "203" );
        reaction.setReactionstartdateformat( reactionstartdateformat );

        Reactionstartdate reactionstartdate = new Reactionstartdate();

        String reactionStartDate = te
            .getTrackerDataValue( aefiProperties.getDhis2().getMapping().getReaction_start_date() );
        String reactionStartTime = te
            .getTrackerDataValue( aefiProperties.getDhis2().getMapping().getReaction_start_time() );

        if ( hasText( reactionStartDate ) )
        {
            if ( !hasText( reactionStartTime ) )
            {
                reactionStartTime = "00:00:00";
            }

            LocalDateTime dateTime = LocalDateTime.parse( reactionStartDate + "T" + reactionStartTime );
            reactionstartdate.setvalue( DateUtils.dateFormat203( dateTime ) );
        }

        reaction.setReactionstartdate( reactionstartdate );

        String outcome = getReactionOutcome( aefiProperties, te );

        if ( hasText( outcome ) )
        {
            Reactionoutcome reactionoutcome = new Reactionoutcome();
            reactionoutcome.setvalue( outcome );
            reaction.setReactionoutcome( reactionoutcome );
        }

        return reaction;
    }

    private static Summary createSummary( AefiProperties aefiProperties, MappedTrackedEntityInstance te )
    {
        Summary summary = new Summary();

        Reportercomment reportercomment = new Reportercomment();
        reportercomment
            .setvalue( te.getTrackerDataValue( aefiProperties.getDhis2().getMapping().getReporter_comment() ) );
        summary.setReportercomment( reportercomment );

        return summary;
    }

    private static Medicalhistoryepisode createMedicalHistoryEpisode( AefiProperties aefiProperties,
        MappedTrackedEntityInstance te )
    {
        Medicalhistoryepisode medicalhistoryepisode = new Medicalhistoryepisode();

        Patientmedicalcomment patientmedicalcomment = new Patientmedicalcomment();
        patientmedicalcomment.setvalue(
            te.getTrackerDataValue( aefiProperties.getDhis2().getMapping().getSeriousness_medical_comment() ) );
        medicalhistoryepisode.setPatientmedicalcomment( patientmedicalcomment );

        return medicalhistoryepisode;
    }

    private static Primarysource createPrimarySource( AefiProperties aefiProperties, MappedTrackedEntityInstance te,
        Function<String, OrganisationUnit> orgUnitResolver )
    {
        Primarysource primarysource = new Primarysource();

        String reporterName = te.getTrackerDataValue( aefiProperties.getDhis2().getMapping().getReporter_name() );

        if ( !hasText( reporterName ) )
        {
            reporterName = "";
        }

        Reportergivename reportergivename = new Reportergivename();
        reportergivename.setvalue( reporterName );
        primarysource.setReportergivename( reportergivename );

        Reporterorganization reporterorganization = new Reporterorganization();
        String reporterorganizationOrgUnit = te
            .getTrackerDataValue( aefiProperties.getDhis2().getMapping().getReporter_organization() );

        reporterorganization.setvalue( orgUnitResolver.apply( reporterorganizationOrgUnit ).getName() );
        primarysource.setReporterorganization( reporterorganization );

        Qualification qualification = new Qualification();
        qualification.setvalue( reporterName.startsWith( "DR " ) ? "1" : "3" );
        primarysource.setQualification( qualification );

        return primarysource;
    }

    private static Receiver createReceiver( AefiProperties aefiProperties, MappedTrackedEntityInstance te )
    {
        Receiver receiver = new Receiver();

        Receivertype receivertype = new Receivertype();
        receivertype.setvalue( "4" );
        receiver.setReceivertype( receivertype );

        Receiverorganization receiverorganization = new Receiverorganization();
        receiverorganization.setvalue( aefiProperties.getE2b().getReceiverOrganization() );
        receiver.setReceiverorganization( receiverorganization );

        Receivercountrycode receivercountrycode = new Receivercountrycode();
        receivercountrycode.setvalue( aefiProperties.getE2b().getReceiverCode() );
        receiver.setReceivercountrycode( receivercountrycode );

        return receiver;
    }

    private static Sender createSender( AefiProperties aefiProperties, MappedTrackedEntityInstance te )
    {
        Sender sender = new Sender();

        Senderorganization senderorganization = new Senderorganization();
        senderorganization.setvalue( "DHIS2" );
        sender.setSenderorganization( senderorganization );

        return sender;
    }

    private static MappedTrackedEntityInstance createMappedTrackedEntityInstance(
        TrackedEntity trackedEntity )
    {
        MappedTrackedEntityInstance te = new MappedTrackedEntityInstance();

        for ( TrackedEntityAttribute attribute : trackedEntity.getAttributes() )
        {
            te.getAttributes().put( attribute.getAttribute(), attribute.getValue() );
        }

        // TODO this does not really properly handle multiple AEFI enrollments
        // (but that's not a concern right now)
        for ( Enrollment enrollment : trackedEntity.getEnrollments() )
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

    private static String getReactionOutcome( AefiProperties aefiProperties, MappedTrackedEntityInstance te )
    {
        String value = te.getTrackerDataValue( aefiProperties.getDhis2().getMapping().getReaction_outcome() );

        if ( !hasText( value ) )
        {
            return "";
        }

        switch ( value )
        {
        case "Recovered/resolved":
            return "1";
        case "Recovering/resolving":
            return "2";
        case "Not recovered/not resolved":
            return "3";
        case "Recovered/resolved with sequelae":
            return "4";
        case "Died":
        case "DiedAutopsy done":
            return "5";
        case "Unknown":
            return "6";
        }

        return value;
    }

    private static String getPatientGender( AefiProperties aefiProperties, MappedTrackedEntityInstance te )
    {
        String gender = te.getTrackerDataValue( aefiProperties.getDhis2().getMapping().getPatient_gender() );

        if ( !hasText( gender ) )
        {
            return "";
        }

        switch ( gender )
        {
        case "MALE":
            return "1";
        case "FEMALE":
            return "2";
        }

        return "";
    }

    private static String getYesNo( String value )
    {
        if ( isTrue( value ) )
        {
            return "1";
        }

        return "2";
    }

    private static String getPatientName( AefiProperties aefiProperties, MappedTrackedEntityInstance te )
    {
        String givenName = te.getTrackerDataValue( aefiProperties.getDhis2().getMapping().getPatient_given_name() );
        String familyName = te.getTrackerDataValue( aefiProperties.getDhis2().getMapping().getPatient_family_name() );

        String name = "ANON";

        if ( hasText( givenName ) )
        {
            name = givenName;

            if ( hasText( familyName ) )
            {
                name = givenName + " " + familyName;
            }
        }

        return name;
    }

    private static String getPatientBirthdate( AefiProperties aefiProperties, MappedTrackedEntityInstance te )
    {
        String birthdate = te.getTrackerDataValue( aefiProperties.getDhis2().getMapping().getPatient_birthdate() );

        if ( hasText( birthdate ) )
        {
            return DateUtils.dateFormat102( LocalDateTime.parse( birthdate + "T00:00:00" ) );
        }

        return null;
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

    public String getTrackerDataValue( TrackerDataValue value )
    {
        if ( value.isAttribute() && attributes.containsKey( value.getId() ) )
        {
            return attributes.get( value.getId() );
        }
        else if ( value.isDataElement() && dataValues.containsKey( value.getId() ) )
        {
            return dataValues.get( value.getId() );
        }

        return null;
    }
}