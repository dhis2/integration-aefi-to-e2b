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
    "patientinitial",
    "patientgpmedicalrecordnumb",
    "patientspecialistrecordnumb",
    "patienthospitalrecordnumb",
    "patientinvestigationnumb",
    "patientbirthdateformat",
    "patientbirthdate",
    "patientonsetage",
    "patientonsetageunit",
    "gestationperiod",
    "gestationperiodunit",
    "patientagegroup",
    "patientweight",
    "patientheight",
    "patientsex",
    "lastmenstrualdateformat",
    "patientlastmenstrualdate",
    "patientmedicalhistorytext",
    "resultstestsprocedures",
    "medicalhistoryepisode",
    "patientpastdrugtherapy",
    "patientdeath",
    "parent",
    "reaction",
    "test",
    "drug",
    "summary"
} )
@XmlRootElement( name = "patient" )
public class Patient
{

    @XmlAttribute( name = "lang" )
    @XmlJavaTypeAdapter( NormalizedStringAdapter.class )
    protected String lang;

    protected Patientinitial patientinitial;

    protected Patientgpmedicalrecordnumb patientgpmedicalrecordnumb;

    protected Patientspecialistrecordnumb patientspecialistrecordnumb;

    protected Patienthospitalrecordnumb patienthospitalrecordnumb;

    protected Patientinvestigationnumb patientinvestigationnumb;

    protected Patientbirthdateformat patientbirthdateformat;

    protected Patientbirthdate patientbirthdate;

    protected Patientonsetage patientonsetage;

    protected Patientonsetageunit patientonsetageunit;

    protected Gestationperiod gestationperiod;

    protected Gestationperiodunit gestationperiodunit;

    protected Patientagegroup patientagegroup;

    protected Patientweight patientweight;

    protected Patientheight patientheight;

    protected Patientsex patientsex;

    protected Lastmenstrualdateformat lastmenstrualdateformat;

    protected Patientlastmenstrualdate patientlastmenstrualdate;

    protected Patientmedicalhistorytext patientmedicalhistorytext;

    protected Resultstestsprocedures resultstestsprocedures;

    protected List<Medicalhistoryepisode> medicalhistoryepisode;

    protected List<Patientpastdrugtherapy> patientpastdrugtherapy;

    protected Patientdeath patientdeath;

    protected Parent parent;

    @XmlElement( required = true )
    protected List<Reaction> reaction;

    protected List<Test> test;

    @XmlElement( required = true )
    protected List<Drug> drug;

    protected Summary summary;

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
     * Gets the value of the patientinitial property.
     *
     * @return possible object is {@link Patientinitial }
     *
     */
    public Patientinitial getPatientinitial()
    {
        return patientinitial;
    }

    /**
     * Sets the value of the patientinitial property.
     *
     * @param value allowed object is {@link Patientinitial }
     *
     */
    public void setPatientinitial( Patientinitial value )
    {
        this.patientinitial = value;
    }

    /**
     * Gets the value of the patientgpmedicalrecordnumb property.
     *
     * @return possible object is {@link Patientgpmedicalrecordnumb }
     *
     */
    public Patientgpmedicalrecordnumb getPatientgpmedicalrecordnumb()
    {
        return patientgpmedicalrecordnumb;
    }

    /**
     * Sets the value of the patientgpmedicalrecordnumb property.
     *
     * @param value allowed object is {@link Patientgpmedicalrecordnumb }
     *
     */
    public void setPatientgpmedicalrecordnumb( Patientgpmedicalrecordnumb value )
    {
        this.patientgpmedicalrecordnumb = value;
    }

    /**
     * Gets the value of the patientspecialistrecordnumb property.
     *
     * @return possible object is {@link Patientspecialistrecordnumb }
     *
     */
    public Patientspecialistrecordnumb getPatientspecialistrecordnumb()
    {
        return patientspecialistrecordnumb;
    }

    /**
     * Sets the value of the patientspecialistrecordnumb property.
     *
     * @param value allowed object is {@link Patientspecialistrecordnumb }
     *
     */
    public void setPatientspecialistrecordnumb( Patientspecialistrecordnumb value )
    {
        this.patientspecialistrecordnumb = value;
    }

    /**
     * Gets the value of the patienthospitalrecordnumb property.
     *
     * @return possible object is {@link Patienthospitalrecordnumb }
     *
     */
    public Patienthospitalrecordnumb getPatienthospitalrecordnumb()
    {
        return patienthospitalrecordnumb;
    }

    /**
     * Sets the value of the patienthospitalrecordnumb property.
     *
     * @param value allowed object is {@link Patienthospitalrecordnumb }
     *
     */
    public void setPatienthospitalrecordnumb( Patienthospitalrecordnumb value )
    {
        this.patienthospitalrecordnumb = value;
    }

    /**
     * Gets the value of the patientinvestigationnumb property.
     *
     * @return possible object is {@link Patientinvestigationnumb }
     *
     */
    public Patientinvestigationnumb getPatientinvestigationnumb()
    {
        return patientinvestigationnumb;
    }

