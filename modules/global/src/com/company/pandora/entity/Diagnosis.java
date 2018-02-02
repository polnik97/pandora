package com.company.pandora.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@NamePattern("%s|first_clinical_marks_date")
@Table(name = "PANDORA_DIAGNOSIS")
@Entity(name = "pandora$Diagnosis")
public class Diagnosis extends StandardEntity {
    private static final long serialVersionUID = 6207827717666743613L;

    @Temporal(TemporalType.DATE)
    @Column(name = "FIRST_CLINICAL_MARKS_DATE", nullable = false)
    protected Date first_clinical_marks_date;

    @Column(name = "FIRST_CLINICAL_SYMTOMS")
    protected String first_clinical_symtoms;

    @Column(name = "WEIGHT_AT_BIRTH")
    protected Integer weight_at_birth;

    @Column(name = "RISK_GROUP_INITIAL")
    protected Integer risk_group_initial;

    @Column(name = "RISK_GROUP_FINAL")
    protected Integer risk_group_final;

    @Lob
    @Column(name = "DIAGNOSIS", nullable = false)
    protected String diagnosis;

    @Column(name = "TUMOR_TYPE")
    protected String tumorType;

    @Column(name = "HEPAR_PARTS")
    protected String hepar_parts;

    @Column(name = "ADDITIONAL_DIAGNOSIS")
    protected String additional_diagnosis;

    @Column(name = "MKB_10")
    protected Integer mkb_10;

    @Column(name = "PRETEXT_STAGE")
    protected Integer pretext_stage;

    @Column(name = "SPEIGELIAN_LOBE_AFFECT")
    protected Integer speigelian_lobe_affect;

    @Column(name = "HEPAR_OUT_EXPANSION")
    protected Integer hepar_out_expansion;

    @Column(name = "FOCAL")
    protected Integer focal;

    @Column(name = "TUMOR_EXPLOSION")
    protected Integer tumor_explosion;

    @Column(name = "REMOTE_METASTASIS")
    protected Integer remote_metastasis;

    @Column(name = "LYMPH_NODES_AFFECT")
    protected Integer lymph_nodes_affect;

    @Column(name = "PORTAL_VEIN_INVOLVE")
    protected Integer portal_vein_involve;

    @Column(name = "HEPAR_VEIN_INVOLVE")
    protected Integer hepar_vein_involve;

    public GistClassification getAdditional_diagnosis() {
        return additional_diagnosis == null ? null : GistClassification.fromId(additional_diagnosis);
    }

    public void setAdditional_diagnosis(GistClassification additional_diagnosis) {
        this.additional_diagnosis = additional_diagnosis == null ? null : additional_diagnosis.getId();
    }


    public HeparParts getHepar_parts() {
        return hepar_parts == null ? null : HeparParts.fromId(hepar_parts);
    }

    public void setHepar_parts(HeparParts hepar_parts) {
        this.hepar_parts = hepar_parts == null ? null : hepar_parts.getId();
    }


    public TumorType getTumorType() {
        return tumorType == null ? null : TumorType.fromId(tumorType);
    }

    public void setTumorType(TumorType tumorType) {
        this.tumorType = tumorType == null ? null : tumorType.getId();
    }







    public void setFirst_clinical_marks_date(Date first_clinical_marks_date) {
        this.first_clinical_marks_date = first_clinical_marks_date;
    }

    public Date getFirst_clinical_marks_date() {
        return first_clinical_marks_date;
    }

    public void setFirst_clinical_symtoms(String first_clinical_symtoms) {
        this.first_clinical_symtoms = first_clinical_symtoms;
    }

