-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-05-2022 a las 16:00:00
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hospital`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `idcategoria` int(11) NOT NULL,
  `nombrecategoria` varchar(45) DEFAULT NULL,
  `descripcion` longtext DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`idcategoria`, `nombrecategoria`, `descripcion`) VALUES
(1, 'Adulto', 'Personas mayores de edad.'),
(2, 'Joven', 'Persona menor de edad.'),
(3, 'Personal medico', 'Para personas que hacen parte del personal medico.'),
(4, 'Adulto mayor', 'Adultos con edad avanzada.');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dosis`
--

CREATE TABLE `dosis` (
  `iddosis` int(11) NOT NULL,
  `fechaprimeradosis` date DEFAULT NULL,
  `numerodosis` int(11) DEFAULT NULL,
  `usuario_cedula` varchar(11) NOT NULL,
  `funcionario_cedula` varchar(11) NOT NULL,
  `vacuna_idvacuna` int(11) NOT NULL,
  `categoria_idcategoria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `funcionario`
--

CREATE TABLE `funcionario` (
  `cedula` varchar(11) NOT NULL,
  `nombres` varchar(45) DEFAULT NULL,
  `apellidos` varchar(45) DEFAULT NULL,
  `edad` varchar(45) DEFAULT NULL,
  `vacuna` varchar(45) DEFAULT NULL,
  `categoria` varchar(45) DEFAULT NULL,
  `cargo` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `funcionario`
--

INSERT INTO `funcionario` (`cedula`, `nombres`, `apellidos`, `edad`, `vacuna`, `categoria`, `cargo`) VALUES
('1065599588', 'Kristina Dallana', 'Salina Garcia', '24', 'Pfizer', 'Adulto', 'Auxiliar de enfermeria'),
('1065789321', 'Gustavo Francisco', 'Baute', '41', 'Sinovac', 'Adulto', 'Auxiliar de enfermeria'),
('66677877', 'Robert', 'Plant', '48', 'Moderna', 'Adulto', 'Epidemiólogo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `cedula` varchar(11) NOT NULL,
  `nombres` varchar(45) DEFAULT NULL,
  `apellidos` varchar(45) DEFAULT NULL,
  `edad` varchar(45) DEFAULT NULL,
  `vacuna` varchar(45) DEFAULT NULL,
  `categoria` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`cedula`, `nombres`, `apellidos`, `edad`, `vacuna`, `categoria`) VALUES
('1065577599', 'Kristina', 'Salina', '25', 'Astrazeneca', 'Adulto'),
('1065660077', 'Erick', 'Riaño', '28', 'Pfizer', 'Adulto'),
('777', 'Jimmy', 'Page', '50', 'Pfizer', 'Adulto'),
('778912', 'Alan', 'Riaño', '17', 'Moderna', 'Joven'),
('789546', 'Claudia', 'Hoyos', '41', 'Astrazeneca', 'Adulto');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vacuna`
--

CREATE TABLE `vacuna` (
  `idvacuna` int(11) NOT NULL,
  `nombrevacuna` varchar(45) DEFAULT NULL,
  `lote` varchar(45) DEFAULT NULL,
  `fechavencimiento` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `vacuna`
--

INSERT INTO `vacuna` (`idvacuna`, `nombrevacuna`, `lote`, `fechavencimiento`) VALUES
(1, 'Pfizer', '01', '2022-05-01'),
(2, 'Moderna', '02', '2022-05-02'),
(3, 'Astrazeneca', '03', '2022-05-03'),
(4, 'Sinovac', '04', '2022-05-04'),
(5, 'Janssen', '05', '2022-05-05');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`idcategoria`);

--
-- Indices de la tabla `dosis`
--
ALTER TABLE `dosis`
  ADD PRIMARY KEY (`iddosis`),
  ADD KEY `fk_dosis_usuario_idx` (`usuario_cedula`),
  ADD KEY `fk_dosis_funcionario1_idx` (`funcionario_cedula`),
  ADD KEY `fk_dosis_vacuna1_idx` (`vacuna_idvacuna`),
  ADD KEY `fk_dosis_categoria1_idx` (`categoria_idcategoria`);

--
-- Indices de la tabla `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`cedula`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`cedula`);

--
-- Indices de la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD PRIMARY KEY (`idvacuna`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `dosis`
--
ALTER TABLE `dosis`
  ADD CONSTRAINT `fk_dosis_categoria1` FOREIGN KEY (`categoria_idcategoria`) REFERENCES `categoria` (`idcategoria`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_dosis_funcionario1` FOREIGN KEY (`funcionario_cedula`) REFERENCES `funcionario` (`cedula`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_dosis_usuario` FOREIGN KEY (`usuario_cedula`) REFERENCES `usuario` (`cedula`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_dosis_vacuna1` FOREIGN KEY (`vacuna_idvacuna`) REFERENCES `vacuna` (`idvacuna`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
