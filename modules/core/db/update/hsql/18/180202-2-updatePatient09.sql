alter table PANDORA_PATIENT add constraint FK_PANDORA_PATIENT_EVENT foreign key (EVENT_ID) references PANDORA_EVENT(ID);
