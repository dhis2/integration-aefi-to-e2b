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
    "patientdrugname",
    "patientdrugstartdateformat",
    "patientdrugstartdate",
    "patientdrugenddateformat",
    "patientdrugenddate",
    "patientindicationmeddraversion",
    "patientdrugindication",
    "patientdrgreactionmeddraversion",
    "patientdrugreaction"
} )
@XmlRootElement( name = "patientpastdrugtherapy" )
public class Patientpastdrugtherapy
{

    @XmlAttribute( name = "lang" )
    @XmlJavaTypeAdapter( NormalizedStringAdapter.class )
    protected String lang;

    protected Patientdrugname patientdrugname;

    protected Patientdrugstartdateformat patientdrugstartdateformat;

    protected Patientdrugstartdate patientdrugstartdate;

    protected Patientdrugenddateformat patientdrugenddateformat;

    protected Patientdrugenddate patientdrugenddate;

    protected Patientindicationmeddraversion patientindicationmeddraversion;

    protected Patientdrugindication patientdrugindication;

    protected Patientdrgreactionmeddraversion patientdrgreactionmeddraversion;

    protected Patientdrugreaction patientdrugreaction;

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
     * Gets the value of the patientdrugname property.
     *
     * @return possible object is {@link Patientdrugname }
     *
     */
    public Patientdrugname getPatientdrugname()
    {
        return patientdrugname;
    }

    /**
     * Sets the value of the patientdrugname property.
     *
     * @param value allowed object is {@link Patientdrugname }
     *
     */
    public void setPatientdrugname( Patientdrugname value )
    {
        this.patientdrugname = value;
    }

    /**
     * Gets the value of the patientdrugstartdateformat property.
     *
     * @return possible object is {@link Patientdrugstartdateformat }
     *
     */
    public Patientdrugstartdateformat getPatientdrugstartdateformat()
    {
        return patientdrugstartdateformat;
    }

    /**
     * Sets the value of the patientdrugstartdateformat property.
     *
     * @param value allowed object is {@link Patientdrugstartdateformat }
     *
     */
    public void setPatientdrugstartdateformat( Patientdrugstartdateformat value )
    {
        this.patientdrugstartdateformat = value;
    }

    /**
     * Gets the value of the patientdrugstartdate property.
     *
     * @return possible object is {@link Patientdrugstartdate }
     *
     */
    public Patientdrugstartdate getPatientdrugstartdate()
    {
        return patientdrugstartdate;
    }

    /**
     * Sets the value of the patientdrugstartdate property.
     *
     * @param value allowed object is {@link Patientdrugstartdate }
     *
     */
    public void setPatientdrugstartdate( Patientdrugstartdate value )
    {
        this.patientdrugstartdate = value;
    }

    /**
     * Gets the value of the patientdrugenddateformat property.
     *
     * @return possible object is {@link Patientdrugenddateformat }
     *
     */
    public Patientdrugenddateformat getPatientdrugenddateformat()
    {
        return patientdrugenddateformat;
    }

    /**
     * Sets the value of the patientdrugenddateformat property.
     *
     * @param value allowed object is {@link Patientdrugenddateformat }
     *
     */
    public void setPatientdrugenddateformat( Patientdrugenddateformat value )
    {
        this.patientdrugenddateformat = value;
    }

    /**
     * Gets the value of the patientdrugenddate property.
     *
     * @return possible object is {@link Patientdrugenddate }
     *
     */
    public Patientdrugenddate getPatientdrugenddate()
    {
        return patientdrugenddate;
    }

    /**
     * Sets the value of the patientdrugenddate property.
     *
     * @param value allowed object is {@link Patientdrugenddate }
     *
     */
    public void setPatientdrugenddate( Patientdrugenddate value )
    {
        this.patientdrugenddate = value;
    }

    /**
     * Gets the value of the patientindicationmeddraversion property.
     *
     * @return possible object is {@link Patientindicationmeddraversion }
     *
     */
    public Patientindicationmeddraversion getPatientindicationmeddraversion()
    {
        return patientindicationmeddraversion;
    }

    /**
     * Sets the value of the patientindicationmeddraversion property.
     *
     * @param value allowed object is {@link Patientindicationmeddraversion }
     *
     */
    public void setPatientindicationmeddraversion( Patientindicationmeddraversion value )
    {
        this.patientindicationmeddraversion = value;
    }

    /**
     * Gets the value of the patientdrugindication property.
     *
     * @return possible object is {@link Patientdrugindication }
     *
     */
    public Patientdrugindication getPatientdrugindication()
    {
        return patientdrugindication;
    }

    /**
     * Sets the value of the patientdrugindication property.
     *
     * @param value allowed object is {@link Patientdrugindication }
     *
     */
    public void setPatientdrugindication( Patientdrugindication value )
    {
        this.patientdrugindication = value;
    }

    /**
     * Gets the value of the patientdrgreactionmeddraversion property.
     *
     * @return possible object is {@link Patientdrgreactionmeddraversion }
     *
     */
    public Patientdrgreactionmeddraversion getPatientdrgreactionmeddraversion()
    {
        return patientdrgreactionmeddraversion;
    }

    /**
     * Sets the value of the patientdrgreactionmeddraversion property.
     *
     * @param value allowed object is {@link Patientdrgreactionmeddraversion }
     *
     */
    public void setPatientdrgreactionmeddraversion( Patientdrgreactionmeddraversion value )
    {
        this.patientdrgreactionmeddraversion = value;
    }

    /**
     * Gets the value of the patientdrugreaction property.
     *
     * @return possible object is {@link Patientdrugreaction }
     *
     */
    public Patientdrugreaction getPatientdrugreaction()
    {
        return patientdrugreaction;
    }

    /**
     * Sets the value of the patientdrugreaction property.
     *
     * @param value allowed object is {@link Patientdrugreaction }
     *
     */
    public void setPatientdrugreaction( Patientdrugreaction value )
    {
        this.patientdrugreaction = value;
    }

}
