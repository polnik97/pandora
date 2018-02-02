package com.company.pandora.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum EarRatingMethod implements EnumClass<Integer> {

    vsp(1),
    audiometry(2);

    private Integer id;

    EarRatingMethod(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static EarRatingMethod fromId(Integer id) {
        for (EarRatingMethod at : EarRatingMethod.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}