-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-04-2020 a las 20:12:38
-- Versión del servidor: 10.4.10-MariaDB
-- Versión de PHP: 7.1.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `lauulu`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `curso`
--

CREATE TABLE `curso` (
  `ID` int(11) NOT NULL,
  `NombreCurso` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `curso`
--

INSERT INTO `curso` (`ID`, `NombreCurso`) VALUES
(1, 'Administrador'),
(2, 'Desarrollo de Aplicaciones Multiplataforma'),
(3, 'Desarrollo Aplicaciones Mutiplataforma Dual'),
(4, 'Animacion 3D, Juegos y Entornos Interactivos'),
(5, 'Master en Animacion 3D'),
(6, 'Master Composicion Digital VFX'),
(7, 'Experto en Diseño de Personajes'),
(8, 'Master en Riggimg Y Character FX'),
(9, 'Master en Programacion de Videojuegos'),
(10, 'Master en Data Science y Big Date'),
(11, 'Experto en Business Analytics');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresa`
--

CREATE TABLE `empresa` (
  `ID` int(11) NOT NULL,
  `NombreEmpresa` varchar(45) DEFAULT NULL,
  `Descripcion` varchar(45) DEFAULT NULL,
  `Valoracion` varchar(45) DEFAULT NULL,
  `Localidad` varchar(45) DEFAULT NULL,
  `Direccion` varchar(45) DEFAULT NULL,
  `Disponibilidad` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `telf` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `empresa`
--

INSERT INTO `empresa` (`ID`, `NombreEmpresa`, `Descripcion`, `Valoracion`, `Localidad`, `Direccion`, `Disponibilidad`, `email`, `telf`) VALUES
(1, 'TechnologiesCore', 'Empresa centrada en Hardware', '4.2', 'Madrid', 'C.supervivencia N.6', 'L - V', 'TechnologiesCore@gmail.com', '687542369'),
(2, 'Optimus Desgin', 'Empresa de Diseño Digital ', '3.7', ' Alcalá de Henares', 'Av de Somorrostro', 'L - V', 'OptimusDesgin@gmail.com', '654785214'),
(3, 'TechDoc', 'Tecnologia Avanzada en  la palma de tu mano', '4.1', ' Alcalá de Henares', 'Av de León N 21', 'L - V', 'TechDoc@gmail.com', '632547825'),
(4, 'eyeDesign', 'Creación de personajes digitales avanzados', '4.4', 'Arroyomolinos', 'Av de las Eras N 14', 'L - V', 'eyeDesign@gmail.com', '62456321'),
(5, 'Data Create Data', 'Manejo de administraccion de informacion', '4.3', 'Arroyomolinos', 'Av del Atlántico N 7', 'L - V', 'DataCreateData@yahoo.es', '69854214'),
(6, 'Modelandoando', 'Modelar sera tu hobby favorito', '4.5', 'Majadahonda', 'Av de la Oliva N 7', 'L-V', 'Modelandoando@emp.com', '65489213'),
(7, 'DigitalCare', 'Seguridad en milésimas de segundo', '4.6', 'Rivas', 'Av de la Técnica N 3', 'L - V', 'DigitalCare@gmaial.com', '69542318'),
(8, 'CiberTouch', 'Prioriza las prioridades', '4.8', 'Torrejón de Ardoz‎ ', 'Av de la Luna N 7 ', 'L - V', 'CiberTouch@tech.com', '67425168'),
(9, 'Didiseign', 'Rediseña los diseños', '3.5', 'Torrejón de Ardoz‎ ', 'Av de las Fronteras N15', 'L - V', 'Didiseign@gmail.com', '698721453'),
(10, 'Programando.INC', 'Programa para las mejores empresas', '3.6', 'San Fernando de Henares', 'Av de la Constitución N 34', 'L - V', 'Programando.INC@programming.com', '687213548');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `roles`
--

CREATE TABLE `roles` (
  `ID` int(11) NOT NULL,
  `NombreRol` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `roles`
--

INSERT INTO `roles` (`ID`, `NombreRol`) VALUES
(1, 'Administrador'),
(2, 'Director'),
(3, 'Profesor'),
(4, 'Alumno');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `users`
--

CREATE TABLE `users` (
  `USR` varchar(45) NOT NULL,
  `PWD` varchar(45) DEFAULT NULL,
  `Nombre` varchar(45) DEFAULT NULL,
  `Apellido1` varchar(45) DEFAULT NULL,
  `Apellido2` varchar(45) DEFAULT NULL,
  `DNI` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `telf` varchar(45) DEFAULT NULL,
  `centroEstudios` varchar(45) DEFAULT NULL,
  `Roles_ID` int(11) NOT NULL,
  `Curso_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `users`
--

INSERT INTO `users` (`USR`, `PWD`, `Nombre`, `Apellido1`, `Apellido2`, `DNI`, `email`, `telf`, `centroEstudios`, `Roles_ID`, `Curso_ID`) VALUES
('Admin', 'Passw0rd', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, 1),
('JoseDirec', 'jose6488135', 'Jose', 'Perez', 'Conde', '02649856P', 'Jose.hekp@gmail.com', '62541467', 'utad', 2, 9),
('Luis', 'luisjhse345', 'Luis', 'Sanz', 'Alonso', '02144587E', 'LuisProfe@gmail.com', '684452174', 'utad', 3, 7),
('Alfonso21', 'alfSept72', 'Alfonso', 'Martin', 'Gomez', '0416898M', 'Alfonso21@gmail.com', '658742365', 'Logos', 4, 5),
('Andreajm', 'andreita1390', 'Andrea', 'Jimenez', 'Martín', '024697432M', 'Andreajm@gmail.com', '645241874', 'Logos', 4, 7),
('AndresIs', 'calisseparatodos', 'Andres', 'Iniesta', 'singol', '125896541M', 'AndresIs@gmail.com', '68755236', 'utad', 4, 3),
('Juanph', 'juanito345', 'Juan', 'Montoya', 'Jazmin', '1587456M', 'Juanph@gmail.com', '69542185', 'Zola', 4, 8),
('Maria34', 'mery2749', 'Maria', 'Ramos', 'Gil', '05648793S', 'Maria34@gmail.com.com', '65848412', 'Logos', 4, 5),
('michirapper', 'Passw0rd', 'Miguel Angel', 'Garre', 'Acebes', 'XXXXX', 'magarreacebes@gmail.com', 'XXXXXXXXXXX', 'U-TAD', 4, 2),
('Paula65', 'pauli849', 'Paula', 'Moliner', 'Sandrei', '0468266P', 'Paulams@gmail.com', '65884234', 'utad', 4, 11),
('SebastianPL', 'sebas47202JP', 'Sebastian', 'Perez', 'Lima', '54698725J', 'SebastianPL@yahoo.com', '65874235', 'Zola', 4, 10),
('SergioSN', 'asdffghjklñ', 'Sergio', 'Sanz', 'Nuñez', '0214587P', 'SergioSN@gmail.com', '654754235', 'utad', 4, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `users_has_empresa`
--

CREATE TABLE `users_has_empresa` (
  `Users_Roles_ID` int(11) NOT NULL,
  `Users_USR` varchar(45) NOT NULL,
  `Empresa_ID` int(11) NOT NULL,
  `Notas` varchar(300) DEFAULT NULL,
  `Comentarios` varchar(300) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `users_has_empresa`
--

INSERT INTO `users_has_empresa` (`Users_Roles_ID`, `Users_USR`, `Empresa_ID`, `Notas`, `Comentarios`) VALUES
(4, 'Alfonso21', 10, NULL, 'Muy cuidadoso'),
(4, 'Andreajm', 2, NULL, 'Se esfuerza bastante y siempre crea diseños bastante profesionales'),
(4, 'Andreajm', 3, NULL, 'Todo perfecto.'),
(4, 'AndresIs', 3, NULL, 'Cumple con las actividades adecuadamente y progresa correctamente'),
(4, 'Juanph', 5, NULL, 'Cumple con las actividades adecuadamente'),
(4, 'Maria34', 6, 'Todo bastante bien', 'Necesita llegar con antelación'),
(4, 'Maria34', 9, NULL, 'La alumna debería poner  mas intereses en sus actividades'),
(4, 'michirapper', 10, NULL, 'Cumple con las actividades adecuadamente'),
(4, 'Paula65', 5, 'Os adjunto el curriculum: ', 'Progresa adecuadamente, trabaja con bastante fluidez'),
(4, 'SebastianPL', 1, 'Tiene complicaciones para desplazarse', 'Últimamente siempre llega tarde');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `curso`
--
ALTER TABLE `curso`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `empresa`
--
ALTER TABLE `empresa`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`Roles_ID`,`USR`,`Curso_ID`),
  ADD KEY `fk_Users_Roles1_idx` (`Roles_ID`),
  ADD KEY `fk_Users_Curso1_idx` (`Curso_ID`);

--
-- Indices de la tabla `users_has_empresa`
--
ALTER TABLE `users_has_empresa`
  ADD PRIMARY KEY (`Users_Roles_ID`,`Users_USR`,`Empresa_ID`),
  ADD KEY `fk_Users_has_Empresa_Empresa1_idx` (`Empresa_ID`),
  ADD KEY `fk_Users_has_Empresa_Users1_idx` (`Users_Roles_ID`,`Users_USR`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `curso`
--
ALTER TABLE `curso`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `empresa`
--
ALTER TABLE `empresa`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `roles`
--
ALTER TABLE `roles`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `users`
--
ALTER TABLE `users`
  ADD CONSTRAINT `fk_Users_Curso1` FOREIGN KEY (`Curso_ID`) REFERENCES `curso` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Users_Roles1` FOREIGN KEY (`Roles_ID`) REFERENCES `roles` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `users_has_empresa`
--
ALTER TABLE `users_has_empresa`
  ADD CONSTRAINT `fk_Users_has_Empresa_Empresa1` FOREIGN KEY (`Empresa_ID`) REFERENCES `empresa` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Users_has_Empresa_Users1` FOREIGN KEY (`Users_Roles_ID`,`Users_USR`) REFERENCES `users` (`Roles_ID`, `USR`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
