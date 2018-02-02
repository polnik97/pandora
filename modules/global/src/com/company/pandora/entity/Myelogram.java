package com.company.pandora.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;

@Table(name = "PANDORA_MYELOGRAM")
@Entity(name = "pandora$Myelogram")
public class Myelogram extends StandardEntity {
    private static final long serialVersionUID = -1323662948189305901L;

    @Column(name = "VALUE_", length = 200)
    protected String value;


    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}