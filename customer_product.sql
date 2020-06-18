CREATE DATABASE  IF NOT EXISTS `Products_customer` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `Products_customer`;

DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

DROP TABLE IF EXISTS `categories`;
CREATE TABLE categories(
    categoryId INT AUTO_INCREMENT PRIMARY KEY,
    categoryName VARCHAR(100) NOT NULL
) ENGINE=INNODB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `products`;
CREATE TABLE products(
    productId INT AUTO_INCREMENT PRIMARY KEY,
    productName varchar(100) not null,
    categoryId INT,
    price INT,
    rating DECIMAL(19 , 4 ) NOT NULL,
    CONSTRAINT fk_category
    FOREIGN KEY (categoryId) 
        REFERENCES categories(categoryId)
) ENGINE=INNODB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

/*!40000 ALTER TABLE `customer` DISABLE KEYS */;

INSERT INTO `customer` VALUES 
	(1,'David','Adams','david@luv2code.com'),
	(2,'John','Doe','john@luv2code.com'),
	(3,'Ajay','Rao','ajay@luv2code.com'),
	(4,'Mary','Public','mary@luv2code.com'),
	(5,'Maxwell','Dixon','max@luv2code.com');

INSERT INTO `categories` VALUES 
     (1, `HouseDecor`),
     (2, `Grossary`);



INSERT INTO `products` VALUES 
	(1,'painting',1, 300, 4.1),
	(2,'Watch',1,500, 4.2),
	(3,'Watch', 1, 400, 4.0),
	(4,'Sticker', 1, 100, 5.0),
	(5,'Sticker',1 , 200, 5.0),
	(6, `Atta`, 2, 100, 4.0),
	(7, `rice`, 2. 100, 4.0),
	(8, `rice`, 2, 200, 5.0),
	(9, `dal`, 2, 200, 4.5),
	(10, `Sugar`, 2, 50, 3.5);

UNLOCK TABLES;