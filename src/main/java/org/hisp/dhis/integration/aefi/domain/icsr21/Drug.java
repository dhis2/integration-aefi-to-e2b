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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "", propOrder = {
    "drugcharacterization",
    "medicinalproduct",
    "obtaindrugcountry",
    "drugbatchnumb",
    "drugauthorizationnumb",
    "drugauthorizationcountry",
    "drugauthorizationholder",
    "drugstructuredosagenumb",
    "drugstructuredosageunit",
    "drugseparatedosagenumb",
    "drugintervaldosageunitnumb",
    "drugintervaldosagedefinition",
    "drugcumulativedosagenumb",
    "drugcumulativedosageunit",
    "drugdosagetext",
    "drugdosageform",
    "drugadministrationroute",
    "drugparadministration",
    "reactiongestationperiod",
    "reactiongestationperiodunit",
    "drugindicationmeddraversion",
    "drugindication",
    "drugstartdateformat",
    "drugstartdate",
    "drugstartperiod",
    "drugstartperiodunit",
    "druglastperiod",
    "druglastperiodunit",
    "drugenddateformat",
    "drugenddate",
    "drugtreatmentduration",
    "drugtreatmentdurationunit",
    "actiondrug",
    "drugrecurreadministration",
    "drugadditional",
    "activesubstance",
    "drugrecurrence",
    "drugreactionrelatedness"
} )
@XmlRootElement( name = "drug" )
public class Drug
{

    @XmlAttribute( name = "lang" )
    @XmlJavaTypeAdapter( NormalizedStringAdapter.class )
    protected String lang;

    protected Drugcharacterization drugcharacterization;

    protected Medicinalproduct medicinalproduct;

    protected Obtaindrugcountry obtaindrugcountry;

    protected Drugbatchnumb drugbatchnumb;

    protected Drugauthorizationnumb drugauthorizationnumb;

    protected Drugauthorizationcountry drugauthorizationcountry;

    protected Drugauthorizationholder drugauthorizationholder;

    protected Drugstructuredosagenumb drugstructuredosagenumb;

    protected Drugstructuredosageunit drugstructuredosageunit;

    protected Drugseparatedosagenumb drugseparatedosagenumb;

    protected Drugintervaldosageunitnumb drugintervaldosageunitnumb;

    protected Drugintervaldosagedefinition drugintervaldosagedefinition;

    protected Drugcumulativedosagenumb drugcumulativedosagenumb;

    protected Drugcumulativedosageunit drugcumulativedosageunit;

    protected Drugdosagetext drugdosagetext;

    protected Drugdosageform drugdosageform;

    protected Drugadministrationroute drugadministrationroute;

    protected Drugparadministration drugparadministration;

    protected Reactiongestationperiod reactiongestationperiod;

    protected Reactiongestationperiodunit reactiongestationperiodunit;

    protected Drugindicationmeddraversion drugindicationmeddraversion;

    protected Drugindication drugindication;

    protected Drugstartdateformat drugstartdateformat;

    protected Drugstartdate drugstartdate;

    protected Drugstartperiod drugstartperiod;

    protected Drugstartperiodunit drugstartperiodunit;

    protected Druglastperiod druglastperiod;

    protected Druglastperiodunit druglastperiodunit;

    protected Drugenddateformat drugenddateformat;

    protected Drugenddate drugenddate;

    protected Drugtreatmentduration drugtreatmentduration;

    protected Drugtreatmentdurationunit drugtreatmentdurationunit;

    protected Actiondrug actiondrug;

    protected Drugrecurreadministration drugrecurreadministration;

    protected Drugadditional drugadditional;

    protected List<Activesubstance> activesubstance;

    protected List<Drugrecurrence> drugrecurrence;

    protected List<Drugreactionrelatedness> drugreactionrelatedness;

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
     * Gets the value of the drugcharacterization property.
     *
     * @return possible object is {@link Drugcharacterization }
     *
     */
    public Drugcharacterization getDrugcharacterization()
    {
        return drugcharacterization;
    }

    /**
     * Sets the value of the drugcharacterization property.
     *
     * @param value allowed object is {@link Drugcharacterization }
     *
     */
    public void setDrugcharacterization( Drugcharacterization value )
    {
        this.drugcharacterization = value;
    }

    /**
     * Gets the value of the medicinalproduct property.
     *
     * @return possible object is {@link Medicinalproduct }
     *
     */
    public Medicinalproduct getMedicinalproduct()
    {
        return medicinalproduct;
    }

