DROP TABLE IF EXISTS `dictionary_history`;
CREATE TABLE IF NOT EXISTS `dictionary_history` (
  `NR_SEQUENCE` int(255) NOT NULL AUTO_INCREMENT,
  `NR_SEQ_OBJECT` int(255) NOT NULL,
  `DS_CONTENT` mediumtext,
  `DT_INSERTION` date NOT NULL,
  `CD_USER` int(255) NOT NULL,
  PRIMARY KEY (`NR_SEQUENCE`),
  UNIQUE KEY `nr_sequence_UNIQUE` (`NR_SEQUENCE`),
  KEY `DIC_DICHIS_FK_idx` (`NR_SEQ_OBJECT`),
  KEY `FK_DICHIST_USER_idx` (`CD_USER`),
  CONSTRAINT `FK_DICHIST_USER` FOREIGN KEY (`CD_USER`) REFERENCES `application_user` (`nr_sequence`),
  CONSTRAINT `FK_DIC_DICHIST` FOREIGN KEY (`NR_SEQ_OBJECT`) REFERENCES `dictionary` (`nr_sequence`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;