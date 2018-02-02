package com.company.pandora.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Focal implements EnumClass<Integer> {

    f0(0),
    f1(1);

    private Integer id;

    Focal(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Focal fromId(Integer id) {
        for (Focal at : Focal.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}