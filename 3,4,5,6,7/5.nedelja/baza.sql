/*
SQLyog Community v12.08 (32 bit)
MySQL - 5.6.12-log : Database - prosoft
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`prosoft` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

USE `prosoft`;

/*Table structure for table `mesto` */

DROP TABLE IF EXISTS `mesto`;

CREATE TABLE `mesto` (
  `ppt` bigint(20) NOT NULL,
  `naziv` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`ppt`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `mesto` */

insert  into `mesto`(`ppt`,`naziv`) values (11000,'Beograd'),(21000,'Novi Sad'),(35000,'Jagodina');

/*Table structure for table `poslovni_partner` */

DROP TABLE IF EXISTS `poslovni_partner`;

CREATE TABLE `poslovni_partner` (
  `pib` varchar(7) COLLATE utf8_unicode_ci DEFAULT NULL,
  `maticniBroj` varchar(8) COLLATE utf8_unicode_ci NOT NULL,
  `naziv` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ulica` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `broj` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ppt` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`maticniBroj`),
  KEY `ppt_fk` (`ppt`),
  CONSTRAINT `ppt_fk` FOREIGN KEY (`ppt`) REFERENCES `mesto` (`ppt`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `poslovni_partner` */

insert  into `poslovni_partner`(`pib`,`maticniBroj`,`naziv`,`ulica`,`broj`,`ppt`) values ('12','12345678','ii','23','33',11000);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
