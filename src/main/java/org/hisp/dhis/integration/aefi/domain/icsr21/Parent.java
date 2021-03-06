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
    "parentidentification",
    "parentbirthdateformat",
    "parentbirthdate",
    "parentage",
    "parentageunit",
    "parentlastmenstrualdateformat",
    "parentlastmenstrualdate",
    "parentweight",
    "parentheight",
    "parentsex",
    "parentmedicalrelevanttext",
    "parentmedicalhistoryepisode",
    "parentpastdrugtherapy"
} )
@XmlRootElement( name = "parent" )
public class Parent
{

    @XmlAttribute( name = "lang" )
    @XmlJavaTypeAdapter( NormalizedStringAdapter.class )
    protected String lang;

    protected Parentidentification parentidentification;

    protected Parentbirthdateformat parentbirthdateformat;

    protected Parentbirthdate parentbirthdate;

    protected Parentage parentage;

    protected Parentageunit parentageunit;

    protected Parentlastmenstrualdateformat parentlastmenstrualdateformat;

    protected Parentlastmenstrualdate parentlastmenstrualdate;

    protected Parentweight parentweight;

    protected Parentheight parentheight;

    protected Parentsex parentsex;

    protected Parentmedicalrelevanttext parentmedicalrelevanttext;

    protected List<Parentmedicalhistoryepisode> parentmedicalhistoryepisode;

    protected List<Parentpastdrugtherapy> parentpastdrugtherapy;

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
     * Gets the value of the parentidentification property.
     *
     * @return possible object is {@link Parentidentification }
     *
     */
    public Parentidentification getParentidentification()
    {
        return parentidentification;
    }

    /**
     * Sets the value of the parentidentification property.
     *
     * @param value allowed object is {@link Parentidentification }
     *
     */
    public void setParentidentification( Parentidentification value )
    {
        this.parentidentification = value;
    }

    /**
     * Gets the value of the parentbirthdateformat property.
     *
     * @return possible object is {@link Parentbirthdateformat }
     *
     */
    public Parentbirthdateformat getParentbirthdateformat()
    {
        return parentbirthdateformat;
    }

    /**
     * Sets the value of the parentbirthdateformat property.
     *
     * @param value allowed object is {@link Parentbirthdateformat }
     *
     */
    public void setParentbirthdateformat( Parentbirthdateformat value )
    {
        this.parentbirthdateformat = value;
    }

    /**
     * Gets the value of the parentbirthdate property.
     *
     * @return possible object is {@link Parentbirthdate }
     *
     */
    public Parentbirthdate getParentbirthdate()
    {
        return parentbirthdate;
    }

    /**
     * Sets the value of the parentbirthdate property.
     *
     * @param value allowed object is {@link Parentbirthdate }
     *
     */
    public void setParentbirthdate( Parentbirthdate value )
    {
        this.parentbirthdate = value;
    }

    /**
     * Gets the value of the parentage property.
     *
     * @return possible object is {@link Parentage }
     *
     */
    public Parentage getParentage()
    {
        return parentage;
    }

    /**
     * Sets the value of the parentage property.
     *
     * @param value allowed object is {@link Parentage }
     *
     */
    public void setParentage( Parentage value )
    {
        this.parentage = value;
    }

    /**
     * Gets the value of the parentageunit property.
     *
     * @return possible object is {@link Parentageunit }
     *
     */
    public Parentageunit getParentageunit()
    {
        return parentageunit;
    }

    /**
     * Sets the value of the parentageunit property.
     *
     * @param value allowed object is {@link Parentageunit }
     *
     */
    public void setParentageunit( Parentageunit value )
    {
        this.parentageunit = value;
    }

    /**
     * Gets the value of the parentlastmenstrualdateformat property.
     *
     * @return possible object is {@link Parentlastmenstrualdateformat }
     *
     */
    public Parentlastmenstrualdateformat getParentlastmenstrualdateformat()
    {
        return parentlastmenstrualdateformat;
    }

    /**
     * Sets the value of the parentlastmenstrualdateformat property.
     *
     * @param value allowed object is {@link Parentlastmenstrualdateformat }
     *
     */
    public void setParentlastmenstrualdateformat( Parentlastmenstrualdateformat value )
    {
        this.parentlastmenstrualdateformat = value;
    }

    /**
     * Gets the value of the parentlastmenstrualdate property.
     *
     * @return possible object is {@link Parentlastmenstrualdate }
     *
     */
    public Parentlastmenstrualdate getParentlastmenstrualdate()
    {
        return parentlastmenstrualdate;
    }

    /**
     * Sets the value of the parentlastmenstrualdate property.
     *
     * @param value allowed object is {@link Parentlastmenstrualdate }
     *
     */
    public void setParentlastmenstrualdate( Parentlastmenstrualdate value )
    {
        this.parentlastmenstrualdate = value;
    }

    /**
     * Gets the value of the parentweight property.
     *
     * @return possible object is {@link Parentweight }
     *
     */
    public Parentweight getParentweight()
    {
        return parentweight;
    }

    /**
     * Sets the value of the parentweight property.
     *
     * @param value allowed object is {@link Parentweight }
     *
     */
    public void setParentweight( Parentweight value )
    {
        this.parentweight = value;
    }

    /**
     * Gets the value of the parentheight property.
     *
     * @return possible object is {@link Parentheight }
     *
     */
    public Parentheight getParentheight()
    {
        return parentheight;
    }

    /**
     * Sets the value of the parentheight property.
     *
     * @param value allowed object is {@link Parentheight }
     *
     */
    public void setParentheight( Parentheight value )
    {
        this.parentheight = value;
    }

    /**
     * Gets the value of the parentsex property.
     *
     * @return possible object is {@link Parentsex }
     *
     */
    public Parentsex getParentsex()
    {
        return parentsex;
    }

    /**
     * Sets the value of the parentsex property.
     *
     * @param value allowed object is {@link Parentsex }
     *
     */
    public void setParentsex( Parentsex value )
    {
        this.parentsex = value;
    }

    /**
     * Gets the value of the parentmedicalrelevanttext property.
     *
     * @return possible object is {@link Parentmedicalrelevanttext }
     *
     */
    public Parentmedicalrelevanttext getParentmedicalrelevanttext()
    {
        return parentmedicalrelevanttext;
    }

    /**
     * Sets the value of the parentmedicalrelevanttext property.
     *
     * @param value allowed object is {@link Parentmedicalrelevanttext }
     *
     */
    public void setParentmedicalrelevanttext( Parentmedicalrelevanttext value )
    {
        this.parentmedicalrelevanttext = value;
    }

    /**
     * Gets the value of the parentmedicalhistoryepisode property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the parentmedicalhistoryepisode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getParentmedicalhistoryepisode().add( newItem );
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Parentmedicalhistoryepisode }
     *
     *
     */
    public List<Parentmedicalhistoryepisode> getParentmedicalhistoryepisode()
    {
        if ( parentmedicalhistoryepisode == null )
        {
            parentmedicalhistoryepisode = new ArrayList<Parentmedicalhistoryepisode>();
        }
        return this.parentmedicalhistoryepisode;
    }

    /**
     * Gets the value of the parentpastdrugtherapy property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the parentpastdrugtherapy property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getParentpastdrugtherapy().add( newItem );
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Parentpastdrugtherapy }
     *
     *
     */
    public List<Parentpastdrugtherapy> getParentpastdrugtherapy()
    {
        if ( parentpastdrugtherapy == null )
        {
            parentpastdrugtherapy = new ArrayList<Parentpastdrugtherapy>();
        }
        return this.parentpastdrugtherapy;
    }

}
