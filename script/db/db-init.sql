/*
Navicat MySQL Data Transfer

Source Server         : 47.52.102.69
Source Server Version : 50556
Source Host           : 47.52.102.69:3306
Source Database       : collector

Target Server Type    : MYSQL
Target Server Version : 50556
File Encoding         : 65001

Date: 2017-12-13 10:17:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(512) COLLATE utf8_bin DEFAULT NULL,
  `summary` text COLLATE utf8_bin,
  `conclusion` text COLLATE utf8_bin,
  `source_id` bigint(20) NOT NULL,
  `creater` varchar(64) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for article_item
-- ----------------------------
DROP TABLE IF EXISTS `article_item`;
CREATE TABLE `article_item` (
  `id` bigint(20) NOT NULL,
  `number` smallint(6) NOT NULL,
  `image_id` varchar(512) COLLATE utf8_bin DEFAULT NULL,
  `image_desc` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `description` text COLLATE utf8_bin,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for article_item_image
-- ----------------------------
DROP TABLE IF EXISTS `article_item_image`;
CREATE TABLE `article_item_image` (
  `id` bigint(20) NOT NULL,
  `description` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `article_id` bigint(20) DEFAULT NULL,
  `item_id` bigint(20) DEFAULT NULL,
  `bytes` blob,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for categories
-- ----------------------------
DROP TABLE IF EXISTS `categories`;
CREATE TABLE `categories` (
  `id` bigint(20) NOT NULL,
  `key` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `name` varchar(16) COLLATE utf8_bin DEFAULT NULL,
  `owner` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `id` bigint(20) NOT NULL,
  `url` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `title` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `category` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `owner` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `icon` blob,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `publish_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(64) COLLATE utf8_bin NOT NULL,
  `name` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `phone` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `password` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for web_source
-- ----------------------------
DROP TABLE IF EXISTS `web_source`;
CREATE TABLE `web_source` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `endpoint` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `icon` blob,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
