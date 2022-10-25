-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 19, 2022 at 10:10 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `saaddb`
--

-- --------------------------------------------------------

--
-- Table structure for table `suppliers`
--

CREATE TABLE `suppliers` (
  `supplierid` int(11) NOT NULL,
  `companyname` varchar(30) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `pincode` varchar(10) DEFAULT NULL,
  `city` varchar(10) DEFAULT NULL,
  `contactpersonname` varchar(30) DEFAULT NULL,
  `contactpersonmobileno` varchar(10) DEFAULT NULL,
  `companycontactinfo` varchar(100) DEFAULT NULL,
  `regdate` date DEFAULT NULL,
  `currentstatus` varchar(10) DEFAULT NULL CHECK (`currentstatus` in ('active','close'))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `suppliers`
--

INSERT INTO `suppliers` (`supplierid`, `companyname`, `address`, `pincode`, `city`, `contactpersonname`, `contactpersonmobileno`, `companycontactinfo`, `regdate`, `currentstatus`) VALUES
(1, 'spaceoled', '5-california', '2568479', 'fairyplace', 'Mr.mac', '963258741', 'space@oled.in', '2002-08-01', 'active'),
(2, 'denver semiconductor', 'c denver halt', '28874130', 'denver', 'john', '9687984749', 'denver@semicons.in', '2003-05-18', 'active'),
(3, 'jackob', '9874789652', '7847894', 'bardey', 'macdey', '9874561540', 'sw@zc.in', '2000-04-07', 'active'),
(4, 'skyworks', 'D kim pathway, japan', '26478510', 'penvalley ', 'jacob', '9875814178', 'skyworks@japan.in', '1998-05-06', 'active'),
(5, 'noam microdevices', '7BRIDGE BERKELEY', '97544130', 'berkeley', 'johnson', '9774888491', 'noam@micro.in', '2003-07-06', 'active'),
(6, 'leafmicrons', '4-roundfly', '987487', 'newjersey', 'Mr.steve', '78987723', 'leaf@microns.in', '2005-08-08', 'active'),
(7, 'dolvy', '78-walingford', '658748', 'austin', 'Ms.mishel', '987478258', 'dolvy@austin.in', '2001-03-03', 'active'),
(8, 'energex', '6-eastview', '258746', 'tunisia', 'Mr.robert', '98458966', 'energex@tunisia.in', '2004-09-01', 'active'),
(9, 'acutybrands', '3-rampfall', '874562', 'portland', 'mr.rogers', '98568974', 'acuty@portland.in', '2003-06-02', 'active'),
(10, 'techfuse', '8-springway', '789856', 'eastland', 'Mr.nevel', '98562463', 'techfuse@eastland.in', '2003-06-01', 'active'),
(11, 'vicorcorporates', '3-fastway', '9874895', 'suncity', 'mr.sandy', '985784623', 'vicor@suncity.in', '2006-09-04', 'active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `suppliers`
--
ALTER TABLE `suppliers`
  ADD PRIMARY KEY (`supplierid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
