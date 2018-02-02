package com.company.pandora.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum RemoteMetastasis implements EnumClass<Integer> {

    m0(0),
    m1(1);

    private Integer id;

    RemoteMetastasis(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static RemoteMetastasis fromId(Integer id) {
        for (RemoteMetastasis at : RemoteMetastasis.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}