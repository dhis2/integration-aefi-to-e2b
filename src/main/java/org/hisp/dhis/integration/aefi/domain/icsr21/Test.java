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
    "testdateformat",
    "testdate",
    "testname",
    "testresult",
    "testunit",
    "lowtestrange",
    "hightestrange",
    "moreinformation"
} )
@XmlRootElement( name = "test" )
public class Test
{

    @XmlAttribute( name = "lang" )
    @XmlJavaTypeAdapter( NormalizedStringAdapter.class )
    protected String lang;

    protected Testdateformat testdateformat;

    protected Testdate testdate;

    protected Testname testname;

    protected Testresult testresult;

    protected Testunit testunit;

    protected Lowtestrange lowtestrange;

    protected Hightestrange hightestrange;

    protected Moreinformation moreinformation;

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
     * Gets the value of the testdateformat property.
     *
     * @return possible object is {@link Testdateformat }
     *
     */
    public Testdateformat getTestdateformat()
    {
        return testdateformat;
    }

    /**
     * Sets the value of the testdateformat property.
     *
     * @param value allowed object is {@link Testdateformat }
     *
     */
    public void setTestdateformat( Testdateformat value )
    {
        this.testdateformat = value;
    }

    /**
     * Gets the value of the testdate property.
     *
     * @return possible object is {@link Testdate }
     *
     */
    public Testdate getTestdate()
    {
        return testdate;
    }

    /**
     * Sets the value of the testdate property.
     *
     * @param value allowed object is {@link Testdate }
     *
     */
    public void setTestdate( Testdate value )
    {
        this.testdate = value;
    }

    /**
     * Gets the value of the testname property.
     *
     * @return possible object is {@link Testname }
     *
     */
    public Testname getTestname()
    {
        return testname;
    }

    /**
     * Sets the value of the testname property.
     *
     * @param value allowed object is {@link Testname }
     *
     */
    public void setTestname( Testname value )
    {
        this.testname = value;
    }

    /**
     * Gets the value of the testresult property.
     *
     * @return possible object is {@link Testresult }
     *
     */
    public Testresult getTestresult()
    {
        return testresult;
    }

    /**
     * Sets the value of the testresult property.
     *
     * @param value allowed object is {@link Testresult }
     *
     */
    public void setTestresult( Testresult value )
    {
        this.testresult = value;
    }

    /**
     * Gets the value of the testunit property.
     *
     * @return possible object is {@link Testunit }
     *
     */
    public Testunit getTestunit()
    {
        return testunit;
    }

    /**
     * Sets the value of the testunit property.
     *
     * @param value allowed object is {@link Testunit }
     *
     */
    public void setTestunit( Testunit value )
    {
        this.testunit = value;
    }

    /**
     * Gets the value of the lowtestrange property.
     *
     * @return possible object is {@link Lowtestrange }
     *
     */
    public Lowtestrange getLowtestrange()
    {
        return lowtestrange;
    }

    /**
     * Sets the value of the lowtestrange property.
     *
     * @param value allowed object is {@link Lowtestrange }
     *
     */
    public void setLowtestrange( Lowtestrange value )
    {
        this.lowtestrange = value;
    }

    /**
     * Gets the value of the hightestrange property.
     *
     * @return possible object is {@link Hightestrange }
     *
     */
    public Hightestrange getHightestrange()
    {
        return hightestrange;
    }

    /**
     * Sets the value of the hightestrange property.
     *
     * @param value allowed object is {@link Hightestrange }
     *
     */
    public void setHightestrange( Hightestrange value )
    {
        this.hightestrange = value;
    }

    /**
     * Gets the value of the moreinformation property.
     *
     * @return possible object is {@link Moreinformation }
     *
     */
    public Moreinformation getMoreinformation()
    {
        return moreinformation;
    }

    /**
     * Sets the value of the moreinformation property.
     *
     * @param value allowed object is {@link Moreinformation }
     *
     */
    public void setMoreinformation( Moreinformation value )
    {
        this.moreinformation = value;
    }

}
