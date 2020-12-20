/*
Navicat MySQL Data Transfer

Source Server         : big_data
Source Server Version : 50527
Source Host           : 127.0.0.1:3306
Source Database       : t_class

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2020-08-14 16:15:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_class`
-- ----------------------------
DROP TABLE IF EXISTS `t_class`;
CREATE TABLE `t_class` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tname` varchar(255) NOT NULL,
  `enable` int(11) NOT NULL COMMENT '//班级是否可用 1可用 0是不可用',
  `createTime` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_class
-- ----------------------------
INSERT INTO `t_class` VALUES ('20', 'JAVA2003', '1', '2018-11-29 16:55:00');
INSERT INTO `t_class` VALUES ('21', 'JAVA1802', '1', '2018-11-29 16:55:07');
INSERT INTO `t_class` VALUES ('22', 'JAVA1803', '1', '2018-11-29 16:55:10');
INSERT INTO `t_class` VALUES ('23', 'JAVA1804', '1', '2018-11-29 16:55:14');
INSERT INTO `t_class` VALUES ('24', 'JAVA1805', '1', '2018-11-29 16:55:18');
INSERT INTO `t_class` VALUES ('25', 'JAVA2002', '1', '2018-11-29 16:55:21');
INSERT INTO `t_class` VALUES ('33', '前端1801', '1', '2018-11-29 16:56:50');
INSERT INTO `t_class` VALUES ('34', '前端1802', '1', '2018-11-29 16:56:53');
INSERT INTO `t_class` VALUES ('35', '前端1803', '1', '2018-11-29 16:56:55');
INSERT INTO `t_class` VALUES ('36', '前端1804', '1', '2018-11-29 16:56:58');
INSERT INTO `t_class` VALUES ('37', '办公1801', '1', '2018-11-30 09:28:43');
INSERT INTO `t_class` VALUES ('38', '办公1802', '1', '2018-11-30 09:28:52');
INSERT INTO `t_class` VALUES ('39', '办公1803', '1', '2018-11-30 09:28:56');
INSERT INTO `t_class` VALUES ('40', '办公1804', '1', '2018-11-30 09:28:59');
INSERT INTO `t_class` VALUES ('41', '办公1805', '1', '2018-11-30 09:29:05');
