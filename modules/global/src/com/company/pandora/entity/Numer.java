package com.company.pandora.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Numer implements EnumClass<Integer> {

    I(1),
    II(2),
    III(3),
    IV(4);

    private Integer id;

    Numer(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Numer fromId(Integer id) {
        for (Numer at : Numer.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}