    /**
     * Sets the value of the medicinalproduct property.
     *
     * @param value allowed object is {@link Medicinalproduct }
     *
     */
    public void setMedicinalproduct( Medicinalproduct value )
    {
        this.medicinalproduct = value;
    }

    /**
     * Gets the value of the obtaindrugcountry property.
     *
     * @return possible object is {@link Obtaindrugcountry }
     *
     */
    public Obtaindrugcountry getObtaindrugcountry()
    {
        return obtaindrugcountry;
    }

    /**
     * Sets the value of the obtaindrugcountry property.
     *
     * @param value allowed object is {@link Obtaindrugcountry }
     *
     */
    public void setObtaindrugcountry( Obtaindrugcountry value )
    {
        this.obtaindrugcountry = value;
    }

    /**
     * Gets the value of the drugbatchnumb property.
     *
     * @return possible object is {@link Drugbatchnumb }
     *
     */
    public Drugbatchnumb getDrugbatchnumb()
    {
        return drugbatchnumb;
    }

    /**
     * Sets the value of the drugbatchnumb property.
     *
     * @param value allowed object is {@link Drugbatchnumb }
     *
     */
    public void setDrugbatchnumb( Drugbatchnumb value )
    {
        this.drugbatchnumb = value;
    }

    /**
     * Gets the value of the drugauthorizationnumb property.
     *
     * @return possible object is {@link Drugauthorizationnumb }
     *
     */
    public Drugauthorizationnumb getDrugauthorizationnumb()
    {
        return drugauthorizationnumb;
    }

    /**
     * Sets the value of the drugauthorizationnumb property.
     *
     * @param value allowed object is {@link Drugauthorizationnumb }
     *
     */
    public void setDrugauthorizationnumb( Drugauthorizationnumb value )
    {
        this.drugauthorizationnumb = value;
    }

    /**
     * Gets the value of the drugauthorizationcountry property.
     *
     * @return possible object is {@link Drugauthorizationcountry }
     *
     */
    public Drugauthorizationcountry getDrugauthorizationcountry()
    {
        return drugauthorizationcountry;
    }

    /**
     * Sets the value of the drugauthorizationcountry property.
     *
     * @param value allowed object is {@link Drugauthorizationcountry }
     *
     */
    public void setDrugauthorizationcountry( Drugauthorizationcountry value )
    {
        this.drugauthorizationcountry = value;
    }

    /**
     * Gets the value of the drugauthorizationholder property.
     *
     * @return possible object is {@link Drugauthorizationholder }
     *
     */
    public Drugauthorizationholder getDrugauthorizationholder()
    {
        return drugauthorizationholder;
    }

    /**
     * Sets the value of the drugauthorizationholder property.
     *
     * @param value allowed object is {@link Drugauthorizationholder }
     *
     */
    public void setDrugauthorizationholder( Drugauthorizationholder value )
    {
        this.drugauthorizationholder = value;
    }

    /**
     * Gets the value of the drugstructuredosagenumb property.
     *
     * @return possible object is {@link Drugstructuredosagenumb }
     *
     */
    public Drugstructuredosagenumb getDrugstructuredosagenumb()
    {
        return drugstructuredosagenumb;
    }

    /**
     * Sets the value of the drugstructuredosagenumb property.
     *
     * @param value allowed object is {@link Drugstructuredosagenumb }
     *
     */
    public void setDrugstructuredosagenumb( Drugstructuredosagenumb value )
    {
        this.drugstructuredosagenumb = value;
    }

    /**
     * Gets the value of the drugstructuredosageunit property.
     *
     * @return possible object is {@link Drugstructuredosageunit }
     *
     */
    public Drugstructuredosageunit getDrugstructuredosageunit()
    {
        return drugstructuredosageunit;
    }

    /**
     * Sets the value of the drugstructuredosageunit property.
     *
     * @param value allowed object is {@link Drugstructuredosageunit }
     *
     */
    public void setDrugstructuredosageunit( Drugstructuredosageunit value )
    {
        this.drugstructuredosageunit = value;
    }

    /**
     * Gets the value of the drugseparatedosagenumb property.
     *
     * @return possible object is {@link Drugseparatedosagenumb }
     *
     */
    public Drugseparatedosagenumb getDrugseparatedosagenumb()
    {
        return drugseparatedosagenumb;
    }

    /**
     * Sets the value of the drugseparatedosagenumb property.
     *
     * @param value allowed object is {@link Drugseparatedosagenumb }
     *
     */
    public void setDrugseparatedosagenumb( Drugseparatedosagenumb value )
    {
        this.drugseparatedosagenumb = value;
    }

