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

import org.hisp.dhis.integration.aefi.domain.TrackerDataValue;
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
    private TrackerDataValue patient_id;

    @NotNull
    private TrackerDataValue patient_gender;

    @NotNull
    private TrackerDataValue patient_given_name;

    @NotNull
    private TrackerDataValue patient_family_name;

    @NotNull
    private TrackerDataValue patient_birthdate;

    @NotNull
    private TrackerDataValue serious;

    @NotNull
    private TrackerDataValue seriousness_death;

    @NotNull
    private TrackerDataValue seriousness_death_date;

    @NotNull
    private TrackerDataValue seriousness_death_autopsy;

    @NotNull
    private TrackerDataValue seriousness_life_threatening;

    @NotNull
    private TrackerDataValue seriousness_hospitalization;

    @NotNull
    private TrackerDataValue seriousness_disabling;

    @NotNull
    private TrackerDataValue seriousness_congenital_anomali;

    @NotNull
    private TrackerDataValue seriousness_other;

    @NotNull
    private TrackerDataValue seriousness_other_medical_comment;

    @NotNull
    private TrackerDataValue seriousness_medical_comment;

    @NotNull
    private TrackerDataValue reporter_name;

    @NotNull
    private TrackerDataValue reporter_organization;

    @NotNull
    private TrackerDataValue reporter_comment;

    @NotNull
    private TrackerDataValue vaccine1_name;

    @NotNull
    private TrackerDataValue vaccine1_brand;

    @NotNull
    private TrackerDataValue vaccine1_date;

    @NotNull
    private TrackerDataValue vaccine1_time;

    @NotNull
    private TrackerDataValue vaccine1_batch;

    @NotNull
    private TrackerDataValue vaccine1_dose;

    @NotNull
    private TrackerDataValue vaccine1_expiry;

    @NotNull
    private TrackerDataValue diluent1_name;

    @NotNull
    private TrackerDataValue diluent1_batch;

    @NotNull
    private TrackerDataValue diluent1_expiry;

    @NotNull
    private TrackerDataValue diluent1_dor;

    @NotNull
    private TrackerDataValue diluent1_tor;

    @NotNull
    private TrackerDataValue vaccine2_name;

    @NotNull
    private TrackerDataValue vaccine2_brand;

    @NotNull
    private TrackerDataValue vaccine2_date;

    @NotNull
    private TrackerDataValue vaccine2_time;

    @NotNull
    private TrackerDataValue vaccine2_batch;

    @NotNull
    private TrackerDataValue vaccine2_dose;

    @NotNull
    private TrackerDataValue vaccine2_expiry;

    @NotNull
    private TrackerDataValue diluent2_name;

    @NotNull
    private TrackerDataValue diluent2_batch;

    @NotNull
    private TrackerDataValue diluent2_expiry;

    @NotNull
    private TrackerDataValue diluent2_dor;

    @NotNull
    private TrackerDataValue diluent2_tor;

    @NotNull
    private TrackerDataValue vaccine3_name;

    @NotNull
    private TrackerDataValue vaccine3_brand;

    @NotNull
    private TrackerDataValue vaccine3_date;

    @NotNull
    private TrackerDataValue vaccine3_time;

    @NotNull
    private TrackerDataValue vaccine3_batch;

    @NotNull
    private TrackerDataValue vaccine3_dose;

    @NotNull
    private TrackerDataValue vaccine3_expiry;

    @NotNull
    private TrackerDataValue diluent3_name;

    @NotNull
    private TrackerDataValue diluent3_batch;

    @NotNull
    private TrackerDataValue diluent3_expiry;

    @NotNull
    private TrackerDataValue diluent3_dor;

    @NotNull
    private TrackerDataValue diluent3_tor;

    @NotNull
    private TrackerDataValue vaccine4_name;

    @NotNull
    private TrackerDataValue vaccine4_brand;

    @NotNull
    private TrackerDataValue vaccine4_date;

    @NotNull
    private TrackerDataValue vaccine4_time;

    @NotNull
    private TrackerDataValue vaccine4_batch;

    @NotNull
    private TrackerDataValue vaccine4_dose;

    @NotNull
    private TrackerDataValue vaccine4_expiry;

    @NotNull
    private TrackerDataValue diluent4_name;

    @NotNull
    private TrackerDataValue diluent4_batch;

    @NotNull
    private TrackerDataValue diluent4_expiry;

    @NotNull
    private TrackerDataValue diluent4_dor;

    @NotNull
    private TrackerDataValue diluent4_tor;

    @NotNull
    private TrackerDataValue reaction_start_date;

    @NotNull
    private TrackerDataValue reaction_start_time;

    @NotNull
    private TrackerDataValue reaction_outcome;

    @NotNull
    private TrackerDataValue reaction_severe_local_reaction;

    @NotNull
    private TrackerDataValue reaction_above_3_days;

    @NotNull
    private TrackerDataValue reaction_beyond_nearest_joint;

    @NotNull
    private TrackerDataValue reaction_seizures;

    @NotNull
    private TrackerDataValue reaction_seizures_type;

    @NotNull
    private TrackerDataValue reaction_abscess;

    @NotNull
    private TrackerDataValue reaction_sepsis;

    @NotNull
    private TrackerDataValue reaction_encephalopathy;

    @NotNull
    private TrackerDataValue reaction_toxic_shock_syndrome;

    @NotNull
    private TrackerDataValue reaction_thrombocytopenia;

    @NotNull
    private TrackerDataValue reaction_anaphylaxis;

    @NotNull
    private TrackerDataValue reaction_fever_above_38;

    @NotNull
    private TrackerDataValue reaction_headache;

    @NotNull
    private TrackerDataValue reaction_irritability;

    @NotNull
    private TrackerDataValue reaction_sore_throat;

    @NotNull
    private TrackerDataValue reaction_joint_pain;

    @NotNull
    private TrackerDataValue reaction_abdominal_pain;

    @NotNull
    private TrackerDataValue reaction_cough;

    @NotNull
    private TrackerDataValue reaction_nausea;

    @NotNull
    private TrackerDataValue reaction_diarrhoea;

    @NotNull
    private TrackerDataValue reaction_fatigue;

    @NotNull
    private TrackerDataValue reaction_vomiting;

    @NotNull
    private TrackerDataValue reaction_injection_site_soreness;

    @NotNull
    private TrackerDataValue reaction_injection_site_tenderness;

    @NotNull
    private TrackerDataValue reaction_skin_rash;

    @NotNull
    private TrackerDataValue reaction_itchingh;

    @NotNull
    private TrackerDataValue reaction_muscle_pain;

    @NotNull
    private TrackerDataValue reaction_persistent_crying;

    @NotNull
    private TrackerDataValue reaction_poor_breast_feeding;

    @NotNull
    private TrackerDataValue reaction_loss_of_apetite;

    @NotNull
    private TrackerDataValue reaction_chills;

    @NotNull
    private TrackerDataValue reaction_fainting;

    @NotNull
    private TrackerDataValue reaction_mild_fever;

    @NotNull
    private TrackerDataValue reaction_tiredness;

    @NotNull
    private TrackerDataValue reaction_nasal_congestion;

    @NotNull
    private TrackerDataValue reaction_lymph_node_enlargement;

    @NotNull
    private TrackerDataValue reaction_dizziness;

    @NotNull
    private TrackerDataValue reaction_drowsiness;

    @NotNull
    private TrackerDataValue reaction_other;
}
