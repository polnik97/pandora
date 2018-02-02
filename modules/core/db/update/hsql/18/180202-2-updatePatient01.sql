alter table PANDORA_PATIENT add constraint FK_PANDORA_PATIENT_DIAGNOS foreign key (DIAGNOS_ID) references PANDORA_DIAGNOSIS(ID);
