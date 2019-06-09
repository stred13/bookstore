-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 09, 2019 at 08:14 PM
-- Server version: 10.1.39-MariaDB
-- PHP Version: 7.3.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bookstore`
--

-- --------------------------------------------------------

--
-- Table structure for table `chitiethoadon`
--

CREATE TABLE `chitiethoadon` (
  `MaCTHD` int(5) NOT NULL,
  `MaHD` int(5) NOT NULL,
  `MaSach` int(5) NOT NULL,
  `SoLuong` int(5) NOT NULL,
  `DonGia` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `chitietphieunhap`
--

CREATE TABLE `chitietphieunhap` (
  `MaCTNH` int(5) NOT NULL,
  `MaPN` int(5) NOT NULL,
  `MaSach` int(5) NOT NULL,
  `GiaNhap` int(10) NOT NULL,
  `SoLuong` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `chitietphieunhap`
--

INSERT INTO `chitietphieunhap` (`MaCTNH`, `MaPN`, `MaSach`, `GiaNhap`, `SoLuong`) VALUES
(1, 1, 1, 250000, 15),
(2, 1, 2, 250000, 15),
(3, 1, 3, 13000, 23),
(4, 1, 3, 10000, 2);

-- --------------------------------------------------------

--
-- Table structure for table `hoadonbansach`
--

CREATE TABLE `hoadonbansach` (
  `MaHD` int(5) NOT NULL,
  `NgayLap` date NOT NULL,
  `MaNhanVien` int(5) NOT NULL,
  `MaKH` int(5) NOT NULL,
  `TongTien` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `khachhang`
--

CREATE TABLE `khachhang` (
  `MaKH` int(5) NOT NULL,
  `TenKH` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `GioiTinh` int(2) NOT NULL,
  `NamSinh` int(4) NOT NULL,
  `DiaChi` varchar(280) COLLATE utf8_unicode_ci NOT NULL,
  `SDT` char(11) COLLATE utf8_unicode_ci NOT NULL,
  `Email` char(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `khachhang`
--

INSERT INTO `khachhang` (`MaKH`, `TenKH`, `GioiTinh`, `NamSinh`, `DiaChi`, `SDT`, `Email`) VALUES
(1, 'Doanh', 0, 0, '123 tam hà', '1111111111', 'doanh@gmail.com'),
(2, 'TIến', 0, 0, '56 Gia Kiệm', '094545215', 'tien@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MaNV` int(5) NOT NULL,
  `TenNV` varchar(100) CHARACTER SET utf32 COLLATE utf32_unicode_ci NOT NULL,
  `Sdt` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `taikhoan` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `matkhau` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `gioitinh` smallint(6) DEFAULT '1',
  `ngaysinh` date DEFAULT NULL,
  `diachi` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `nhanvien`
--

INSERT INTO `nhanvien` (`MaNV`, `TenNV`, `Sdt`, `email`, `taikhoan`, `matkhau`, `gioitinh`, `ngaysinh`, `diachi`) VALUES
(1, 'test1', NULL, 'test1@gmail.com', 'test1', 'test1', 1, NULL, NULL),
(3, 'admin', '', 'admin@gmail.com', 'admin', 'admin', 1, NULL, ''),
(4, '123123', '1231231231', 'asd@asd.com', 'asdasda', '[C@326cacad', 1, '2019-06-09', '123123');

-- --------------------------------------------------------

--
-- Table structure for table `phieunhap`
--

