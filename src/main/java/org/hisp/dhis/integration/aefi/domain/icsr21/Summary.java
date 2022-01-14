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
    "narrativeincludeclinical",
    "reportercomment",
    "senderdiagnosismeddraversion",
    "senderdiagnosis",
    "sendercomment"
} )
@XmlRootElement( name = "summary" )
public class Summary
{

    @XmlAttribute( name = "lang" )
    @XmlJavaTypeAdapter( NormalizedStringAdapter.class )
    protected String lang;

    protected Narrativeincludeclinical narrativeincludeclinical;

    protected Reportercomment reportercomment;

    protected Senderdiagnosismeddraversion senderdiagnosismeddraversion;

    protected Senderdiagnosis senderdiagnosis;

    protected Sendercomment sendercomment;

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
     * Gets the value of the narrativeincludeclinical property.
     *
     * @return possible object is {@link Narrativeincludeclinical }
     *
     */
    public Narrativeincludeclinical getNarrativeincludeclinical()
    {
        return narrativeincludeclinical;
    }

    /**
     * Sets the value of the narrativeincludeclinical property.
     *
     * @param value allowed object is {@link Narrativeincludeclinical }
     *
     */
    public void setNarrativeincludeclinical( Narrativeincludeclinical value )
    {
        this.narrativeincludeclinical = value;
    }

    /**
     * Gets the value of the reportercomment property.
     *
     * @return possible object is {@link Reportercomment }
     *
     */
    public Reportercomment getReportercomment()
    {
        return reportercomment;
    }

    /**
     * Sets the value of the reportercomment property.
     *
     * @param value allowed object is {@link Reportercomment }
     *
     */
    public void setReportercomment( Reportercomment value )
    {
        this.reportercomment = value;
    }

    /**
     * Gets the value of the senderdiagnosismeddraversion property.
     *
     * @return possible object is {@link Senderdiagnosismeddraversion }
     *
     */
    public Senderdiagnosismeddraversion getSenderdiagnosismeddraversion()
    {
        return senderdiagnosismeddraversion;
    }

    /**
     * Sets the value of the senderdiagnosismeddraversion property.
     *
     * @param value allowed object is {@link Senderdiagnosismeddraversion }
     *
     */
    public void setSenderdiagnosismeddraversion( Senderdiagnosismeddraversion value )
    {
        this.senderdiagnosismeddraversion = value;
    }

    /**
     * Gets the value of the senderdiagnosis property.
     *
     * @return possible object is {@link Senderdiagnosis }
     *
     */
    public Senderdiagnosis getSenderdiagnosis()
    {
        return senderdiagnosis;
    }

    /**
     * Sets the value of the senderdiagnosis property.
     *
     * @param value allowed object is {@link Senderdiagnosis }
     *
     */
    public void setSenderdiagnosis( Senderdiagnosis value )
    {
        this.senderdiagnosis = value;
    }

    /**
     * Gets the value of the sendercomment property.
     *
     * @return possible object is {@link Sendercomment }
     *
     */
    public Sendercomment getSendercomment()
    {
        return sendercomment;
    }

    /**
     * Sets the value of the sendercomment property.
     *
     * @param value allowed object is {@link Sendercomment }
     *
     */
    public void setSendercomment( Sendercomment value )
    {
        this.sendercomment = value;
    }

}
