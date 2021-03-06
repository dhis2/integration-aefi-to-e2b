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
    "sendertype",
    "senderorganization",
    "senderdepartment",
    "sendertitle",
    "sendergivename",
    "sendermiddlename",
    "senderfamilyname",
    "senderstreetaddress",
    "sendercity",
    "senderstate",
    "senderpostcode",
    "sendercountrycode",
    "sendertel",
    "sendertelextension",
    "sendertelcountrycode",
    "senderfax",
    "senderfaxextension",
    "senderfaxcountrycode",
    "senderemailaddress"
} )
@XmlRootElement( name = "sender" )
public class Sender
{

    @XmlAttribute( name = "lang" )
    @XmlJavaTypeAdapter( NormalizedStringAdapter.class )
    protected String lang;

    protected Sendertype sendertype;

    protected Senderorganization senderorganization;

    protected Senderdepartment senderdepartment;

    protected Sendertitle sendertitle;

    protected Sendergivename sendergivename;

    protected Sendermiddlename sendermiddlename;

    protected Senderfamilyname senderfamilyname;

    protected Senderstreetaddress senderstreetaddress;

    protected Sendercity sendercity;

    protected Senderstate senderstate;

    protected Senderpostcode senderpostcode;

    protected Sendercountrycode sendercountrycode;

    protected Sendertel sendertel;

    protected Sendertelextension sendertelextension;

    protected Sendertelcountrycode sendertelcountrycode;

    protected Senderfax senderfax;

    protected Senderfaxextension senderfaxextension;

    protected Senderfaxcountrycode senderfaxcountrycode;

    protected Senderemailaddress senderemailaddress;

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
     * Gets the value of the sendertype property.
     *
     * @return possible object is {@link Sendertype }
     *
     */
    public Sendertype getSendertype()
    {
        return sendertype;
    }

    /**
     * Sets the value of the sendertype property.
     *
     * @param value allowed object is {@link Sendertype }
     *
     */
    public void setSendertype( Sendertype value )
    {
        this.sendertype = value;
    }

    /**
     * Gets the value of the senderorganization property.
     *
     * @return possible object is {@link Senderorganization }
     *
     */
    public Senderorganization getSenderorganization()
    {
        return senderorganization;
    }

    /**
     * Sets the value of the senderorganization property.
     *
     * @param value allowed object is {@link Senderorganization }
     *
     */
    public void setSenderorganization( Senderorganization value )
    {
        this.senderorganization = value;
    }

    /**
     * Gets the value of the senderdepartment property.
     *
     * @return possible object is {@link Senderdepartment }
     *
     */
    public Senderdepartment getSenderdepartment()
    {
        return senderdepartment;
    }

    /**
     * Sets the value of the senderdepartment property.
     *
     * @param value allowed object is {@link Senderdepartment }
     *
     */
    public void setSenderdepartment( Senderdepartment value )
    {
        this.senderdepartment = value;
    }

    /**
     * Gets the value of the sendertitle property.
     *
     * @return possible object is {@link Sendertitle }
     *
     */
    public Sendertitle getSendertitle()
    {
        return sendertitle;
    }

    /**
     * Sets the value of the sendertitle property.
     *
     * @param value allowed object is {@link Sendertitle }
     *
     */
    public void setSendertitle( Sendertitle value )
    {
        this.sendertitle = value;
    }

    /**
     * Gets the value of the sendergivename property.
     *
     * @return possible object is {@link Sendergivename }
     *
     */
    public Sendergivename getSendergivename()
    {
        return sendergivename;
    }

    /**
     * Sets the value of the sendergivename property.
     *
     * @param value allowed object is {@link Sendergivename }
     *
     */
    public void setSendergivename( Sendergivename value )
    {
        this.sendergivename = value;
    }

    /**
     * Gets the value of the sendermiddlename property.
     *
     * @return possible object is {@link Sendermiddlename }
     *
     */
    public Sendermiddlename getSendermiddlename()
    {
        return sendermiddlename;
    }

    /**
     * Sets the value of the sendermiddlename property.
     *
     * @param value allowed object is {@link Sendermiddlename }
     *
     */
    public void setSendermiddlename( Sendermiddlename value )
    {
        this.sendermiddlename = value;
    }

    /**
     * Gets the value of the senderfamilyname property.
     *
     * @return possible object is {@link Senderfamilyname }
     *
     */
    public Senderfamilyname getSenderfamilyname()
    {
        return senderfamilyname;
    }

    /**
     * Sets the value of the senderfamilyname property.
     *
     * @param value allowed object is {@link Senderfamilyname }
     *
     */
    public void setSenderfamilyname( Senderfamilyname value )
    {
        this.senderfamilyname = value;
    }

    /**
     * Gets the value of the senderstreetaddress property.
     *
     * @return possible object is {@link Senderstreetaddress }
     *
     */
    public Senderstreetaddress getSenderstreetaddress()
    {
        return senderstreetaddress;
    }

    /**
     * Sets the value of the senderstreetaddress property.
     *
     * @param value allowed object is {@link Senderstreetaddress }
     *
     */
    public void setSenderstreetaddress( Senderstreetaddress value )
    {
        this.senderstreetaddress = value;
    }

