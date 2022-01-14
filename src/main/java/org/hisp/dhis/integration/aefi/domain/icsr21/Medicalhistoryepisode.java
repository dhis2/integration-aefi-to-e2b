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
    "patientepisodenamemeddraversion",
    "patientepisodename",
    "patientmedicalstartdateformat",
    "patientmedicalstartdate",
    "patientmedicalcontinue",
    "patientmedicalenddateformat",
    "patientmedicalenddate",
    "patientmedicalcomment"
} )
@XmlRootElement( name = "medicalhistoryepisode" )
public class Medicalhistoryepisode
{

    @XmlAttribute( name = "lang" )
    @XmlJavaTypeAdapter( NormalizedStringAdapter.class )
    protected String lang;

    protected Patientepisodenamemeddraversion patientepisodenamemeddraversion;

    protected Patientepisodename patientepisodename;

    protected Patientmedicalstartdateformat patientmedicalstartdateformat;

    protected Patientmedicalstartdate patientmedicalstartdate;

    protected Patientmedicalcontinue patientmedicalcontinue;

    protected Patientmedicalenddateformat patientmedicalenddateformat;

    protected Patientmedicalenddate patientmedicalenddate;

    protected Patientmedicalcomment patientmedicalcomment;

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
     * Gets the value of the patientepisodenamemeddraversion property.
     *
     * @return possible object is {@link Patientepisodenamemeddraversion }
     *
     */
    public Patientepisodenamemeddraversion getPatientepisodenamemeddraversion()
    {
        return patientepisodenamemeddraversion;
    }

    /**
     * Sets the value of the patientepisodenamemeddraversion property.
     *
     * @param value allowed object is {@link Patientepisodenamemeddraversion }
     *
     */
    public void setPatientepisodenamemeddraversion( Patientepisodenamemeddraversion value )
    {
        this.patientepisodenamemeddraversion = value;
    }

    /**
     * Gets the value of the patientepisodename property.
     *
     * @return possible object is {@link Patientepisodename }
     *
     */
    public Patientepisodename getPatientepisodename()
    {
        return patientepisodename;
    }

    /**
     * Sets the value of the patientepisodename property.
     *
     * @param value allowed object is {@link Patientepisodename }
     *
     */
    public void setPatientepisodename( Patientepisodename value )
    {
        this.patientepisodename = value;
    }

    /**
     * Gets the value of the patientmedicalstartdateformat property.
     *
     * @return possible object is {@link Patientmedicalstartdateformat }
     *
     */
    public Patientmedicalstartdateformat getPatientmedicalstartdateformat()
    {
        return patientmedicalstartdateformat;
    }

    /**
     * Sets the value of the patientmedicalstartdateformat property.
     *
     * @param value allowed object is {@link Patientmedicalstartdateformat }
     *
     */
    public void setPatientmedicalstartdateformat( Patientmedicalstartdateformat value )
    {
        this.patientmedicalstartdateformat = value;
    }

    /**
     * Gets the value of the patientmedicalstartdate property.
     *
     * @return possible object is {@link Patientmedicalstartdate }
     *
     */
    public Patientmedicalstartdate getPatientmedicalstartdate()
    {
        return patientmedicalstartdate;
    }

    /**
     * Sets the value of the patientmedicalstartdate property.
     *
     * @param value allowed object is {@link Patientmedicalstartdate }
     *
     */
    public void setPatientmedicalstartdate( Patientmedicalstartdate value )
    {
        this.patientmedicalstartdate = value;
    }

    /**
     * Gets the value of the patientmedicalcontinue property.
     *
     * @return possible object is {@link Patientmedicalcontinue }
     *
     */
    public Patientmedicalcontinue getPatientmedicalcontinue()
    {
        return patientmedicalcontinue;
    }

    /**
     * Sets the value of the patientmedicalcontinue property.
     *
     * @param value allowed object is {@link Patientmedicalcontinue }
     *
     */
    public void setPatientmedicalcontinue( Patientmedicalcontinue value )
    {
        this.patientmedicalcontinue = value;
    }

    /**
     * Gets the value of the patientmedicalenddateformat property.
     *
     * @return possible object is {@link Patientmedicalenddateformat }
     *
     */
    public Patientmedicalenddateformat getPatientmedicalenddateformat()
    {
        return patientmedicalenddateformat;
    }

    /**
     * Sets the value of the patientmedicalenddateformat property.
     *
     * @param value allowed object is {@link Patientmedicalenddateformat }
     *
     */
    public void setPatientmedicalenddateformat( Patientmedicalenddateformat value )
    {
        this.patientmedicalenddateformat = value;
    }

    /**
     * Gets the value of the patientmedicalenddate property.
     *
     * @return possible object is {@link Patientmedicalenddate }
     *
     */
    public Patientmedicalenddate getPatientmedicalenddate()
    {
        return patientmedicalenddate;
    }

    /**
     * Sets the value of the patientmedicalenddate property.
     *
     * @param value allowed object is {@link Patientmedicalenddate }
     *
     */
    public void setPatientmedicalenddate( Patientmedicalenddate value )
    {
        this.patientmedicalenddate = value;
    }

    /**
     * Gets the value of the patientmedicalcomment property.
     *
     * @return possible object is {@link Patientmedicalcomment }
     *
     */
    public Patientmedicalcomment getPatientmedicalcomment()
    {
        return patientmedicalcomment;
    }

    /**
     * Sets the value of the patientmedicalcomment property.
     *
     * @param value allowed object is {@link Patientmedicalcomment }
     *
     */
    public void setPatientmedicalcomment( Patientmedicalcomment value )
    {
        this.patientmedicalcomment = value;
    }

}
