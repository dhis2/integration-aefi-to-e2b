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
    "drugreactionassesmeddraversion",
    "drugreactionasses",
    "drugassessmentsource",
    "drugassessmentmethod",
    "drugresult"
} )
@XmlRootElement( name = "drugreactionrelatedness" )
public class Drugreactionrelatedness
{

    @XmlAttribute( name = "lang" )
    @XmlJavaTypeAdapter( NormalizedStringAdapter.class )
    protected String lang;

    protected Drugreactionassesmeddraversion drugreactionassesmeddraversion;

    protected Drugreactionasses drugreactionasses;

    protected Drugassessmentsource drugassessmentsource;

    protected Drugassessmentmethod drugassessmentmethod;

    protected Drugresult drugresult;

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
     * Gets the value of the drugreactionassesmeddraversion property.
     *
     * @return possible object is {@link Drugreactionassesmeddraversion }
     *
     */
    public Drugreactionassesmeddraversion getDrugreactionassesmeddraversion()
    {
        return drugreactionassesmeddraversion;
    }

    /**
     * Sets the value of the drugreactionassesmeddraversion property.
     *
     * @param value allowed object is {@link Drugreactionassesmeddraversion }
     *
     */
    public void setDrugreactionassesmeddraversion( Drugreactionassesmeddraversion value )
    {
        this.drugreactionassesmeddraversion = value;
    }

    /**
     * Gets the value of the drugreactionasses property.
     *
     * @return possible object is {@link Drugreactionasses }
     *
     */
    public Drugreactionasses getDrugreactionasses()
    {
        return drugreactionasses;
    }

    /**
     * Sets the value of the drugreactionasses property.
     *
     * @param value allowed object is {@link Drugreactionasses }
     *
     */
    public void setDrugreactionasses( Drugreactionasses value )
    {
        this.drugreactionasses = value;
    }

    /**
     * Gets the value of the drugassessmentsource property.
     *
     * @return possible object is {@link Drugassessmentsource }
     *
     */
    public Drugassessmentsource getDrugassessmentsource()
    {
        return drugassessmentsource;
    }

    /**
     * Sets the value of the drugassessmentsource property.
     *
     * @param value allowed object is {@link Drugassessmentsource }
     *
     */
    public void setDrugassessmentsource( Drugassessmentsource value )
    {
        this.drugassessmentsource = value;
    }

    /**
     * Gets the value of the drugassessmentmethod property.
     *
     * @return possible object is {@link Drugassessmentmethod }
     *
     */
    public Drugassessmentmethod getDrugassessmentmethod()
    {
        return drugassessmentmethod;
    }

    /**
     * Sets the value of the drugassessmentmethod property.
     *
     * @param value allowed object is {@link Drugassessmentmethod }
     *
     */
    public void setDrugassessmentmethod( Drugassessmentmethod value )
    {
        this.drugassessmentmethod = value;
    }

    /**
     * Gets the value of the drugresult property.
     *
     * @return possible object is {@link Drugresult }
     *
     */
    public Drugresult getDrugresult()
    {
        return drugresult;
    }

    /**
     * Sets the value of the drugresult property.
     *
     * @param value allowed object is {@link Drugresult }
     *
     */
    public void setDrugresult( Drugresult value )
    {
        this.drugresult = value;
    }

}
