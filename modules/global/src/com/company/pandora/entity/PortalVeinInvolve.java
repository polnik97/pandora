package com.company.pandora.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum PortalVeinInvolve implements EnumClass<Integer> {

    p0(0),
    p1(1),
    p2(2);

    private Integer id;

    PortalVeinInvolve(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static PortalVeinInvolve fromId(Integer id) {
        for (PortalVeinInvolve at : PortalVeinInvolve.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}