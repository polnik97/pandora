alter table PANDORA_TREATMENT_RATING add constraint FK_PANDORA_TREATMENT_RATING_EAR_RATING foreign key (EAR_RATING_ID) references PANDORA_EAR_RATING(ID);
