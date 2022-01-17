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

import org.hisp.dhis.integration.aefi.config.properties.AefiMappingProperties;
import org.hisp.dhis.integration.aefi.config.properties.AefiProperties;
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
import org.hisp.dhis.integration.aefi.domain.icsr21.Patientbirthdate;
import org.hisp.dhis.integration.aefi.domain.icsr21.Patientbirthdateformat;
import org.hisp.dhis.integration.aefi.domain.icsr21.Patientinitial;
import org.hisp.dhis.integration.aefi.domain.icsr21.Patientmedicalcomment;
import org.hisp.dhis.integration.aefi.domain.icsr21.Patientsex;
import org.hisp.dhis.integration.aefi.domain.icsr21.Primarysource;
import org.hisp.dhis.integration.aefi.domain.icsr21.Primarysourcecountry;
import org.hisp.dhis.integration.aefi.domain.icsr21.Primarysourcereaction;
import org.hisp.dhis.integration.aefi.domain.icsr21.Qualification;
import org.hisp.dhis.integration.aefi.domain.icsr21.Reaction;
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
import org.hisp.dhis.integration.aefi.domain.tracker.TrackedEntityAttribute;
import org.hisp.dhis.integration.aefi.domain.tracker.TrackedEntityInstance;
import org.springframework.util.StringUtils;

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
        TrackedEntityInstance trackedEntityInstance )
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
        safetyreport.setPatient( createPatient( aefiProperties, te ) );

        return safetyreport;
    }

    private static Patient createPatient( AefiProperties aefiProperties, MappedTrackedEntityInstance te )
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

        patient.getDrug().addAll( createDrugs( aefiProperties, te ) );
        patient.getReaction().addAll( createReactions( aefiProperties, te ) );

        patient.setSummary( createSummary( te ) );

        return patient;
    }

    private static List<Drug> createDrugs( AefiProperties aefiProperties, MappedTrackedEntityInstance te )
    {
        List<Drug> drugs = new ArrayList<>();

        createDrug( drugs, te.getDataValues().get( aefiProperties.getDhis2().getMapping().getVaccine1_name() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getVaccine1_brand() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getVaccine1_date() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getVaccine1_time() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getVaccine1_batch() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getVaccine1_dose() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getVaccine1_expiry() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getDiluent1_name() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getDiluent1_batch() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getDiluent1_expiry() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getDiluent1_dor() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getDiluent1_tor() ) );

        createDrug( drugs, te.getDataValues().get( aefiProperties.getDhis2().getMapping().getVaccine2_name() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getVaccine2_brand() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getVaccine2_date() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getVaccine2_time() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getVaccine2_batch() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getVaccine2_dose() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getVaccine2_expiry() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getDiluent2_name() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getDiluent2_batch() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getDiluent2_expiry() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getDiluent2_dor() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getDiluent2_tor() ) );

        createDrug( drugs, te.getDataValues().get( aefiProperties.getDhis2().getMapping().getVaccine3_name() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getVaccine3_brand() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getVaccine3_date() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getVaccine3_time() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getVaccine3_batch() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getVaccine3_dose() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getVaccine3_expiry() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getDiluent3_name() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getDiluent3_batch() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getDiluent3_expiry() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getDiluent3_dor() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getDiluent3_tor() ) );

        createDrug( drugs, te.getDataValues().get( aefiProperties.getDhis2().getMapping().getVaccine4_name() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getVaccine4_brand() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getVaccine4_date() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getVaccine4_time() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getVaccine4_batch() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getVaccine4_dose() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getVaccine4_expiry() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getDiluent4_name() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getDiluent4_batch() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getDiluent4_expiry() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getDiluent4_dor() ),
            te.getDataValues().get( aefiProperties.getDhis2().getMapping().getDiluent4_tor() ) );

        return drugs;
    }

    private static void createDrug( List<Drug> drugs, String vaccine_name, String vaccine_brand, String vaccine_date,
        String vaccine_time, String vaccine_batch, String vaccine_dose, String vaccine_expiry, String diluent_name,
        String diluent_batch,
        String diluent_expiry, String diluent_dor, String diluent_tor )
    {
        if ( !StringUtils.hasText( vaccine_name ) )
        {
            return;
        }

        Drug drug = new Drug();
        Drugcharacterization drugcharacterization = new Drugcharacterization();
        drugcharacterization.setvalue( "1" );
        drug.setDrugcharacterization( drugcharacterization );

        Medicinalproduct medicinalproduct = new Medicinalproduct();
        medicinalproduct.setvalue( vaccine_name + " " + vaccine_brand );
        drug.setMedicinalproduct( medicinalproduct );

        Drugbatchnumb drugbatchnumb = new Drugbatchnumb();
        drugbatchnumb.setvalue( vaccine_batch );
        drug.setDrugbatchnumb( drugbatchnumb );

        List<String> druginfo = new ArrayList<>();

        if ( StringUtils.hasText( vaccine_dose ) )
        {
            druginfo.add( vaccine_dose );
        }

        if ( StringUtils.hasText( vaccine_expiry ) )
        {
            druginfo.add( ", Expiry: " + vaccine_expiry );
        }

        if ( !druginfo.isEmpty() )
        {
            Drugdosagetext drugdosagetext = new Drugdosagetext();
            drugdosagetext.setvalue( String.join( ",", druginfo ) );
            drug.setDrugdosagetext( drugdosagetext );
        }

        if ( StringUtils.hasText( vaccine_date ) )
        {
            // TODO do we care about time? we are currently using 102 format
            if ( !StringUtils.hasText( vaccine_time ) )
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

        if ( StringUtils.hasText( diluent_name ) )
        {
            List<String> diluentinfo = new ArrayList<>();

            diluentinfo.add( "N: " + diluent_name );

            if ( StringUtils.hasText( diluent_batch ) )
            {
                diluentinfo.add( "B: " + diluent_batch );
            }

            if ( StringUtils.hasText( diluent_expiry ) )
            {
                diluentinfo.add( "EX: " + diluent_expiry );
            }

            if ( StringUtils.hasText( diluent_dor ) )
            {
                diluentinfo.add( "DR: " + diluent_dor );
            }

            if ( StringUtils.hasText( diluent_tor ) )
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

        Map<String, String> dataValues = te.getDataValues();
        AefiMappingProperties mapping = aefiProperties.getDhis2().getMapping();

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_severe_local_reaction() ) ) )
        {
            List<String> reactionList = new ArrayList<>();
            reactionList.add( "Severe local reaction" );

            if ( StringUtils.hasText( dataValues.get( mapping.getReaction_above_3_days() ) ) )
            {
                reactionList.add( ">3 days" );
            }

            if ( StringUtils.hasText( dataValues.get( mapping.getReaction_beyond_nearest_joint() ) ) )
            {
                reactionList.add( "Beyond nearest joint" );
            }

            reactions.add( createReaction( aefiProperties, te, reactionList ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_seizures() ) ) )
        {
            String seizureType = dataValues.get( mapping.getReaction_seizures_type() );

            if ( StringUtils.hasText( seizureType ) )
            {
                reactions.add( createReaction( aefiProperties, te, "Seizures (" + seizureType + ")" ) );
            }
            else
            {
                reactions.add( createReaction( aefiProperties, te, "Seizures" ) );
            }
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_abscess() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Abscess" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_sepsis() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Sepsis" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_encephalopathy() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Encephalopathy" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_toxic_shock_syndrome() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Toxic shock syndrome" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_thrombocytopenia() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Thrombocytopenia" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_anaphylaxis() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Anaphylaxis" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_fever_above_38() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Fever (> 38°C)" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_headache() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Headache" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_irritability() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Irritability" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_sore_throat() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Sore Throat" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_joint_pain() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Joint Pain" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_abdominal_pain() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Abdominal Pain" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_cough() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Cough" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_nausea() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Nausea" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_diarrhoea() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Diarrhoea" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_fatigue() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Fatigue" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_vomiting() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Vomiting" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_injection_site_soreness() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Injection site soreness" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_injection_site_tenderness() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Injection site tenderness" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_skin_rash() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Skin rash" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_itchingh() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Itching" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_muscle_pain() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Muscle pain" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_persistent_crying() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Persistent crying" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_poor_breast_feeding() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Poor breast feeding" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_loss_of_apetite() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Loss of apetite" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_chills() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Chills" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_fainting() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Fainting" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_mild_fever() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Mild fever" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_tiredness() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Tiredness" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_nasal_congestion() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Nasal congestion" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_lymph_node_enlargement() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Lymph node enlargement" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_dizziness() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Dizziness" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_drowsiness() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, "Drowsiness" ) );
        }

        if ( StringUtils.hasText( dataValues.get( mapping.getReaction_other() ) ) )
        {
            reactions.add( createReaction( aefiProperties, te, dataValues.get( mapping.getReaction_other() ) ) );
        }

        return reactions;
    }

    private static Reaction createReaction( AefiProperties aefiProperties, MappedTrackedEntityInstance te,
        String reaction )
    {
        return createReaction( aefiProperties, te, List.of( reaction ) );
    }

    private static Reaction createReaction( AefiProperties aefiProperties, MappedTrackedEntityInstance te,
        List<String> reactionList )
    {
        Reaction reaction = new Reaction();

        Primarysourcereaction primarysourcereaction = new Primarysourcereaction();
        primarysourcereaction.setvalue( String.join( ",", reactionList ) );
        reaction.setPrimarysourcereaction( primarysourcereaction );

        Reactionstartdateformat reactionstartdateformat = new Reactionstartdateformat();
        reactionstartdateformat.setvalue( "203" );
        reaction.setReactionstartdateformat( reactionstartdateformat );

        Reactionstartdate reactionstartdate = new Reactionstartdate();

        String reactionStartDate = te.getDataValues()
            .get( aefiProperties.getDhis2().getMapping().getReaction_start_date() );
        String reactionStartTime = te.getDataValues()
            .get( aefiProperties.getDhis2().getMapping().getReaction_start_time() );

        if ( StringUtils.hasText( reactionStartDate ) )
        {
            if ( !StringUtils.hasText( reactionStartTime ) )
            {
                reactionStartTime = "00:00:00";
            }

            LocalDateTime dateTime = LocalDateTime.parse( reactionStartDate + "T" + reactionStartTime );
            reactionstartdate.setvalue( DateUtils.dateFormat203( dateTime ) );
        }

        reaction.setReactionstartdate( reactionstartdate );

        String outcome = getReactionOutcome( aefiProperties, te );

        if ( StringUtils.hasText( outcome ) )
        {
            Reactionoutcome reactionoutcome = new Reactionoutcome();
            reactionoutcome.setvalue( outcome );
            reaction.setReactionoutcome( reactionoutcome );
        }

        return reaction;
    }

    private static String getReactionOutcome( AefiProperties aefiProperties, MappedTrackedEntityInstance te )
    {
        String value = te.getDataValues().get( aefiProperties.getDhis2().getMapping().getReaction_outcome() );

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

    private static String getPatientSex( AefiProperties aefiProperties, MappedTrackedEntityInstance te )
    {
        String gender = te.getAttributes().get( aefiProperties.getDhis2().getMapping().getGender() );

        switch ( gender )
        {
        case "MALE":
            return "1";
        case "FEMALE":
            return "2";
        }

        return "";
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