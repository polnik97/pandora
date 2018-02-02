package com.company.pandora.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Mkb10 implements EnumClass<Integer> {

    c_22_0(1),
    c_22_2(2),
    c_22_4(3);

    private Integer id;

    Mkb10(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Mkb10 fromId(Integer id) {
        for (Mkb10 at : Mkb10.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}