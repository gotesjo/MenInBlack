-- MySQL dump 10.13  Distrib 8.0.15, for macos10.14 (x86_64)
--
-- Host: 127.0.0.1    Database: mibdb
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8mb4 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
--  Create database
--
CREATE DATABASE mibdb CHARACTER SET utf8mb4 COLLATE utf8mb4_sv_0900_ai_ci;
USE mibdb;
/*This code is to create the database to enable the creation of a user for connecting to the database and the creation of the tables and example data*/
--
-- Create user for connecting to the database
--
CREATE USER mibdba@localhost IDENTIFIED BY 'mibkey';
GRANT ALL PRIVILEGES ON mibdb.* TO mibdba@localhost;
/*This code is to enable a connection to the database mibdb*/

--
-- Table structure for table `Agent`
--

DROP TABLE IF EXISTS `Agent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Agent` (
  `Agent_ID` int(11) NOT NULL,
  `Namn` varchar(20) NOT NULL,
  `Telefon` varchar(30) DEFAULT NULL,
  `Anstallningsdatum` date NOT NULL,
  `Administrator` char(1) DEFAULT NULL,
  `Losenord` varchar(6) DEFAULT NULL,
  `Omrade` int(11) DEFAULT NULL,
  PRIMARY KEY (`Agent_ID`),
  KEY `Omrade` (`Omrade`),
  CONSTRAINT `Agent_ibfk_1` FOREIGN KEY (`Omrade`) REFERENCES `Omrade` (`Omrades_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_sv_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Agent`
--

LOCK TABLES `Agent` WRITE;
/*!40000 ALTER TABLE `Agent` DISABLE KEYS */;
INSERT INTO `Agent` VALUES (1,'Agent O','555-223233','2015-12-18','J','planka',1),(2,'Agent K','555-7765','2015-04-17','N','gtYtyU',4),(3,'Agent J','555-55444','2059-12-19','N','solros',2),(4,'Agent Z','555-5654','2015-01-12','J','jaja',1);
/*!40000 ALTER TABLE `Agent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Alien`
--

DROP TABLE IF EXISTS `Alien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Alien` (
  `Alien_ID` int(11) NOT NULL,
  `Registreringsdatum` date DEFAULT NULL,
  `Losenord` varchar(6) DEFAULT NULL,
  `Namn` varchar(20) DEFAULT NULL,
  `Telefon` varchar(30) DEFAULT NULL,
  `Plats` int(11) NOT NULL,
  `Ansvarig_Agent` int(11) NOT NULL,
  PRIMARY KEY (`Alien_ID`),
  KEY `Ansvarig_Agent` (`Ansvarig_Agent`),
  KEY `Plats` (`Plats`),
  CONSTRAINT `Alien_ibfk_1` FOREIGN KEY (`Ansvarig_Agent`) REFERENCES `Agent` (`Agent_ID`),
  CONSTRAINT `Alien_ibfk_2` FOREIGN KEY (`Plats`) REFERENCES `Plats` (`Plats_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_sv_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ALIEN`
--

LOCK TABLES `Alien` WRITE;
/*!40000 ALTER TABLE `Alien` DISABLE KEYS */;
INSERT INTO `Alien` VALUES (1,'2009-12-17','blomma','Bobbo','555-55678',1,1),(2,'2019-12-18','gulbil','My Book','',2,1),(3,'2017-11-18','123','Braxen','555-5544',2,4);
/*!40000 ALTER TABLE `Alien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Boglodite`
--

DROP TABLE IF EXISTS `Boglodite`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Boglodite` (
  `Alien_ID` int(11) NOT NULL,
  `Antal_Boogies` int(11) DEFAULT NULL,
  PRIMARY KEY (`Alien_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_sv_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Boglodite`
--

LOCK TABLES `Boglodite` WRITE;
/*!40000 ALTER TABLE `Boglodite` DISABLE KEYS */;
INSERT INTO `Boglodite` VALUES (1,3);
/*!40000 ALTER TABLE `Boglodite` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Faltagent`
--

DROP TABLE IF EXISTS `Faltagent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Faltagent` (
  `Agent_ID` int(11) NOT NULL,
  PRIMARY KEY (`Agent_ID`),
  CONSTRAINT `Faltagent_Agent_Agent_ID_fk` FOREIGN KEY (`Agent_ID`) REFERENCES `Agent` (`Agent_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_sv_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Faltagent`
--

LOCK TABLES `Faltagent` WRITE;
/*!40000 ALTER TABLE `Faltagent` DISABLE KEYS */;
INSERT INTO `Faltagent` VALUES (1),(2),(3);
/*!40000 ALTER TABLE `Faltagent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Fordon`
--

DROP TABLE IF EXISTS `Fordon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Fordon` (
  `Fordons_ID` varchar(6) NOT NULL,
  `Fordonsbeskrivning` varchar(100) DEFAULT NULL,
  `Registreringsdatum` date NOT NULL,
  `Arsmodell` int(11) DEFAULT NULL,
  PRIMARY KEY (`Fordons_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_sv_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Fordon`
--

LOCK TABLES `Fordon` WRITE;
/*!40000 ALTER TABLE `Fordon` DISABLE KEYS */;
INSERT INTO `Fordon` VALUES ('33','Ford Galaxie','1965-06-05',1964),('ABC123','Ford LTD Crown Victoria','1993-04-12',1987),('ER55','Monocykle','2012-03-22',2012);
/*!40000 ALTER TABLE `Fordon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Innehar_Fordon`
--

DROP TABLE IF EXISTS `Innehar_Fordon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Innehar_Fordon` (
  `Agent_ID` int(11) NOT NULL,
  `Fordons_ID` varchar(6) NOT NULL,
  `Utkvitteringsdatum` date NOT NULL,
  PRIMARY KEY (`Agent_ID`,`Fordons_ID`),
  KEY `Fordons_ID` (`Fordons_ID`),
  CONSTRAINT `Innehar_Fordon_ibfk_1` FOREIGN KEY (`Fordons_ID`) REFERENCES `Fordon` (`Fordons_ID`),
  CONSTRAINT `Innehar_Fordon_ibfk_2` FOREIGN KEY (`Agent_ID`) REFERENCES `Agent` (`Agent_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_sv_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Innehar_Fordon`
--

LOCK TABLES `Innehar_Fordon` WRITE;
/*!40000 ALTER TABLE `Innehar_Fordon` DISABLE KEYS */;
INSERT INTO `Innehar_Fordon` VALUES (1,'ABC123','2017-12-24'),(2,'33','2017-12-24'),(2,'ER55','2019-12-18');
/*!40000 ALTER TABLE `Innehar_Fordon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Innehar_Utrustning`
--

DROP TABLE IF EXISTS `Innehar_Utrustning`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Innehar_Utrustning` (
  `Agent_ID` int(11) NOT NULL,
  `Utrustnings_ID` int(11) NOT NULL,
  `Utkvitteringsdatum` date NOT NULL,
  PRIMARY KEY (`Agent_ID`,`Utrustnings_ID`),
  KEY `Utrustnings_ID` (`Utrustnings_ID`),
  CONSTRAINT `Innehar_Utrustning_ibfk_1` FOREIGN KEY (`Utrustnings_ID`) REFERENCES `Utrustning` (`Utrustnings_ID`),
  CONSTRAINT `Innehar_Utrustning_ibfk_2` FOREIGN KEY (`Agent_ID`) REFERENCES `Agent` (`Agent_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_sv_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Innehar_Utrustning`
--

LOCK TABLES `Innehar_Utrustning` WRITE;
/*!40000 ALTER TABLE `Innehar_Utrustning` DISABLE KEYS */;
INSERT INTO `Innehar_Utrustning` VALUES (1,2,'2019-12-18'),(1,4,'2019-12-18'),(2,1,'2019-11-18'),(3,3,'2019-11-18');
/*!40000 ALTER TABLE `Innehar_Utrustning` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Kommunikation`
--

DROP TABLE IF EXISTS `Kommunikation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Kommunikation` (
  `Utrustnings_ID` int(11) NOT NULL,
  `Overforingsteknik` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Utrustnings_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_sv_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Kommunikation`
--

LOCK TABLES `Kommunikation` WRITE;
/*!40000 ALTER TABLE `Kommunikation` DISABLE KEYS */;
INSERT INTO `Kommunikation` VALUES (4,'7G');
/*!40000 ALTER TABLE `Kommunikation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Kontorschef`
--

DROP TABLE IF EXISTS `Kontorschef`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Kontorschef` (
  `Agent_ID` int(11) NOT NULL,
  `Kontorsbeteckning` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`Agent_ID`),
  CONSTRAINT `Kontorschef_Agent_Agent_ID_fk` FOREIGN KEY (`Agent_ID`) REFERENCES `agent` (`Agent_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_sv_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Kontorschef`
--

LOCK TABLES `Kontorschef` WRITE;
/*!40000 ALTER TABLE `Kontorschef` DISABLE KEYS */;
INSERT INTO `Kontorschef` VALUES (4,'Örebrokontoret');
/*!40000 ALTER TABLE `Kontorschef` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Omrade`
--

DROP TABLE IF EXISTS `Omrade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Omrade` (
  `Omrades_ID` int(11) NOT NULL,
  `Benamning` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Omrades_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_sv_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `OMRADE`
--

LOCK TABLES `Omrade` WRITE;
/*!40000 ALTER TABLE `Omrade` DISABLE KEYS */;
INSERT INTO `Omrade` VALUES (1,'Svealand'),(2,'Götaland'),(4,'Norrland');
/*!40000 ALTER TABLE `Omrade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Omradeschef`
--

DROP TABLE IF EXISTS `Omradeschef`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Omradeschef` (
  `Agent_ID` int(11) NOT NULL,
  `Omrade` int(11) NOT NULL,
  PRIMARY KEY (`Agent_ID`),
  KEY `Omradeschef_Omrade_Omrades_ID_fk` (`OMRADE`),
  CONSTRAINT `Omradeschef_Agent_Agent_ID_fk` FOREIGN KEY (`Agent_ID`) REFERENCES `agent` (`Agent_ID`),
  CONSTRAINT `Omradeschef_Omrade_Omrades_ID_fk` FOREIGN KEY (`Omrade`) REFERENCES `Omrade` (`Omrades_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_sv_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Omradeschef`
--

LOCK TABLES `Omradeschef` WRITE;
/*!40000 ALTER TABLE `Omradeschef` DISABLE KEYS */;
INSERT INTO `Omradeschef` VALUES (1,1),(2,2),(3,4);
/*!40000 ALTER TABLE `Omradeschef` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Plats`
--

DROP TABLE IF EXISTS `Plats`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Plats` (
  `Plats_ID` int(11) NOT NULL,
  `Finns_I` int(11) NOT NULL,
  `Benamning` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Plats_ID`),
  KEY `FINNS_I` (`FINNS_I`),
  CONSTRAINT `plats_ibfk_1` FOREIGN KEY (`Finns_i`) REFERENCES `Omrade` (`Omrades_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_sv_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PLATS`
--

LOCK TABLES `Plats` WRITE;
/*!40000 ALTER TABLE `PLATS` DISABLE KEYS */;
INSERT INTO `Plats` VALUES (1,1,'Örebro'),(2,1,'Västerås'),(3,4,'Vilhelmina'),(4,2,'Borås');
/*!40000 ALTER TABLE `Plats` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Squid`
--

DROP TABLE IF EXISTS `Squid`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Squid` (
  `Alien_ID` int(11) NOT NULL,
  `Antal_Armar` int(11) DEFAULT NULL,
  PRIMARY KEY (`Alien_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_sv_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Squid`
--

LOCK TABLES `Squid` WRITE;
/*!40000 ALTER TABLE `Squid` DISABLE KEYS */;
INSERT INTO `Squid` VALUES (2,6);
/*!40000 ALTER TABLE `Squid` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Teknik`
--

DROP TABLE IF EXISTS `Teknik`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Teknik` (
  `Utrustnings_ID` int(11) NOT NULL,
  `Kraftkalla` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Utrustnings_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_sv_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Teknik`
--

LOCK TABLES `Teknik` WRITE;
/*!40000 ALTER TABLE `Teknik` DISABLE KEYS */;
INSERT INTO `Teknik` VALUES (3,'Uran');
/*!40000 ALTER TABLE `Teknik` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Utrustning`
--

DROP TABLE IF EXISTS `Utrustning`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Utrustning` (
  `Utrustnings_ID` int(11) NOT NULL,
  `Benamning` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Utrustnings_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_sv_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Utrustning`
--

LOCK TABLES `Utrustning` WRITE;
/*!40000 ALTER TABLE `Utrustning` DISABLE KEYS */;
INSERT INTO `Utrustning` VALUES (1,'Noisy Cricket'),(2,'Carbonizer'),(3,'Neuralyzer'),(4,'Communicater');
/*!40000 ALTER TABLE `Utrustning` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Vapen`
--

DROP TABLE IF EXISTS `Vapen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Vapen` (
  `Utrustnings_ID` int(11) NOT NULL,
  `Kaliber` int(11) DEFAULT NULL,
  PRIMARY KEY (`Utrustnings_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_sv_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Vapen`
--

LOCK TABLES `Vapen` WRITE;
/*!40000 ALTER TABLE `Vapen` DISABLE KEYS */;
INSERT INTO `Vapen` VALUES (1,200),(2,4);
/*!40000 ALTER TABLE `Vapen` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Worm`
--

DROP TABLE IF EXISTS `Worm`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Worm` (
  `Alien_ID` int(11) NOT NULL,
  PRIMARY KEY (`Alien_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_sv_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Worm`
--

LOCK TABLES `Worm` WRITE;
/*!40000 ALTER TABLE `Worm` DISABLE KEYS */;
/*!40000 ALTER TABLE `Worm` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-09 21:48:13
