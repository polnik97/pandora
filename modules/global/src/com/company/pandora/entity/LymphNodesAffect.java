package com.company.pandora.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum LymphNodesAffect implements EnumClass<Integer> {

    n0(0),
    n1(1),
    n2(2);

    private Integer id;

    LymphNodesAffect(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static LymphNodesAffect fromId(Integer id) {
        for (LymphNodesAffect at : LymphNodesAffect.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}