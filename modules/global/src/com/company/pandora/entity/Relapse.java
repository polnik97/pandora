package com.company.pandora.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;

@Table(name = "PANDORA_RELAPSE")
@Entity(name = "pandora$Relapse")
public class Relapse extends StandardEntity {
    private static final long serialVersionUID = -5781327348224614018L;

    @Column(name = "TYPE_", nullable = false)
    protected String type;

    @Column(name = "VALUE_")
    protected String value;


    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}