DROP TABLE IF EXISTS `lib_book_category`;
CREATE TABLE `lib_book_category` (
  `book_category` varchar(100) NOT NULL,
  PRIMARY KEY  (`book_category`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lib_book_category`
--

/*!40000 ALTER TABLE `lib_book_category` DISABLE KEYS */;
INSERT INTO `lib_book_category` (`book_category`) VALUES 
 ('Database'),
 ('Programming'),
 ('Web');
/*!40000 ALTER TABLE `lib_book_category` ENABLE KEYS */;


--
-- Definition of table `lib_book_master`
--

DROP TABLE IF EXISTS `lib_book_master`;
CREATE TABLE `lib_book_master` (
  `book_id` int(10) unsigned NOT NULL auto_increment,
  `book_title` varchar(100) default NULL,
  `book_author` varchar(100) NOT NULL,
  `book_publisher` varchar(100) NOT NULL,
  `book_publish_year` varchar(45) NOT NULL,
  `book_category` varchar(100) NOT NULL,
  `book_keyword` varchar(250) NOT NULL,
  `book_status` varchar(45) default NULL,
  PRIMARY KEY  (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lib_book_master`
--

/*!40000 ALTER TABLE `lib_book_master` DISABLE KEYS */;
INSERT INTO `lib_book_master` (`book_id`,`book_title`,`book_author`,`book_publisher`,`book_publish_year`,`book_category`,`book_keyword`,`book_status`) VALUES 
 (1,'Mastering VB6','Mr. J. K','MSN','1999','Programming','VB6, Programming','Issued'),
 (2,'Oracle Handbook','Mr. Oracle','Oracle Press','2010','Database','Oracle, Database','Available'),
 (4,'JAVA 123','Atanu','P2P','2000','Programming','Java','Available'),
 (5,'Easy HTML','Mr. Jarry','P2P','2009','Web','HTML, Web','Available'),
 (6,'JAVA handbook','Sun','Sun','2010','Programming','Java, Programming','Available'),
 (7,'MS Office Easy','Microsoft','MSN','2010','Programming','MS Office','Available');
/*!40000 ALTER TABLE `lib_book_master` ENABLE KEYS */;


--
-- Definition of table `lib_member_master`
--

DROP TABLE IF EXISTS `lib_member_master`;
CREATE TABLE `lib_member_master` (
  `mem_id` int(11) NOT NULL auto_increment,
  `mem_name` varchar(100) default NULL,
  `mem_address` varchar(250) default NULL,
  `mem_email_id` varchar(100) default NULL,
  `mem_mobile_no` varchar(20) default NULL,
  `mem_registered_date` date default NULL,
  `mem_active` varchar(1) default NULL,
  PRIMARY KEY  (`mem_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lib_member_master`
--

/*!40000 ALTER TABLE `lib_member_master` DISABLE KEYS */;
INSERT INTO `lib_member_master` (`mem_id`,`mem_name`,`mem_address`,`mem_email_id`,`mem_mobile_no`,`mem_registered_date`,`mem_active`) VALUES 
 (1,'Aditya','Mumai','aditya@programmer2programer.et','996774212','2012-08-08','Y'),
 (2,'Atanu Maity','Mumbai, India','ajprofessioals@gmail.com','9999999999',NULL,'Y'),
 (3,'Sunil Sharma','New Delhi','sunil.sharma@gmail.com','9999632333',NULL,'Y');
/*!40000 ALTER TABLE `lib_member_master` ENABLE KEYS */;


--
-- Definition of table `lib_transaction`
--

DROP TABLE IF EXISTS `lib_transaction`;
CREATE TABLE `lib_transaction` (
  `trn_id` int(10) unsigned NOT NULL auto_increment,
  `trn_mem_id` int(10) unsigned NOT NULL,
  `trn_book_id` int(10) unsigned NOT NULL,
  `trn_issue_dt` datetime NOT NULL,
  `trn_receive_dt` datetime default NULL,
  PRIMARY KEY  (`trn_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lib_transaction`
--

/*!40000 ALTER TABLE `lib_transaction` DISABLE KEYS */;
INSERT INTO `lib_transaction` (`trn_id`,`trn_mem_id`,`trn_book_id`,`trn_issue_dt`,`trn_receive_dt`) VALUES 
 (1,1,1,'2012-01-01 00:00:00','2012-01-01 00:00:00'),
 (2,1,2,'2012-09-08 23:42:11','2012-09-09 10:22:58'),
 (3,2,1,'2012-09-08 23:43:03','2012-09-09 10:23:07'),
 (4,1,1,'2012-09-09 10:23:21',NULL),
 (5,3,6,'2012-09-09 11:35:26','2012-09-09 11:36:20'),
 (6,2,7,'2012-09-09 11:58:23','2012-09-09 11:59:06');
/*!40000 ALTER TABLE `lib_transaction` ENABLE KEYS */;


--
-- Definition of table `lib_user`
--

DROP TABLE IF EXISTS `lib_user`;
CREATE TABLE `lib_user` (
  `user_name` varchar(45) NOT NULL,
  `user_password` varchar(45) NOT NULL,
  `user_type` varchar(45) NOT NULL,
  `user_active` varchar(45) NOT NULL,
  PRIMARY KEY  (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lib_user`
--

/*!40000 ALTER TABLE `lib_user` DISABLE KEYS */;
INSERT INTO `lib_user` (`user_name`,`user_password`,`user_type`,`user_active`) VALUES 
 ('Atanu','124','Admin','YES'),
 ('d','123','User','YES'),
 ('Raj','1001','Admin','NO'),
 ('sanjay','san123','User','YES');
/*!40000 ALTER TABLE `lib_user` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;