
-- Host: localhost
-- Generation Time: May 12, 2020 at 09:44 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.27

--
-- Database: `elibrary`
--

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `CALLNO` varchar(100) NOT NULL,
  `NAME` varchar(100) DEFAULT NULL,
  `AUTHOR` varchar(100) DEFAULT NULL,
  `PUBLISHER` varchar(100) DEFAULT NULL,
  `QUANTITY` int(100) DEFAULT NULL,
  `ISSUED` int(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`CALLNO`, `NAME`, `AUTHOR`, `PUBLISHER`, `QUANTITY`, `ISSUED`) VALUES
('123', 'qwe', 'qwe', 'qwe', 2, 1),
('1234', 'qwer', 'qwer', 'qwer', 2, 0),
('23456', 'sdfghj', 'wertyu', 'wertyu', 23, 1);

-- --------------------------------------------------------

--
-- Table structure for table `issuebook`
--

CREATE TABLE `issuebook` (
  `CALLNO` varchar(100) NOT NULL,
  `STUDENTID` varchar(100) NOT NULL,
  `STUDENTNAME` varchar(100) DEFAULT NULL,
  `STUDENTMOBILE` int(100) DEFAULT NULL,
  `ISSUEDDATE` date DEFAULT NULL,
  `RETURNSTATUS` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `issuebook`
--

INSERT INTO `issuebook` (`CALLNO`, `STUDENTID`, `STUDENTNAME`, `STUDENTMOBILE`, `ISSUEDDATE`, `RETURNSTATUS`) VALUES
('23456', 'sdfghj', 'sdfgh', 2345, '2020-05-07', 'no'),
('123', 'qwe', 'qwe', 123456, '2020-05-07', 'no'),
('1234', '12345', 'qwer', 123456, '2020-05-07', 'yes');

-- --------------------------------------------------------

--
-- Table structure for table `librarian`
--

CREATE TABLE `librarian` (
  `ID` int(100) NOT NULL,
  `NAME` varchar(100) DEFAULT NULL,
  `PASSWORD` varchar(100) DEFAULT NULL,
  `EMAIL` varchar(100) DEFAULT NULL,
  `MOBILE` int(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `librarian`
--

INSERT INTO `librarian` (`ID`, `NAME`, `PASSWORD`, `EMAIL`, `MOBILE`) VALUES
(1, 'sdfgh', 'dfghj', 'dfghj@dfghj.com', 23456),
(2, 'test', '123456', 'test@mail.com', 123456789),
(3, 'sago', '123456', 'sago@gmail.com', 123456789),
(4, 'test', '123456', 'test@gmail.com', 1234567),
(5, 'sdfgh', 'dfghj', 'dfghj@mail.com', 12345678),
(6, 'test', '123456', 'test@gmail.com', 12345678),
(7, 'qwerty', '123456', 'qwerty@mail.com', 12345678),
(8, 'sdfg', 'dfgh', 'asdfgh@fghj.com', 7854321);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`CALLNO`);

--
-- Indexes for table `librarian`
--
ALTER TABLE `librarian`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `librarian`
--
ALTER TABLE `librarian`
  MODIFY `ID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
