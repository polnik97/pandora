package com.company.pandora.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;

@NamePattern("%s|operation_name")
@Table(name = "PANDORA_SURGERY")
@Entity(name = "pandora$Surgery")
public class Surgery extends StandardEntity {
    private static final long serialVersionUID = -701101511429002702L;

    @Column(name = "OPERATION_NAME", length = 200)
    protected String operation_name;

    @Column(name = "OPERATION_INFLUENCE")
    protected Integer operation_influence;

    @Column(name = "AFFECT")
    protected String affect;

    @Column(name = "ADDRESS")
    protected String address;

    @Column(name = "HISTOLOGY_AFTER_OPERATION")
    protected String histology_after_operation;

    @Column(name = "TREATMENT_PATOMORPHISM")
    protected Integer treatment_patomorphism;



    public TreatmentPatomorhism getTreatment_patomorphism() {
        return treatment_patomorphism == null ? null : TreatmentPatomorhism.fromId(treatment_patomorphism);
    }

    public void setTreatment_patomorphism(TreatmentPatomorhism treatment_patomorphism) {
        this.treatment_patomorphism = treatment_patomorphism == null ? null : treatment_patomorphism.getId();
    }


    public OperationInfluence getOperation_influence() {
        return operation_influence == null ? null : OperationInfluence.fromId(operation_influence);
    }

    public void setOperation_influence(OperationInfluence operation_influence) {
        this.operation_influence = operation_influence == null ? null : operation_influence.getId();
    }


    public void setOperation_name(String operation_name) {
        this.operation_name = operation_name;
    }

    public String getOperation_name() {
        return operation_name;
    }

    public void setAffect(String affect) {
        this.affect = affect;
    }

    public String getAffect() {
        return affect;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setHistology_after_operation(String histology_after_operation) {
        this.histology_after_operation = histology_after_operation;
    }

    public String getHistology_after_operation() {
        return histology_after_operation;
    }


}