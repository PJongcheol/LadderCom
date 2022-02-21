-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: ladderex
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin_board`
--

DROP TABLE IF EXISTS `admin_board`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `admin_board` (
  `a_main_NO` int(11) NOT NULL AUTO_INCREMENT,
  `a_main_title` varchar(500) NOT NULL,
  `a_main_content` varchar(4000) DEFAULT NULL,
  `a_main_writeDate` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `user_id` varchar(10) DEFAULT '관리자',
  PRIMARY KEY (`a_main_NO`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin_board`
--

LOCK TABLES `admin_board` WRITE;
/*!40000 ALTER TABLE `admin_board` DISABLE KEYS */;
INSERT INTO `admin_board` VALUES (1,'사이트 악용 회원 대처 안내','관리자 공지사항 내용 입력 테스트 중','2022-01-13 01:16:59','관리자'),(3,'관리자 공지사항 수정중','완료했음','2022-01-13 02:26:12','관리자');
/*!40000 ALTER TABLE `admin_board` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `announcement`
--

DROP TABLE IF EXISTS `announcement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `announcement` (
  `announcement_id` int(11) NOT NULL AUTO_INCREMENT,
  `announcement_code` varchar(20) NOT NULL,
  `announcement_name` varchar(50) NOT NULL,
  `announcement_user` varchar(20) NOT NULL,
  `announcement_type` varchar(20) NOT NULL,
  `announcement_regdate` datetime NOT NULL,
  PRIMARY KEY (`announcement_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `announcement`
--

LOCK TABLES `announcement` WRITE;
/*!40000 ALTER TABLE `announcement` DISABLE KEYS */;
/*!40000 ALTER TABLE `announcement` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `as`
--

DROP TABLE IF EXISTS `as`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `as` (
  `as_no` int(11) NOT NULL AUTO_INCREMENT,
  `as_type` text NOT NULL,
  `user_id` varchar(20) NOT NULL,
  `user_phone` varchar(20) NOT NULL,
  `user_email` varchar(50) NOT NULL,
  `as_name` varchar(100) NOT NULL,
  `as_content` text NOT NULL,
  `imageFileName` varchar(50) DEFAULT NULL,
  `as_regdate` datetime DEFAULT NULL,
  `as_state` varchar(10) DEFAULT '대기중',
  `as_reply` text,
  PRIMARY KEY (`as_no`),
  KEY `fk_asdetail_member1_idx` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `as`
--

LOCK TABLES `as` WRITE;
/*!40000 ALTER TABLE `as` DISABLE KEYS */;
INSERT INTO `as` VALUES (64,'방문 신청','admin','010-1111-2222','admin@main.com','123','123123123',NULL,'2022-01-26 14:10:24','접수완료',NULL),(65,'A/S','park','01099338844','pjc2348@naver.com','호롤롤로','호롤롤로',NULL,'2022-02-07 15:47:06','접수완료','넹');
/*!40000 ALTER TABLE `as` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `as_imagefile`
--

DROP TABLE IF EXISTS `as_imagefile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `as_imagefile` (
  `imageFileNO` int(10) DEFAULT NULL,
  `imageFileName` varchar(20) DEFAULT NULL,
  `regDate` datetime DEFAULT CURRENT_TIMESTAMP,
  `as_no` int(11) DEFAULT NULL,
  KEY `FK_as_no` (`as_no`),
  CONSTRAINT `FK_as_no` FOREIGN KEY (`as_no`) REFERENCES `as` (`as_no`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `as_imagefile`
--

LOCK TABLES `as_imagefile` WRITE;
/*!40000 ALTER TABLE `as_imagefile` DISABLE KEYS */;
INSERT INTO `as_imagefile` VALUES (1,'cont.PNG','2022-02-07 15:47:07',65);
/*!40000 ALTER TABLE `as_imagefile` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `cart` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `productNum` int(11) NOT NULL,
  `cartproductAmt` int(11) NOT NULL DEFAULT '1',
  `user_id` varchar(20) NOT NULL,
  `cart_ckid` varchar(45) DEFAULT NULL,
  `cart_cklimit` date DEFAULT NULL,
  `cart_mem_no` int(11) DEFAULT NULL,
  `cart_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `member_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart`
--

LOCK TABLES `cart` WRITE;
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
INSERT INTO `cart` VALUES (3,400,1,'uG0FBn','uG0FBn',NULL,0,'2022-01-25 14:02:06',NULL),(31,400,1,'UAoMbV','UAoMbV',NULL,0,'2022-01-26 09:45:12',NULL),(32,400,1,'kim',NULL,NULL,NULL,'2022-01-26 09:45:55',NULL),(33,400,1,'kim',NULL,NULL,NULL,'2022-01-26 09:45:57',NULL),(34,400,1,'kim',NULL,NULL,NULL,'2022-01-26 09:45:59',NULL),(40,400,1,'park',NULL,NULL,8,'2022-01-26 12:09:56',8);
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categoryname`
--

DROP TABLE IF EXISTS `categoryname`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `categoryname` (
  `major_id` int(11) NOT NULL AUTO_INCREMENT,
  `major_name` varchar(20) NOT NULL,
  PRIMARY KEY (`major_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoryname`
--

LOCK TABLES `categoryname` WRITE;
/*!40000 ALTER TABLE `categoryname` DISABLE KEYS */;
INSERT INTO `categoryname` VALUES (1,'모니터'),(2,'마우스'),(3,'키보드'),(4,'스피커'),(5,'헤드셋');
/*!40000 ALTER TABLE `categoryname` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `consulting`
--

DROP TABLE IF EXISTS `consulting`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `consulting` (
  `c_no` int(11) NOT NULL AUTO_INCREMENT,
  `c_type` text NOT NULL,
  `user_id` varchar(20) NOT NULL,
  `user_phone` varchar(20) NOT NULL,
  `user_email` varchar(50) NOT NULL,
  `c_name` varchar(100) NOT NULL,
  `c_content` text NOT NULL,
  `c_regdate` datetime DEFAULT NULL,
  `c_state` varchar(10) DEFAULT '대기중',
  `c_reply` text,
  PRIMARY KEY (`c_no`),
  KEY `fk_consulting_member1_idx` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `consulting`
--

LOCK TABLES `consulting` WRITE;
/*!40000 ALTER TABLE `consulting` DISABLE KEYS */;
INSERT INTO `consulting` VALUES (11,'카카오톡 상담','admin','010-1111-2222','admin@main.com','321321','321321','2022-01-26 14:01:52','접수완료',NULL),(12,'카카오톡 상담','admin','010-1111-2222','admin@main.com','13213','321321','2022-01-26 14:02:04','접수완료','접수했습니다'),(13,'카카오톡 상담','park','01089832348','pjc2348@naver.com','123331','123123123','2022-02-07 10:12:33','접수완료','test 완료'),(14,'카카오톡 상담','admin','01089832348','admin@main.com','333333','qweasd','2022-02-07 14:03:11','대기중',NULL);
/*!40000 ALTER TABLE `consulting` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `member` (
  `user_id` varchar(20) NOT NULL,
  `user_pw` varchar(20) NOT NULL,
  `user_name` varchar(20) NOT NULL,
  `user_phone` varchar(20) NOT NULL,
  `nickname` varchar(10) NOT NULL,
  `user_email` varchar(50) NOT NULL,
  `authority` varchar(20) DEFAULT '일반',
  `user_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `user_img` varchar(200) DEFAULT NULL,
  `zipcode` varchar(20) DEFAULT NULL,
  `roadAddress` varchar(500) DEFAULT NULL,
  `jibunAddress` varchar(500) DEFAULT NULL,
  `namujiAddress` varchar(500) DEFAULT NULL,
  `member_id` int(11) NOT NULL AUTO_INCREMENT,
  `cart_ckid` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`member_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES ('admin','12341234','박종철','01033246655','admin','pjc2348@naver.com','관리자','2022-01-10 14:38:59',NULL,NULL,NULL,NULL,NULL,2,NULL),('abcdabcd','12341234','아무개','01088669568','aaaaaasda','bbackgom5@naver.com','일반',NULL,NULL,NULL,NULL,NULL,NULL,8,NULL);
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `memberorder`
--

DROP TABLE IF EXISTS `memberorder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `memberorder` (
  `memorderseqnum` int(11) NOT NULL AUTO_INCREMENT,
  `memordernum` int(11) DEFAULT NULL,
  `user_id` varchar(40) NOT NULL,
  `productprice` int(11) DEFAULT NULL,
  `productAmt` varchar(45) DEFAULT NULL,
  `totalprice` int(11) DEFAULT NULL,
  `memsqname` varchar(10) DEFAULT NULL,
  `memsqphonenum` char(15) DEFAULT NULL,
  `mempayment` varchar(15) DEFAULT NULL,
  `memsqaddr` varchar(100) DEFAULT NULL,
  `productnum` int(11) NOT NULL,
  `productname` varchar(20) DEFAULT NULL,
  `originFileName` varchar(100) DEFAULT NULL,
  `delivery_message` varchar(100) DEFAULT NULL,
  `pay_order_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `order_state` varchar(10) DEFAULT '입금확인중',
  `order_name` varchar(10) DEFAULT NULL,
  `order_phone` varchar(45) DEFAULT NULL,
  `order_email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`memorderseqnum`),
  KEY `fk_memberorder_product1_idx` (`productnum`),
  CONSTRAINT `fk_memberorder_product1` FOREIGN KEY (`productnum`) REFERENCES `product` (`productnum`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=20220012 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `memberorder`
--

LOCK TABLES `memberorder` WRITE;
/*!40000 ALTER TABLE `memberorder` DISABLE KEYS */;
INSERT INTO `memberorder` VALUES (20220004,20220004,'admin',8100,'1',10600,'박종철','011101010','무통장입금','우편번호:&nbsp;34672<br>도로명 주소:대전 동구 판교1길 3 (판암동)<br>[지번 주소:대전 동구 판암동 497-7]<br>ㅇㄴㄴㅇ',20220035,'m100r','m100r.jpg','집','2022-02-10 10:49:46','배송완료','관리자','01089832348',''),(20220005,20220006,'admin',8100,'1',10600,'박종철','123123123','무통장입금','우편번호:&nbsp;06779<br>도로명 주소:서울 서초구 언남길 15-8 (양재동)<br>[지번 주소:서울 서초구 양재동 320-5]<br>123123',20220035,'m100r','m100r.jpg','집','2022-02-10 11:59:44','상품배송중','관리자','01089832348',''),(20220006,20220009,'',8100,'1',10600,'박종철','01089832348','무통장입금','우편번호:&nbsp;26392<br>도로명 주소:강원 원주시 능라동길 7 (무실동)<br>[지번 주소:강원 원주시 무실동 1857-25]<br>ww',20220035,'m100r','m100r.jpg','집','2022-02-10 12:19:40','입금확인중','박종철','0108983234788',''),(20220007,20220011,'admin',8100,'1',10600,'박종철','123123123','무통장입금','우편번호:&nbsp;44231<br>도로명 주소:울산 북구 원지제방길 3 (송정동)<br>[지번 주소:울산 북구 송정동 853-5]<br>daw',20220035,'m100r','m100r.jpg','adwasd','2022-02-14 14:54:39','입금확인중','관리자','01089832348',''),(20220008,20220012,'admin',100,'2',3930,'박종철','01090932349','무통장입금','우편번호:&nbsp;44532<br>도로명 주소:울산 중구 만남의거리 1 (성남동)<br>[지번 주소:울산 중구 성남동 241-1]<br>집',20220035,'m100r','m100r.jpg','집','2022-02-18 09:13:00','입금확인중','박종철','01089832348',''),(20220009,20220012,'admin',1230,'1',3930,'박종철','01090932349','무통장입금','우편번호:&nbsp;44532<br>도로명 주소:울산 중구 만남의거리 1 (성남동)<br>[지번 주소:울산 중구 성남동 241-1]<br>집',20220036,'assasa','K660M TKL 체리키보드.png','집','2022-02-18 09:13:00','입금확인중','박종철','01089832348',''),(20220010,20220013,'admin',8100,'1',10600,'박종철','01089832348','무통장입금','우편번호:&nbsp;27679<br>도로명 주소:충북 음성군 금왕읍 유포소탄길 1<br>[지번 주소:충북 음성군 금왕읍 유포리 124-10]<br>22',20220041,'1111','로지텍 G304 WIRELESS 무선 게이밍 마우스.jpg','22','2022-02-18 09:24:34','입금확인중','박종철','01089832348',''),(20220011,20220014,'abcdabcd',100,'1',2600,'아무개','01088669568','무통장입금','우편번호:&nbsp;35426<br>도로명 주소:대전 서구 가마절길 7 (산직동)<br>[지번 주소:대전 서구 산직동 79-3]<br>test',20220035,'m100r','m100r.jpg','집','2022-02-18 12:41:19','입금확인중','아무개','01088669568','');
/*!40000 ALTER TABLE `memberorder` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nonmemberorder`
--

DROP TABLE IF EXISTS `nonmemberorder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `nonmemberorder` (
  `nonmemorderseqnum` int(11) NOT NULL AUTO_INCREMENT,
  `nonmemordernum` int(11) NOT NULL,
  `nonmemname` varchar(10) NOT NULL,
  `nonmemorderpwd` varchar(10) NOT NULL,
  `productnum` int(11) NOT NULL,
  `productname` varchar(20) NOT NULL,
  `productprice` int(11) NOT NULL,
  `productImage` varchar(200) NOT NULL,
  `productamt` int(11) NOT NULL,
  `totalprice` int(11) NOT NULL,
  `nonmemsqname` varchar(10) NOT NULL,
  `nonmemsqphonenum` char(15) NOT NULL,
  `nonmempayment` varchar(15) NOT NULL,
  `nonmemspaddr` varchar(30) NOT NULL,
  `deliverycharge` varchar(30) NOT NULL,
  PRIMARY KEY (`nonmemorderseqnum`),
  KEY `fk_nonmemberorder_product1_idx` (`productnum`),
  CONSTRAINT `fk_nonmemberorder_product1` FOREIGN KEY (`productnum`) REFERENCES `product` (`productnum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nonmemberorder`
--

LOCK TABLES `nonmemberorder` WRITE;
/*!40000 ALTER TABLE `nonmemberorder` DISABLE KEYS */;
/*!40000 ALTER TABLE `nonmemberorder` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notice`
--

DROP TABLE IF EXISTS `notice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `notice` (
  `n_no` int(11) NOT NULL AUTO_INCREMENT,
  `n_type` text NOT NULL,
  `n_name` varchar(100) NOT NULL,
  `n_content` text NOT NULL,
  `n_regdate` datetime NOT NULL,
  `user_id` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`n_no`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notice`
--

LOCK TABLES `notice` WRITE;
/*!40000 ALTER TABLE `notice` DISABLE KEYS */;
INSERT INTO `notice` VALUES (14,'필독','검색테스트중','ㅇ','2022-01-12 11:13:47','admin'),(15,'안내','abcd','fdfd','2022-01-12 11:14:15','admin'),(16,'안내','fdfd','fdfd','2022-01-12 12:48:59','admin');
/*!40000 ALTER TABLE `notice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `product` (
  `productNum` int(11) NOT NULL AUTO_INCREMENT,
  `productName` varchar(20) NOT NULL,
  `productPrice` int(11) NOT NULL,
  `category` varchar(20) NOT NULL,
  `subcategory` varchar(20) NOT NULL,
  `productStock` varchar(20) NOT NULL,
  `company` varchar(20) NOT NULL,
  `productDate` datetime NOT NULL,
  `productStar` int(11) DEFAULT '3',
  `productInfo` text NOT NULL,
  `productImage` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`productNum`)
) ENGINE=InnoDB AUTO_INCREMENT=20220042 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (20220035,'m100r',100,'Mouse','유선마우스','6','인호','2022-02-10 10:31:34',3,'1515',NULL),(20220036,'assasa',1230,'Keyboard','게이밍 키보드','11','이노텍','2022-02-10 10:34:53',NULL,'dd',NULL),(20220039,'m100r13',13123123,'Mouse','선택','23123','1111','2022-02-17 11:53:09',NULL,'2131',NULL),(20220041,'1111',8100,'Mouse','무선마우스','11111','logitec','2022-02-18 09:20:49',NULL,'ㅏㅏㅏㅏㅏ',NULL);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_image`
--

DROP TABLE IF EXISTS `product_image`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `product_image` (
  `productNum` int(11) DEFAULT NULL,
  `fileName` varchar(45) NOT NULL,
  `fileType` varchar(45) NOT NULL,
  `creDate` date NOT NULL,
  `imageNum` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`imageNum`),
  KEY `fk_product_image_product1_idx` (`productNum`),
  CONSTRAINT `fk_product1_productNum` FOREIGN KEY (`productNum`) REFERENCES `product` (`productnum`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_image`
--

LOCK TABLES `product_image` WRITE;
/*!40000 ALTER TABLE `product_image` DISABLE KEYS */;
INSERT INTO `product_image` VALUES (20220035,'m100r.jpg','main_image','2022-02-10',29),(20220036,'K660M TKL 체리키보드.png','main_image','2022-02-10',30),(20220039,'archon AG60 프로 게이밍 마우스.jpg','main_image','2022-02-17',34),(20220041,'로지텍 G304 WIRELESS 무선 게이밍 마우스.jpg','main_image','2022-02-18',36),(20220041,'SPA-JMA1PUB.jpg','detail_image1','2022-02-18',37),(20220041,'팀스콜피온 게이밍마우스.jpg','detail_image2','2022-02-18',38);
/*!40000 ALTER TABLE `product_image` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productreview`
--

DROP TABLE IF EXISTS `productreview`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `productreview` (
  `re_num` int(11) NOT NULL AUTO_INCREMENT,
  `re_star` varchar(50) DEFAULT NULL,
  `re_regdate` datetime DEFAULT NULL,
  `re_content` varchar(50) DEFAULT NULL,
  `imageFileName` varchar(500) DEFAULT NULL,
  `memorderseqnum` int(11) DEFAULT NULL,
  `productNum` int(11) DEFAULT NULL,
  `user_id` varchar(20) DEFAULT NULL,
  `productName` varchar(45) DEFAULT NULL,
  `re_reply` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`re_num`),
  KEY `fk_productreview_product1_idx` (`productNum`),
  KEY `fk_productreview_memberorder1_idx` (`memorderseqnum`),
  KEY `fk_productreview_member1_idx` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productreview`
--

LOCK TABLES `productreview` WRITE;
/*!40000 ALTER TABLE `productreview` DISABLE KEYS */;
INSERT INTO `productreview` VALUES (6,'4','2022-02-07 11:53:15','dsasad',NULL,NULL,100,'admin','m100r','넹'),(7,'4','2022-02-08 10:20:21','굳',NULL,NULL,100,'admin','m100r',NULL),(11,NULL,'2022-02-09 15:26:02','',NULL,NULL,100,'admin','m100r',NULL),(12,'4','2022-02-09 15:26:45','fdsf',NULL,NULL,100,'admin','m100r',NULL),(13,'4','2022-02-09 15:27:38','fdsf',NULL,NULL,100,'admin','m100r',NULL),(14,'4','2022-02-09 15:27:53','fdsf',NULL,NULL,100,'admin','m100r',NULL),(15,NULL,'2022-02-09 15:28:30','',NULL,NULL,100,'admin','m100r',NULL),(16,NULL,'2022-02-09 15:31:31','',NULL,NULL,100,'admin','m100r',NULL),(17,NULL,'2022-02-09 15:32:54','',NULL,NULL,100,'admin','m100r',NULL),(18,'4','2022-02-10 10:13:38','sss1213',NULL,NULL,100,'admin','m100r',NULL),(19,'4','2022-02-10 10:18:23','213123',NULL,NULL,100,'admin','m100r',NULL),(20,'4','2022-02-10 10:49:57','ㄴㅇㅇㄴ',NULL,NULL,20220035,'admin','m100r',NULL),(21,'2','2022-02-14 14:55:23','좋네야',NULL,NULL,20220035,'admin','m100r',NULL),(22,'4','2022-02-17 15:37:43','가나다라',NULL,NULL,20220035,'admin','m100r',NULL),(23,'4','2022-02-18 12:42:14','ㅇㄴㅁㅇㄴ',NULL,NULL,20220035,'abcdabcd','m100r',NULL),(24,'4','2022-02-18 12:42:45','ㅇㄴㅁㅇㄴ',NULL,NULL,20220035,'abcdabcd','m100r',NULL);
/*!40000 ALTER TABLE `productreview` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qanda`
--

DROP TABLE IF EXISTS `qanda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `qanda` (
  `q_no` int(11) NOT NULL AUTO_INCREMENT,
  `q_type` text NOT NULL,
  `user_id` varchar(20) NOT NULL,
  `user_phone` varchar(20) NOT NULL,
  `user_email` varchar(50) NOT NULL,
  `q_name` varchar(100) NOT NULL,
  `q_content` text NOT NULL,
  `q_secret` char(5) DEFAULT NULL,
  `q_regdate` datetime DEFAULT NULL,
  `q_state` varchar(10) DEFAULT '대기중',
  `q_reply` text,
  `user_pw` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`q_no`),
  KEY `fk_qanda_member1_idx` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qanda`
--

LOCK TABLES `qanda` WRITE;
/*!40000 ALTER TABLE `qanda` DISABLE KEYS */;
INSERT INTO `qanda` VALUES (29,'회원 관련','admin','01022222222','admin@main.com','sda','ddads','Y','2022-02-03 14:33:02','접수완료','넹',NULL),(31,'교환','abcdabcd','01088669568','bbackgom5@naver.com','test','sdadsa','Y','2022-02-18 12:45:01','대기중',NULL,NULL);
/*!40000 ALTER TABLE `qanda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `re_imagefile`
--

DROP TABLE IF EXISTS `re_imagefile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `re_imagefile` (
  `imageFileNo` int(10) DEFAULT NULL,
  `imageFileName` varchar(500) DEFAULT NULL,
  `regdate` datetime DEFAULT CURRENT_TIMESTAMP,
  `re_num` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `re_imagefile`
--

LOCK TABLES `re_imagefile` WRITE;
/*!40000 ALTER TABLE `re_imagefile` DISABLE KEYS */;
INSERT INTO `re_imagefile` VALUES (1,'blue.webp','2022-01-26 11:27:52',1),(2,'blue.webp','2022-01-26 11:28:57',3),(3,NULL,'2022-02-07 10:05:51',1),(4,NULL,'2022-02-07 10:22:26',5),(5,NULL,'2022-02-07 11:53:15',6),(6,NULL,'2022-02-08 10:20:21',7),(7,'4942402.jpg','2022-02-08 10:20:21',7),(8,'AGS200.png','2022-02-09 15:21:21',9),(9,'%EC%97%90%ED%94%84%EC%95%A4%EB%94%94+A450+2.1%EC%B1%84%EB%84%90+%EA%B2%8C%EC%9D%B4%EB%B0%8D+PC%EC%8A%A4%ED%94%BC%EC%BB%A4+%EC%9C%A0%EC%84%A0+%EB%A6%AC%EB%AA%A8%EC%BB%A8.jpg','2022-02-09 15:26:02',8),(10,'%EB%B8%8C%EB%A6%AC%EC%B8%A0+BZ-SL10+%EC%BB%B4%ED%93%A8%ED%84%B0+PC+%EA%B2%8C%EC%9D%B4%EB%B0%8D+%EC%82%AC%EC%9A%B4%EB%93%9C%EB%B0%94+%EC%8A%A4%ED%94%BC%EC%BB%A4.jpg','2022-02-09 15:26:45',12),(11,'%EB%A1%9C%EC%9D%B4%EC%B2%B4+RSB-G5000.jpg','2022-02-09 15:27:38',13),(12,'blue.webp','2022-02-09 15:27:53',14),(13,'%EC%9E%90%EB%A3%8C.PNG','2022-02-09 15:31:31',16),(14,'ABKO+HACKER+K660+ARC+dfsejlsdjfolisejlkdjflsiejdklm.jpg','2022-02-09 15:32:54',17),(15,'TECHRIVER 7.1CH 게이밍 헤드셋TK-GH1000.jpg','2022-02-10 10:13:38',18),(16,'앱코 N800 가상 7.1채널 컴퓨터 PC 게이밍 헤드셋.jpg','2022-02-10 10:18:23',19),(17,'팀스콜피온 기계식 게이밍키보드 PEGASUS SE 청축 LED 백라이트 PC방 FPS.jpg','2022-02-10 10:49:57',20),(18,NULL,'2022-02-17 10:43:07',21),(19,'캡처1.PNG','2022-02-17 15:37:43',22),(20,'','2022-02-18 12:42:14',23),(21,'M90.jpg','2022-02-18 12:42:45',24);
/*!40000 ALTER TABLE `re_imagefile` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sequences`
--

DROP TABLE IF EXISTS `sequences`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `sequences` (
  `sequence_name` varchar(20) DEFAULT NULL,
  `count_no` int(10) unsigned DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sequences`
--

LOCK TABLES `sequences` WRITE;
/*!40000 ALTER TABLE `sequences` DISABLE KEYS */;
INSERT INTO `sequences` VALUES ('memorderseqnum',20220011),('productNum',20220041),('SEQ_IMAGE_ID',20220001),('memordernum',20220014);
/*!40000 ALTER TABLE `sequences` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subcategoryname`
--

DROP TABLE IF EXISTS `subcategoryname`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `subcategoryname` (
  `minor_id` int(11) NOT NULL AUTO_INCREMENT,
  `minor_name` varchar(20) NOT NULL,
  `major_id` int(11) NOT NULL,
  `major_name` varchar(20) NOT NULL,
  PRIMARY KEY (`minor_id`),
  KEY `fk_subcategoryname_categoryname1_idx` (`major_id`),
  CONSTRAINT `fk_subcategoryname_categoryname1` FOREIGN KEY (`major_id`) REFERENCES `categoryname` (`major_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subcategoryname`
--

LOCK TABLES `subcategoryname` WRITE;
/*!40000 ALTER TABLE `subcategoryname` DISABLE KEYS */;
INSERT INTO `subcategoryname` VALUES (1,'19인치 이하',1,'모니터'),(2,'20~22인치',1,'모니터'),(3,'23~25인치',1,'모니터'),(4,'27~31인치',1,'모니터'),(5,'32인치 이상',1,'모니터'),(6,'게이밍 모니터',1,'모니터'),(7,'모니터암,어댑터',1,'모니터'),(8,'유선 마우스',2,'마우스'),(9,'무선 마우스',2,'마우스'),(10,'게이밍 마우스',2,'마우스'),(11,'마우스 패드',2,'마우스'),(12,'기계식 키보드',3,'키보드'),(13,'게이밍 키보드',3,'키보드'),(14,'무접점 키보드',3,'키보드'),(15,'무선 키보드',3,'키보드'),(16,'2채널',4,'스피커'),(17,'2.1채널 이상',4,'스피커'),(18,'사운드바',4,'스피커'),(19,'헤드셋',5,'헤드셋'),(20,'악세서리',5,'헤드셋');
/*!40000 ALTER TABLE `subcategoryname` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'ladderex'
--

--
-- Dumping routines for database 'ladderex'
--
/*!50003 DROP FUNCTION IF EXISTS `nextval` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`laddercom`@`%` FUNCTION `nextval`(the_name VARCHAR(20)) RETURNS bigint(20) unsigned
    MODIFIES SQL DATA
    DETERMINISTIC
BEGIN
	DECLARE ret BIGINT UNSIGNED;	#지역변수 선언
	UPDATE sequences SET count_no = count_no + 1 WHERE sequence_name = the_name;
    set ret := (select count_no from sequences where sequence_name = the_name);
    RETURN ret;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `create_sequence` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`laddercom`@`%` PROCEDURE `create_sequence`(in the_name text)
    MODIFIES SQL DATA
    DETERMINISTIC
begin
delete from sequences where sequence_name = the_name;
insert into sequences values(the_name, 20220001);	#오라클의 START WITH[시작 수]와 동일한 역할, 시작값을 지정
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-02-18 15:48:26
