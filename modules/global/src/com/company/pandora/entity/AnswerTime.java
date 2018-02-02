package com.company.pandora.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum AnswerTime implements EnumClass<Integer> {

    after_2_courses(1),
    after_4_courses(2),
    after_therapy_end(3);

    private Integer id;

    AnswerTime(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static AnswerTime fromId(Integer id) {
        for (AnswerTime at : AnswerTime.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}