    public String getFirst_clinical_symtoms() {
        return first_clinical_symtoms;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setMkb_10(Mkb10 mkb_10) {
        this.mkb_10 = mkb_10 == null ? null : mkb_10.getId();
    }

    public Mkb10 getMkb_10() {
        return mkb_10 == null ? null : Mkb10.fromId(mkb_10);
    }

    public void setWeight_at_birth(Integer weight_at_birth) {
        this.weight_at_birth = weight_at_birth;
    }

    public Integer getWeight_at_birth() {
        return weight_at_birth;
    }

    public void setPretext_stage(Numer pretext_stage) {
        this.pretext_stage = pretext_stage == null ? null : pretext_stage.getId();
    }

    public Numer getPretext_stage() {
        return pretext_stage == null ? null : Numer.fromId(pretext_stage);
    }

    public void setSpeigelian_lobe_affect(SpeigelianLobe speigelian_lobe_affect) {
        this.speigelian_lobe_affect = speigelian_lobe_affect == null ? null : speigelian_lobe_affect.getId();
    }

    public SpeigelianLobe getSpeigelian_lobe_affect() {
        return speigelian_lobe_affect == null ? null : SpeigelianLobe.fromId(speigelian_lobe_affect);
    }

    public void setHepar_out_expansion(HeparOutExtension hepar_out_expansion) {
        this.hepar_out_expansion = hepar_out_expansion == null ? null : hepar_out_expansion.getId();
    }

    public HeparOutExtension getHepar_out_expansion() {
        return hepar_out_expansion == null ? null : HeparOutExtension.fromId(hepar_out_expansion);
    }

    public void setFocal(Focal focal) {
        this.focal = focal == null ? null : focal.getId();
    }

    public Focal getFocal() {
        return focal == null ? null : Focal.fromId(focal);
    }

    public void setTumor_explosion(TumorExplosion tumor_explosion) {
        this.tumor_explosion = tumor_explosion == null ? null : tumor_explosion.getId();
    }

    public TumorExplosion getTumor_explosion() {
        return tumor_explosion == null ? null : TumorExplosion.fromId(tumor_explosion);
    }

    public void setRemote_metastasis(RemoteMetastasis remote_metastasis) {
        this.remote_metastasis = remote_metastasis == null ? null : remote_metastasis.getId();
    }

    public RemoteMetastasis getRemote_metastasis() {
        return remote_metastasis == null ? null : RemoteMetastasis.fromId(remote_metastasis);
    }

    public void setLymph_nodes_affect(LymphNodesAffect lymph_nodes_affect) {
        this.lymph_nodes_affect = lymph_nodes_affect == null ? null : lymph_nodes_affect.getId();
    }

    public LymphNodesAffect getLymph_nodes_affect() {
        return lymph_nodes_affect == null ? null : LymphNodesAffect.fromId(lymph_nodes_affect);
    }

    public void setPortal_vein_involve(PortalVeinInvolve portal_vein_involve) {
        this.portal_vein_involve = portal_vein_involve == null ? null : portal_vein_involve.getId();
    }

    public PortalVeinInvolve getPortal_vein_involve() {
        return portal_vein_involve == null ? null : PortalVeinInvolve.fromId(portal_vein_involve);
    }

    public void setHepar_vein_involve(HeaprVeinInvolve hepar_vein_involve) {
        this.hepar_vein_involve = hepar_vein_involve == null ? null : hepar_vein_involve.getId();
    }

    public HeaprVeinInvolve getHepar_vein_involve() {
        return hepar_vein_involve == null ? null : HeaprVeinInvolve.fromId(hepar_vein_involve);
    }

    public void setRisk_group_initial(Numer risk_group_initial) {
        this.risk_group_initial = risk_group_initial == null ? null : risk_group_initial.getId();
    }

    public Numer getRisk_group_initial() {
        return risk_group_initial == null ? null : Numer.fromId(risk_group_initial);
    }

    public void setRisk_group_final(Numer risk_group_final) {
        this.risk_group_final = risk_group_final == null ? null : risk_group_final.getId();
    }

    public Numer getRisk_group_final() {
        return risk_group_final == null ? null : Numer.fromId(risk_group_final);
    }


}