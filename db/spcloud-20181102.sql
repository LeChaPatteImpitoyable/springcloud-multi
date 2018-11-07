/*
MySQL Backup
Database: spcloud
Backup Time: 2018-11-02 11:17:06
*/

SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS `spcloud`.`tb_kingboy_users`;
DROP TABLE IF EXISTS `spcloud`.`tb_user`;
DROP TABLE IF EXISTS `spcloud`.`tb_users`;
DROP TABLE IF EXISTS `spcloud`.`tb_yasaka_users`;
DROP TABLE IF EXISTS `spcloud`.`users`;
CREATE TABLE `tb_kingboy_users` (
  `id` varchar(255) NOT NULL,
  `nickName` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_js0kdijaxp50u3jr44oogo9v3` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `tb_user` (
  `id` varchar(255) NOT NULL,
  `nick_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_4wv83hfajry5tdoamn8wsqa6x` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `tb_users` (
  `id` varchar(255) NOT NULL,
  `nickName` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_8n82lwp7lflhwda2v2v3wckc9` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `tb_yasaka_users` (
  `id` varchar(255) NOT NULL,
  `nickName` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_qfkg09bokrx81akb4bior4jjd` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `users` (
  `id` varchar(255) NOT NULL,
  `nickName` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_r43af9ap4edm43mmtq01oddj6` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
BEGIN;
LOCK TABLES `spcloud`.`tb_kingboy_users` WRITE;
DELETE FROM `spcloud`.`tb_kingboy_users`;
UNLOCK TABLES;
COMMIT;
BEGIN;
LOCK TABLES `spcloud`.`tb_user` WRITE;
DELETE FROM `spcloud`.`tb_user`;
UNLOCK TABLES;
COMMIT;
BEGIN;
LOCK TABLES `spcloud`.`tb_users` WRITE;
DELETE FROM `spcloud`.`tb_users`;
UNLOCK TABLES;
COMMIT;
BEGIN;
LOCK TABLES `spcloud`.`tb_yasaka_users` WRITE;
DELETE FROM `spcloud`.`tb_yasaka_users`;
INSERT INTO `spcloud`.`tb_yasaka_users` (`id`,`nickName`,`password`,`username`) VALUES ('ff8081815f19b1dc015f19b24ffb0000', 'yasaka', 'yasaka', 'yasaka'),('ff8081815f19b1dc015f19b24ffb0001', 'test', 'password', 'username');
UNLOCK TABLES;
COMMIT;
BEGIN;
LOCK TABLES `spcloud`.`users` WRITE;
DELETE FROM `spcloud`.`users`;
UNLOCK TABLES;
COMMIT;
