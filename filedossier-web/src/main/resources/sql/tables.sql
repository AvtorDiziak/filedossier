CREATE TABLE `DOSSIERCONTEXT` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `DOSSIERKEY` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `DOSSIERCONTEXTDATA` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `DOSSIERCONTEXT_ID` int(11) DEFAULT NULL,
  `CONTEXTKEY` varchar(64) DEFAULT NULL,
  `CONTEXTVALUE` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
