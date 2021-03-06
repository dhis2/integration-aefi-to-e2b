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
    "reportertitle",
    "reportergivename",
    "reportermiddlename",
    "reporterfamilyname",
    "reporterorganization",
    "reporterdepartment",
    "reporterstreet",
    "reportercity",
    "reporterstate",
    "reporterpostcode",
    "reportercountry",
    "qualification",
    "literaturereference",
    "studyname",
    "sponsorstudynumb",
    "observestudytype"
} )
@XmlRootElement( name = "primarysource" )
public class Primarysource
{

    @XmlAttribute( name = "lang" )
    @XmlJavaTypeAdapter( NormalizedStringAdapter.class )
    protected String lang;

    protected Reportertitle reportertitle;

    protected Reportergivename reportergivename;

    protected Reportermiddlename reportermiddlename;

    protected Reporterfamilyname reporterfamilyname;

    protected Reporterorganization reporterorganization;

    protected Reporterdepartment reporterdepartment;

    protected Reporterstreet reporterstreet;

    protected Reportercity reportercity;

    protected Reporterstate reporterstate;

    protected Reporterpostcode reporterpostcode;

    protected Reportercountry reportercountry;

    protected Qualification qualification;

    protected Literaturereference literaturereference;

    protected Studyname studyname;

    protected Sponsorstudynumb sponsorstudynumb;

    protected Observestudytype observestudytype;

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
     * Gets the value of the reportertitle property.
     *
     * @return possible object is {@link Reportertitle }
     *
     */
    public Reportertitle getReportertitle()
    {
        return reportertitle;
    }

    /**
     * Sets the value of the reportertitle property.
     *
     * @param value allowed object is {@link Reportertitle }
     *
     */
    public void setReportertitle( Reportertitle value )
    {
        this.reportertitle = value;
    }

    /**
     * Gets the value of the reportergivename property.
     *
     * @return possible object is {@link Reportergivename }
     *
     */
    public Reportergivename getReportergivename()
    {
        return reportergivename;
    }

    /**
     * Sets the value of the reportergivename property.
     *
     * @param value allowed object is {@link Reportergivename }
     *
     */
    public void setReportergivename( Reportergivename value )
    {
        this.reportergivename = value;
    }

    /**
     * Gets the value of the reportermiddlename property.
     *
     * @return possible object is {@link Reportermiddlename }
     *
     */
    public Reportermiddlename getReportermiddlename()
    {
        return reportermiddlename;
    }

    /**
     * Sets the value of the reportermiddlename property.
     *
     * @param value allowed object is {@link Reportermiddlename }
     *
     */
    public void setReportermiddlename( Reportermiddlename value )
    {
        this.reportermiddlename = value;
    }

    /**
     * Gets the value of the reporterfamilyname property.
     *
     * @return possible object is {@link Reporterfamilyname }
     *
     */
    public Reporterfamilyname getReporterfamilyname()
    {
        return reporterfamilyname;
    }

    /**
     * Sets the value of the reporterfamilyname property.
     *
     * @param value allowed object is {@link Reporterfamilyname }
     *
     */
    public void setReporterfamilyname( Reporterfamilyname value )
    {
        this.reporterfamilyname = value;
    }

    /**
     * Gets the value of the reporterorganization property.
     *
     * @return possible object is {@link Reporterorganization }
     *
     */
    public Reporterorganization getReporterorganization()
    {
        return reporterorganization;
    }

    /**
     * Sets the value of the reporterorganization property.
     *
     * @param value allowed object is {@link Reporterorganization }
     *
     */
    public void setReporterorganization( Reporterorganization value )
    {
        this.reporterorganization = value;
    }

    /**
     * Gets the value of the reporterdepartment property.
     *
     * @return possible object is {@link Reporterdepartment }
     *
     */
    public Reporterdepartment getReporterdepartment()
    {
        return reporterdepartment;
    }

    /**
     * Sets the value of the reporterdepartment property.
     *
     * @param value allowed object is {@link Reporterdepartment }
     *
     */
    public void setReporterdepartment( Reporterdepartment value )
    {
        this.reporterdepartment = value;
    }