    /**
     * Gets the value of the drugintervaldosageunitnumb property.
     *
     * @return possible object is {@link Drugintervaldosageunitnumb }
     *
     */
    public Drugintervaldosageunitnumb getDrugintervaldosageunitnumb()
    {
        return drugintervaldosageunitnumb;
    }

    /**
     * Sets the value of the drugintervaldosageunitnumb property.
     *
     * @param value allowed object is {@link Drugintervaldosageunitnumb }
     *
     */
    public void setDrugintervaldosageunitnumb( Drugintervaldosageunitnumb value )
    {
        this.drugintervaldosageunitnumb = value;
    }

    /**
     * Gets the value of the drugintervaldosagedefinition property.
     *
     * @return possible object is {@link Drugintervaldosagedefinition }
     *
     */
    public Drugintervaldosagedefinition getDrugintervaldosagedefinition()
    {
        return drugintervaldosagedefinition;
    }

    /**
     * Sets the value of the drugintervaldosagedefinition property.
     *
     * @param value allowed object is {@link Drugintervaldosagedefinition }
     *
     */
    public void setDrugintervaldosagedefinition( Drugintervaldosagedefinition value )
    {
        this.drugintervaldosagedefinition = value;
    }

    /**
     * Gets the value of the drugcumulativedosagenumb property.
     *
     * @return possible object is {@link Drugcumulativedosagenumb }
     *
     */
    public Drugcumulativedosagenumb getDrugcumulativedosagenumb()
    {
        return drugcumulativedosagenumb;
    }

    /**
     * Sets the value of the drugcumulativedosagenumb property.
     *
     * @param value allowed object is {@link Drugcumulativedosagenumb }
     *
     */
    public void setDrugcumulativedosagenumb( Drugcumulativedosagenumb value )
    {
        this.drugcumulativedosagenumb = value;
    }

    /**
     * Gets the value of the drugcumulativedosageunit property.
     *
     * @return possible object is {@link Drugcumulativedosageunit }
     *
     */
    public Drugcumulativedosageunit getDrugcumulativedosageunit()
    {
        return drugcumulativedosageunit;
    }

    /**
     * Sets the value of the drugcumulativedosageunit property.
     *
     * @param value allowed object is {@link Drugcumulativedosageunit }
     *
     */
    public void setDrugcumulativedosageunit( Drugcumulativedosageunit value )
    {
        this.drugcumulativedosageunit = value;
    }

    /**
     * Gets the value of the drugdosagetext property.
     *
     * @return possible object is {@link Drugdosagetext }
     *
     */
    public Drugdosagetext getDrugdosagetext()
    {
        return drugdosagetext;
    }

    /**
     * Sets the value of the drugdosagetext property.
     *
     * @param value allowed object is {@link Drugdosagetext }
     *
     */
    public void setDrugdosagetext( Drugdosagetext value )
    {
        this.drugdosagetext = value;
    }

    /**
     * Gets the value of the drugdosageform property.
     *
     * @return possible object is {@link Drugdosageform }
     *
     */
    public Drugdosageform getDrugdosageform()
    {
        return drugdosageform;
    }

    /**
     * Sets the value of the drugdosageform property.
     *
     * @param value allowed object is {@link Drugdosageform }
     *
     */
    public void setDrugdosageform( Drugdosageform value )
    {
        this.drugdosageform = value;
    }

    /**
     * Gets the value of the drugadministrationroute property.
     *
     * @return possible object is {@link Drugadministrationroute }
     *
     */
    public Drugadministrationroute getDrugadministrationroute()
    {
        return drugadministrationroute;
    }

    /**
     * Sets the value of the drugadministrationroute property.
     *
     * @param value allowed object is {@link Drugadministrationroute }
     *
     */
    public void setDrugadministrationroute( Drugadministrationroute value )
    {
        this.drugadministrationroute = value;
    }

    /**
     * Gets the value of the drugparadministration property.
     *
     * @return possible object is {@link Drugparadministration }
     *
     */
    public Drugparadministration getDrugparadministration()
    {
        return drugparadministration;
    }

    /**
     * Sets the value of the drugparadministration property.
     *
     * @param value allowed object is {@link Drugparadministration }
     *
     */
    public void setDrugparadministration( Drugparadministration value )
    {
        this.drugparadministration = value;
    }

    /**
     * Gets the value of the reactiongestationperiod property.
     *
     * @return possible object is {@link Reactiongestationperiod }
     *
     */
    public Reactiongestationperiod getReactiongestationperiod()
    {
        return reactiongestationperiod;
    }

    /**
     * Sets the value of the reactiongestationperiod property.
     *
     * @param value allowed object is {@link Reactiongestationperiod }
     *
     */
    public void setReactiongestationperiod( Reactiongestationperiod value )
    {
        this.reactiongestationperiod = value;
    }

