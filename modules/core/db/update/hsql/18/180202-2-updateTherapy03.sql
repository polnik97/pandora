alter table PANDORA_THERAPY add constraint FK_PANDORA_THERAPY_MYELOGRAM foreign key (MYELOGRAM_ID) references PANDORA_MYELOGRAM(ID);
