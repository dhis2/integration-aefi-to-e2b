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

import java.util.List;
import java.util.UUID;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import org.hisp.dhis.integration.aefi.common.IchicsrUtils;
import org.hisp.dhis.integration.aefi.config.properties.AefiProperties;
import org.hisp.dhis.integration.aefi.domain.icsr21.Drug;
import org.hisp.dhis.integration.aefi.domain.icsr21.Ichicsr;
import org.hisp.dhis.integration.aefi.domain.icsr21.Ichicsrmessageheader;
import org.hisp.dhis.integration.aefi.domain.icsr21.Reaction;
import org.hisp.dhis.integration.aefi.domain.icsr21.Safetyreport;
import org.hisp.dhis.integration.aefi.domain.tracker.TrackedEntities;
import org.hisp.dhis.integration.aefi.domain.tracker.TrackedEntity;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class AefiService
{
    private final AefiProperties aefiProperties;

    private final OrganisationUnitService organisationUnitService;

    public Ichicsr getFromTrackedEntity( TrackedEntity trackedEntity )
    {
        TrackedEntities trackedEntities = new TrackedEntities();
        trackedEntities.getTrackedEntities().add( trackedEntity );

        System.err.println("1");

        return getFromTrackedEntities( trackedEntities );
    }

    public Ichicsr getFromTrackedEntities( TrackedEntities trackedEntities )
    {
        Ichicsr ichicsr = IchicsrUtils.createIchicsr();

        Ichicsrmessageheader ichicsrmessageheader = IchicsrUtils.createIchicsrmessageheader(
            UUID.randomUUID().toString(), aefiProperties.getE2b().getSenderId(),
            aefiProperties.getE2b().getReceiverId() );

        System.err.println("2");

        ichicsr.setIchicsrmessageheader( ichicsrmessageheader );

        trackedEntities.getTrackedEntities().forEach( te -> {
            Safetyreport safetyreport = IchicsrUtils
                .createSafetyreport( aefiProperties, te, organisationUnitService::getOrganisationUnit );

            List<Drug> drugs = safetyreport.getPatient().getDrug();
            List<Reaction> reactions = safetyreport.getPatient().getReaction();

            if ( drugs == null || reactions == null || drugs.isEmpty() || reactions.isEmpty() )
            {
                log.warn( "Skipping safetyreport: " + safetyreport );
                return;
            }

            ichicsr.getSafetyreport().add( safetyreport );
        } );

        return ichicsr;
    }
}
