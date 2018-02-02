package com.company.pandora.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum TherapyAnswer implements EnumClass<Integer> {

    full_answer(1),
    partial_answer(2),
    stabilization(3),
    progression(4);

    private Integer id;

    TherapyAnswer(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static TherapyAnswer fromId(Integer id) {
        for (TherapyAnswer at : TherapyAnswer.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}