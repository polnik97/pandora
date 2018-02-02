package com.company.pandora.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum HeaprVeinInvolve implements EnumClass<Integer> {

    v0(0),
    v1(1),
    v2(2),
    v3(3);

    private Integer id;

    HeaprVeinInvolve(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static HeaprVeinInvolve fromId(Integer id) {
        for (HeaprVeinInvolve at : HeaprVeinInvolve.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}