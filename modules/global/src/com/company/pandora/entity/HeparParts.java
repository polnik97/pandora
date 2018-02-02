package com.company.pandora.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum HeparParts implements EnumClass<String> {

    leftPart("left"),
    RightPart("right"),
    BothParts("Both");

    private String id;

    HeparParts(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static HeparParts fromId(String id) {
        for (HeparParts at : HeparParts.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}