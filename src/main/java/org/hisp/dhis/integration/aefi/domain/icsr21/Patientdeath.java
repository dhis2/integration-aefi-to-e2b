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
    "patientdeathdateformat",
    "patientdeathdate",
    "patientautopsyyesno",
    "patientdeathcause",
    "patientautopsy"
} )
@XmlRootElement( name = "patientdeath" )
public class Patientdeath
{

    @XmlAttribute( name = "lang" )
    @XmlJavaTypeAdapter( NormalizedStringAdapter.class )
    protected String lang;

    protected Patientdeathdateformat patientdeathdateformat;

    protected Patientdeathdate patientdeathdate;

    protected Patientautopsyyesno patientautopsyyesno;

    protected List<Patientdeathcause> patientdeathcause;

    protected List<Patientautopsy> patientautopsy;

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
     * Gets the value of the patientdeathdateformat property.
     *
     * @return possible object is {@link Patientdeathdateformat }
     *
     */
    public Patientdeathdateformat getPatientdeathdateformat()
    {
        return patientdeathdateformat;
    }

    /**
     * Sets the value of the patientdeathdateformat property.
     *
     * @param value allowed object is {@link Patientdeathdateformat }
     *
     */
    public void setPatientdeathdateformat( Patientdeathdateformat value )
    {
        this.patientdeathdateformat = value;
    }

    /**
     * Gets the value of the patientdeathdate property.
     *
     * @return possible object is {@link Patientdeathdate }
     *
     */
    public Patientdeathdate getPatientdeathdate()
    {
        return patientdeathdate;
    }

    /**
     * Sets the value of the patientdeathdate property.
     *
     * @param value allowed object is {@link Patientdeathdate }
     *
     */
    public void setPatientdeathdate( Patientdeathdate value )
    {
        this.patientdeathdate = value;
    }

    /**
     * Gets the value of the patientautopsyyesno property.
     *
     * @return possible object is {@link Patientautopsyyesno }
     *
     */
    public Patientautopsyyesno getPatientautopsyyesno()
    {
        return patientautopsyyesno;
    }

    /**
     * Sets the value of the patientautopsyyesno property.
     *
     * @param value allowed object is {@link Patientautopsyyesno }
     *
     */
    public void setPatientautopsyyesno( Patientautopsyyesno value )
    {
        this.patientautopsyyesno = value;
    }

    /**
     * Gets the value of the patientdeathcause property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the patientdeathcause property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getPatientdeathcause().add( newItem );
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Patientdeathcause }
     *
     *
     */
    public List<Patientdeathcause> getPatientdeathcause()
    {
        if ( patientdeathcause == null )
        {
            patientdeathcause = new ArrayList<Patientdeathcause>();
        }
        return this.patientdeathcause;
    }

    /**
     * Gets the value of the patientautopsy property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the patientautopsy property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getPatientautopsy().add( newItem );
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Patientautopsy }
     *
     *
     */
    public List<Patientautopsy> getPatientautopsy()
    {
        if ( patientautopsy == null )
        {
            patientautopsy = new ArrayList<Patientautopsy>();
        }
        return this.patientautopsy;
    }

}
