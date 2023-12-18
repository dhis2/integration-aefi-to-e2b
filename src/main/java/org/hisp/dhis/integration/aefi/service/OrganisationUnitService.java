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
import org.hisp.dhis.integration.aefi.config.properties.Dhis2Properties;
import org.hisp.dhis.integration.aefi.domain.OrganisationUnit;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Service
@RequiredArgsConstructor
@CacheConfig(cacheNames = {"orgUnit"})
public class OrganisationUnitService {

  private final Dhis2Properties dhis2Properties;

  private final RestTemplate restTemplate;

  @Cacheable("orgUnit")
  public OrganisationUnit getOrganisationUnit(String id) {
    UriComponents uriComponents = UriComponentsBuilder.newInstance()
        .uri(URI.create(dhis2Properties.getBaseUrl()))
        .path("/api/organisationUnits/")
        .path(id)
        .queryParam("fields", "id,displayName~rename(name)")
        .build()
        .encode();

    try {
      ResponseEntity<OrganisationUnit> response = restTemplate.getForEntity(uriComponents.toUri(),
          OrganisationUnit.class);

      return response.getBody();
    } catch (HttpClientErrorException ignored) {
      OrganisationUnit organisationUnit = new OrganisationUnit();
      organisationUnit.setId(id);
      organisationUnit.setName(id);

      return organisationUnit;
    }
  }
}
