alter table PANDORA_PATIENT add constraint FK_PANDORA_PATIENT_THERAPY foreign key (THERAPY_ID) references PANDORA_THERAPY(ID);
