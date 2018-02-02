package com.company.pandora.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;

@NamePattern("%s|therapy_start_date")
@Table(name = "PANDORA_THERAPY")
@Entity(name = "pandora$Therapy")
public class Therapy extends StandardEntity {
    private static final long serialVersionUID = 1345610875775916663L;

    @Temporal(TemporalType.DATE)
    @Column(name = "THERAPY_START_DATE", nullable = false)
    protected Date therapy_start_date;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PROTOCOL_ID")
    protected Protocol protocol;

    @Column(name = "AFP_INITIAL")
    protected Integer afp_initial;

    @Column(name = "HYSTOLOGICAL_TYPE")
    protected String hystological_type;

    @Column(name = "KT_FIRST_TUMOR")
    protected Integer kt_first_tumor;

    @Column(name = "TUMOR_SIZE")
    protected Integer tumor_size;

    @Column(name = "INITIAL_TUMOR_SIZE")
    protected Integer initial_tumor_size;

    @Column(name = "MRT_INITIAL_TUMOR")
    protected Integer mrt_initial_tumor;

    @Column(name = "LUNGS_KT")
    protected Integer lungs_kt;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TC99_SCINTIGRAPHY_ID")
    protected Tc99Scintigraphy tc99_scintigraphy;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MYELOGRAM_ID")
    protected Myelogram myelogram;

    @Temporal(TemporalType.DATE)
    @Column(name = "OPERATION_DATE")
    protected Date operation_date;

    @Column(name = "POST_TEXT_STAGE")
    protected String post_text_stage;

    public Protocol getProtocol() {
        return protocol;
    }

    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }


    public Tc99Scintigraphy getTc99_scintigraphy() {
        return tc99_scintigraphy;
    }

    public void setTc99_scintigraphy(Tc99Scintigraphy tc99_scintigraphy) {
        this.tc99_scintigraphy = tc99_scintigraphy;
    }


    public Myelogram getMyelogram() {
        return myelogram;
    }

    public void setMyelogram(Myelogram myelogram) {
        this.myelogram = myelogram;
    }




    public YesNo getKt_first_tumor() {
        return kt_first_tumor == null ? null : YesNo.fromId(kt_first_tumor);
    }

    public void setKt_first_tumor(YesNo kt_first_tumor) {
        this.kt_first_tumor = kt_first_tumor == null ? null : kt_first_tumor.getId();
    }


    public YesNo getMrt_initial_tumor() {
        return mrt_initial_tumor == null ? null : YesNo.fromId(mrt_initial_tumor);
    }

    public void setMrt_initial_tumor(YesNo mrt_initial_tumor) {
        this.mrt_initial_tumor = mrt_initial_tumor == null ? null : mrt_initial_tumor.getId();
    }


    public YesNo getLungs_kt() {
        return lungs_kt == null ? null : YesNo.fromId(lungs_kt);
    }

    public void setLungs_kt(YesNo lungs_kt) {
        this.lungs_kt = lungs_kt == null ? null : lungs_kt.getId();
    }


    public void setOperation_date(Date operation_date) {
        this.operation_date = operation_date;
    }

    public Date getOperation_date() {
        return operation_date;
    }

    public void setPost_text_stage(String post_text_stage) {
        this.post_text_stage = post_text_stage;
    }

    public String getPost_text_stage() {
        return post_text_stage;
    }



    public void setAfp_initial(Integer afp_initial) {
        this.afp_initial = afp_initial;
    }

    public Integer getAfp_initial() {
        return afp_initial;
    }

    public void setHystological_type(String hystological_type) {
        this.hystological_type = hystological_type;
    }

    public String getHystological_type() {
        return hystological_type;
    }

    public void setTumor_size(Integer tumor_size) {
        this.tumor_size = tumor_size;
    }

    public Integer getTumor_size() {
        return tumor_size;
    }

    public void setInitial_tumor_size(Integer initial_tumor_size) {
        this.initial_tumor_size = initial_tumor_size;
    }

    public Integer getInitial_tumor_size() {
        return initial_tumor_size;
    }


    public void setTherapy_start_date(Date therapy_start_date) {
        this.therapy_start_date = therapy_start_date;
    }

    public Date getTherapy_start_date() {
        return therapy_start_date;
    }


}