    /**
     * Gets the value of the sendercity property.
     *
     * @return possible object is {@link Sendercity }
     *
     */
    public Sendercity getSendercity()
    {
        return sendercity;
    }

    /**
     * Sets the value of the sendercity property.
     *
     * @param value allowed object is {@link Sendercity }
     *
     */
    public void setSendercity( Sendercity value )
    {
        this.sendercity = value;
    }

    /**
     * Gets the value of the senderstate property.
     *
     * @return possible object is {@link Senderstate }
     *
     */
    public Senderstate getSenderstate()
    {
        return senderstate;
    }

    /**
     * Sets the value of the senderstate property.
     *
     * @param value allowed object is {@link Senderstate }
     *
     */
    public void setSenderstate( Senderstate value )
    {
        this.senderstate = value;
    }

    /**
     * Gets the value of the senderpostcode property.
     *
     * @return possible object is {@link Senderpostcode }
     *
     */
    public Senderpostcode getSenderpostcode()
    {
        return senderpostcode;
    }

    /**
     * Sets the value of the senderpostcode property.
     *
     * @param value allowed object is {@link Senderpostcode }
     *
     */
    public void setSenderpostcode( Senderpostcode value )
    {
        this.senderpostcode = value;
    }

    /**
     * Gets the value of the sendercountrycode property.
     *
     * @return possible object is {@link Sendercountrycode }
     *
     */
    public Sendercountrycode getSendercountrycode()
    {
        return sendercountrycode;
    }

    /**
     * Sets the value of the sendercountrycode property.
     *
     * @param value allowed object is {@link Sendercountrycode }
     *
     */
    public void setSendercountrycode( Sendercountrycode value )
    {
        this.sendercountrycode = value;
    }

    /**
     * Gets the value of the sendertel property.
     *
     * @return possible object is {@link Sendertel }
     *
     */
    public Sendertel getSendertel()
    {
        return sendertel;
    }

    /**
     * Sets the value of the sendertel property.
     *
     * @param value allowed object is {@link Sendertel }
     *
     */
    public void setSendertel( Sendertel value )
    {
        this.sendertel = value;
    }

    /**
     * Gets the value of the sendertelextension property.
     *
     * @return possible object is {@link Sendertelextension }
     *
     */
    public Sendertelextension getSendertelextension()
    {
        return sendertelextension;
    }

    /**
     * Sets the value of the sendertelextension property.
     *
     * @param value allowed object is {@link Sendertelextension }
     *
     */
    public void setSendertelextension( Sendertelextension value )
    {
        this.sendertelextension = value;
    }

    /**
     * Gets the value of the sendertelcountrycode property.
     *
     * @return possible object is {@link Sendertelcountrycode }
     *
     */
    public Sendertelcountrycode getSendertelcountrycode()
    {
        return sendertelcountrycode;
    }

    /**
     * Sets the value of the sendertelcountrycode property.
     *
     * @param value allowed object is {@link Sendertelcountrycode }
     *
     */
    public void setSendertelcountrycode( Sendertelcountrycode value )
    {
        this.sendertelcountrycode = value;
    }

    /**
     * Gets the value of the senderfax property.
     *
     * @return possible object is {@link Senderfax }
     *
     */
    public Senderfax getSenderfax()
    {
        return senderfax;
    }

    /**
     * Sets the value of the senderfax property.
     *
     * @param value allowed object is {@link Senderfax }
     *
     */
    public void setSenderfax( Senderfax value )
    {
        this.senderfax = value;
    }

    /**
     * Gets the value of the senderfaxextension property.
     *
     * @return possible object is {@link Senderfaxextension }
     *
     */
    public Senderfaxextension getSenderfaxextension()
    {
        return senderfaxextension;
    }

    /**
     * Sets the value of the senderfaxextension property.
     *
     * @param value allowed object is {@link Senderfaxextension }
     *
     */
    public void setSenderfaxextension( Senderfaxextension value )
    {
        this.senderfaxextension = value;
    }

    /**
     * Gets the value of the senderfaxcountrycode property.
     *
     * @return possible object is {@link Senderfaxcountrycode }
     *
     */
    public Senderfaxcountrycode getSenderfaxcountrycode()
    {
        return senderfaxcountrycode;
    }

    /**
     * Sets the value of the senderfaxcountrycode property.
     *
     * @param value allowed object is {@link Senderfaxcountrycode }
     *
     */
    public void setSenderfaxcountrycode( Senderfaxcountrycode value )
    {
        this.senderfaxcountrycode = value;
    }

    /**
     * Gets the value of the senderemailaddress property.
     *
     * @return possible object is {@link Senderemailaddress }
     *
     */
    public Senderemailaddress getSenderemailaddress()
    {
        return senderemailaddress;
    }

    /**
     * Sets the value of the senderemailaddress property.
     *
     * @param value allowed object is {@link Senderemailaddress }
     *
     */
    public void setSenderemailaddress( Senderemailaddress value )
    {
        this.senderemailaddress = value;
    }

}
