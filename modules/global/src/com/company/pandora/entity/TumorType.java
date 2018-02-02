package com.company.pandora.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum TumorType implements EnumClass<String> {

    Hepatoblastoma("hepatoblastoma");

    private String id;

    TumorType(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static TumorType fromId(String id) {
        for (TumorType at : TumorType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}