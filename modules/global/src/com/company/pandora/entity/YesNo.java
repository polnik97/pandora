package com.company.pandora.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum YesNo implements EnumClass<Integer> {

    yes(1),
    no(0);

    private Integer id;

    YesNo(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static YesNo fromId(Integer id) {
        for (YesNo at : YesNo.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}