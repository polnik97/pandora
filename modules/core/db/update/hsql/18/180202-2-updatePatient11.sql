alter table PANDORA_PATIENT add constraint FK_PANDORA_PATIENT_TREATMENT foreign key (TREATMENT_ID) references PANDORA_TREATMENT_RATING(ID);