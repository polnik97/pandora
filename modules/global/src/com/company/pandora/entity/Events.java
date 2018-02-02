package com.company.pandora.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Events implements EnumClass<Integer> {

    alive_without_changes(1),
    relapse(2),
    progression(3),
    second_trum(4),
    death(5),
    lost_under_control(6),
    no_data(7);

    private Integer id;

    Events(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Events fromId(Integer id) {
        for (Events at : Events.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}