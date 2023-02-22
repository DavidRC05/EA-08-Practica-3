/*DROP SCHEMA techshop;
DROP USER usuario_prueba;*/

CREATE SCHEMA `practica`;

CREATE TABLE `practica`.`estado` (`id_estado` INT NOT NULL AUTO_INCREMENT, `nombre_estado` VARCHAR(30) NOT NULL, `nombre_capital` VARCHAR(50) NOT NULL,
`costas` VARCHAR(50) NULL, `poblacion` VARCHAR(15) NULL, PRIMARY KEY (`id_estado`))
ENGINE = innoDB;

INSERT INTO `practica`.`estado` (`nombre_estado`, `nombre_capital`, `costas`, `poblacion`)
	VALUES ('Costa Rica', 'San Jose', 'Si', '5,154 millones');
    
INSERT INTO `practica`.`estado` (`nombre_estado`, `nombre_capital`, `costas`, `poblacion`)
	VALUES ('Estados Unidos', 'Washington DC', 'Si', '331,9 millones');
    
INSERT INTO `practica`.`estado` (`nombre_estado`, `nombre_capital`, `costas`, `poblacion`)
	VALUES ('Argentina', 'Argentina', 'Si', '45,81 millones');
    
INSERT INTO `practica`.`estado` (`nombre_estado`, `nombre_capital`, `costas`, `poblacion`)
	VALUES ('España', 'Madrid', 'Si', '47,42 millones');

CREATE USER 'usuario_practica' @'%' IDENTIFIED BY 'la_Clave';

GRANT ALL PRIVILEGES ON techshop.* to 'usuario_practica';
flush privileges;