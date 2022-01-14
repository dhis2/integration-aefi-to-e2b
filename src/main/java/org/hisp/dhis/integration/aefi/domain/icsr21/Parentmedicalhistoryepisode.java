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
    "parentmdepisodemeddraversion",
    "parentmedicalepisodename",
    "parentmedicalstartdateformat",
    "parentmedicalstartdate",
    "parentmedicalcontinue",
    "parentmedicalenddateformat",
    "parentmedicalenddate",
    "parentmedicalcomment"
} )
@XmlRootElement( name = "parentmedicalhistoryepisode" )
public class Parentmedicalhistoryepisode
{

    @XmlAttribute( name = "lang" )
    @XmlJavaTypeAdapter( NormalizedStringAdapter.class )
    protected String lang;

    protected Parentmdepisodemeddraversion parentmdepisodemeddraversion;

    protected Parentmedicalepisodename parentmedicalepisodename;

    protected Parentmedicalstartdateformat parentmedicalstartdateformat;

    protected Parentmedicalstartdate parentmedicalstartdate;

    protected Parentmedicalcontinue parentmedicalcontinue;

    protected Parentmedicalenddateformat parentmedicalenddateformat;

    protected Parentmedicalenddate parentmedicalenddate;

    protected Parentmedicalcomment parentmedicalcomment;

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
     * Gets the value of the parentmdepisodemeddraversion property.
     *
     * @return possible object is {@link Parentmdepisodemeddraversion }
     *
     */
    public Parentmdepisodemeddraversion getParentmdepisodemeddraversion()
    {
        return parentmdepisodemeddraversion;
    }

    /**
     * Sets the value of the parentmdepisodemeddraversion property.
     *
     * @param value allowed object is {@link Parentmdepisodemeddraversion }
     *
     */
    public void setParentmdepisodemeddraversion( Parentmdepisodemeddraversion value )
    {
        this.parentmdepisodemeddraversion = value;
    }

    /**
     * Gets the value of the parentmedicalepisodename property.
     *
     * @return possible object is {@link Parentmedicalepisodename }
     *
     */
    public Parentmedicalepisodename getParentmedicalepisodename()
    {
        return parentmedicalepisodename;
    }

    /**
     * Sets the value of the parentmedicalepisodename property.
     *
     * @param value allowed object is {@link Parentmedicalepisodename }
     *
     */
    public void setParentmedicalepisodename( Parentmedicalepisodename value )
    {
        this.parentmedicalepisodename = value;
    }

    /**
     * Gets the value of the parentmedicalstartdateformat property.
     *
     * @return possible object is {@link Parentmedicalstartdateformat }
     *
     */
    public Parentmedicalstartdateformat getParentmedicalstartdateformat()
    {
        return parentmedicalstartdateformat;
    }

    /**
     * Sets the value of the parentmedicalstartdateformat property.
     *
     * @param value allowed object is {@link Parentmedicalstartdateformat }
     *
     */
    public void setParentmedicalstartdateformat( Parentmedicalstartdateformat value )
    {
        this.parentmedicalstartdateformat = value;
    }

    /**
     * Gets the value of the parentmedicalstartdate property.
     *
     * @return possible object is {@link Parentmedicalstartdate }
     *
     */
    public Parentmedicalstartdate getParentmedicalstartdate()
    {
        return parentmedicalstartdate;
    }

    /**
     * Sets the value of the parentmedicalstartdate property.
     *
     * @param value allowed object is {@link Parentmedicalstartdate }
     *
     */
    public void setParentmedicalstartdate( Parentmedicalstartdate value )
    {
        this.parentmedicalstartdate = value;
    }

    /**
     * Gets the value of the parentmedicalcontinue property.
     *
     * @return possible object is {@link Parentmedicalcontinue }
     *
     */
    public Parentmedicalcontinue getParentmedicalcontinue()
    {
        return parentmedicalcontinue;
    }

    /**
     * Sets the value of the parentmedicalcontinue property.
     *
     * @param value allowed object is {@link Parentmedicalcontinue }
     *
     */
    public void setParentmedicalcontinue( Parentmedicalcontinue value )
    {
        this.parentmedicalcontinue = value;
    }

    /**
     * Gets the value of the parentmedicalenddateformat property.
     *
     * @return possible object is {@link Parentmedicalenddateformat }
     *
     */
    public Parentmedicalenddateformat getParentmedicalenddateformat()
    {
        return parentmedicalenddateformat;
    }

    /**
     * Sets the value of the parentmedicalenddateformat property.
     *
     * @param value allowed object is {@link Parentmedicalenddateformat }
     *
     */
    public void setParentmedicalenddateformat( Parentmedicalenddateformat value )
    {
        this.parentmedicalenddateformat = value;
    }

    /**
     * Gets the value of the parentmedicalenddate property.
     *
     * @return possible object is {@link Parentmedicalenddate }
     *
     */
    public Parentmedicalenddate getParentmedicalenddate()
    {
        return parentmedicalenddate;
    }

    /**
     * Sets the value of the parentmedicalenddate property.
     *
     * @param value allowed object is {@link Parentmedicalenddate }
     *
     */
    public void setParentmedicalenddate( Parentmedicalenddate value )
    {
        this.parentmedicalenddate = value;
    }

    /**
     * Gets the value of the parentmedicalcomment property.
     *
     * @return possible object is {@link Parentmedicalcomment }
     *
     */
    public Parentmedicalcomment getParentmedicalcomment()
    {
        return parentmedicalcomment;
    }

    /**
     * Sets the value of the parentmedicalcomment property.
     *
     * @param value allowed object is {@link Parentmedicalcomment }
     *
     */
    public void setParentmedicalcomment( Parentmedicalcomment value )
    {
        this.parentmedicalcomment = value;
    }

}