    /**
     * Gets the value of the reactiongestationperiodunit property.
     *
     * @return possible object is {@link Reactiongestationperiodunit }
     *
     */
    public Reactiongestationperiodunit getReactiongestationperiodunit()
    {
        return reactiongestationperiodunit;
    }

    /**
     * Sets the value of the reactiongestationperiodunit property.
     *
     * @param value allowed object is {@link Reactiongestationperiodunit }
     *
     */
    public void setReactiongestationperiodunit( Reactiongestationperiodunit value )
    {
        this.reactiongestationperiodunit = value;
    }

    /**
     * Gets the value of the drugindicationmeddraversion property.
     *
     * @return possible object is {@link Drugindicationmeddraversion }
     *
     */
    public Drugindicationmeddraversion getDrugindicationmeddraversion()
    {
        return drugindicationmeddraversion;
    }

    /**
     * Sets the value of the drugindicationmeddraversion property.
     *
     * @param value allowed object is {@link Drugindicationmeddraversion }
     *
     */
    public void setDrugindicationmeddraversion( Drugindicationmeddraversion value )
    {
        this.drugindicationmeddraversion = value;
    }

    /**
     * Gets the value of the drugindication property.
     *
     * @return possible object is {@link Drugindication }
     *
     */
    public Drugindication getDrugindication()
    {
        return drugindication;
    }

    /**
     * Sets the value of the drugindication property.
     *
     * @param value allowed object is {@link Drugindication }
     *
     */
    public void setDrugindication( Drugindication value )
    {
        this.drugindication = value;
    }

    /**
     * Gets the value of the drugstartdateformat property.
     *
     * @return possible object is {@link Drugstartdateformat }
     *
     */
    public Drugstartdateformat getDrugstartdateformat()
    {
        return drugstartdateformat;
    }

    /**
     * Sets the value of the drugstartdateformat property.
     *
     * @param value allowed object is {@link Drugstartdateformat }
     *
     */
    public void setDrugstartdateformat( Drugstartdateformat value )
    {
        this.drugstartdateformat = value;
    }

    /**
     * Gets the value of the drugstartdate property.
     *
     * @return possible object is {@link Drugstartdate }
     *
     */
    public Drugstartdate getDrugstartdate()
    {
        return drugstartdate;
    }

    /**
     * Sets the value of the drugstartdate property.
     *
     * @param value allowed object is {@link Drugstartdate }
     *
     */
    public void setDrugstartdate( Drugstartdate value )
    {
        this.drugstartdate = value;
    }

    /**
     * Gets the value of the drugstartperiod property.
     *
     * @return possible object is {@link Drugstartperiod }
     *
     */
    public Drugstartperiod getDrugstartperiod()
    {
        return drugstartperiod;
    }

    /**
     * Sets the value of the drugstartperiod property.
     *
     * @param value allowed object is {@link Drugstartperiod }
     *
     */
    public void setDrugstartperiod( Drugstartperiod value )
    {
        this.drugstartperiod = value;
    }

    /**
     * Gets the value of the drugstartperiodunit property.
     *
     * @return possible object is {@link Drugstartperiodunit }
     *
     */
    public Drugstartperiodunit getDrugstartperiodunit()
    {
        return drugstartperiodunit;
    }

    /**
     * Sets the value of the drugstartperiodunit property.
     *
     * @param value allowed object is {@link Drugstartperiodunit }
     *
     */
    public void setDrugstartperiodunit( Drugstartperiodunit value )
    {
        this.drugstartperiodunit = value;
    }

    /**
     * Gets the value of the druglastperiod property.
     *
     * @return possible object is {@link Druglastperiod }
     *
     */
    public Druglastperiod getDruglastperiod()
    {
        return druglastperiod;
    }

    /**
     * Sets the value of the druglastperiod property.
     *
     * @param value allowed object is {@link Druglastperiod }
     *
     */
    public void setDruglastperiod( Druglastperiod value )
    {
        this.druglastperiod = value;
    }

    /**
     * Gets the value of the druglastperiodunit property.
     *
     * @return possible object is {@link Druglastperiodunit }
     *
     */
    public Druglastperiodunit getDruglastperiodunit()
    {
        return druglastperiodunit;
    }

    /**
     * Sets the value of the druglastperiodunit property.
     *
     * @param value allowed object is {@link Druglastperiodunit }
     *
     */
    public void setDruglastperiodunit( Druglastperiodunit value )
    {
        this.druglastperiodunit = value;
    }

