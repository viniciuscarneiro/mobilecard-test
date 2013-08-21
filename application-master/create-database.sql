/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Version : 50613
 Source Host           : localhost
 Source Database       : example-test

 Target Server Version : 50613
 File Encoding         : utf-8

 Date: 08/19/2013 14:38:34 PM
*/




CREATE SCHEMA IF NOT EXISTS `example-test` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `example-test` ;

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `CLIENTE`
-- ----------------------------
DROP TABLE IF EXISTS `TB_CLIENTE`;
CREATE TABLE `TB_CLIENTE` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NOME` varchar(50) NOT NULL,
  `EMAIL` varchar(50) DEFAULT NULL,
  `ENDERECO` varchar(50) DEFAULT NULL,
  `BAIRRO` varchar(50) DEFAULT NULL,
  `CIDADE` varchar(50) DEFAULT NULL,
  `UF` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

SET FOREIGN_KEY_CHECKS = 1;
