package com.company.pandora.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum HeparOutExtension implements EnumClass<Integer> {

    e0(0),
    e1(1),
    e2(2);

    private Integer id;

    HeparOutExtension(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static HeparOutExtension fromId(Integer id) {
        for (HeparOutExtension at : HeparOutExtension.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}