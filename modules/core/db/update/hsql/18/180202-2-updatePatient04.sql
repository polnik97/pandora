alter table PANDORA_PATIENT add constraint FK_PANDORA_PATIENT_TREATMENT_RATING foreign key (TREATMENT_RATING_ID) references PANDORA_TREATMENT_RATING(ID);
