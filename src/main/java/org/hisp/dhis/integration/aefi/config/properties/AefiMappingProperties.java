/*
 * Copyright (c) 2004-2004-2022, University of Oslo
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
package org.hisp.dhis.integration.aefi.config.properties;

import javax.validation.constraints.NotNull;

import lombok.Data;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Data
@Component
@Validated
@ConfigurationProperties( prefix = "aefi-to-e2b.dhis2.mapping" )
public class AefiMappingProperties
{
    @NotNull
    private String program;

    @NotNull
    private String vaccine1_name;

    @NotNull
    private String vaccine1_brand;

    @NotNull
    private String vaccine1_date;

    @NotNull
    private String vaccine1_time;

    @NotNull
    private String vaccine1_batch;

    @NotNull
    private String vaccine1_dose;

    @NotNull
    private String vaccine1_expiry;

    @NotNull
    private String diluent1_name;

    @NotNull
    private String diluent1_batch;

    @NotNull
    private String diluent1_expiry;

    @NotNull
    private String diluent1_dor;

    @NotNull
    private String diluent1_tor;

    @NotNull
    private String vaccine2_name;

    @NotNull
    private String vaccine2_brand;

    @NotNull
    private String vaccine2_date;

    @NotNull
    private String vaccine2_time;

    @NotNull
    private String vaccine2_batch;

    @NotNull
    private String vaccine2_dose;

    @NotNull
    private String vaccine2_expiry;

    @NotNull
    private String diluent2_name;

    @NotNull
    private String diluent2_batch;

    @NotNull
    private String diluent2_expiry;

    @NotNull
    private String diluent2_dor;

    @NotNull
    private String diluent2_tor;

    @NotNull
    private String vaccine3_name;

    @NotNull
    private String vaccine3_brand;

    @NotNull
    private String vaccine3_date;

    @NotNull
    private String vaccine3_time;

    @NotNull
    private String vaccine3_batch;

    @NotNull
    private String vaccine3_dose;

    @NotNull
    private String vaccine3_expiry;

    @NotNull
    private String diluent3_name;

    @NotNull
    private String diluent3_batch;

    @NotNull
    private String diluent3_expiry;

    @NotNull
    private String diluent3_dor;

    @NotNull
    private String diluent3_tor;

    @NotNull
    private String vaccine4_name;

    @NotNull
    private String vaccine4_brand;

    @NotNull
    private String vaccine4_date;

    @NotNull
    private String vaccine4_time;

    @NotNull
    private String vaccine4_batch;

    @NotNull
    private String vaccine4_dose;

    @NotNull
    private String vaccine4_expiry;

    @NotNull
    private String diluent4_name;

    @NotNull
    private String diluent4_batch;

    @NotNull
    private String diluent4_expiry;

    @NotNull
    private String diluent4_dor;

    @NotNull
    private String diluent4_tor;

    @NotNull
    private String reaction_severe_local_reaction;

    @NotNull
    private String reaction_above_3_days;

    @NotNull
    private String reaction_beyond_nearest_joint;

    @NotNull
    private String reaction_seizures;

    @NotNull
    private String reaction_seizures_type;

    @NotNull
    private String reaction_abscess;

    @NotNull
    private String reaction_sepsis;

    @NotNull
    private String reaction_encephalopathy;

    @NotNull
    private String reaction_toxic_shock_syndrome;

    @NotNull
    private String reaction_thrombocytopenia;

    @NotNull
    private String reaction_anaphylaxis;

    @NotNull
    private String reaction_fever_above_38;

    @NotNull
    private String reaction_headache;

    @NotNull
    private String reaction_irritability;

    @NotNull
    private String reaction_sore_throat;

    @NotNull
    private String reaction_joint_pain;

    @NotNull
    private String reaction_abdominal_pain;

    @NotNull
    private String reaction_cough;

    @NotNull
    private String reaction_nausea;

    @NotNull
    private String reaction_diarrhoea;

    @NotNull
    private String reaction_fatigue;

    @NotNull
    private String reaction_vomiting;

    @NotNull
    private String reaction_injection_site_soreness;

    @NotNull
    private String reaction_injection_site_tenderness;

    @NotNull
    private String reaction_skin_rash;

    @NotNull
    private String reaction_itchingh;

    @NotNull
    private String reaction_muscle_pain;

    @NotNull
    private String reaction_persistent_crying;

    @NotNull
    private String reaction_poor_breast_feeding;

    @NotNull
    private String reaction_loss_of_apetite;

    @NotNull
    private String reaction_chills;

    @NotNull
    private String reaction_fainting;

    @NotNull
    private String reaction_mild_fever;

    @NotNull
    private String reaction_tiredness;

    @NotNull
    private String reaction_nasal_congestion;

    @NotNull
    private String reaction_lymph_node_enlargement;

    @NotNull
    private String reaction_dizziness;

    @NotNull
    private String reaction_drowsiness;

    @NotNull
    private String reaction_other;
}
