package com.company.pandora.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum TreatmentPatomorhism implements EnumClass<Integer> {

    grade_1(1),
    grade_2(2),
    grade_3(3),
    grade_4(4),
    no_data(5);

    private Integer id;

    TreatmentPatomorhism(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static TreatmentPatomorhism fromId(Integer id) {
        for (TreatmentPatomorhism at : TreatmentPatomorhism.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}