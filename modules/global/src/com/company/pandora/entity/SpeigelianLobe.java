package com.company.pandora.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum SpeigelianLobe implements EnumClass<Integer> {

    c0(1),
    c1(2);

    private Integer id;

    SpeigelianLobe(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static SpeigelianLobe fromId(Integer id) {
        for (SpeigelianLobe at : SpeigelianLobe.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}