    /**
     * Gets the value of the drugenddateformat property.
     *
     * @return possible object is {@link Drugenddateformat }
     *
     */
    public Drugenddateformat getDrugenddateformat()
    {
        return drugenddateformat;
    }

    /**
     * Sets the value of the drugenddateformat property.
     *
     * @param value allowed object is {@link Drugenddateformat }
     *
     */
    public void setDrugenddateformat( Drugenddateformat value )
    {
        this.drugenddateformat = value;
    }

    /**
     * Gets the value of the drugenddate property.
     *
     * @return possible object is {@link Drugenddate }
     *
     */
    public Drugenddate getDrugenddate()
    {
        return drugenddate;
    }

    /**
     * Sets the value of the drugenddate property.
     *
     * @param value allowed object is {@link Drugenddate }
     *
     */
    public void setDrugenddate( Drugenddate value )
    {
        this.drugenddate = value;
    }

    /**
     * Gets the value of the drugtreatmentduration property.
     *
     * @return possible object is {@link Drugtreatmentduration }
     *
     */
    public Drugtreatmentduration getDrugtreatmentduration()
    {
        return drugtreatmentduration;
    }

    /**
     * Sets the value of the drugtreatmentduration property.
     *
     * @param value allowed object is {@link Drugtreatmentduration }
     *
     */
    public void setDrugtreatmentduration( Drugtreatmentduration value )
    {
        this.drugtreatmentduration = value;
    }

    /**
     * Gets the value of the drugtreatmentdurationunit property.
     *
     * @return possible object is {@link Drugtreatmentdurationunit }
     *
     */
    public Drugtreatmentdurationunit getDrugtreatmentdurationunit()
    {
        return drugtreatmentdurationunit;
    }

    /**
     * Sets the value of the drugtreatmentdurationunit property.
     *
     * @param value allowed object is {@link Drugtreatmentdurationunit }
     *
     */
    public void setDrugtreatmentdurationunit( Drugtreatmentdurationunit value )
    {
        this.drugtreatmentdurationunit = value;
    }

    /**
     * Gets the value of the actiondrug property.
     *
     * @return possible object is {@link Actiondrug }
     *
     */
    public Actiondrug getActiondrug()
    {
        return actiondrug;
    }

    /**
     * Sets the value of the actiondrug property.
     *
     * @param value allowed object is {@link Actiondrug }
     *
     */
    public void setActiondrug( Actiondrug value )
    {
        this.actiondrug = value;
    }

    /**
     * Gets the value of the drugrecurreadministration property.
     *
     * @return possible object is {@link Drugrecurreadministration }
     *
     */
    public Drugrecurreadministration getDrugrecurreadministration()
    {
        return drugrecurreadministration;
    }

    /**
     * Sets the value of the drugrecurreadministration property.
     *
     * @param value allowed object is {@link Drugrecurreadministration }
     *
     */
    public void setDrugrecurreadministration( Drugrecurreadministration value )
    {
        this.drugrecurreadministration = value;
    }

    /**
     * Gets the value of the drugadditional property.
     *
     * @return possible object is {@link Drugadditional }
     *
     */
    public Drugadditional getDrugadditional()
    {
        return drugadditional;
    }

    /**
     * Sets the value of the drugadditional property.
     *
     * @param value allowed object is {@link Drugadditional }
     *
     */
    public void setDrugadditional( Drugadditional value )
    {
        this.drugadditional = value;
    }

    /**
     * Gets the value of the activesubstance property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the activesubstance property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getActivesubstance().add( newItem );
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Activesubstance }
     *
     *
     */
    public List<Activesubstance> getActivesubstance()
    {
        if ( activesubstance == null )
        {
            activesubstance = new ArrayList<Activesubstance>();
        }
        return this.activesubstance;
    }

    /**
     * Gets the value of the drugrecurrence property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the drugrecurrence property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getDrugrecurrence().add( newItem );
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Drugrecurrence }
     *
     *
     */
    public List<Drugrecurrence> getDrugrecurrence()
    {
        if ( drugrecurrence == null )
        {
            drugrecurrence = new ArrayList<Drugrecurrence>();
        }
        return this.drugrecurrence;
    }

    /**
     * Gets the value of the drugreactionrelatedness property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the drugreactionrelatedness property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getDrugreactionrelatedness().add( newItem );
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Drugreactionrelatedness }
     *
     *
     */
    public List<Drugreactionrelatedness> getDrugreactionrelatedness()
    {
        if ( drugreactionrelatedness == null )
        {
            drugreactionrelatedness = new ArrayList<Drugreactionrelatedness>();
        }
        return this.drugreactionrelatedness;
    }

}
