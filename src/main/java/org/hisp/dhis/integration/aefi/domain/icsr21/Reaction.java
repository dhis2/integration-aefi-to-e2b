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
    "primarysourcereaction",
    "reactionmeddraversionllt",
    "reactionmeddrallt",
    "reactionmeddraversionpt",
    "reactionmeddrapt",
    "termhighlighted",
    "reactionstartdateformat",
    "reactionstartdate",
    "reactionenddateformat",
    "reactionenddate",
    "reactionduration",
    "reactiondurationunit",
    "reactionfirsttime",
    "reactionfirsttimeunit",
    "reactionlasttime",
    "reactionlasttimeunit",
    "reactionoutcome"
} )
@XmlRootElement( name = "reaction" )
public class Reaction
{

    @XmlAttribute( name = "lang" )
    @XmlJavaTypeAdapter( NormalizedStringAdapter.class )
    protected String lang;

    protected Primarysourcereaction primarysourcereaction;

    protected Reactionmeddraversionllt reactionmeddraversionllt;

    protected Reactionmeddrallt reactionmeddrallt;

    protected Reactionmeddraversionpt reactionmeddraversionpt;

    protected Reactionmeddrapt reactionmeddrapt;

    protected Termhighlighted termhighlighted;

    protected Reactionstartdateformat reactionstartdateformat;

    protected Reactionstartdate reactionstartdate;

    protected Reactionenddateformat reactionenddateformat;

    protected Reactionenddate reactionenddate;

    protected Reactionduration reactionduration;

    protected Reactiondurationunit reactiondurationunit;

    protected Reactionfirsttime reactionfirsttime;

    protected Reactionfirsttimeunit reactionfirsttimeunit;

    protected Reactionlasttime reactionlasttime;

    protected Reactionlasttimeunit reactionlasttimeunit;

    protected Reactionoutcome reactionoutcome;

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
     * Gets the value of the primarysourcereaction property.
     *
     * @return possible object is {@link Primarysourcereaction }
     *
     */
    public Primarysourcereaction getPrimarysourcereaction()
    {
        return primarysourcereaction;
    }

    /**
     * Sets the value of the primarysourcereaction property.
     *
     * @param value allowed object is {@link Primarysourcereaction }
     *
     */
    public void setPrimarysourcereaction( Primarysourcereaction value )
    {
        this.primarysourcereaction = value;
    }

    /**
     * Gets the value of the reactionmeddraversionllt property.
     *
     * @return possible object is {@link Reactionmeddraversionllt }
     *
     */
    public Reactionmeddraversionllt getReactionmeddraversionllt()
    {
        return reactionmeddraversionllt;
    }

    /**
     * Sets the value of the reactionmeddraversionllt property.
     *
     * @param value allowed object is {@link Reactionmeddraversionllt }
     *
     */
    public void setReactionmeddraversionllt( Reactionmeddraversionllt value )
    {
        this.reactionmeddraversionllt = value;
    }

    /**
     * Gets the value of the reactionmeddrallt property.
     *
     * @return possible object is {@link Reactionmeddrallt }
     *
     */
    public Reactionmeddrallt getReactionmeddrallt()
    {
        return reactionmeddrallt;
    }

    /**
     * Sets the value of the reactionmeddrallt property.
     *
     * @param value allowed object is {@link Reactionmeddrallt }
     *
     */
    public void setReactionmeddrallt( Reactionmeddrallt value )
    {
        this.reactionmeddrallt = value;
    }

    /**
     * Gets the value of the reactionmeddraversionpt property.
     *
     * @return possible object is {@link Reactionmeddraversionpt }
     *
     */
    public Reactionmeddraversionpt getReactionmeddraversionpt()
    {
        return reactionmeddraversionpt;
    }

    /**
     * Sets the value of the reactionmeddraversionpt property.
     *
     * @param value allowed object is {@link Reactionmeddraversionpt }
     *
     */
    public void setReactionmeddraversionpt( Reactionmeddraversionpt value )
    {
        this.reactionmeddraversionpt = value;
    }

    /**
     * Gets the value of the reactionmeddrapt property.
     *
     * @return possible object is {@link Reactionmeddrapt }
     *
     */
    public Reactionmeddrapt getReactionmeddrapt()
    {
        return reactionmeddrapt;
    }

    /**
     * Sets the value of the reactionmeddrapt property.
     *
     * @param value allowed object is {@link Reactionmeddrapt }
     *
     */
    public void setReactionmeddrapt( Reactionmeddrapt value )
    {
        this.reactionmeddrapt = value;
    }

    /**
     * Gets the value of the termhighlighted property.
     *
     * @return possible object is {@link Termhighlighted }
     *
     */
    public Termhighlighted getTermhighlighted()
    {
        return termhighlighted;
    }

    /**
     * Sets the value of the termhighlighted property.
     *
     * @param value allowed object is {@link Termhighlighted }
     *
     */
    public void setTermhighlighted( Termhighlighted value )
    {
        this.termhighlighted = value;
    }

    /**
     * Gets the value of the reactionstartdateformat property.
     *
     * @return possible object is {@link Reactionstartdateformat }
     *
     */
    public Reactionstartdateformat getReactionstartdateformat()
    {
        return reactionstartdateformat;
    }

