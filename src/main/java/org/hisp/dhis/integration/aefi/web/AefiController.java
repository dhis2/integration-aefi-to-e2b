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

import java.time.LocalDate;
import java.util.List;

import lombok.RequiredArgsConstructor;

import org.hisp.dhis.integration.aefi.domain.icsr21.Ichicsr;
import org.hisp.dhis.integration.aefi.domain.tracker.TrackedEntities;
import org.hisp.dhis.integration.aefi.domain.tracker.TrackedEntity;
import org.hisp.dhis.integration.aefi.service.AefiService;
import org.hisp.dhis.integration.aefi.service.TrackerSearchParams;
import org.hisp.dhis.integration.aefi.service.TrackerService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

@RestController
@RequiredArgsConstructor
@ConditionalOnProperty( prefix = "aefi-to-e2b.api", name = "enabled" )
@RequestMapping( "${aefi-to-e2b.api.endpoint}" )
public class AefiController
{
    private final TrackerService trackerService;

    private final AefiService aefiService;

    @GetMapping( value = "/{uid}", produces = MediaType.APPLICATION_XML_VALUE )
    public ResponseEntity<Ichicsr> getAefiCase( @PathVariable String uid )
    {
        TrackedEntity trackedEntity = trackerService.getById( uid );

        if ( trackedEntity == null )
        {
            throw new HttpClientErrorException( HttpStatus.NOT_FOUND );
        }

        Ichicsr ichicsr = aefiService.getFromTrackedEntity( trackedEntity );

        return ResponseEntity.ok( ichicsr );
    }

    @GetMapping( value = "", produces = MediaType.APPLICATION_XML_VALUE )
    public ResponseEntity<Ichicsr> getAefiCases(
        @RequestParam( required = false ) List<String> te,
        @RequestParam( required = false ) @DateTimeFormat( pattern = "yyyy-MM-dd" ) LocalDate lastUpdated )
    {
        TrackerSearchParams params = TrackerSearchParams.of( te, lastUpdated );
        TrackedEntities trackedEntities = trackerService.search( params );
        Ichicsr ichicsr = aefiService.getFromTrackedEntities( trackedEntities );

        return ResponseEntity.ok( ichicsr );
    }
}