    /**
     * Sets the value of the patientinvestigationnumb property.
     *
     * @param value allowed object is {@link Patientinvestigationnumb }
     *
     */
    public void setPatientinvestigationnumb( Patientinvestigationnumb value )
    {
        this.patientinvestigationnumb = value;
    }

    /**
     * Gets the value of the patientbirthdateformat property.
     *
     * @return possible object is {@link Patientbirthdateformat }
     *
     */
    public Patientbirthdateformat getPatientbirthdateformat()
    {
        return patientbirthdateformat;
    }

    /**
     * Sets the value of the patientbirthdateformat property.
     *
     * @param value allowed object is {@link Patientbirthdateformat }
     *
     */
    public void setPatientbirthdateformat( Patientbirthdateformat value )
    {
        this.patientbirthdateformat = value;
    }

    /**
     * Gets the value of the patientbirthdate property.
     *
     * @return possible object is {@link Patientbirthdate }
     *
     */
    public Patientbirthdate getPatientbirthdate()
    {
        return patientbirthdate;
    }

    /**
     * Sets the value of the patientbirthdate property.
     *
     * @param value allowed object is {@link Patientbirthdate }
     *
     */
    public void setPatientbirthdate( Patientbirthdate value )
    {
        this.patientbirthdate = value;
    }

    /**
     * Gets the value of the patientonsetage property.
     *
     * @return possible object is {@link Patientonsetage }
     *
     */
    public Patientonsetage getPatientonsetage()
    {
        return patientonsetage;
    }

    /**
     * Sets the value of the patientonsetage property.
     *
     * @param value allowed object is {@link Patientonsetage }
     *
     */
    public void setPatientonsetage( Patientonsetage value )
    {
        this.patientonsetage = value;
    }

    /**
     * Gets the value of the patientonsetageunit property.
     *
     * @return possible object is {@link Patientonsetageunit }
     *
     */
    public Patientonsetageunit getPatientonsetageunit()
    {
        return patientonsetageunit;
    }

    /**
     * Sets the value of the patientonsetageunit property.
     *
     * @param value allowed object is {@link Patientonsetageunit }
     *
     */
    public void setPatientonsetageunit( Patientonsetageunit value )
    {
        this.patientonsetageunit = value;
    }

    /**
     * Gets the value of the gestationperiod property.
     *
     * @return possible object is {@link Gestationperiod }
     *
     */
    public Gestationperiod getGestationperiod()
    {
        return gestationperiod;
    }

    /**
     * Sets the value of the gestationperiod property.
     *
     * @param value allowed object is {@link Gestationperiod }
     *
     */
    public void setGestationperiod( Gestationperiod value )
    {
        this.gestationperiod = value;
    }

    /**
     * Gets the value of the gestationperiodunit property.
     *
     * @return possible object is {@link Gestationperiodunit }
     *
     */
    public Gestationperiodunit getGestationperiodunit()
    {
        return gestationperiodunit;
    }

    /**
     * Sets the value of the gestationperiodunit property.
     *
     * @param value allowed object is {@link Gestationperiodunit }
     *
     */
    public void setGestationperiodunit( Gestationperiodunit value )
    {
        this.gestationperiodunit = value;
    }

    /**
     * Gets the value of the patientagegroup property.
     *
     * @return possible object is {@link Patientagegroup }
     *
     */
    public Patientagegroup getPatientagegroup()
    {
        return patientagegroup;
    }

    /**
     * Sets the value of the patientagegroup property.
     *
     * @param value allowed object is {@link Patientagegroup }
     *
     */
    public void setPatientagegroup( Patientagegroup value )
    {
        this.patientagegroup = value;
    }

    /**
     * Gets the value of the patientweight property.
     *
     * @return possible object is {@link Patientweight }
     *
     */
    public Patientweight getPatientweight()
    {
        return patientweight;
    }

    /**
     * Sets the value of the patientweight property.
     *
     * @param value allowed object is {@link Patientweight }
     *
     */
    public void setPatientweight( Patientweight value )
    {
        this.patientweight = value;
    }

    /**
     * Gets the value of the patientheight property.
     *
     * @return possible object is {@link Patientheight }
     *
     */
    public Patientheight getPatientheight()
    {
        return patientheight;
    }

    /**
     * Sets the value of the patientheight property.
     *
     * @param value allowed object is {@link Patientheight }
     *
     */
    public void setPatientheight( Patientheight value )
    {
        this.patientheight = value;
    }

    /**
     * Gets the value of the patientsex property.
     *
     * @return possible object is {@link Patientsex }
     *
     */
    public Patientsex getPatientsex()
    {
        return patientsex;
    }

    /**
     * Sets the value of the patientsex property.
     *
     * @param value allowed object is {@link Patientsex }
     *
     */
    public void setPatientsex( Patientsex value )
    {
        this.patientsex = value;
    }

