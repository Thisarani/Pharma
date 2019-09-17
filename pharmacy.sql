-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 08, 2019 at 03:32 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pharmacy`
--

-- --------------------------------------------------------

--
-- Table structure for table `bill`
--

CREATE TABLE `bill` (
  `bill_id_fk` int(10) NOT NULL,
  `cust_nic_fk` varchar(10) NOT NULL,
  `item_id_fk` int(10) NOT NULL,
  `report_id_fk` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `bill_details`
--

CREATE TABLE `bill_details` (
  `bill_id` int(10) NOT NULL,
  `tot_amount` float NOT NULL,
  `tot_qty` int(10) NOT NULL,
  `tot_discount` float NOT NULL,
  `bill_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bill_details`
--

INSERT INTO `bill_details` (`bill_id`, `tot_amount`, `tot_qty`, `tot_discount`, `bill_date`) VALUES
(1, 97.5, 10, 15, '2019-07-13'),
(2, 938, 15, 127, '2019-07-13'),
(3, 152.25, 6, 5.25, '2019-07-13'),
(4, 105.5, 14, 17, '2019-07-13');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `cust_nic` varchar(10) NOT NULL,
  `cust_fname` varchar(10) NOT NULL,
  `cust_lname` varchar(30) NOT NULL,
  `cust_address` varchar(50) NOT NULL,
  `cust_dob` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`cust_nic`, `cust_fname`, `cust_lname`, `cust_address`, `cust_dob`) VALUES
('625874588V', 'Charles', 'Kulasinghe', 'No:3, Dewata Road, Katuwana', '1982-01-15'),
('678958988V', 'Malanie', 'Bulathsinghala', '67/A, Thalagala Road, Homagama', '1967-12-01'),
('758956857V', 'Sriyalatha', 'Malawige', '23, Thibbotuwawa, Homagama', '1975-02-10'),
('852565896V', 'Saman', 'Perera', '23, Gangodawila, Homagama', '1985-07-25'),
('985899857V', 'Kumudu', 'Dissanayake', 'No:52, Gammanpila Road, Pannipitiya', '1998-03-11');

-- --------------------------------------------------------

--
-- Table structure for table `customer_tel`
--

CREATE TABLE `customer_tel` (
  `custNIC_fk` varchar(10) NOT NULL,
  `cust_tel` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer_tel`
--

INSERT INTO `customer_tel` (`custNIC_fk`, `cust_tel`) VALUES
('625874588V', '0112588784'),
('625874588V', '0778542100'),
('678958988V', '0715899869'),
('758956857V', '0788855214'),
('852565896V', '0728512001'),
('852565896V', '0768596322'),
('985899857V', '0112585985'),
('985899857V', '0715286324');

-- --------------------------------------------------------

--
-- Table structure for table `daily_report`
--

