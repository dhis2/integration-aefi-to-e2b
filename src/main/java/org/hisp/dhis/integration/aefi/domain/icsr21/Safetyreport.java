/*
 * Copyright (c) 2004-1309-1802, University of Oslo
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
package org.hisp.dhis.integration.aefi.domain.icsr21;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "", propOrder = {
    "safetyreportversion",
    "safetyreportid",
    "primarysourcecountry",
    "occurcountry",
    "transmissiondateformat",
    "transmissiondate",
    "reporttype",
    "serious",
    "seriousnessdeath",
    "seriousnesslifethreatening",
    "seriousnesshospitalization",
    "seriousnessdisabling",
    "seriousnesscongenitalanomali",
    "seriousnessother",
    "receivedateformat",
    "receivedate",
    "receiptdateformat",
    "receiptdate",
    "additionaldocument",
    "documentlist",
    "fulfillexpeditecriteria",
    "authoritynumb",
    "companynumb",
    "duplicate",
    "casenullification",
    "nullificationreason",
    "medicallyconfirm",
    "reportduplicate",
    "linkedreport",
    "primarysource",
    "sender",
    "receiver",
    "patient"
} )
@XmlRootElement( name = "safetyreport" )
public class Safetyreport
{

    @XmlAttribute( name = "lang" )
    @XmlJavaTypeAdapter( NormalizedStringAdapter.class )
    protected String lang;

    protected Safetyreportversion safetyreportversion;

    @XmlElement( required = true )
    protected Safetyreportid safetyreportid;

    protected Primarysourcecountry primarysourcecountry;

    protected Occurcountry occurcountry;

    protected Transmissiondateformat transmissiondateformat;

    protected Transmissiondate transmissiondate;

    protected Reporttype reporttype;

    protected Serious serious;

    protected Seriousnessdeath seriousnessdeath;

    protected Seriousnesslifethreatening seriousnesslifethreatening;

    protected Seriousnesshospitalization seriousnesshospitalization;

    protected Seriousnessdisabling seriousnessdisabling;

    protected Seriousnesscongenitalanomali seriousnesscongenitalanomali;

    protected Seriousnessother seriousnessother;

    protected Receivedateformat receivedateformat;

    protected Receivedate receivedate;

    protected Receiptdateformat receiptdateformat;

    protected Receiptdate receiptdate;

    protected Additionaldocument additionaldocument;

    protected Documentlist documentlist;

    protected Fulfillexpeditecriteria fulfillexpeditecriteria;

    protected Authoritynumb authoritynumb;

    protected Companynumb companynumb;

    protected Duplicate duplicate;

    protected Casenullification casenullification;

    protected Nullificationreason nullificationreason;

    protected Medicallyconfirm medicallyconfirm;

    protected List<Reportduplicate> reportduplicate;

    protected List<Linkedreport> linkedreport;

    @XmlElement( required = true )
    protected List<Primarysource> primarysource;

    @XmlElement( required = true )
    protected Sender sender;

    @XmlElement( required = true )
    protected Receiver receiver;

    @XmlElement( required = true )
    protected Patient patient;

    /**
     * Gets the value of the lang property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getLang()
    {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setLang( String value )
    {
        this.lang = value;
    }

    /**
     * Gets the value of the safetyreportversion property.
     *
     * @return possible object is {@link Safetyreportversion }
     *
     */
    public Safetyreportversion getSafetyreportversion()
    {
        return safetyreportversion;
    }

    /**
     * Sets the value of the safetyreportversion property.
     *
     * @param value allowed object is {@link Safetyreportversion }
     *
     */
    public void setSafetyreportversion( Safetyreportversion value )
    {
        this.safetyreportversion = value;
    }

    /**
     * Gets the value of the safetyreportid property.
     *
     * @return possible object is {@link Safetyreportid }
     *
     */
    public Safetyreportid getSafetyreportid()
    {
        return safetyreportid;
    }

    /**
     * Sets the value of the safetyreportid property.
     *
     * @param value allowed object is {@link Safetyreportid }
     *
     */
    public void setSafetyreportid( Safetyreportid value )
    {
        this.safetyreportid = value;
    }

    /**
     * Gets the value of the primarysourcecountry property.
     *
     * @return possible object is {@link Primarysourcecountry }
     *
     */
    public Primarysourcecountry getPrimarysourcecountry()
    {
        return primarysourcecountry;
    }

    /**
     * Sets the value of the primarysourcecountry property.
     *
     * @param value allowed object is {@link Primarysourcecountry }
     *
     */
    public void setPrimarysourcecountry( Primarysourcecountry value )
    {
        this.primarysourcecountry = value;
    }

    /**
     * Gets the value of the occurcountry property.
     *
     * @return possible object is {@link Occurcountry }
     *
     */
    public Occurcountry getOccurcountry()
    {
        return occurcountry;
    }

    /**
     * Sets the value of the occurcountry property.
     *
     * @param value allowed object is {@link Occurcountry }
     *
     */
    public void setOccurcountry( Occurcountry value )
    {
        this.occurcountry = value;
    }

    /**
     * Gets the value of the transmissiondateformat property.
     *
     * @return possible object is {@link Transmissiondateformat }
     *
     */
    public Transmissiondateformat getTransmissiondateformat()
    {
        return transmissiondateformat;
    }

    /**
     * Sets the value of the transmissiondateformat property.
     *
     * @param value allowed object is {@link Transmissiondateformat }
     *
     */
    public void setTransmissiondateformat( Transmissiondateformat value )
    {
        this.transmissiondateformat = value;
    }

    /**
     * Gets the value of the transmissiondate property.
     *
     * @return possible object is {@link Transmissiondate }
     *
     */
    public Transmissiondate getTransmissiondate()
    {
        return transmissiondate;
    }

    /**
     * Sets the value of the transmissiondate property.
     *
     * @param value allowed object is {@link Transmissiondate }
     *
     */
    public void setTransmissiondate( Transmissiondate value )
    {
        this.transmissiondate = value;
    }

    /**
     * Gets the value of the reporttype property.
     *
     * @return possible object is {@link Reporttype }
     *
     */
    public Reporttype getReporttype()
    {
        return reporttype;
    }

    /**
     * Sets the value of the reporttype property.
     *
     * @param value allowed object is {@link Reporttype }
     *
     */
    public void setReporttype( Reporttype value )
    {
        this.reporttype = value;
    }

    /**
     * Gets the value of the serious property.
     *
     * @return possible object is {@link Serious }
     *
     */
    public Serious getSerious()
    {
        return serious;
    }

    /**
     * Sets the value of the serious property.
     *
     * @param value allowed object is {@link Serious }
     *
     */
    public void setSerious( Serious value )
    {
        this.serious = value;
    }

    /**
     * Gets the value of the seriousnessdeath property.
     *
     * @return possible object is {@link Seriousnessdeath }
     *
     */
    public Seriousnessdeath getSeriousnessdeath()
    {
        return seriousnessdeath;
    }

    /**
     * Sets the value of the seriousnessdeath property.
     *
     * @param value allowed object is {@link Seriousnessdeath }
     *
     */
    public void setSeriousnessdeath( Seriousnessdeath value )
    {
        this.seriousnessdeath = value;
    }

    /**
     * Gets the value of the seriousnesslifethreatening property.
     *
     * @return possible object is {@link Seriousnesslifethreatening }
     *
     */
    public Seriousnesslifethreatening getSeriousnesslifethreatening()
    {
        return seriousnesslifethreatening;
    }

    /**
     * Sets the value of the seriousnesslifethreatening property.
     *
     * @param value allowed object is {@link Seriousnesslifethreatening }
     *
     */
    public void setSeriousnesslifethreatening( Seriousnesslifethreatening value )
    {
        this.seriousnesslifethreatening = value;
    }

    /**
     * Gets the value of the seriousnesshospitalization property.
     *
     * @return possible object is {@link Seriousnesshospitalization }
     *
     */
    public Seriousnesshospitalization getSeriousnesshospitalization()
    {
        return seriousnesshospitalization;
    }

    /**
     * Sets the value of the seriousnesshospitalization property.
     *
     * @param value allowed object is {@link Seriousnesshospitalization }
     *
     */
    public void setSeriousnesshospitalization( Seriousnesshospitalization value )
    {
        this.seriousnesshospitalization = value;
    }

    /**
     * Gets the value of the seriousnessdisabling property.
     *
     * @return possible object is {@link Seriousnessdisabling }
     *
     */
    public Seriousnessdisabling getSeriousnessdisabling()
    {
        return seriousnessdisabling;
    }

    /**
     * Sets the value of the seriousnessdisabling property.
     *
     * @param value allowed object is {@link Seriousnessdisabling }
     *
     */
    public void setSeriousnessdisabling( Seriousnessdisabling value )
    {
        this.seriousnessdisabling = value;
    }

    /**
     * Gets the value of the seriousnesscongenitalanomali property.
     *
     * @return possible object is {@link Seriousnesscongenitalanomali }
     *
     */
    public Seriousnesscongenitalanomali getSeriousnesscongenitalanomali()
    {
        return seriousnesscongenitalanomali;
    }

    /**
     * Sets the value of the seriousnesscongenitalanomali property.
     *
     * @param value allowed object is {@link Seriousnesscongenitalanomali }
     *
     */
    public void setSeriousnesscongenitalanomali( Seriousnesscongenitalanomali value )
    {
        this.seriousnesscongenitalanomali = value;
    }

    /**
     * Gets the value of the seriousnessother property.
     *
     * @return possible object is {@link Seriousnessother }
     *
     */
    public Seriousnessother getSeriousnessother()
    {
        return seriousnessother;
    }

    /**
     * Sets the value of the seriousnessother property.
     *
     * @param value allowed object is {@link Seriousnessother }
     *
     */
    public void setSeriousnessother( Seriousnessother value )
    {
        this.seriousnessother = value;
    }

    /**
     * Gets the value of the receivedateformat property.
     *
     * @return possible object is {@link Receivedateformat }
     *
     */
    public Receivedateformat getReceivedateformat()
    {
        return receivedateformat;
    }

    /**
     * Sets the value of the receivedateformat property.
     *
     * @param value allowed object is {@link Receivedateformat }
     *
     */
    public void setReceivedateformat( Receivedateformat value )
    {
        this.receivedateformat = value;
    }

    /**
     * Gets the value of the receivedate property.
     *
     * @return possible object is {@link Receivedate }
     *
     */
    public Receivedate getReceivedate()
    {
        return receivedate;
    }

    /**
     * Sets the value of the receivedate property.
     *
     * @param value allowed object is {@link Receivedate }
     *
     */
    public void setReceivedate( Receivedate value )
    {
        this.receivedate = value;
    }

    /**
     * Gets the value of the receiptdateformat property.
     *
     * @return possible object is {@link Receiptdateformat }
     *
     */
    public Receiptdateformat getReceiptdateformat()
    {
        return receiptdateformat;
    }

    /**
     * Sets the value of the receiptdateformat property.
     *
     * @param value allowed object is {@link Receiptdateformat }
     *
     */
    public void setReceiptdateformat( Receiptdateformat value )
    {
        this.receiptdateformat = value;
    }

    /**
     * Gets the value of the receiptdate property.
     *
     * @return possible object is {@link Receiptdate }
     *
     */
    public Receiptdate getReceiptdate()
    {
        return receiptdate;
    }

    /**
     * Sets the value of the receiptdate property.
     *
     * @param value allowed object is {@link Receiptdate }
     *
     */
    public void setReceiptdate( Receiptdate value )
    {
        this.receiptdate = value;
    }

    /**
     * Gets the value of the additionaldocument property.
     *
     * @return possible object is {@link Additionaldocument }
     *
     */
    public Additionaldocument getAdditionaldocument()
    {
        return additionaldocument;
    }

    /**
     * Sets the value of the additionaldocument property.
     *
     * @param value allowed object is {@link Additionaldocument }
     *
     */
    public void setAdditionaldocument( Additionaldocument value )
    {
        this.additionaldocument = value;
    }

    /**
     * Gets the value of the documentlist property.
     *
     * @return possible object is {@link Documentlist }
     *
     */
    public Documentlist getDocumentlist()
    {
        return documentlist;
    }

    /**
     * Sets the value of the documentlist property.
     *
     * @param value allowed object is {@link Documentlist }
     *
     */
    public void setDocumentlist( Documentlist value )
    {
        this.documentlist = value;
    }

    /**
     * Gets the value of the fulfillexpeditecriteria property.
     *
     * @return possible object is {@link Fulfillexpeditecriteria }
     *
     */
    public Fulfillexpeditecriteria getFulfillexpeditecriteria()
    {
        return fulfillexpeditecriteria;
    }

    /**
     * Sets the value of the fulfillexpeditecriteria property.
     *
     * @param value allowed object is {@link Fulfillexpeditecriteria }
     *
     */
    public void setFulfillexpeditecriteria( Fulfillexpeditecriteria value )
    {
        this.fulfillexpeditecriteria = value;
    }

    /**
     * Gets the value of the authoritynumb property.
     *
     * @return possible object is {@link Authoritynumb }
     *
     */
    public Authoritynumb getAuthoritynumb()
    {
        return authoritynumb;
    }

    /**
     * Sets the value of the authoritynumb property.
     *
     * @param value allowed object is {@link Authoritynumb }
     *
     */
    public void setAuthoritynumb( Authoritynumb value )
    {
        this.authoritynumb = value;
    }

    /**
     * Gets the value of the companynumb property.
     *
     * @return possible object is {@link Companynumb }
     *
     */
    public Companynumb getCompanynumb()
    {
        return companynumb;
    }

    /**
     * Sets the value of the companynumb property.
     *
     * @param value allowed object is {@link Companynumb }
     *
     */
    public void setCompanynumb( Companynumb value )
    {
        this.companynumb = value;
    }

    /**
     * Gets the value of the duplicate property.
     *
     * @return possible object is {@link Duplicate }
     *
     */
    public Duplicate getDuplicate()
    {
        return duplicate;
    }

    /**
     * Sets the value of the duplicate property.
     *
     * @param value allowed object is {@link Duplicate }
     *
     */
    public void setDuplicate( Duplicate value )
    {
        this.duplicate = value;
    }

    /**
     * Gets the value of the casenullification property.
     *
     * @return possible object is {@link Casenullification }
     *
     */
    public Casenullification getCasenullification()
    {
        return casenullification;
    }

    /**
     * Sets the value of the casenullification property.
     *
     * @param value allowed object is {@link Casenullification }
     *
     */
    public void setCasenullification( Casenullification value )
    {
        this.casenullification = value;
    }

    /**
     * Gets the value of the nullificationreason property.
     *
     * @return possible object is {@link Nullificationreason }
     *
     */
    public Nullificationreason getNullificationreason()
    {
        return nullificationreason;
    }

    /**
     * Sets the value of the nullificationreason property.
     *
     * @param value allowed object is {@link Nullificationreason }
     *
     */
    public void setNullificationreason( Nullificationreason value )
    {
        this.nullificationreason = value;
    }

    /**
     * Gets the value of the medicallyconfirm property.
     *
     * @return possible object is {@link Medicallyconfirm }
     *
     */
    public Medicallyconfirm getMedicallyconfirm()
    {
        return medicallyconfirm;
    }

    /**
     * Sets the value of the medicallyconfirm property.
     *
     * @param value allowed object is {@link Medicallyconfirm }
     *
     */
    public void setMedicallyconfirm( Medicallyconfirm value )
    {
        this.medicallyconfirm = value;
    }

    /**
     * Gets the value of the reportduplicate property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the reportduplicate property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getReportduplicate().add( newItem );
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reportduplicate }
     *
     *
     */
    public List<Reportduplicate> getReportduplicate()
    {
        if ( reportduplicate == null )
        {
            reportduplicate = new ArrayList<Reportduplicate>();
        }
        return this.reportduplicate;
    }

    /**
     * Gets the value of the linkedreport property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the linkedreport property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getLinkedreport().add( newItem );
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Linkedreport }
     *
     *
     */
    public List<Linkedreport> getLinkedreport()
    {
        if ( linkedreport == null )
        {
            linkedreport = new ArrayList<Linkedreport>();
        }
        return this.linkedreport;
    }

    /**
     * Gets the value of the primarysource property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the primarysource property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getPrimarysource().add( newItem );
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Primarysource }
     *
     *
     */
    public List<Primarysource> getPrimarysource()
    {
        if ( primarysource == null )
        {
            primarysource = new ArrayList<Primarysource>();
        }
        return this.primarysource;
    }

    /**
     * Gets the value of the sender property.
     *
     * @return possible object is {@link Sender }
     *
     */
    public Sender getSender()
    {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     *
     * @param value allowed object is {@link Sender }
     *
     */
    public void setSender( Sender value )
    {
        this.sender = value;
    }

    /**
     * Gets the value of the receiver property.
     *
     * @return possible object is {@link Receiver }
     *
     */
    public Receiver getReceiver()
    {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     *
     * @param value allowed object is {@link Receiver }
     *
     */
    public void setReceiver( Receiver value )
    {
        this.receiver = value;
    }

    /**
     * Gets the value of the patient property.
     *
     * @return possible object is {@link Patient }
     *
     */
    public Patient getPatient()
    {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     *
     * @param value allowed object is {@link Patient }
     *
     */
    public void setPatient( Patient value )
    {
        this.patient = value;
    }

}
