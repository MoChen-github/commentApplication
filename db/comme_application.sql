create database comments_application;
use comments_application;
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment`  (
  `id` varchar(36) NOT NULL COMMENT '主键',
 `user_id` varchar(36) NOT NULL COMMENT '发起用户ID',
 `goods_id` varchar(36) NULL DEFAULT NULL COMMENT '评论物品ID',
 `layer` int Not Null COMMENT '评论层级 0 针对物品（1级评论）， 1 针对1级评论（2级评论， 即回复1级评论）， 2 针对二级评论（3级评论，即回复2级评论）',
 `parent_id` varchar(36) NULL DEFAULT NULL COMMENT '父级评论主键',
 `score` VARCHAR(36) NOT NULL DEFAULT 5.0 COMMENT '评分',
 `stars` int NOT NULL DEFAULT 0 COMMENT '点赞数',
 `comment_details` LONGTEXT NOT NULL COMMENT '评论详情',
 `imageUrl` LONGTEXT NULL DEFAULT NULL COMMENT '图片组',
 `is_delete` TINYINT NOT NULL DEFAULT 1 COMMENT '逻辑删除 1 false ，0 true',
 `create_time` DATETIME NULL COMMENT '创建时间',
  `option_time` DATETIME NULL COMMENT '修改时间',

  PRIMARY KEY (`id`)
) ENGINE = InnoDB CHARACTER SET = utf8mb4;

INSERT INTO `comment` VALUES ('1281792646935842830', '1281794386984779777', '15889531536650244013', '0', NULL, '4.3', '0', '这个显示器外观设计很好看，色彩也很好', NULL, '1', '2020-07-11 11:29:16', NULL);

DROP TABLE IF EXISTS `ces_order_customer`;
CREATE TABLE `ces_order_customer`  (
  `id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `create_by` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建日期',
  `update_by` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新日期',
  `sys_org_code` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '所属部门',
  `name` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '客户名字',
  `sex` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '客户性别',
  `birthday` datetime NULL DEFAULT NULL COMMENT '客户生日',
  `age` int(11) NULL DEFAULT NULL COMMENT '年龄',
  `address` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_gen