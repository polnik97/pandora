package com.company.pandora.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "PANDORA_TC99_SCINTIGRAPHY")
@Entity(name = "pandora$Tc99Scintigraphy")
public class Tc99Scintigraphy extends StandardEntity {
    private static final long serialVersionUID = -3744816108697891507L;

    @Column(name = "VALUE_", length = 200)
    protected String value;


    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}