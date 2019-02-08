/*
SQLyog Ultimate v11.5 (64 bit)
MySQL - 5.5.50 : Database - gestionetudiant
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`gestionetudiant` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `gestionetudiant`;

/*Table structure for table `etudiant` */

DROP TABLE IF EXISTS `etudiant`;

CREATE TABLE `etudiant` (
  `idEtudiant` int(11) NOT NULL,
  `adresse` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idEtudiant`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `etudiant` */

insert  into `etudiant`(`idEtudiant`,`adresse`,`email`,`nom`,`prenom`,`telephone`) values (1,'Boyard','passefort@yahoo.fr','Passe','Partout','654212378'),(2,'TKC','poladams@gmail.com','Adams','Polo','687451932'),(3,'Bastos','desremy@gmail.com','Deschamps','Jeremy','622354999');

/*Table structure for table `hibernate_sequence` */

DROP TABLE IF EXISTS `hibernate_sequence`;

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `hibernate_sequence` */

insert  into `hibernate_sequence`(`next_val`) values (4);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
