package com.company.pandora.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;

@Table(name = "PANDORA_EAR_RATING")
@Entity(name = "pandora$EarRating")
public class EarRating extends StandardEntity {
    private static final long serialVersionUID = 4377826036691517280L;

    @Column(name = "TYPE_", nullable = false, length = 100)
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