CREATE TABLE `daily_report` (
  `report_id_fk` int(10) NOT NULL,
  `item_id_fk` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `daily_report_details`
--

CREATE TABLE `daily_report_details` (
  `report_id` int(10) NOT NULL,
  `total_income` float NOT NULL,
  `total_outcome` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `daily_report_details`
--

INSERT INTO `daily_report_details` (`report_id`, `total_income`, `total_outcome`) VALUES
(1, 15000, 20000),
(2, 17500, 0),
(3, 10000.5, 10000),
(4, 20120.6, 12000),
(5, 30000.5, 21000);

-- --------------------------------------------------------

--
-- Table structure for table `health_&_sanitary`
--

CREATE TABLE `health_&_sanitary` (
  `item_id_fk` int(10) NOT NULL,
  `item_name` varchar(20) NOT NULL,
  `exp_date` date NOT NULL,
  `available_qty` int(10) NOT NULL,
  `price` float NOT NULL,
  `discount` float NOT NULL,
  `brand` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `health_&_sanitary_suppliers_type`
--

CREATE TABLE `health_&_sanitary_suppliers_type` (
  `sup_id_fk` int(10) NOT NULL,
  `sup_type` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `health_&_sanitary_suppliers_y`
--

CREATE TABLE `health_&_sanitary_suppliers_y` (
  `sup_id_fk` int(10) NOT NULL,
  `sup_fname` varchar(10) NOT NULL,
  `sup_lname` varchar(30) NOT NULL,
  `sup_address` varchar(50) NOT NULL,
  `sup_type` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `invoice`
--

CREATE TABLE `invoice` (
  `invoice_id` int(10) NOT NULL,
  `user_id_fk` int(10) NOT NULL,
  `report_id_fk` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `invoice_details`
--

CREATE TABLE `invoice_details` (
  `invoice_id` int(10) NOT NULL,
  `total_qty` int(10) NOT NULL,
  `total_invoice` float NOT NULL,
  `invoice_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

CREATE TABLE `item` (
  `item_id` int(10) NOT NULL,
  `user_id_fk` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `item_details`
--

CREATE TABLE `item_details` (
  `item_id` int(10) NOT NULL,
  `item_name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `item_details`
--

INSERT INTO `item_details` (`item_id`, `item_name`) VALUES
(1, 'Panadol'),
(2, 'Niko'),
(3, 'Sdfr'),
(4, 'Libaro'),
(5, 'Casinol');

-- --------------------------------------------------------

--
-- Table structure for table `item_details2`
--

CREATE TABLE `item_details2` (
  `item_id` int(10) NOT NULL,
  `item_name_fk` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `item_details2`
--

INSERT INTO `item_details2` (`item_id`, `item_name_fk`) VALUES
(5, 'Dog-Biscuit'),
(2, 'Encorate Chrono 500m'),
(1, 'Paracetamol-capsule'),
(3, 'Toxoide'),
(4, 'Transparent-Plaster'),
(6, 'Xenat');

-- --------------------------------------------------------

--
-- Table structure for table `item_name`
--

CREATE TABLE `item_name` (
  `item_id_fk` int(10) NOT NULL,
  `item_name_fk` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `item_owner_update`
--

CREATE TABLE `item_owner_update` (
  `user_id_fk` int(10) NOT NULL,
  `item_id_fk` int(10) NOT NULL,
  `update_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `item_primary_details`
--

CREATE TABLE `item_primary_details` (
  `item_name` varchar(20) NOT NULL,
  `exp_date` date NOT NULL,
  `price` float NOT NULL,
  `discount` float NOT NULL,
  `available_qty` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `item_primary_details`
--

INSERT INTO `item_primary_details` (`item_name`, `exp_date`, `price`, `discount`, `available_qty`) VALUES
('Casinol', '2021-03-11', 5, 0, 1000),
('Libaro', '2021-03-11', 125, 15.25, 2000),
('Niko', '2019-10-17', 20, 2.5, 100),
('Panadol', '2019-07-24', 2.5, 0.5, 100),
('Sdfr', '2019-07-24', 50, 1.25, 1000);

-- --------------------------------------------------------

--
-- Table structure for table `item_primary_details2`
--

CREATE TABLE `item_primary_details2` (
  `item_name` varchar(20) NOT NULL,
  `exp_date` date NOT NULL,
  `price` float NOT NULL,
  `discount` float NOT NULL,
  `available_qty` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `item_primary_details2`
--

INSERT INTO `item_primary_details2` (`item_name`, `exp_date`, `price`, `discount`, `available_qty`) VALUES
('Dog-Biscuit', '2021-03-11', 25, 2.5, 1000),
('Encorate Chrono 500m', '2019-11-08', 41, 0, 200),
('Paracetamol-capsule', '2019-07-31', 5, 0, 1000),
('Toxoide', '2019-12-31', 20, 0, 1000),
('Transparent-Plaster', '2019-10-17', 250.5, 15, 100),
('Xenat', '2020-04-10', 52, 0, 2000);

-- --------------------------------------------------------

--
-- Table structure for table `medical_suppliers_license`
--

CREATE TABLE `medical_suppliers_license` (
  `sup_id_fk` int(10) NOT NULL,
  `license_number_fk` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `medical_supplier_details`
--

CREATE TABLE `medical_supplier_details` (
  `license_number` int(10) NOT NULL,
  `sup_fname` varchar(10) NOT NULL,
  `sup_lname` varchar(30) NOT NULL,
  `sup_address` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `medicine_details`
--

CREATE TABLE `medicine_details` (
  `item_name_fk` varchar(20) NOT NULL,
  `exp_date` date NOT NULL,
  `available_qty` int(10) NOT NULL,
  `price` float NOT NULL,
  `discount` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `medicine_name`
--

CREATE TABLE `medicine_name` (
  `item_id_fk` int(10) NOT NULL,
  `item_name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `medicine_name`
--

INSERT INTO `medicine_name` (`item_id_fk`, `item_name`) VALUES
(1, 'Panadol'),
(2, 'Niko'),
(3, 'Sdfr'),
(4, 'Libaro'),
(5, 'Casinol');

-- --------------------------------------------------------

--
-- Table structure for table `medicine_name2`
--

CREATE TABLE `medicine_name2` (
  `item_id_fk` int(10) NOT NULL,
  `item_name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `medicine_x`
--

CREATE TABLE `medicine_x` (
  `item_id_fk` int(10) NOT NULL,
  `brand_name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `medicine_x`
--

INSERT INTO `medicine_x` (`item_id_fk`, `brand_name`) VALUES
(1, 'GSK'),
(2, 'Nikola'),
(3, 'San'),
(4, 'Libarol'),
(5, 'Casine');

-- --------------------------------------------------------

--
-- Table structure for table `medicine_x2`
--

CREATE TABLE `medicine_x2` (
  `item_id_fk` int(10) NOT NULL,
  `brand_name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `medicine_y`
--

CREATE TABLE `medicine_y` (
  `item_id_fk` int(10) NOT NULL,
  `item_name` varchar(20) NOT NULL,
  `generic_name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `medicine_y`
--

INSERT INTO `medicine_y` (`item_id_fk`, `item_name`, `generic_name`) VALUES
(1, 'Panadol', 'Paracetamol'),
(2, 'Niko', 'GNiko'),
(3, 'Sdfr', 'Gsdfr'),
(4, 'Libaro', 'Glibaro'),
(5, 'Casinol', 'Gcasinol');

-- --------------------------------------------------------

--
-- Table structure for table `medicine_y2`
--

CREATE TABLE `medicine_y2` (
  `item_id_fk` int(10) NOT NULL,
  `item_name` varchar(20) NOT NULL,
  `generic_name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `sup_id` int(10) NOT NULL,
  `invoice_id_fk` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `supplier_details`
--

CREATE TABLE `supplier_details` (
  `sup_id` int(10) NOT NULL,
  `sup_fname` varchar(15) NOT NULL,
  `sup_lname` varchar(30) NOT NULL,
  `sup_address` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `supplier_invoice`
--

CREATE TABLE `supplier_invoice` (
  `sup_id_fk` int(10) NOT NULL,
  `invoice_id_fk` int(10) NOT NULL,
  `issued_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `supplier_tel`
--

CREATE TABLE `supplier_tel` (
  `sup_tel` varchar(10) NOT NULL,
  `sup_id_fk` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `user_id` int(10) NOT NULL,
  `report_id_fk` int(10) NOT NULL,
  `customer_nic_fk` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `report_id_fk`, `customer_nic_fk`) VALUES
(2, 1, '678958988V'),
(3, 1, '625874588V');

-- --------------------------------------------------------

--
-- Table structure for table `user_daily_report`
--

CREATE TABLE `user_daily_report` (
  `report_id_fk` int(10) NOT NULL,
  `user_id_fk` int(10) NOT NULL,
  `daily_report_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user_details`
--

CREATE TABLE `user_details` (
  `user_id` int(10) NOT NULL,
  `password` varchar(10) NOT NULL,
  `user_level` varchar(15) NOT NULL,
  `nic` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_details`
--

INSERT INTO `user_details` (`user_id`, `password`, `user_level`, `nic`) VALUES
(1, '12345', 'Admin', '947810642V'),
(2, 'M1234', 'Admin', '952211044V'),
(3, '147', 'Normal User', '977710642V'),
(4, 'M55122', 'Admin', '952212204V'),
(5, 'N15423', 'Normal User', '977810642V'),
(6, '14789', 'Normal User', '4445555'),
(7, '456', 'Normal User', '5555'),
(8, '123', 'Normal User', '947852652V');

-- --------------------------------------------------------

--
-- Table structure for table `user_nic`
--

CREATE TABLE `user_nic` (
  `user_id_fk` int(10) NOT NULL,
  `nic_fk` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user_primary_details`
--

CREATE TABLE `user_primary_details` (
  `nic` varchar(10) NOT NULL,
  `user_fname` varchar(10) NOT NULL,
  `user_lname` varchar(30) NOT NULL,
  `user_address` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_primary_details`
--

INSERT INTO `user_primary_details` (`nic`, `user_fname`, `user_lname`, `user_address`) VALUES
('444', 'ddd', 'ee', 'eee'),
('55', 'kkk', 'ooiiii', 'uuuuuuuuuuuuuu'),
('947810642V', 'Thisarani', 'Malawaraarachchi', '194/31 Pathum Uyana, Pamburana, Matara'),
('947852652V', 'Melani', 'Kaluarachchi', '12/A Silva Road, Nugegoda'),
('952211044V', 'Melani', 'Kaluarachchi', '12, Suananda Road, Welegoda, Ambalangoda'),
('952212204V', 'Rajitha ', 'Gamage', '23 B, Sudam Ranasinghe Road, Horana'),
('977710642V', 'Nadeesha', 'Pathirana', '13/A, Daraniyagala, Rathnapura'),
('977810642V', 'Kusal', 'Amarasinghe', '52A, Balangoda, Rathnapura');

-- --------------------------------------------------------

--
-- Table structure for table `user_tel`
--

CREATE TABLE `user_tel` (
  `user_id_fk` int(10) NOT NULL,
  `user_tel` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_tel`
--

INSERT INTO `user_tel` (`user_id_fk`, `user_tel`) VALUES
(1, '0719602234'),
(1, '0776920623'),
(2, '0718575958'),
(2, '0718575958'),
(3, '0778545220'),
(3, '0778545220');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bill`
--
ALTER TABLE `bill`
  ADD KEY `cust_nic_fk` (`cust_nic_fk`),
  ADD KEY `item_id_fk` (`item_id_fk`),
  ADD KEY `report_id_fk` (`report_id_fk`),
  ADD KEY `bill_id_fk` (`bill_id_fk`);

--
-- Indexes for table `bill_details`
--
ALTER TABLE `bill_details`
  ADD PRIMARY KEY (`bill_id`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`cust_nic`);

--
-- Indexes for table `customer_tel`
--
ALTER TABLE `customer_tel`
  ADD PRIMARY KEY (`cust_tel`),
  ADD KEY `custNIC_fk` (`custNIC_fk`);

--
-- Indexes for table `daily_report`
--
ALTER TABLE `daily_report`
  ADD KEY `item_id_fk` (`item_id_fk`),
  ADD KEY `report_id_fk` (`report_id_fk`);

--
-- Indexes for table `daily_report_details`
--
ALTER TABLE `daily_report_details`
  ADD PRIMARY KEY (`report_id`);

--
-- Indexes for table `health_&_sanitary`
--
ALTER TABLE `health_&_sanitary`
  ADD PRIMARY KEY (`item_id_fk`),
  ADD KEY `item_id_fk` (`item_id_fk`);

--
-- Indexes for table `health_&_sanitary_suppliers_type`
--
ALTER TABLE `health_&_sanitary_suppliers_type`
  ADD PRIMARY KEY (`sup_id_fk`),
  ADD KEY `sup_id_fk` (`sup_id_fk`);

--
-- Indexes for table `health_&_sanitary_suppliers_y`
--
ALTER TABLE `health_&_sanitary_suppliers_y`
  ADD PRIMARY KEY (`sup_id_fk`),
  ADD KEY `sup_id_fk` (`sup_id_fk`);

--
-- Indexes for table `invoice`
--
ALTER TABLE `invoice`
  ADD PRIMARY KEY (`invoice_id`),
  ADD KEY `user_id_fk` (`user_id_fk`),
  ADD KEY `report_id_fk` (`report_id_fk`);

--
-- Indexes for table `invoice_details`
--
ALTER TABLE `invoice_details`
  ADD PRIMARY KEY (`invoice_id`);

--
-- Indexes for table `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`item_id`),
  ADD KEY `user_id_fk` (`user_id_fk`);

--
-- Indexes for table `item_details`
--
ALTER TABLE `item_details`
  ADD PRIMARY KEY (`item_id`);

--
-- Indexes for table `item_details2`
--
ALTER TABLE `item_details2`
  ADD PRIMARY KEY (`item_id`),
  ADD KEY `item_name_fk` (`item_name_fk`);

--
-- Indexes for table `item_name`
--
ALTER TABLE `item_name`
  ADD KEY `item_id_fk` (`item_id_fk`),
  ADD KEY `item_name_fk` (`item_name_fk`);

--
-- Indexes for table `item_owner_update`
--
ALTER TABLE `item_owner_update`
  ADD KEY `user_id_fk` (`user_id_fk`),
  ADD KEY `item_id_fk` (`item_id_fk`);

--
-- Indexes for table `item_primary_details`
--
ALTER TABLE `item_primary_details`
  ADD PRIMARY KEY (`item_name`);

--
-- Indexes for table `item_primary_details2`
--
ALTER TABLE `item_primary_details2`
  ADD PRIMARY KEY (`item_name`);

--
-- Indexes for table `medical_suppliers_license`
--
ALTER TABLE `medical_suppliers_license`
  ADD KEY `sup_id_fk` (`sup_id_fk`),
  ADD KEY `license_number_fk` (`license_number_fk`);

--
-- Indexes for table `medical_supplier_details`
--
ALTER TABLE `medical_supplier_details`
  ADD PRIMARY KEY (`license_number`);

--
-- Indexes for table `medicine_details`
--
ALTER TABLE `medicine_details`
  ADD KEY `item_name_fk` (`item_name_fk`);

--
-- Indexes for table `medicine_name`
--
ALTER TABLE `medicine_name`
  ADD KEY `item_id_fk` (`item_id_fk`);

--
-- Indexes for table `medicine_name2`
--
ALTER TABLE `medicine_name2`
  ADD KEY `item_id_fk` (`item_id_fk`);

--
-- Indexes for table `medicine_x`
--
ALTER TABLE `medicine_x`
  ADD KEY `item_id_fk` (`item_id_fk`);

--
-- Indexes for table `medicine_x2`
--
ALTER TABLE `medicine_x2`
  ADD KEY `item_id_fk` (`item_id_fk`);

--
-- Indexes for table `medicine_y`
--
ALTER TABLE `medicine_y`
  ADD KEY `item_id_fk` (`item_id_fk`);

--
-- Indexes for table `medicine_y2`
--
ALTER TABLE `medicine_y2`
  ADD KEY `item_id_fk` (`item_id_fk`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`sup_id`),
  ADD KEY `invoice_id_fk` (`invoice_id_fk`);

--
-- Indexes for table `supplier_details`
--
ALTER TABLE `supplier_details`
  ADD PRIMARY KEY (`sup_id`);

--
-- Indexes for table `supplier_invoice`
--
ALTER TABLE `supplier_invoice`
  ADD KEY `sup_id_fk` (`sup_id_fk`),
  ADD KEY `invoice_id_fk` (`invoice_id_fk`);

--
-- Indexes for table `supplier_tel`
--
ALTER TABLE `supplier_tel`
  ADD PRIMARY KEY (`sup_tel`),
  ADD KEY `sup_id_fk` (`sup_id_fk`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`),
  ADD KEY `report_id_fk` (`report_id_fk`),
  ADD KEY `customer_nic_fk` (`customer_nic_fk`);

--
-- Indexes for table `user_daily_report`
--
ALTER TABLE `user_daily_report`
  ADD KEY `report_id_fk` (`report_id_fk`),
  ADD KEY `user_id_fk` (`user_id_fk`);

--
-- Indexes for table `user_details`
--
ALTER TABLE `user_details`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `user_nic`
--
ALTER TABLE `user_nic`
  ADD KEY `user_id_fk` (`user_id_fk`),
  ADD KEY `nic_fk` (`nic_fk`);

--
-- Indexes for table `user_primary_details`
--
ALTER TABLE `user_primary_details`
  ADD PRIMARY KEY (`nic`);

--
-- Indexes for table `user_tel`
--
ALTER TABLE `user_tel`
  ADD KEY `user_id_fk` (`user_id_fk`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bill_details`
--
ALTER TABLE `bill_details`
  MODIFY `bill_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `daily_report_details`
--
ALTER TABLE `daily_report_details`
  MODIFY `report_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `invoice`
--
ALTER TABLE `invoice`
  MODIFY `invoice_id` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `item`
--
ALTER TABLE `item`
  MODIFY `item_id` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `item_details`
--
ALTER TABLE `item_details`
  MODIFY `item_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `item_details2`
--
ALTER TABLE `item_details2`
  MODIFY `item_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `medical_supplier_details`
--
ALTER TABLE `medical_supplier_details`
  MODIFY `license_number` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `supplier_details`
--
ALTER TABLE `supplier_details`
  MODIFY `sup_id` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `user_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `user_details`
--
ALTER TABLE `user_details`
  MODIFY `user_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `bill`
--
ALTER TABLE `bill`
  ADD CONSTRAINT `bill_ibfk_1` FOREIGN KEY (`cust_nic_fk`) REFERENCES `customer` (`cust_nic`),
  ADD CONSTRAINT `bill_ibfk_2` FOREIGN KEY (`item_id_fk`) REFERENCES `item` (`item_id`),
  ADD CONSTRAINT `bill_ibfk_3` FOREIGN KEY (`report_id_fk`) REFERENCES `daily_report_details` (`report_id`),
  ADD CONSTRAINT `bill_ibfk_4` FOREIGN KEY (`bill_id_fk`) REFERENCES `bill_details` (`bill_id`);

--
-- Constraints for table `customer_tel`
--
ALTER TABLE `customer_tel`
  ADD CONSTRAINT `customer_tel_ibfk_1` FOREIGN KEY (`custNIC_fk`) REFERENCES `customer` (`cust_nic`);

--
-- Constraints for table `daily_report`
--
ALTER TABLE `daily_report`
  ADD CONSTRAINT `daily_report_ibfk_1` FOREIGN KEY (`item_id_fk`) REFERENCES `item_details2` (`item_id`),
  ADD CONSTRAINT `daily_report_ibfk_2` FOREIGN KEY (`report_id_fk`) REFERENCES `daily_report_details` (`report_id`);

--
-- Constraints for table `invoice`
--
ALTER TABLE `invoice`
  ADD CONSTRAINT `invoice_ibfk_1` FOREIGN KEY (`user_id_fk`) REFERENCES `user_details` (`user_id`),
  ADD CONSTRAINT `invoice_ibfk_2` FOREIGN KEY (`report_id_fk`) REFERENCES `daily_report_details` (`report_id`);

--
-- Constraints for table `item`
--
ALTER TABLE `item`
  ADD CONSTRAINT `item_ibfk_1` FOREIGN KEY (`user_id_fk`) REFERENCES `user_details` (`user_id`);

--
-- Constraints for table `item_details2`
--
ALTER TABLE `item_details2`
  ADD CONSTRAINT `item_details2_ibfk_1` FOREIGN KEY (`item_name_fk`) REFERENCES `item_primary_details2` (`item_name`);

--
-- Constraints for table `item_name`
--
ALTER TABLE `item_name`
  ADD CONSTRAINT `item_name_ibfk_1` FOREIGN KEY (`item_id_fk`) REFERENCES `item_details2` (`item_id`),
  ADD CONSTRAINT `item_name_ibfk_2` FOREIGN KEY (`item_name_fk`) REFERENCES `item_primary_details2` (`item_name`);

--
-- Constraints for table `item_owner_update`
--
ALTER TABLE `item_owner_update`
  ADD CONSTRAINT `item_owner_update_ibfk_1` FOREIGN KEY (`user_id_fk`) REFERENCES `user_details` (`user_id`),
  ADD CONSTRAINT `item_owner_update_ibfk_2` FOREIGN KEY (`item_id_fk`) REFERENCES `item_details2` (`item_id`);

--
-- Constraints for table `medical_suppliers_license`
--
ALTER TABLE `medical_suppliers_license`
  ADD CONSTRAINT `medical_suppliers_license_ibfk_1` FOREIGN KEY (`license_number_fk`) REFERENCES `medical_supplier_details` (`license_number`),
  ADD CONSTRAINT `medical_suppliers_license_ibfk_2` FOREIGN KEY (`sup_id_fk`) REFERENCES `supplier_details` (`sup_id`);

--
-- Constraints for table `medicine_details`
--
ALTER TABLE `medicine_details`
  ADD CONSTRAINT `medicine_details_ibfk_1` FOREIGN KEY (`item_name_fk`) REFERENCES `item_primary_details2` (`item_name`);

--
-- Constraints for table `medicine_name`
--
ALTER TABLE `medicine_name`
  ADD CONSTRAINT `medicine_name_ibfk_1` FOREIGN KEY (`item_id_fk`) REFERENCES `item_details` (`item_id`);

--
-- Constraints for table `medicine_name2`
--
ALTER TABLE `medicine_name2`
  ADD CONSTRAINT `medicine_name2_ibfk_1` FOREIGN KEY (`item_id_fk`) REFERENCES `item_details2` (`item_id`);

--
-- Constraints for table `medicine_x`
--
ALTER TABLE `medicine_x`
  ADD CONSTRAINT `medicine_x_ibfk_1` FOREIGN KEY (`item_id_fk`) REFERENCES `item_details` (`item_id`);

--
-- Constraints for table `medicine_x2`
--
ALTER TABLE `medicine_x2`
  ADD CONSTRAINT `medicine_x2_ibfk_1` FOREIGN KEY (`item_id_fk`) REFERENCES `item_details2` (`item_id`);

--
-- Constraints for table `medicine_y`
--
ALTER TABLE `medicine_y`
  ADD CONSTRAINT `medicine_y_ibfk_1` FOREIGN KEY (`item_id_fk`) REFERENCES `item_details` (`item_id`);

--
-- Constraints for table `medicine_y2`
--
ALTER TABLE `medicine_y2`
  ADD CONSTRAINT `medicine_y2_ibfk_1` FOREIGN KEY (`item_id_fk`) REFERENCES `item_details2` (`item_id`);

--
-- Constraints for table `supplier`
--
ALTER TABLE `supplier`
  ADD CONSTRAINT `supplier_ibfk_1` FOREIGN KEY (`invoice_id_fk`) REFERENCES `invoice_details` (`invoice_id`);

--
-- Constraints for table `supplier_invoice`
--
ALTER TABLE `supplier_invoice`
  ADD CONSTRAINT `supplier_invoice_ibfk_1` FOREIGN KEY (`sup_id_fk`) REFERENCES `supplier_details` (`sup_id`),
  ADD CONSTRAINT `supplier_invoice_ibfk_2` FOREIGN KEY (`invoice_id_fk`) REFERENCES `invoice_details` (`invoice_id`);

--
-- Constraints for table `supplier_tel`
--
ALTER TABLE `supplier_tel`
  ADD CONSTRAINT `supplier_tel_ibfk_1` FOREIGN KEY (`sup_id_fk`) REFERENCES `supplier_details` (`sup_id`);

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `user_ibfk_1` FOREIGN KEY (`report_id_fk`) REFERENCES `daily_report_details` (`report_id`),
  ADD CONSTRAINT `user_ibfk_2` FOREIGN KEY (`customer_nic_fk`) REFERENCES `customer` (`cust_nic`);

--
-- Constraints for table `user_daily_report`
--
ALTER TABLE `user_daily_report`
  ADD CONSTRAINT `user_daily_report_ibfk_1` FOREIGN KEY (`report_id_fk`) REFERENCES `daily_report_details` (`report_id`),
  ADD CONSTRAINT `user_daily_report_ibfk_2` FOREIGN KEY (`user_id_fk`) REFERENCES `user_details` (`user_id`);

--
-- Constraints for table `user_nic`
--
ALTER TABLE `user_nic`
  ADD CONSTRAINT `user_nic_ibfk_1` FOREIGN KEY (`user_id_fk`) REFERENCES `user_details` (`user_id`),
  ADD CONSTRAINT `user_nic_ibfk_2` FOREIGN KEY (`nic_fk`) REFERENCES `user_primary_details` (`nic`);

--
-- Constraints for table `user_tel`
--
ALTER TABLE `user_tel`
  ADD CONSTRAINT `user_tel_ibfk_1` FOREIGN KEY (`user_id_fk`) REFERENCES `user_details` (`user_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
