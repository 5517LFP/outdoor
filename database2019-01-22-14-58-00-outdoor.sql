-- MySQL dump 10.13  Distrib 5.5.27, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: outdoorbase
-- ------------------------------------------------------
-- Server version	5.5.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `activemanager`
--

DROP TABLE IF EXISTS `activemanager`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `activemanager` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `aname` varchar(255) DEFAULT NULL,
  `aline` varchar(1000) DEFAULT NULL,
  `asecure` varchar(255) DEFAULT NULL,
  `adangerous` varchar(255) DEFAULT NULL,
  `astronger` varchar(255) DEFAULT NULL,
  `aproject` varchar(255) DEFAULT NULL,
  `activestatues` varchar(255) DEFAULT NULL,
  `acontent` varchar(1000) DEFAULT NULL,
  `apicture` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `activemanager`
--

LOCK TABLES `activemanager` WRITE;
/*!40000 ALTER TABLE `activemanager` DISABLE KEYS */;
INSERT INTO `activemanager` VALUES (1,'双城骑游','邯邢','120000','A','3','登山','活动中','从邯郸到邢台，从美女之都到七夕之乡，用清风，用单车领略沿途风光...','shuangcheng.jpg'),(3,'自驾西藏（限邯郸）','邯藏','500000','A','3','登山','活动中','带上你的爱车，最好的朋友，抛弃你的老板，去放飞自己吧...','zijia.jpg'),(4,'峻险莲花山','莲花上','500000','C','3','潜水','禁用期','别说你爬过的山只有早高峰，不不不，晚高峰啊，午高峰啊，你该来这里在增加一座了...','lianhua.jpg'),(5,'海南深潜','海禁岛','120000','B','2','潜水','禁用期','远离陆地，贴近海洋，牵手鱼儿我们在这里等着你...','shenqian.jpg'),(6,'海南伞降','邯藏','500000','A','2','潜水','活动中','不在是陆地，不在是海洋，是天空，是疾风划过脸盘的感觉...','tiaosan.jpg'),(7,'深度江南','江南小镇','500000','D','1','跳伞','禁用期','还以为殉情只是古老的传言，你走得有多痛痛有多浓，当梦被埋在江南烟雨中...','jiangnan.jpg'),(8,'坝上冬摄影','承德坝上','120000','B','3','跳伞','禁用期','以万物为伴,孤独的人不孤单!用相机记录身边的事物...','dongshe.jpg'),(9,'漓江绕林峰','漓绕之旅','500000','C','3','登山','禁用期','仁者乐山,智者乐水。仁者静,智者动...','lijiang.png'),(10,'七步沟化雪','七步沟旅','120000','C','2','登山','活动中','领略北国风雪之景色，踏皑皑白色浪花...','qibugou.jpg'),(11,'探寻娲皇宫','探寻娲皇宫','500000','A','1','跳伞','活动中','追寻华夏文明，探寻人类始祖...','wahuanggong.jpg'),(12,'广府骑行','路线二','500000','A','1','跳伞','禁用期','走，骑行，去广府...','guangfu.jpg');
/*!40000 ALTER TABLE `activemanager` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `adminid` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `pwd` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,'admin','123456');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `benlist`
--

DROP TABLE IF EXISTS `benlist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `benlist` (
  `bid` int(11) NOT NULL AUTO_INCREMENT,
  `bname` varchar(255) DEFAULT NULL,
  `bphone` varchar(255) DEFAULT NULL,
  `bactivename` varchar(255) DEFAULT NULL,
  `bactivetime` varchar(255) DEFAULT NULL,
  `bjust` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`bid`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `benlist`
--

LOCK TABLES `benlist` WRITE;
/*!40000 ALTER TABLE `benlist` DISABLE KEYS */;
INSERT INTO `benlist` VALUES (10,'lucy','18832079359','海南伞降','潜水','审核中'),(11,'lucy','18832079359','峻险莲花山','潜水','同意'),(12,'lpf','18732009117','深度江南','跳伞','审核中'),(13,'lpf','18732009117','漓江绕林峰','登山','审核中'),(14,'lpf','18732009117','海南伞降','潜水','审核中'),(15,'lucy','18732009117','深度江南','跳伞','审核中');
/*!40000 ALTER TABLE `benlist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `equip`
--

DROP TABLE IF EXISTS `equip`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `equip` (
  `eqid` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `onedayvalue` varchar(255) DEFAULT NULL,
  `deposit` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equip`
--

LOCK TABLES `equip` WRITE;
/*!40000 ALTER TABLE `equip` DISABLE KEYS */;
INSERT INTO `equip` VALUES (1,'帐篷','10','300'),(2,'睡袋','10','200'),(3,'山地背包','5','150'),(4,'伞包','100','1000');
/*!40000 ALTER TABLE `equip` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `linemanage`
--

DROP TABLE IF EXISTS `linemanage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `linemanage` (
  `lid` int(11) NOT NULL AUTO_INCREMENT,
  `linename` varchar(255) DEFAULT NULL,
  `linecontent` varchar(1000) DEFAULT NULL,
  `linetype` varchar(255) DEFAULT NULL,
  `abouttime` int(255) DEFAULT NULL,
  PRIMARY KEY (`lid`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `linemanage`
--

LOCK TABLES `linemanage` WRITE;
/*!40000 ALTER TABLE `linemanage` DISABLE KEYS */;
INSERT INTO `linemanage` VALUES (2,'邯藏','邯郸--西藏','long',7),(3,'海南界内','-美国','long',16),(12,'邯邢','邯郸-沙河-邢台','short',1),(13,'海禁岛','水世界','middium',5),(14,'承德坝上','国家森林公园-庙宫-水晶塔','long',7),(15,'莲花上','五台酒店-莲花峰','short',2),(16,'江南小镇','南镇-西胡同-南条街','short',2),(17,'七步沟旅','天镜湖-百瀑峡-罗汉铜-东屏山','short',2),(18,'探寻娲皇宫','涉县-娲皇宫','short',3),(19,'漓绕之旅','漓江-林峰','middium',7);
/*!40000 ALTER TABLE `linemanage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `memactlist`
--

DROP TABLE IF EXISTS `memactlist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `memactlist` (
  `maid` int(11) NOT NULL AUTO_INCREMENT,
  `aid` int(11) DEFAULT NULL,
  `aname` varchar(255) DEFAULT NULL,
  `alinename` varchar(255) DEFAULT NULL,
  `aproject` varchar(255) DEFAULT NULL,
  `mid` int(11) DEFAULT NULL,
  `mname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`maid`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `memactlist`
--

LOCK TABLES `memactlist` WRITE;
/*!40000 ALTER TABLE `memactlist` DISABLE KEYS */;
INSERT INTO `memactlist` VALUES (14,1,'双城骑游','邯邢','登山',17,'CATT'),(15,4,'峻险莲花山','莲花上','潜水',13,'lucy'),(17,1,'双城骑游','邯邢','登山',15,'lpf'),(18,1,'双城骑游','邯邢','登山',14,'mavan'),(19,6,'海南伞降','邯藏','潜水',26,'马云'),(20,12,'广府骑行','路线二','跳伞',29,'lpf8'),(21,8,'坝上冬摄影','承德坝上','跳伞',13,'lucy'),(22,5,'海南深潜','海禁岛','潜水',13,'lucy'),(23,5,'海南深潜','海禁岛','潜水',15,'lpf'),(24,6,'海南伞降','邯藏','潜水',13,'lucy');
/*!40000 ALTER TABLE `memactlist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `member` (
  `hid` int(11) NOT NULL AUTO_INCREMENT,
  `hname` varchar(255) DEFAULT NULL,
  `hpwd` varchar(255) DEFAULT NULL,
  `hphonenumber` varchar(255) DEFAULT NULL,
  `hlv` varchar(255) DEFAULT NULL,
  `hidcard` varchar(255) DEFAULT NULL,
  `hemail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`hid`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES (13,'lucy','123456','18731440481','3','130828199410175517','15278@qq.cm'),(14,'mavan','ldlaff','14531401562','3','130828199410175517','15278@qq.cm'),(15,'lpf','123456','18832079359','3','130828199410175518','1527815566@qq.cm'),(17,'CATT6','456789','18732009117','3','130828199410175517','zzz@sina.cn'),(19,'momo6','123456','13213354117','1','130828199410175517','566@qq.com'),(24,'郑智薰','zffzss','18732009117','2','130828199410175517','1566@fackbook.com'),(26,'马云5','dfgesw','15732024615','3','130828199410175517','152251@qq.com'),(27,'马化腾','9699vsd','18832199127','2','130828199410175517','sjsdkf@163.com'),(28,'富达公司','666666','18732009056','1','130828199410175517','sidfn@sina.cn'),(29,'lpf8','123457','1873140157','3','130828199410175517','1527831187@qq.cm'),(30,'pac2','123456','18832079359','1','188565985956265962','bugao@sina.com');
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project`
--

DROP TABLE IF EXISTS `project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `project` (
  `pid` int(15) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `lvs` varchar(255) DEFAULT NULL,
  `lvd` varchar(255) DEFAULT NULL,
  `content` varchar(1000) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project`
--

LOCK TABLES `project` WRITE;
/*!40000 ALTER TABLE `project` DISABLE KEYS */;
INSERT INTO `project` VALUES (1,'跳伞','2','B','跳伞运动是指跳伞员乘飞机、气球等航空器或其他器械升至高空后跳下，或者从陡峭的山顶、高地上跳下，并借助空气动力和降落伞在张开降落伞之前和开伞后完成各种规定动作，并利用降落伞减缓下降速度在指定区域安全着陆的一项体育运动','sky'),(2,'登山','2','D','登山（mountaineering）：是指在特定要求下，运动员徒手或使用专门装备，从低海拔地形向高海拔山峰进行攀登的一项体育活动','ground'),(3,'潜水','3','A','潜水的原意是为进行水下查勘、打捞、修理和水下工程等作业而在携带或不携带专业工具的情况下进入水面以下的活动','water'),(4,'攀岩','3','A','攀岩运动有“岩壁芭蕾”、“峭壁上的艺术体操”等美称，由登山运动衍生而来，富有很强的技巧性、冒险性，是极限运动中的一个重要项目','ground'),(5,'蹦极','2','D','从高空坠落，啪唧，结束','all'),(6,'徒步','0','D','不行穿越地形','ground'),(7,'热气球','0','A','乘坐热气球，进行空中之旅','sky'),(8,'漂流','2','B','乘皮筏，在激谁中前行','water'),(9,'风帆','2','A','成风帆穿越海峡','water'),(10,'滑雪','2','B','飞驰在一望无际的雪原上','all'),(11,'探穴','3','A','进行洞穴探测（属于极限运动）','all'),(12,'水上摩托','2','C','骑水上摩托，在水上飞驰','water'),(13,'荒岛生存','3','A','带上一定装备，体验荒岛原始生活','sky');
/*!40000 ALTER TABLE `project` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `safedangerous`
--

DROP TABLE IF EXISTS `safedangerous`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `safedangerous` (
  `sdid` int(15) DEFAULT NULL,
  `sdname` varchar(500) DEFAULT NULL,
  `sdlv` int(15) DEFAULT NULL,
  `sdcontent` varchar(1000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `safedangerous`
--

LOCK TABLES `safedangerous` WRITE;
/*!40000 ALTER TABLE `safedangerous` DISABLE KEYS */;
INSERT INTO `safedangerous` VALUES (1,'无危险度',0,'一般的休闲游，如旅游景点游玩，安全有充分保障的短期野外旅行，线路明了的短期常规山地攀登。无意外情况发生，行程短，强度低。对参与者没有什么特殊要求'),(2,'低危险度',1,'多数常规活动，如常规登山、攀岩、滑雪、骑马、游泳等。可能会有意外情况发生，行程中等，强度低，一般有1-3次野营。需要参与者有一般的生活常识和较好的心理素质 '),(3,'中危险度',2,'难度较大的常规山地活动，非常规山地的活动，强度较大的骑马、滑雪活动，未知领域的大强度探索穿越活动，需要特殊户外技能的活动环境。可能有意外情况发生，行程长，强度大，一般有多次野营。需要参与者有好的心理素质和团队意识，具有一定的户外活动经验和户外技能（如攀岩，急救等）'),(4,'高危险度',3,'非常规山地的活动，需要特殊户外技能的活动环境。不可预测和控制的因素多，经常有意外情况发生，行程长，强度大，自然条件艰苦，多次野营。需要参与者良好的心理素质、丰富的户外经验和较全面的户外技能和优良的团队精神。');
/*!40000 ALTER TABLE `safedangerous` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `safestronger`
--

DROP TABLE IF EXISTS `safestronger`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `safestronger` (
  `ssid` int(15) NOT NULL,
  `ssname` varchar(255) DEFAULT NULL,
  `sslv` varchar(255) DEFAULT NULL,
  `sscontent` varchar(1000) NOT NULL,
  PRIMARY KEY (`ssid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `safestronger`
--

LOCK TABLES `safestronger` WRITE;
/*!40000 ALTER TABLE `safestronger` DISABLE KEYS */;
INSERT INTO `safestronger` VALUES (0,'休闲强度','D','一般的休闲游，如郊游聚餐等。行程短，一般不野营。不对参与者体能提出要求，一般穿旅游鞋（或运动鞋），背小双肩包，带水和食物即可'),(2,'中等强度','C','数日的常规山地活动，日行程短（一般少于15公里山路），1-2次宿营。如：登云蒙山，爬司马台长城，攀岩，游泳，骑马，滑雪等。对参与者要求其身体健康，装备要求一般，背负重量15公斤以下（男性）'),(3,'高等强度','B','多日的常规山地活动，多数非常规山地活动，日行程山路20公里以上，攀升高度大，以及竞技性活动，如自行车、登山比赛等。三夫俱乐部曾经举行的3天小五台连穿是典型的高强度活动。对参与者有较高的体能和装备要求，背负重量15公斤以上（男性）'),(4,'极高强度','A','极限环境下的连续活动，非常规山地活动，环境条件恶劣，疲劳度高，恢复期段，多日日平均行程20公里以上，背负重量高于15公斤（男性），如雪山攀登活动，连续多日的冰雪环境下的探险穿越活动等。');
/*!40000 ALTER TABLE `safestronger` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `secure`
--

DROP TABLE IF EXISTS `secure`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `secure` (
  `seid` int(11) NOT NULL AUTO_INCREMENT,
  `sename` varchar(255) DEFAULT NULL,
  `selv` varchar(255) DEFAULT NULL,
  `semoney` varchar(255) DEFAULT NULL,
  `secompany` varchar(255) DEFAULT NULL,
  `seneedmoney` int(15) DEFAULT NULL,
  PRIMARY KEY (`seid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `secure`
--

LOCK TABLES `secure` WRITE;
/*!40000 ALTER TABLE `secure` DISABLE KEYS */;
INSERT INTO `secure` VALUES (1,'高额保险','A3','50万元','中国人寿',200),(2,'中额保险','A2-B1','15万元','中国人寿',100),(3,'小额保险','C','5万元','中国人寿',50);
/*!40000 ALTER TABLE `secure` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff`
--

DROP TABLE IF EXISTS `staff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `staff` (
  `staid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `pwd` varchar(255) DEFAULT NULL,
  `encode` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `job` varchar(255) DEFAULT NULL,
  `indate` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`staid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff`
--

LOCK TABLES `staff` WRITE;
/*!40000 ALTER TABLE `staff` DISABLE KEYS */;
INSERT INTO `staff` VALUES (1,'lpf','152','0013','18832079359','会员管理员','2017-10-17'),(2,'pac','123456','1103','18732009117','项目管理员','2017-10-26'),(5,'非','45632','0074','18832079359','安全管理员','2017-17-14');
/*!40000 ALTER TABLE `staff` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-01-22 14:58:00
