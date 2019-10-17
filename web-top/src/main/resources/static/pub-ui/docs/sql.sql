/*
 Navicat Premium Data Transfer

 Source Server         : 本地测试
 Source Server Type    : MariaDB
 Source Server Version : 100308
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MariaDB
 Target Server Version : 100308
 File Encoding         : 65001

 Date: 17/10/2019 22:44:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_function
-- ----------------------------
DROP TABLE IF EXISTS `sys_function`;
CREATE TABLE `sys_function`  (
  `id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '',
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '',
  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '路径',
  `path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '',
  `icon` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `lev` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '',
  `is_html` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '是否为html页面 yes; no',
  `parent_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '',
  `order_value` int(11) NULL DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci;

-- ----------------------------
-- Records of sys_function
-- ----------------------------
BEGIN;
INSERT INTO `sys_function` VALUES ('1', '权限管理', NULL, '', '', NULL, '1', 'no', '0', 2), ('10', 'lay-ui动态页面', '', '../../pub-ui/views/form/index.html', '/manager/change', '&#xe62e;', '2', 'yes', '8', NULL), ('11', '文件管理', '', '../manager/file/index.html', '/manager/file', '&#xe62e;', '2', 'yes', '8', NULL), ('12', '多媒体', '', '', '', '&#xe621;', '1', 'no', '0', 3), ('13', '在线播放视频', '', '../home/ckplayer.html', '/media/video', '&#xe62e;', '2', 'yes', '12', NULL), ('14', '视频列表', '', '../home/video_list.html', '/media/video/list', '&#xe62e;', '2', 'yes', '12', NULL), ('15', '语音播报', '', '../home/spack.html', '/home/spack', '&#xe62e;', '2', 'yes', '12', NULL), ('16', '邮件系统', '', '', '', '&#xe705;', '1', 'no', '0', 4), ('17', '写邮件', '', '../email/send.html', '/email/richtext', '&#xe62e;', '2', 'yes', '16', NULL), ('18', '2D动画', '', '', '', NULL, '1', 'no', '0', 5), ('19', '动画演示', '', '../live2d/demo.html', '/live2d/demo', '&#xe62e;', '2', 'yes', '18', NULL), ('2', '用户管理', NULL, '../auth/user/index.html', '/authority/user', '&#xe62e;', '2', 'yes', '1', NULL), ('20', '主页一', '', '../home/main/main1.html', '/quick/module1', '&#xe68e;', '', 'yes', '100001', 7), ('21', '模板', '', '../home/main/main1.html', '/quick/module2', '&#xe656;', '', 'yes', '100001', 8), ('22', '应用', '', '', '', '&#xe653;', '', 'yes', '100001', 9), ('23', '控制台', '', '', '', '&#xe665;', '', 'yes', '100001', 10), ('24', '设置', '', '', '', '&#xe716;', '', 'yes', '100001', 11), ('25', '办公', '', '', '', '&#xe705;', '', 'yes', '100001', 12), ('26', '用户', '', '', '', '&#xe770;', '', 'yes', '100001', 13), ('27', '组件', '', '', '', '&#xe857;', '', 'yes', '100001', 14), ('28', '链接', '', '', '', '&#xe64c;', '', 'yes', '100001', 15), ('29', '主页一', '', '../home/main/main1.html', '/home/main1', '&#xe62e;', '2', 'yes', '5', NULL), ('3', '角色管理', NULL, '../auth/role/index.html', '/authority/role', '&#xe62e;', '2', 'yes', '1', NULL), ('30', '部门管理', '', '../ztree/dept.html', '/auth/dept', '&#xe62e;', '2', 'yes', '1', NULL), ('31', '3D-Echarts', '', '../echarts/3d-echarts.html', '/echarts/3d-1', '&#xe62e;', '2', 'yes', '18', NULL), ('4', '菜单管理', NULL, '../auth/function/index.html', '/authority/function', '&#xe62e;', '2', 'yes', '1', NULL), ('5', '首页', NULL, '../../pub-ui/views/app.html', '/', NULL, '1', 'yes', '0', 1), ('6', '个人中心', NULL, '../../pub-ui/views/profile.html', '/user/my', NULL, '0', 'yes', '-', NULL), ('7', '修改密码', '', '../../pub-ui/views/editpw.html', '/edit/password', '', '0', 'yes', '-', NULL), ('8', '人员管理', '', '', '', '&#xe770;', '1', 'no', '0', 6), ('9', '个人资料', '', '../manager/user/person.html', '/manager/person', '&#xe62e;', '2', 'yes', '8', NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
