-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 25, 2015 at 06:30 PM
-- Server version: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `pointer`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `username` varchar(512) NOT NULL,
  `password` varchar(512) NOT NULL,
  `email` varchar(512) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`, `email`) VALUES
('admin', 'admin', 'admin@pointerschool.com'),
('udin', 'kosong', 'technoizer@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `bab`
--

CREATE TABLE IF NOT EXISTS `bab` (
`id_bab` int(11) NOT NULL,
  `id_kelas` int(11) NOT NULL,
  `id_mapel` int(11) NOT NULL,
  `nomor_bab` int(11) NOT NULL,
  `nama_bab` varchar(255) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Dumping data for table `bab`
--

INSERT INTO `bab` (`id_bab`, `id_kelas`, `id_mapel`, `nomor_bab`, `nama_bab`) VALUES
(1, 1, 1, 1, 'Penjumlahan'),
(2, 1, 1, 2, 'Pengurangan'),
(7, 11, 2, 1, 'Makhluk Hidup'),
(8, 2, 1, 1, 'Perkalian'),
(9, 2, 1, 2, 'Pembagian');

-- --------------------------------------------------------

--
-- Table structure for table `kelas`
--

CREATE TABLE IF NOT EXISTS `kelas` (
`id_kelas` int(11) NOT NULL,
  `nomor_kelas` int(11) NOT NULL,
  `nama_kelas` varchar(255) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12 ;

--
-- Dumping data for table `kelas`
--

INSERT INTO `kelas` (`id_kelas`, `nomor_kelas`, `nama_kelas`) VALUES
(1, 1, 'Sekolah Dasar'),
(2, 2, 'Sekolah Dasar'),
(7, 3, 'Sekolah Dasar'),
(8, 4, 'Sekolah Dasar'),
(11, 5, 'Sekolah Dasar');

-- --------------------------------------------------------

--
-- Table structure for table `log`
--

CREATE TABLE IF NOT EXISTS `log` (
`id_log` int(11) NOT NULL,
  `action` varchar(20) NOT NULL,
  `date` datetime NOT NULL,
  `username` varchar(512) NOT NULL,
  `id_materi` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `mapel`
--

CREATE TABLE IF NOT EXISTS `mapel` (
`id_mapel` int(11) NOT NULL,
  `nama_mapel` varchar(255) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `mapel`
--

INSERT INTO `mapel` (`id_mapel`, `nama_mapel`) VALUES
(1, 'Matematika'),
(2, 'Ilmu Pengetahuan Alam'),
(6, 'Ilmu Pengetahuan Sosial');

-- --------------------------------------------------------

--
-- Table structure for table `materi`
--

CREATE TABLE IF NOT EXISTS `materi` (
`id_materi` int(11) NOT NULL,
  `id_subbab` int(11) NOT NULL,
  `nomor_materi` int(11) NOT NULL,
  `id_file_materi` varchar(255) NOT NULL,
  `catatan_marei` text
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12 ;

--
-- Dumping data for table `materi`
--

INSERT INTO `materi` (`id_materi`, `id_subbab`, `nomor_materi`, `id_file_materi`, `catatan_marei`) VALUES
(10, 7, 1, 'upload/7/1.jpg', 'Diagram'),
(11, 7, 2, 'upload/7/11.jpg', '');

-- --------------------------------------------------------

--
-- Table structure for table `paket_soal`
--

CREATE TABLE IF NOT EXISTS `paket_soal` (
`id_paket_soal` int(11) NOT NULL,
  `id_bab` int(11) NOT NULL,
  `nomor_paket_soal` int(11) NOT NULL,
  `nama_paket_soal` varchar(255) NOT NULL,
  `level_soal` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `soal`
--

CREATE TABLE IF NOT EXISTS `soal` (
`id_soal` int(11) NOT NULL,
  `id_paket_soal` int(11) NOT NULL,
  `nomor_soal` int(11) NOT NULL,
  `id_file_soal` varchar(255) NOT NULL,
  `pilihan1` varchar(255) DEFAULT NULL,
  `pilihan2` varchar(255) DEFAULT NULL,
  `pilihan3` varchar(255) DEFAULT NULL,
  `pilihan4` varchar(255) DEFAULT NULL,
  `pilihan5` varchar(255) DEFAULT NULL,
  `kunci_soal` varchar(255) DEFAULT NULL,
  `pembahasan_soal` varchar(255) DEFAULT NULL,
  `catatan_soal` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `subbab`
--

CREATE TABLE IF NOT EXISTS `subbab` (
`id_subbab` int(11) NOT NULL,
  `id_bab` int(11) NOT NULL,
  `nomor_subbab` int(11) NOT NULL,
  `nama_subbab` varchar(255) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `subbab`
--

INSERT INTO `subbab` (`id_subbab`, `id_bab`, `nomor_subbab`, `nama_subbab`) VALUES
(1, 1, 1, 'Sifat Penjumlahan'),
(2, 7, 1, 'Hewan'),
(3, 7, 2, 'Tumbuhan'),
(6, 2, 1, 'Sifat Pengurangan'),
(7, 1, 2, 'Penjumlahan');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
 ADD PRIMARY KEY (`username`);

--
-- Indexes for table `bab`
--
ALTER TABLE `bab`
 ADD PRIMARY KEY (`id_bab`), ADD KEY `Relationship3` (`id_kelas`), ADD KEY `Relationship4` (`id_mapel`);

--
-- Indexes for table `kelas`
--
ALTER TABLE `kelas`
 ADD PRIMARY KEY (`id_kelas`);

--
-- Indexes for table `log`
--
ALTER TABLE `log`
 ADD PRIMARY KEY (`id_log`), ADD KEY `log_admin` (`username`), ADD KEY `log_materi` (`id_materi`);

--
-- Indexes for table `mapel`
--
ALTER TABLE `mapel`
 ADD PRIMARY KEY (`id_mapel`);

--
-- Indexes for table `materi`
--
ALTER TABLE `materi`
 ADD PRIMARY KEY (`id_materi`), ADD KEY `Relationship9` (`id_subbab`);

--
-- Indexes for table `paket_soal`
--
ALTER TABLE `paket_soal`
 ADD PRIMARY KEY (`id_paket_soal`), ADD KEY `Relationship8` (`id_bab`);

--
-- Indexes for table `soal`
--
ALTER TABLE `soal`
 ADD PRIMARY KEY (`id_soal`), ADD KEY `Relationship10` (`id_paket_soal`);

--
-- Indexes for table `subbab`
--
ALTER TABLE `subbab`
 ADD PRIMARY KEY (`id_subbab`), ADD KEY `Relationship6` (`id_bab`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bab`