CREATE TABLE `phieunhap` (
  `MaPN` int(5) NOT NULL,
  `NgayNhap` date NOT NULL,
  `MaNV` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `phieunhap`
--

INSERT INTO `phieunhap` (`MaPN`, `NgayNhap`, `MaNV`) VALUES
(1, '2019-05-09', 1);

-- --------------------------------------------------------

--
-- Table structure for table `sach`
--

CREATE TABLE `sach` (
  `MaSach` int(5) NOT NULL,
  `TenSach` varchar(280) COLLATE utf8_unicode_ci NOT NULL,
  `TacGia` varchar(280) COLLATE utf8_unicode_ci NOT NULL,
  `TheLoai` int(5) NOT NULL,
  `GiaBan` int(10) DEFAULT NULL,
  `MoTa` text COLLATE utf8_unicode_ci,
  `SoLuong` int(5) NOT NULL,
  `Xoa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `sach`
--

INSERT INTO `sach` (`MaSach`, `TenSach`, `TacGia`, `TheLoai`, `GiaBan`, `MoTa`, `SoLuong`, `Xoa`) VALUES
(1, 'sachdoanh', 'Doanh Tr?n', 1, 0, NULL, 15, 0),
(2, 'java', 'doanhtran', 1, 0, NULL, 0, 1),
(3, 'java', 'doanhtran', 2, 12000, 'ádadasd', 10, 0),
(4, 'Tình chị em', 'Hoàng', 2, 20000, 'tình cảm chị em', 0, 0),
(5, 'yêu lại từ đầu', 'Khắc Việt', 1, 20000, '', 0, 0),
(6, '123123', '213123', 1, 20000, '213123', 0, 0),
(7, '21321', '23123', 1, 20000, '21312312', 0, 0),
(8, 'sdsdfs', 'sdfsdfds', 1, 20000, 'sdfsdfsd', 0, 0),
(9, 'xzczxc', 'xcxzczx', 1, 20000, 'cxzczxc', 0, 0),
(10, 'xdfg', 'dfgdfg', 1, 20000, 'fdgdfgd', 0, 0),
(11, 'asdas', 'asdasa', 1, 20000, 'sdasdasdas', 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `theloai`
--

CREATE TABLE `theloai` (
  `MaTL` int(5) NOT NULL,
  `TenTL` varchar(100) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `theloai`
--

INSERT INTO `theloai` (`MaTL`, `TenTL`) VALUES
(1, 'Trinh Thám'),
(2, 'Tình Cảm');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chitiethoadon`
--
ALTER TABLE `chitiethoadon`
  ADD PRIMARY KEY (`MaCTHD`),
  ADD KEY `MaSach` (`MaSach`);

--
-- Indexes for table `chitietphieunhap`
--
ALTER TABLE `chitietphieunhap`
  ADD PRIMARY KEY (`MaCTNH`);

--
-- Indexes for table `hoadonbansach`
--
ALTER TABLE `hoadonbansach`
  ADD PRIMARY KEY (`MaHD`);

--
-- Indexes for table `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`MaKH`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MaNV`);

--
-- Indexes for table `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD PRIMARY KEY (`MaPN`),
  ADD KEY `MaPN` (`MaPN`);

--
-- Indexes for table `sach`
--
ALTER TABLE `sach`
  ADD PRIMARY KEY (`MaSach`),
  ADD KEY `MaSach_2` (`MaSach`);

--
-- Indexes for table `theloai`
--
ALTER TABLE `theloai`
  ADD PRIMARY KEY (`MaTL`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `chitiethoadon`
--
ALTER TABLE `chitiethoadon`
  MODIFY `MaCTHD` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `chitietphieunhap`
--
ALTER TABLE `chitietphieunhap`
  MODIFY `MaCTNH` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `hoadonbansach`
--
ALTER TABLE `hoadonbansach`
  MODIFY `MaHD` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `khachhang`
--
ALTER TABLE `khachhang`
  MODIFY `MaKH` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `nhanvien`
--
ALTER TABLE `nhanvien`
  MODIFY `MaNV` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `phieunhap`
--
ALTER TABLE `phieunhap`
  MODIFY `MaPN` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `sach`
--
ALTER TABLE `sach`
  MODIFY `MaSach` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `theloai`
--
ALTER TABLE `theloai`
  MODIFY `MaTL` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
