package com.company.pandora.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Grade implements EnumClass<Integer> {

    standart(0),
    high(1),
    very_high(2);

    private Integer id;

    Grade(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Grade fromId(Integer id) {
        for (Grade at : Grade.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}