--
ALTER TABLE `bab`
MODIFY `id_bab` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `kelas`
--
ALTER TABLE `kelas`
MODIFY `id_kelas` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `log`
--
ALTER TABLE `log`
MODIFY `id_log` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `mapel`
--
ALTER TABLE `mapel`
MODIFY `id_mapel` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `materi`
--
ALTER TABLE `materi`
MODIFY `id_materi` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `paket_soal`
--
ALTER TABLE `paket_soal`
MODIFY `id_paket_soal` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `soal`
--
ALTER TABLE `soal`
MODIFY `id_soal` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `subbab`
--
ALTER TABLE `subbab`
MODIFY `id_subbab` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `bab`
--
ALTER TABLE `bab`
ADD CONSTRAINT `Relationship3` FOREIGN KEY (`id_kelas`) REFERENCES `kelas` (`id_kelas`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `Relationship4` FOREIGN KEY (`id_mapel`) REFERENCES `mapel` (`id_mapel`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `log`
--
ALTER TABLE `log`
ADD CONSTRAINT `log_admin` FOREIGN KEY (`username`) REFERENCES `admin` (`username`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `log_ibfk_1` FOREIGN KEY (`id_materi`) REFERENCES `materi` (`id_materi`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `materi`
--
ALTER TABLE `materi`
ADD CONSTRAINT `Relationship9` FOREIGN KEY (`id_subbab`) REFERENCES `subbab` (`id_subbab`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `paket_soal`
--
ALTER TABLE `paket_soal`
ADD CONSTRAINT `Relationship8` FOREIGN KEY (`id_bab`) REFERENCES `bab` (`id_bab`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `soal`
--
ALTER TABLE `soal`
ADD CONSTRAINT `Relationship10` FOREIGN KEY (`id_paket_soal`) REFERENCES `paket_soal` (`id_paket_soal`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `subbab`
--
ALTER TABLE `subbab`
ADD CONSTRAINT `Relationship6` FOREIGN KEY (`id_bab`) REFERENCES `bab` (`id_bab`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
