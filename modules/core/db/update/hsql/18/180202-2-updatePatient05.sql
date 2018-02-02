alter table PANDORA_PATIENT add constraint FK_PANDORA_PATIENT_SURGERY foreign key (SURGERY_ID) references PANDORA_SURGERY(ID);