    /**
     * Gets the value of the reporterstreet property.
     *
     * @return possible object is {@link Reporterstreet }
     *
     */
    public Reporterstreet getReporterstreet()
    {
        return reporterstreet;
    }

    /**
     * Sets the value of the reporterstreet property.
     *
     * @param value allowed object is {@link Reporterstreet }
     *
     */
    public void setReporterstreet( Reporterstreet value )
    {
        this.reporterstreet = value;
    }

    /**
     * Gets the value of the reportercity property.
     *
     * @return possible object is {@link Reportercity }
     *
     */
    public Reportercity getReportercity()
    {
        return reportercity;
    }

    /**
     * Sets the value of the reportercity property.
     *
     * @param value allowed object is {@link Reportercity }
     *
     */
    public void setReportercity( Reportercity value )
    {
        this.reportercity = value;
    }

    /**
     * Gets the value of the reporterstate property.
     *
     * @return possible object is {@link Reporterstate }
     *
     */
    public Reporterstate getReporterstate()
    {
        return reporterstate;
    }

    /**
     * Sets the value of the reporterstate property.
     *
     * @param value allowed object is {@link Reporterstate }
     *
     */
    public void setReporterstate( Reporterstate value )
    {
        this.reporterstate = value;
    }

    /**
     * Gets the value of the reporterpostcode property.
     *
     * @return possible object is {@link Reporterpostcode }
     *
     */
    public Reporterpostcode getReporterpostcode()
    {
        return reporterpostcode;
    }

    /**
     * Sets the value of the reporterpostcode property.
     *
     * @param value allowed object is {@link Reporterpostcode }
     *
     */
    public void setReporterpostcode( Reporterpostcode value )
    {
        this.reporterpostcode = value;
    }

    /**
     * Gets the value of the reportercountry property.
     *
     * @return possible object is {@link Reportercountry }
     *
     */
    public Reportercountry getReportercountry()
    {
        return reportercountry;
    }

    /**
     * Sets the value of the reportercountry property.
     *
     * @param value allowed object is {@link Reportercountry }
     *
     */
    public void setReportercountry( Reportercountry value )
    {
        this.reportercountry = value;
    }

    /**
     * Gets the value of the qualification property.
     *
     * @return possible object is {@link Qualification }
     *
     */
    public Qualification getQualification()
    {
        return qualification;
    }

    /**
     * Sets the value of the qualification property.
     *
     * @param value allowed object is {@link Qualification }
     *
     */
    public void setQualification( Qualification value )
    {
        this.qualification = value;
    }

    /**
     * Gets the value of the literaturereference property.
     *
     * @return possible object is {@link Literaturereference }
     *
     */
    public Literaturereference getLiteraturereference()
    {
        return literaturereference;
    }

    /**
     * Sets the value of the literaturereference property.
     *
     * @param value allowed object is {@link Literaturereference }
     *
     */
    public void setLiteraturereference( Literaturereference value )
    {
        this.literaturereference = value;
    }

    /**
     * Gets the value of the studyname property.
     *
     * @return possible object is {@link Studyname }
     *
     */
    public Studyname getStudyname()
    {
        return studyname;
    }

    /**
     * Sets the value of the studyname property.
     *
     * @param value allowed object is {@link Studyname }
     *
     */
    public void setStudyname( Studyname value )
    {
        this.studyname = value;
    }

    /**
     * Gets the value of the sponsorstudynumb property.
     *
     * @return possible object is {@link Sponsorstudynumb }
     *
     */
    public Sponsorstudynumb getSponsorstudynumb()
    {
        return sponsorstudynumb;
    }

    /**
     * Sets the value of the sponsorstudynumb property.
     *
     * @param value allowed object is {@link Sponsorstudynumb }
     *
     */
    public void setSponsorstudynumb( Sponsorstudynumb value )
    {
        this.sponsorstudynumb = value;
    }

    /**
     * Gets the value of the observestudytype property.
     *
     * @return possible object is {@link Observestudytype }
     *
     */
    public Observestudytype getObservestudytype()
    {
        return observestudytype;
    }

    /**
     * Sets the value of the observestudytype property.
     *
     * @param value allowed object is {@link Observestudytype }
     *
     */
    public void setObservestudytype( Observestudytype value )
    {
        this.observestudytype = value;
    }

}
