package com.company.pandora.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Courses implements EnumClass<Integer> {

    cddp(0),
    a1(1),
    a2(2),
    a3(3),
    b(4),
    c(5),
    plado(6),
    carbo_doxo(7);

    private Integer id;

    Courses(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Courses fromId(Integer id) {
        for (Courses at : Courses.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}