    /**
     * Gets the value of the lastmenstrualdateformat property.
     *
     * @return possible object is {@link Lastmenstrualdateformat }
     *
     */
    public Lastmenstrualdateformat getLastmenstrualdateformat()
    {
        return lastmenstrualdateformat;
    }

    /**
     * Sets the value of the lastmenstrualdateformat property.
     *
     * @param value allowed object is {@link Lastmenstrualdateformat }
     *
     */
    public void setLastmenstrualdateformat( Lastmenstrualdateformat value )
    {
        this.lastmenstrualdateformat = value;
    }

    /**
     * Gets the value of the patientlastmenstrualdate property.
     *
     * @return possible object is {@link Patientlastmenstrualdate }
     *
     */
    public Patientlastmenstrualdate getPatientlastmenstrualdate()
    {
        return patientlastmenstrualdate;
    }

    /**
     * Sets the value of the patientlastmenstrualdate property.
     *
     * @param value allowed object is {@link Patientlastmenstrualdate }
     *
     */
    public void setPatientlastmenstrualdate( Patientlastmenstrualdate value )
    {
        this.patientlastmenstrualdate = value;
    }

    /**
     * Gets the value of the patientmedicalhistorytext property.
     *
     * @return possible object is {@link Patientmedicalhistorytext }
     *
     */
    public Patientmedicalhistorytext getPatientmedicalhistorytext()
    {
        return patientmedicalhistorytext;
    }

    /**
     * Sets the value of the patientmedicalhistorytext property.
     *
     * @param value allowed object is {@link Patientmedicalhistorytext }
     *
     */
    public void setPatientmedicalhistorytext( Patientmedicalhistorytext value )
    {
        this.patientmedicalhistorytext = value;
    }

    /**
     * Gets the value of the resultstestsprocedures property.
     *
     * @return possible object is {@link Resultstestsprocedures }
     *
     */
    public Resultstestsprocedures getResultstestsprocedures()
    {
        return resultstestsprocedures;
    }

    /**
     * Sets the value of the resultstestsprocedures property.
     *
     * @param value allowed object is {@link Resultstestsprocedures }
     *
     */
    public void setResultstestsprocedures( Resultstestsprocedures value )
    {
        this.resultstestsprocedures = value;
    }

    /**
     * Gets the value of the medicalhistoryepisode property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the medicalhistoryepisode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getMedicalhistoryepisode().add( newItem );
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Medicalhistoryepisode }
     *
     *
     */
    public List<Medicalhistoryepisode> getMedicalhistoryepisode()
    {
        if ( medicalhistoryepisode == null )
        {
            medicalhistoryepisode = new ArrayList<Medicalhistoryepisode>();
        }
        return this.medicalhistoryepisode;
    }

    /**
     * Gets the value of the patientpastdrugtherapy property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the patientpastdrugtherapy property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getPatientpastdrugtherapy().add( newItem );
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Patientpastdrugtherapy }
     *
     *
     */
    public List<Patientpastdrugtherapy> getPatientpastdrugtherapy()
    {
        if ( patientpastdrugtherapy == null )
        {
            patientpastdrugtherapy = new ArrayList<Patientpastdrugtherapy>();
        }
        return this.patientpastdrugtherapy;
    }

    /**
     * Gets the value of the patientdeath property.
     *
     * @return possible object is {@link Patientdeath }
     *
     */
    public Patientdeath getPatientdeath()
    {
        return patientdeath;
    }

    /**
     * Sets the value of the patientdeath property.
     *
     * @param value allowed object is {@link Patientdeath }
     *
     */
    public void setPatientdeath( Patientdeath value )
    {
        this.patientdeath = value;
    }

    /**
     * Gets the value of the parent property.
     *
     * @return possible object is {@link Parent }
     *
     */
    public Parent getParent()
    {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     *
     * @param value allowed object is {@link Parent }
     *
     */
    public void setParent( Parent value )
    {
        this.parent = value;
    }

    /**
     * Gets the value of the reaction property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the reaction property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getReaction().add( newItem );
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Reaction
     * }
     *
     *
     */
    public List<Reaction> getReaction()
    {
        if ( reaction == null )
        {
            reaction = new ArrayList<Reaction>();
        }
        return this.reaction;
    }

    /**
     * Gets the value of the test property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the test property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getTest().add( newItem );
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Test }
     *
     *
     */
    public List<Test> getTest()
    {
        if ( test == null )
        {
            test = new ArrayList<Test>();
        }
        return this.test;
    }

    /**
     * Gets the value of the drug property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the drug property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getDrug().add( newItem );
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Drug }
     *
     *
     */
    public List<Drug> getDrug()
    {
        if ( drug == null )
        {
            drug = new ArrayList<Drug>();
        }
        return this.drug;
    }

    /**
     * Gets the value of the summary property.
     *
     * @return possible object is {@link Summary }
     *
     */
    public Summary getSummary()
    {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     *
     * @param value allowed object is {@link Summary }
     *
     */
    public void setSummary( Summary value )
    {
        this.summary = value;
    }

}
