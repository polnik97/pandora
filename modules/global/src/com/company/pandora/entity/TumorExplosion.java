package com.company.pandora.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum TumorExplosion implements EnumClass<Integer> {

    h0(0),
    h1(1);

    private Integer id;

    TumorExplosion(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static TumorExplosion fromId(Integer id) {
        for (TumorExplosion at : TumorExplosion.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}