    /**
     * Sets the value of the reactionstartdateformat property.
     *
     * @param value allowed object is {@link Reactionstartdateformat }
     *
     */
    public void setReactionstartdateformat( Reactionstartdateformat value )
    {
        this.reactionstartdateformat = value;
    }

    /**
     * Gets the value of the reactionstartdate property.
     *
     * @return possible object is {@link Reactionstartdate }
     *
     */
    public Reactionstartdate getReactionstartdate()
    {
        return reactionstartdate;
    }

    /**
     * Sets the value of the reactionstartdate property.
     *
     * @param value allowed object is {@link Reactionstartdate }
     *
     */
    public void setReactionstartdate( Reactionstartdate value )
    {
        this.reactionstartdate = value;
    }

    /**
     * Gets the value of the reactionenddateformat property.
     *
     * @return possible object is {@link Reactionenddateformat }
     *
     */
    public Reactionenddateformat getReactionenddateformat()
    {
        return reactionenddateformat;
    }

    /**
     * Sets the value of the reactionenddateformat property.
     *
     * @param value allowed object is {@link Reactionenddateformat }
     *
     */
    public void setReactionenddateformat( Reactionenddateformat value )
    {
        this.reactionenddateformat = value;
    }

    /**
     * Gets the value of the reactionenddate property.
     *
     * @return possible object is {@link Reactionenddate }
     *
     */
    public Reactionenddate getReactionenddate()
    {
        return reactionenddate;
    }

    /**
     * Sets the value of the reactionenddate property.
     *
     * @param value allowed object is {@link Reactionenddate }
     *
     */
    public void setReactionenddate( Reactionenddate value )
    {
        this.reactionenddate = value;
    }

    /**
     * Gets the value of the reactionduration property.
     *
     * @return possible object is {@link Reactionduration }
     *
     */
    public Reactionduration getReactionduration()
    {
        return reactionduration;
    }

    /**
     * Sets the value of the reactionduration property.
     *
     * @param value allowed object is {@link Reactionduration }
     *
     */
    public void setReactionduration( Reactionduration value )
    {
        this.reactionduration = value;
    }

    /**
     * Gets the value of the reactiondurationunit property.
     *
     * @return possible object is {@link Reactiondurationunit }
     *
     */
    public Reactiondurationunit getReactiondurationunit()
    {
        return reactiondurationunit;
    }

    /**
     * Sets the value of the reactiondurationunit property.
     *
     * @param value allowed object is {@link Reactiondurationunit }
     *
     */
    public void setReactiondurationunit( Reactiondurationunit value )
    {
        this.reactiondurationunit = value;
    }

    /**
     * Gets the value of the reactionfirsttime property.
     *
     * @return possible object is {@link Reactionfirsttime }
     *
     */
    public Reactionfirsttime getReactionfirsttime()
    {
        return reactionfirsttime;
    }

    /**
     * Sets the value of the reactionfirsttime property.
     *
     * @param value allowed object is {@link Reactionfirsttime }
     *
     */
    public void setReactionfirsttime( Reactionfirsttime value )
    {
        this.reactionfirsttime = value;
    }

    /**
     * Gets the value of the reactionfirsttimeunit property.
     *
     * @return possible object is {@link Reactionfirsttimeunit }
     *
     */
    public Reactionfirsttimeunit getReactionfirsttimeunit()
    {
        return reactionfirsttimeunit;
    }

    /**
     * Sets the value of the reactionfirsttimeunit property.
     *
     * @param value allowed object is {@link Reactionfirsttimeunit }
     *
     */
    public void setReactionfirsttimeunit( Reactionfirsttimeunit value )
    {
        this.reactionfirsttimeunit = value;
    }

    /**
     * Gets the value of the reactionlasttime property.
     *
     * @return possible object is {@link Reactionlasttime }
     *
     */
    public Reactionlasttime getReactionlasttime()
    {
        return reactionlasttime;
    }

    /**
     * Sets the value of the reactionlasttime property.
     *
     * @param value allowed object is {@link Reactionlasttime }
     *
     */
    public void setReactionlasttime( Reactionlasttime value )
    {
        this.reactionlasttime = value;
    }

    /**
     * Gets the value of the reactionlasttimeunit property.
     *
     * @return possible object is {@link Reactionlasttimeunit }
     *
     */
    public Reactionlasttimeunit getReactionlasttimeunit()
    {
        return reactionlasttimeunit;
    }

    /**
     * Sets the value of the reactionlasttimeunit property.
     *
     * @param value allowed object is {@link Reactionlasttimeunit }
     *
     */
    public void setReactionlasttimeunit( Reactionlasttimeunit value )
    {
        this.reactionlasttimeunit = value;
    }

    /**
     * Gets the value of the reactionoutcome property.
     *
     * @return possible object is {@link Reactionoutcome }
     *
     */
    public Reactionoutcome getReactionoutcome()
    {
        return reactionoutcome;
    }

    /**
     * Sets the value of the reactionoutcome property.
     *
     * @param value allowed object is {@link Reactionoutcome }
     *
     */
    public void setReactionoutcome( Reactionoutcome value )
    {
        this.reactionoutcome = value;
    }

}
