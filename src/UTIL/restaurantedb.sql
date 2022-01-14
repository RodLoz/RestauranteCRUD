-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 09, 2021 at 06:22 PM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `restaurantedb`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `cantReservas` (IN `fecha` DATE, IN `local` VARCHAR(25))  BEGIN 
SELECT COUNT(*) from reserva
WHERE reserva.fecha = fecha AND reserva.local = local;
END$$

CREATE DEFINER=`Admin`@`localhost` PROCEDURE `eliminarReserva` (IN `_idReserva` VARCHAR(25))  BEGIN
Delete from reserva where idReserva = _idReserva;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertarReserva` (IN `_local` VARCHAR(15), IN `_cantidadPersonas` INT, IN `_fecha` DATE, IN `_observacion` VARCHAR(255), IN `_idUser` VARCHAR(255))  BEGIN
  		INSERT INTO reserva (local, cantidadPersonas, fecha, observacion, idUser)
        VALUES (_local, _cantidadPersonas, _fecha, _observacion, _idUser);
  END$$

CREATE DEFINER=`Admin`@`localhost` PROCEDURE `insertarUsuario` (IN `idUser` VARCHAR(25), IN `idNombre` VARCHAR(25), IN `password` VARCHAR(25))  BEGIN
 SET FOREIGN_KEY_CHECKS=0;
 SELECT registro.idUser, registro.idNombre, registro.password from registro
 inner Join login ON registro.idNombre = login.idNombre;
 INSERT INTO login values (idUser, idNombre, password);
 END$$

CREATE DEFINER=`Admin`@`localhost` PROCEDURE `mostrarReservas` (IN `filtro` VARCHAR(25))  BEGIN
IF (filtro = "Listar Por Fecha") THEN
SELECT * from reserva 
ORDER BY reserva.fecha ASC;
ELSEIF (filtro = "Listar Por Local") THEN
SELECT * from reserva 
ORDER BY reserva.local ASC;
END IF;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `idUser` varchar(25) NOT NULL,
  `idNombre` varchar(255) DEFAULT NULL,
  `password` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`idUser`, `idNombre`, `password`) VALUES
('bri21', 'Brighit', '1234'),
('jerson12', 'Jerson', '1234'),
('juanL', 'juanm', '1234'),
('luisitoComunica', 'Luisito', '1234'),
('maria', 'Maria12', '1234'),
('pedrito', 'Pedro', '1234'),
('richi', 'Ricardo', '1234'),
('rodri', 'Rodrigo', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `registro`
--

CREATE TABLE `registro` (
  `idNombre` varchar(255) NOT NULL,
  `idUser` varchar(25) DEFAULT NULL,
  `telefono` int(11) NOT NULL,
  `correo` varchar(100) DEFAULT NULL,
  `password` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `registro`
--

INSERT INTO `registro` (`idNombre`, `idUser`, `telefono`, `correo`, `password`) VALUES
('Brighit', 'bri21', 938423422, 'brighit21@gmail.com', '1234'),
('Jerson', 'jerson12', 98273884, 'jerson@gmail.com', '1234'),
('juanm', 'juanL', 123441, 'juan@hotmail,com', '1234'),
('Luisito', 'luisitoComunica', 983742882, 'luisitoElPillo@hotmail.com', '1234'),
('Maria', 'maria12', 98234402, 'maria@hotmail.com', '1234'),
('Pedro', 'pedrito', 982367212, 'pedro@hotmail.com', '1234'),
('Ricardo', 'richi', 92843992, 'ricardo123@hotmail.com', '1234'),
('Rodrigo', 'rodri', 827323, 'rod@hotmail.com', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `reserva`
--

CREATE TABLE `reserva` (
  `idReserva` int(25) NOT NULL,
  `local` varchar(25) DEFAULT NULL,
  `cantidadPersonas` int(11) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `observacion` varchar(255) DEFAULT NULL,
  `idUser` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `reserva`
--

INSERT INTO `reserva` (`idReserva`, `local`, `cantidadPersonas`, `fecha`, `observacion`, `idUser`) VALUES
(21, 'SAN ISIDRO', 9, '2021-10-19', 'qweqweqwe', 'rodri'),
(50, 'SAN BORJA', 4, '2021-10-19', 'wqeqwe', NULL),
(51, 'SAN BORJA', 2, '2021-10-11', 'qweqwe', NULL),
(52, 'SAN BORJA', 2, '2021-10-20', 'qweqwe', NULL),
(53, 'LA MOLINA', 8, '2021-10-12', 'qweqe', NULL),
(54, 'LA MOLINA', 2, '2021-10-12', 'eqqwe', NULL),
(55, 'SAN BORJA', 5, '2021-10-21', 'holaaaa', NULL),
(85, 'LA MOLINA', 2, '2021-10-10', 'probando1', 'luisitoComunica'),
(86, 'LA MOLINA', 3, '2021-10-10', 'probando2', 'luisitoComunica'),
(87, 'LA MOLINA', 2, '2021-10-10', 'probando3', 'luisitoComunica'),
(88, 'LA MOLINA', 5, '2021-10-10', 'probando4', 'luisitoComunica'),
(89, 'LA MOLINA', 2, '2021-10-10', 'probando6', 'luisitoComunica'),
(90, 'LA MOLINA', 4, '2021-10-10', 'probando7', 'luisitoComunica'),
(91, 'LA MOLINA', 7, '2021-10-10', 'probando8', 'luisitoComunica'),
(92, 'LA MOLINA', 8, '2021-10-10', 'probando9', 'luisitoComunica'),
(93, 'LA MOLINA', 3, '2021-10-10', 'probando10', 'luisitoComunica'),
(94, 'LA MOLINA', 2, '2021-10-10', 'probando11', 'luisitoComunica'),
(95, 'SAN BORJA', 8, '2021-10-10', 'probando12', 'bri21'),
(96, 'SAN BORJA', 2, '2021-10-10', 'probando13', 'bri21'),
(97, 'SAN BORJA', 1, '2021-10-10', 'probando14', 'bri21'),
(98, 'SAN BORJA', 3, '2021-10-10', 'probando15', 'bri21'),
(99, 'SAN BORJA', 6, '2021-10-10', 'probando16', 'bri21'),
(100, 'SAN BORJA', 2, '2021-10-10', 'probando17', 'rodri'),
(101, 'SAN BORJA', 7, '2021-10-10', 'probando18', 'rodri'),
(102, 'SAN BORJA', 1, '2021-10-10', 'probando19', 'rodri'),
(103, 'SAN BORJA', 3, '2021-10-10', 'probando20', 'rodri'),
(104, 'SAN BORJA', 4, '2021-10-10', 'probando21', 'rodri'),
(105, 'SAN BORJA', 5, '2021-10-10', 'probando11', 'rodri'),
(106, 'SAN BORJA', 3, '2021-10-10', 'probando12', 'rodri'),
(107, 'SAN BORJA', 6, '2021-10-10', 'probando13', 'rodri'),
(108, 'SAN BORJA', 1, '2021-10-10', 'probando14', 'rodri'),
(109, 'SAN BORJA', 3, '2021-10-10', 'probando15', 'rodri'),
(110, 'SAN BORJA', 3, '2021-10-10', 'probando16', 'rodri'),
(111, 'SAN BORJA', 3, '2021-10-10', 'probando17', 'rodri'),
(112, 'SAN BORJA', 5, '2021-10-10', 'probando18', 'rodri'),
(113, 'SAN BORJA', 6, '2021-10-10', 'probando19', 'rodri');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`idUser`),
  ADD KEY `idNombre` (`idNombre`);

--
-- Indexes for table `registro`
--
ALTER TABLE `registro`
  ADD PRIMARY KEY (`idNombre`);

--
-- Indexes for table `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`idReserva`),
  ADD KEY `idUser` (`idUser`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `reserva`
--
ALTER TABLE `reserva`
  MODIFY `idReserva` int(25) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=115;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `login`
--
ALTER TABLE `login`
  ADD CONSTRAINT `login_ibfk_1` FOREIGN KEY (`idNombre`) REFERENCES `registro` (`idNombre`);

--
-- Constraints for table `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`idUser`) REFERENCES `login` (`idUser`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
