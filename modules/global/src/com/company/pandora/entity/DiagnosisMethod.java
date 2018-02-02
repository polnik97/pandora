package com.company.pandora.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum DiagnosisMethod implements EnumClass<Integer> {

    histology_first_trum(1),
    metastasis_histology(2),
    clinical_survey(3),
    no_data(4);

    private Integer id;

    DiagnosisMethod(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static DiagnosisMethod fromId(Integer id) {
        for (DiagnosisMethod at : DiagnosisMethod.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}