package com.company.pandora.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum LastSeenStatus implements EnumClass<Integer> {

    alive_without_trum(1),
    alive_with_trum(2),
    death_couse_trum(3),
    death_not_couse_trum(4),
    lost_under_control(5),
    no_data(6);

    private Integer id;

    LastSeenStatus(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static LastSeenStatus fromId(Integer id) {
        for (LastSeenStatus at : LastSeenStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}