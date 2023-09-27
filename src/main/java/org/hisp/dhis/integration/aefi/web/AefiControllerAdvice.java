/*
 * Copyright (c) 2004-2022, University of Oslo
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
package org.hisp.dhis.integration.aefi.web;

import java.net.UnknownHostException;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException;

@ControllerAdvice
public class AefiControllerAdvice
{
    @ResponseBody
    @ExceptionHandler( HttpClientErrorException.class )
    public WebMessage httpClientErrorException( HttpClientErrorException ex, HttpServletResponse response )
    {
        response.setStatus( ex.getRawStatusCode() );
        return new WebMessage( ex.getStatusCode().value(), ex.getStatusCode().getReasonPhrase() );
    }

    @ResponseBody
    @ResponseStatus( HttpStatus.BAD_GATEWAY )
    @ExceptionHandler( UnknownHostException.class )
    public WebMessage unknownHostException( UnknownHostException ex )
    {
        return new WebMessage( HttpStatus.BAD_GATEWAY.value(),
            "Unknown host '" + ex.getMessage() + "', please check your configuration." );
    }

    @ResponseBody
    @ResponseStatus( HttpStatus.BAD_GATEWAY )
    @ExceptionHandler( MessagingException.class )
    public WebMessage messagingException( MessagingException ex )
    {
        return new WebMessage( HttpStatus.BAD_GATEWAY.value(),
            "Problem sending email '" + ex.getMessage() + "', please check your configuration." );
    }
}

@XmlRootElement( name = "webMessage" )
class WebMessage
{
    private int httpStatus;

    private String message;

  public WebMessage() {
  }

  public WebMessage(int httpStatus, String message) {
    this.httpStatus = httpStatus;
    this.message = message;
  }

  @XmlElement
  public int getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(int httpStatus) {
        this.httpStatus = httpStatus;
    }

  @XmlElement
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}