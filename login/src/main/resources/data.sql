DROP TABLE IF EXISTS Contact;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE Contact (
  id int(11) NOT NULL AUTO_INCREMENT,
  city varchar(255) DEFAULT NULL,
  email varchar(255) DEFAULT NULL,
  phone varchar(255) DEFAULT NULL,
  state varchar(255) DEFAULT NULL,
  zip varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
);

DROP TABLE IF EXISTS User;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE User (
   id int(11) NOT NULL AUTO_INCREMENT,
   confirmed int(11) DEFAULT NULL,
   password varchar(100) DEFAULT NULL,
   userType varchar(255) DEFAULT NULL,
   userName varchar(20) NOT NULL,
   contact_id int(11) DEFAULT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (contact_id) REFERENCES Contact(id)
);


INSERT INTO Contact VALUES
	  (1,'Kolkata','xyz@gmail.com','9999999999','WB','700107'),
	  (2,'Kolkata','xxx@gmail.com','8888888888','WB','700107');
	  
INSERT INTO User VALUES
	  (1,1,'pppp','ROLE_ADMIN','MAX','1'),
	  (2,1,'pppp','ROLE_USER','MAXY','2');
	  
	  