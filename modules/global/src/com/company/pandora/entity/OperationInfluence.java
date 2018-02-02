package com.company.pandora.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum OperationInfluence implements EnumClass<Integer> {

    biopsy(1),
    r0_resaction(2),
    r1_resaction(3),
    r2_resaction(4);

    private Integer id;

    OperationInfluence(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static OperationInfluence fromId(Integer id) {
        for (OperationInfluence at : OperationInfluence.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}