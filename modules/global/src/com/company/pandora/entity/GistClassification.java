package com.company.pandora.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum GistClassification implements EnumClass<String> {

    Ipet("1"),
    ClearFocalvar("2"),
    Fert("3"),
    Pleomorf("4"),
    Embrion("5"),
    MelkikletOrtic("6"),
    MelkokletPos("7"),
    IpetSmesh("8"),
    Holadgiblasich("9"),
    EpitMacr("10"),
    SmashIpetWithout("11"),
    SmeshIpetWhith("12");

    private String id;

    GistClassification(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static GistClassification fromId(String id) {
        for (GistClassification at : GistClassification.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}