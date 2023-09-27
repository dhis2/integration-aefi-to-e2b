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
package org.hisp.dhis.integration.aefi.service;

import java.net.URI;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.hisp.dhis.integration.aefi.config.properties.Dhis2Properties;
import org.hisp.dhis.integration.aefi.domain.tracker.TrackedEntities;
import org.hisp.dhis.integration.aefi.domain.tracker.TrackedEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Slf4j
@Service
@RequiredArgsConstructor
public class TrackerService
{
    private final Dhis2Properties dhis2Properties;

    private final RestTemplate restTemplate;

    public TrackedEntities search( TrackerSearchParams params )
    {
        return getTrackedEntities( params );
    }

    public TrackedEntity getById( String id )
    {
        UriComponents uriComponents = UriComponentsBuilder.newInstance()
            .uri( URI.create( dhis2Properties.getBaseUrl() ) )
            .path( "/api/trackedEntityInstances/" )
            .path( id )
            .queryParam( "program", dhis2Properties.getMapping().getProgram() )
            .queryParam( "fields", "*" )
            .build()
            .encode();

        System.err.println(uriComponents.toUriString());

        ResponseEntity<TrackedEntity> response = restTemplate.getForEntity( uriComponents.toUri(),
            TrackedEntity.class );

        return response.getBody();
    }

    private TrackedEntities getTrackedEntities( TrackerSearchParams params )
    {
        if ( !params.getTrackedEntities().isEmpty() )
        {
            UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .uri( URI.create( dhis2Properties.getBaseUrl() ) )
                .path( "/api/trackedEntityInstances" )
                .queryParam( "program", dhis2Properties.getMapping().getProgram() )
                .queryParam( "fields", "*" )
                .queryParam( "trackedEntityInstance", String.join( ";", params.getTrackedEntities() ) )
                .build()
                .encode();

            if ( log.isDebugEnabled() )
            {
                log.debug( "Requesting: " + uriComponents.toUriString() );
            }

            ResponseEntity<TrackedEntities> response = restTemplate.getForEntity( uriComponents.toUri(),
                TrackedEntities.class );

            return response.getBody();
        }
        else if ( params.getLastUpdated() != null )
        {
            UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .uri( URI.create( dhis2Properties.getBaseUrl() ) )
                .path( "/api/trackedEntityInstances" )
                .queryParam( "program", dhis2Properties.getMapping().getProgram() )
                .queryParam( "fields", "*" )
                .queryParam( "ouMode", "ACCESSIBLE" )
                .queryParam( "skipPaging", "true" )
                .queryParam( "programStartDate", params.getLastUpdated() )
                .build()
                .encode();

            if ( log.isDebugEnabled() )
            {
                log.debug( "Requesting: " + uriComponents.toUriString() );
            }

            ResponseEntity<TrackedEntities> response = restTemplate.getForEntity( uriComponents.toUri(),
                TrackedEntities.class );

            return response.getBody();
        }

        return new TrackedEntities();
    }
}
