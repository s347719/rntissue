/*
SQLyog Professional v12.08 (64 bit)
MySQL - 5.6.44 : Database - rongyan
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`rongyan` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `rongyan`;

/*Table structure for table `hibernate_sequence` */

DROP TABLE IF EXISTS `hibernate_sequence`;

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `hibernate_sequence` */

insert  into `hibernate_sequence`(`next_val`) values (1),(1),(1);

/*Table structure for table `t_consume_list` */

DROP TABLE IF EXISTS `t_consume_list`;

CREATE TABLE `t_consume_list` (
  `id` bigint(36) NOT NULL,
  `f_userid` varchar(30) DEFAULT NULL COMMENT '消费用户id关联的是用户的电话',
  `f_curren_price` int(11) DEFAULT NULL COMMENT '当前价格',
  `f_is_delete` int(11) DEFAULT NULL COMMENT '是否有效 1-有效 0-无效',
  `f_pic_url` varchar(255) DEFAULT NULL COMMENT '项目图片地址',
  `f_projectid` int(11) DEFAULT NULL COMMENT '项目id',
  `f_project_name` varchar(255) DEFAULT NULL COMMENT '项目名称',
  `f_project_type` varchar(255) DEFAULT NULL COMMENT '项目类型',
  `f_remark` varchar(255) DEFAULT NULL COMMENT '项目说明',
  `f_time` date DEFAULT NULL COMMENT '消费时间',
  `f_user_name` varchar(255) DEFAULT NULL COMMENT '消费用户名称',
  `f_earn_price` int(11) DEFAULT NULL COMMENT '利润价格',
  `f_price` int(11) DEFAULT NULL COMMENT '原始价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户预约项目列表';

/*Data for the table `t_consume_list` */

/*Table structure for table `t_order_list` */

DROP TABLE IF EXISTS `t_order_list`;

CREATE TABLE `t_order_list` (
  `id` bigint(36) NOT NULL,
  `fuserId` varchar(36) DEFAULT NULL COMMENT '关联id还是个人表中的电话号码',
  `fProjectId` varchar(36) DEFAULT NULL COMMENT '项目id',
  `fProjectName` varchar(300) DEFAULT NULL COMMENT '项目名称',
  `fProjectType` varchar(100) DEFAULT NULL COMMENT '类别',
  `fSPrice` bigint(20) DEFAULT NULL COMMENT '原始价格',
  `fCurrenPrice` bigint(20) DEFAULT NULL COMMENT '当前价格',
  `fFHPrice` bigint(20) DEFAULT NULL COMMENT '利润价格',
  `fIsDelete` int(11) DEFAULT NULL COMMENT '是否有效0-有效 1-删除 2-已经消费',
  `fPicUrl` varchar(300) DEFAULT NULL COMMENT '项目图片地址',
  `fRemark` varchar(600) DEFAULT NULL COMMENT '项目说明',
  `f_curren_price` int(11) DEFAULT NULL,
  `f_earnhprice` int(11) DEFAULT NULL,
  `f_is_delete` int(11) DEFAULT NULL,
  `f_pic_url` varchar(255) DEFAULT NULL,
  `f_project_id` varchar(255) DEFAULT NULL,
  `f_project_name` varchar(255) DEFAULT NULL,
  `f_project_type` varchar(255) DEFAULT NULL,
  `f_remark` varchar(255) DEFAULT NULL,
  `fuser_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客户预约项目';

/*Data for the table `t_order_list` */

/*Table structure for table `t_peoject_list` */

DROP TABLE IF EXISTS `t_peoject_list`;

CREATE TABLE `t_peoject_list` (
  `id` bigint(36) NOT NULL,
  `fProjectName` varchar(300) DEFAULT NULL COMMENT '项目名称',
  `fProjectType` varchar(100) DEFAULT NULL COMMENT '类别',
  `fYSPrice` bigint(20) DEFAULT NULL COMMENT '原始价格',
  `fCurrenPrice` bigint(20) DEFAULT NULL COMMENT '当前价格',
  `fFHPrice` bigint(20) DEFAULT NULL COMMENT '利润',
  `fIsDelete` int(11) DEFAULT NULL COMMENT '是否有效',
  `fPicUrl` varchar(300) DEFAULT NULL COMMENT '项目图片地址',
  `fRemark` varchar(600) DEFAULT NULL COMMENT '项目说明',
  `fState` int(11) DEFAULT NULL COMMENT '状态',
  `fCreatetime` datetime DEFAULT NULL COMMENT '添加时间',
  `fUpdateTime` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='店内项目信息列表';

/*Data for the table `t_peoject_list` */

/*Table structure for table `t_store_info` */

DROP TABLE IF EXISTS `t_store_info`;

CREATE TABLE `t_store_info` (
  `类型` int(11) NOT NULL,
  `f_address` varchar(255) DEFAULT NULL COMMENT '地址',
  `f_company_name` varchar(255) DEFAULT NULL COMMENT '企业名称',
  `f_create_time` date DEFAULT NULL COMMENT '添加时间',
  `f_license` varchar(255) DEFAULT NULL COMMENT '营业执照号',
  `f_link_tell` varchar(255) DEFAULT NULL COMMENT '联系电话',
  `f_mange_man` varchar(255) DEFAULT NULL COMMENT '法人姓名',
  `f_office_tell` varchar(255) DEFAULT NULL COMMENT '座机',
  `f_organization_code` varchar(255) DEFAULT NULL COMMENT '统一社会信用代码',
  `f_state` int(11) DEFAULT NULL COMMENT '状态',
  `f_ye_time_memo` varchar(255) DEFAULT NULL COMMENT '营业时间',
  `id` int(11) NOT NULL,
  PRIMARY KEY (`类型`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `t_store_info` */

/*Table structure for table `t_store_news` */

DROP TABLE IF EXISTS `t_store_news`;

CREATE TABLE `t_store_news` (
  `id` int(11) NOT NULL,
  `f_add_user` varchar(255) DEFAULT NULL COMMENT '添加人',
  `f_code` varchar(255) DEFAULT NULL COMMENT '类型',
  `f_content` varchar(255) DEFAULT NULL COMMENT '内容',
  `f_createtime` date DEFAULT NULL COMMENT '添加时间',
  `f_face_pic` varchar(255) DEFAULT NULL COMMENT '封面图片',
  `f_is_delete` int(11) DEFAULT NULL COMMENT '是否有效',
  `f_pub_user` varchar(255) DEFAULT NULL COMMENT '发布人',
  `f_pubtime` date DEFAULT NULL COMMENT '发布时间',
  `f_state` int(11) DEFAULT NULL COMMENT '状态',
  `f_title` varchar(255) DEFAULT NULL COMMENT '标题',
  `f_update_time` date DEFAULT NULL COMMENT '修改时间',
  `last_modified_by` varchar(255) DEFAULT NULL,
  `last_modified_time` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `t_store_news` */

/*Table structure for table `tstore_teacher` */

DROP TABLE IF EXISTS `tstore_teacher`;

CREATE TABLE `tstore_teacher` (
  `id` int(11) NOT NULL,
  `f_companyid` varchar(255) DEFAULT NULL COMMENT '所属企业id',
  `f_createtime` date DEFAULT NULL COMMENT '添加时间',
  `f_display_name` varchar(255) DEFAULT NULL COMMENT '昵称',
  `f_name` varchar(255) DEFAULT NULL COMMENT '名称',
  `f_number` varchar(255) DEFAULT NULL COMMENT '职称',
  `f_photo_url` varchar(255) DEFAULT NULL COMMENT '头像',
  `f_remark` varchar(255) DEFAULT NULL COMMENT '说明',
  `f_state` int(11) DEFAULT NULL COMMENT '状态',
  `f_tell` varchar(255) DEFAULT NULL COMMENT '联系电话',
  `f_update_time` date DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `tstore_teacher` */

/*Table structure for table `tvip_card` */

DROP TABLE IF EXISTS `tvip_card`;

CREATE TABLE `tvip_card` (
  `id` bigint(20) NOT NULL,
  `fCardType` varchar(36) DEFAULT NULL COMMENT '卡类别',
  `fVipCardNo` varchar(20) DEFAULT NULL COMMENT '卡号',
  `fIsLQ` int(11) DEFAULT NULL COMMENT '领取情况',
  `fVipCardNoID` char(32) DEFAULT NULL COMMENT 'vip卡号提取码',
  `fUserID` char(36) DEFAULT NULL COMMENT '用户id',
  `fIsUseing` int(11) DEFAULT NULL COMMENT '是否使用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='vip卡表';

/*Data for the table `tvip_card` */

/*Table structure for table `tvip_cardno` */

DROP TABLE IF EXISTS `tvip_cardno`;

CREATE TABLE `tvip_cardno` (
  `id` bigint(36) NOT NULL,
  `fCardNo` varchar(100) DEFAULT NULL COMMENT '卡号',
  `fCardType` varchar(10) DEFAULT NULL COMMENT '卡类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='vip卡号表';

/*Data for the table `tvip_cardno` */

/*Table structure for table `tvip_liberty` */

DROP TABLE IF EXISTS `tvip_liberty`;

CREATE TABLE `tvip_liberty` (
  `id` bigint(36) NOT NULL,
  `fUserLevel` varchar(50) DEFAULT NULL COMMENT '用户等级',
  `fName` varchar(10) DEFAULT NULL COMMENT '特权类型名称',
  `fIsDelete` int(11) DEFAULT NULL COMMENT '是否删除',
  `fCreateTime` datetime DEFAULT NULL COMMENT '添加时间',
  `fEndTime` datetime DEFAULT NULL COMMENT '有效期',
  `fCount` int(11) DEFAULT NULL COMMENT '次数',
  `fMemo` varchar(300) DEFAULT NULL COMMENT '消费说明',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='vip会员特权';

/*Data for the table `tvip_liberty` */

/*Table structure for table `tvip_user` */

DROP TABLE IF EXISTS `tvip_user`;

CREATE TABLE `tvip_user` (
  `id` bigint(36) NOT NULL,
  `fCompanyID` varchar(36) DEFAULT NULL COMMENT '企业id',
  `f_wx_openId` varchar(100) DEFAULT NULL COMMENT '关联的微信openId',
  `f_wx_name` varchar(100) DEFAULT NULL COMMENT '关联的微信名称',
  `fUserName` varchar(50) DEFAULT NULL COMMENT '用户名',
  `fPassword` varchar(50) DEFAULT NULL COMMENT '密码',
  `fUserTel` varchar(20) DEFAULT NULL COMMENT '用户电话',
  `fUserLevel` int(11) DEFAULT NULL COMMENT '用户等级 0-第一级 1-第二级 2-第三级',
  `fGDType` varchar(50) DEFAULT NULL COMMENT '股东类型',
  `fvipCardNo` varchar(20) DEFAULT NULL COMMENT 'vipCard邀请码',
  `fPhotoUrl` varchar(300) DEFAULT NULL COMMENT '头像',
  `fParentID` varchar(50) DEFAULT NULL COMMENT '父级Id',
  `fState` int(11) DEFAULT NULL COMMENT '状态',
  `fCreateTime` datetime DEFAULT NULL COMMENT '添加时间',
  `fIsDelete` int(11) DEFAULT NULL COMMENT '是否删除',
  `fMoney` bigint(20) DEFAULT NULL COMMENT '入股金额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息';

/*Data for the table `tvip_user` */

/*Table structure for table `tvip_user_copy_liberty` */

DROP TABLE IF EXISTS `tvip_user_copy_liberty`;

CREATE TABLE `tvip_user_copy_liberty` (
  `id` char(36) NOT NULL,
  `fUserID` char(36) DEFAULT NULL COMMENT '用户id',
  `fUserLevel` varchar(50) DEFAULT NULL COMMENT '用户等级',
  `fName` varchar(10) DEFAULT NULL COMMENT '特权类型名称',
  `fEndTime` datetime DEFAULT NULL COMMENT '有效期',
  `fCreateTime` datetime DEFAULT NULL COMMENT '添加时间',
  `fstate` int(11) DEFAULT NULL COMMENT '状态',
  `fIsLQ` int(11) DEFAULT NULL COMMENT '是否已经领取',
  `fCount` int(11) DEFAULT NULL COMMENT '次数',
  `fMemo` varchar(300) DEFAULT NULL COMMENT '消费说明',
  `fLibertyID` char(36) DEFAULT NULL COMMENT '特权表关联id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='VIP会员已经复制特权';

/*Data for the table `tvip_user_copy_liberty` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
