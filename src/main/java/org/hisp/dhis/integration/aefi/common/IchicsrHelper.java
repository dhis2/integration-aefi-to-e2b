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
import org.hisp.dhis.integration.aefi.domain.icsr21.Occurcountry;
import org.hisp.dhis.integration.aefi.domain.icsr21.Primarysource;
import org.hisp.dhis.integration.aefi.domain.icsr21.Primarysourcecountry;
import org.hisp.dhis.integration.aefi.domain.icsr21.Qualification;
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
import org.hisp.dhis.integration.aefi.domain.icsr21.Transmissiondate;
import org.hisp.dhis.integration.aefi.domain.icsr21.Transmissiondateformat;

public final class IchicsrHelper
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
        messagedate.setvalue( "20211103100710" );

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

    public static Safetyreport createSafetyreport()
    {
        Safetyreport safetyreport = new Safetyreport();

        Safetyreportversion safetyreportversion = new Safetyreportversion();
        safetyreportversion.setvalue( "1" );

        Safetyreportid safetyreportid = new Safetyreportid();
        safetyreportid.setvalue( "MU-MUR-BLR-AGJH-0675" );

        Primarysourcecountry primarysourcecountry = new Primarysourcecountry();
        primarysourcecountry.setvalue( "MU" );

        Occurcountry occurcountry = new Occurcountry();
        occurcountry.setvalue( "MU" );

        Transmissiondateformat transmissiondateformat = new Transmissiondateformat();
        transmissiondateformat.setvalue( "102" );

        Transmissiondate transmissiondate = new Transmissiondate();
        transmissiondate.setvalue( "20211103" );

        Reporttype reporttype = new Reporttype();
        reporttype.setvalue( "1" );

        Serious serious = new Serious();
        serious.setvalue( "2" );

        Seriousnessdeath seriousnessdeath = new Seriousnessdeath();
        seriousnessdeath.setvalue( "2" );

        Seriousnesslifethreatening seriousnesslifethreatening = new Seriousnesslifethreatening();
        seriousnesslifethreatening.setvalue( "2" );

        Seriousnesshospitalization seriousnesshospitalization = new Seriousnesshospitalization();
        seriousnesshospitalization.setvalue( "2" );

        Seriousnessdisabling seriousnessdisabling = new Seriousnessdisabling();
        seriousnessdisabling.setvalue( "2" );

        Seriousnesscongenitalanomali seriousnesscongenitalanomali = new Seriousnesscongenitalanomali();
        seriousnesscongenitalanomali.setvalue( "2" );

        Seriousnessother seriousnessother = new Seriousnessother();
        seriousnessother.setvalue( "2" );

        safetyreport.setSafetyreportversion( safetyreportversion );
        safetyreport.setSafetyreportid( safetyreportid );
        safetyreport.setPrimarysourcecountry( primarysourcecountry );
        safetyreport.setOccurcountry( occurcountry );
        safetyreport.setTransmissiondateformat( transmissiondateformat );
        safetyreport.setTransmissiondate( transmissiondate );
        safetyreport.setReporttype( reporttype );
        safetyreport.setSerious( serious );
        safetyreport.setSeriousnessdeath( seriousnessdeath );
        safetyreport.setSeriousnesslifethreatening( seriousnesslifethreatening );
        safetyreport.setSeriousnesshospitalization( seriousnesshospitalization );
        safetyreport.setSeriousnessdisabling( seriousnessdisabling );
        safetyreport.setSeriousnesscongenitalanomali( seriousnesscongenitalanomali );
        safetyreport.setSeriousnessother( seriousnessother );

        Reportergivename reportergivename = new Reportergivename();
        reportergivename.setvalue( "DR LUCHMAH" );

        Reporterorganization reporterorganization = new Reporterorganization();
        reporterorganization.setvalue( "p9wbR8qkLq5" );

        Qualification qualification = new Qualification();
        qualification.setvalue( "1" );

        Primarysource primarysource = new Primarysource();
        primarysource.setReportergivename( reportergivename );
        primarysource.setReporterorganization( reporterorganization );
        primarysource.setQualification( qualification );

        safetyreport.getPrimarysource().add( primarysource );
        safetyreport.getPrimarysource().add( primarysource );

        Senderorganization senderorganization = new Senderorganization();
        senderorganization.setvalue( "DHIS2" );

        Sender sender = new Sender();
        sender.setSenderorganization( senderorganization );

        safetyreport.setSender( sender );

        return safetyreport;
    }

    private IchicsrHelper()
    {
    }
}
