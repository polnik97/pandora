alter table PANDORA_THERAPY add constraint FK_PANDORA_THERAPY_TC99_SCINTIGRAPHY foreign key (TC99_SCINTIGRAPHY_ID) references PANDORA_TC99_SCINTIGRAPHY(ID);
