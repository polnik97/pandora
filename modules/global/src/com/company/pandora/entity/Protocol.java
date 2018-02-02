package com.company.pandora.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;

@Table(name = "PANDORA_PROTOCOL")
@Entity(name = "pandora$Protocol")
public class Protocol extends StandardEntity {
    private static final long serialVersionUID = -6323303264655510792L;

    @Column(name = "VALUE_", length = 200)
    protected String value;


    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}