-- begin PANDORA_PATIENT
create table PANDORA_PATIENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PATIENT_FAMILY_NAME varchar(100),
    PATIENT_GIVEN_NAME varchar(100),
    PATIENT_PATRONYMIC varchar(100),
    PATIENT_SEX integer,
    PATIENT_BIRTHDATE date,
    FNKC_REQUEST_DATE date,
    HOSPITALIZATION_FNKC date,
    ADDRESS varchar(255),
    DIAGNOS_ID varchar(36),
    THERAPY_ID varchar(36),
    EVENT_ID varchar(36),
    SURGERY_ID varchar(36),
    TREATMENT_ID varchar(36),
    --
    primary key (ID)
)^
-- end PANDORA_PATIENT
-- begin PANDORA_COURSE
create table PANDORA_COURSE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME integer,
    START_DATE date not null,
    AFP_BEFORE_COURSE integer,
    --
    primary key (ID)
)^
-- end PANDORA_COURSE
-- begin PANDORA_THERAPY
create table PANDORA_THERAPY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    THERAPY_START_DATE date not null,
    PROTOCOL_ID varchar(36),
    AFP_INITIAL integer,
    HYSTOLOGICAL_TYPE varchar(255),
    KT_FIRST_TUMOR integer,
    TUMOR_SIZE integer,
    INITIAL_TUMOR_SIZE integer,
    MRT_INITIAL_TUMOR integer,
    LUNGS_KT integer,
    TC99_SCINTIGRAPHY_ID varchar(36),
    MYELOGRAM_ID varchar(36),
    OPERATION_DATE date,
    POST_TEXT_STAGE varchar(255),
    --
    primary key (ID)
)^
-- end PANDORA_THERAPY
-- begin PANDORA_SURGERY
create table PANDORA_SURGERY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    OPERATION_NAME varchar(200),
    OPERATION_INFLUENCE integer,
    AFFECT varchar(255),
    ADDRESS varchar(255),
    HISTOLOGY_AFTER_OPERATION varchar(255),
    TREATMENT_PATOMORPHISM integer,
    --
    primary key (ID)
)^
-- end PANDORA_SURGERY
-- begin PANDORA_EAR_RATING
create table PANDORA_EAR_RATING (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TYPE_ varchar(100) not null,
    VALUE_ varchar(255),
    --
    primary key (ID)
)^
-- end PANDORA_EAR_RATING
-- begin PANDORA_TREATMENT_RATING
create table PANDORA_TREATMENT_RATING (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    EAR_RATING_ID varchar(36),
    EAR_RATING_METHOD integer,
    AFP_NORMALIZATION_DATE date,
    ANSWER_TIME integer,
    ANSWER_DATE date,
    ANSWER integer,
    --
    primary key (ID)
)^
-- end PANDORA_TREATMENT_RATING
-- begin PANDORA_EVENT
create table PANDORA_EVENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    EVENT integer not null,
    RELAPSE_ID varchar(36),
    DATE_ date not null,
    STATUS_LAST_SEEN integer,
    INFO_SOURCE varchar(255),
    COMMENTS varchar(255),
    POSSIBLE_EFFECTS varchar(255),
    --
    primary key (ID)
)^
-- end PANDORA_EVENT
-- begin PANDORA_DIAGNOSIS
create table PANDORA_DIAGNOSIS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_CLINICAL_MARKS_DATE date not null,
    FIRST_CLINICAL_SYMTOMS varchar(255),
    WEIGHT_AT_BIRTH integer,
    RISK_GROUP_INITIAL integer,
    RISK_GROUP_FINAL integer,
    DIAGNOSIS longvarchar not null,
    TUMOR_TYPE varchar(50),
    HEPAR_PARTS varchar(50),
    ADDITIONAL_DIAGNOSIS varchar(50),
    MKB_10 integer,
    PRETEXT_STAGE integer,
    SPEIGELIAN_LOBE_AFFECT integer,
    HEPAR_OUT_EXPANSION integer,
    FOCAL integer,
    TUMOR_EXPLOSION integer,
    REMOTE_METASTASIS integer,
    LYMPH_NODES_AFFECT integer,
    PORTAL_VEIN_INVOLVE integer,
    HEPAR_VEIN_INVOLVE integer,
    --
    primary key (ID)
)^
-- end PANDORA_DIAGNOSIS
-- begin PANDORA_PROTOCOL
create table PANDORA_PROTOCOL (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    VALUE_ varchar(200) not null,
    --
    primary key (ID)
)^
-- end PANDORA_PROTOCOL
-- begin PANDORA_TC99_SCINTIGRAPHY
create table PANDORA_TC99_SCINTIGRAPHY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    VALUE_ varchar(200) not null,
    --
    primary key (ID)
)^
-- end PANDORA_TC99_SCINTIGRAPHY
-- begin PANDORA_MYELOGRAM
create table PANDORA_MYELOGRAM (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    VALUE_ varchar(200),
    --
    primary key (ID)
)^
-- end PANDORA_MYELOGRAM
-- begin PANDORA_RELAPSE
create table PANDORA_RELAPSE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TYPE_ varchar(255) not null,
    VALUE_ varchar(255),
    --
    primary key (ID)
)^
-- end PANDORA_RELAPSE
