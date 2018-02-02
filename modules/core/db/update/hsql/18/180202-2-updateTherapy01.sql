alter table PANDORA_THERAPY add constraint FK_PANDORA_THERAPY_PROTOCOL foreign key (PROTOCOL_ID) references PANDORA_PROTOCOL(ID);
