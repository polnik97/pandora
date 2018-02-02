package com.company.pandora.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;

@NamePattern("%s|patient_family_name")
@Table(name = "PANDORA_PATIENT")
@Entity(name = "pandora$Patient")
public class Patient extends StandardEntity {
    private static final long serialVersionUID = -3656425985863643173L;

    @Column(name = "PATIENT_FAMILY_NAME", length = 100)
    protected String patient_family_name;

    @Column(name = "PATIENT_GIVEN_NAME", length = 100)
    protected String patient_given_name;

    @Column(name = "PATIENT_PATRONYMIC", length = 100)
    protected String patient_patronymic;

    @Column(name = "PATIENT_SEX")
    protected Integer patient_sex;

    @Temporal(TemporalType.DATE)
    @Column(name = "PATIENT_BIRTHDATE")
    protected Date patient_birthdate;

    @Temporal(TemporalType.DATE)
    @Column(name = "FNKC_REQUEST_DATE")
    protected Date fnkc_request_date;

    @Temporal(TemporalType.DATE)
    @Column(name = "HOSPITALIZATION_FNKC")
    protected Date hospitalization_fnkc;

    @Column(name = "ADDRESS")
    protected String address;




    @OnDeleteInverse(DeletePolicy.CASCADE)
    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DIAGNOS_ID")
    protected Diagnosis diagnos;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "THERAPY_ID")
    protected Therapy therapy;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EVENT_ID")
    protected Event event;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SURGERY_ID")
    protected Surgery surgery;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TREATMENT_ID")
    protected TreatmentRating treatment;

    public void setTherapy(Therapy therapy) {
        this.therapy = therapy;
    }

    public Therapy getTherapy() {
        return therapy;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Event getEvent() {
        return event;
    }

    public void setSurgery(Surgery surgery) {
        this.surgery = surgery;
    }

    public Surgery getSurgery() {
        return surgery;
    }

    public void setTreatment(TreatmentRating treatment) {
        this.treatment = treatment;
    }

    public TreatmentRating getTreatment() {
        return treatment;
    }


    public void setDiagnos(Diagnosis diagnos) {
        this.diagnos = diagnos;
    }

    public Diagnosis getDiagnos() {
        return diagnos;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }


    public void setFnkc_request_date(Date fnkc_request_date) {
        this.fnkc_request_date = fnkc_request_date;
    }

    public Date getFnkc_request_date() {
        return fnkc_request_date;
    }

    public void setHospitalization_fnkc(Date hospitalization_fnkc) {
        this.hospitalization_fnkc = hospitalization_fnkc;
    }

    public Date getHospitalization_fnkc() {
        return hospitalization_fnkc;
    }


    public void setPatient_sex(Sex patient_sex) {
        this.patient_sex = patient_sex == null ? null : patient_sex.getId();
    }

    public Sex getPatient_sex() {
        return patient_sex == null ? null : Sex.fromId(patient_sex);
    }


    public void setPatient_family_name(String patient_family_name) {
        this.patient_family_name = patient_family_name;
    }

    public String getPatient_family_name() {
        return patient_family_name;
    }

    public void setPatient_given_name(String patient_given_name) {
        this.patient_given_name = patient_given_name;
    }

    public String getPatient_given_name() {
        return patient_given_name;
    }

    public void setPatient_patronymic(String patient_patronymic) {
        this.patient_patronymic = patient_patronymic;
    }

    public String getPatient_patronymic() {
        return patient_patronymic;
    }

    public void setPatient_birthdate(Date patient_birthdate) {
        this.patient_birthdate = patient_birthdate;
    }

    public Date getPatient_birthdate() {
        return patient_birthdate;
    }


}