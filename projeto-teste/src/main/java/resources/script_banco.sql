DROP DATABASE IF EXISTS projeto_teste;

CREATE SCHEMA IF NOT EXISTS ´projeto_teste´;

USE projeto_teste;

CREATE TABLE IF NOT EXISTS `pessoa` (
  `id_pessoa` INT NOT NULL,
  `primeiro_nome` VARCHAR(45) NOT NULL, 
  `idade` INT NOT NULL,
  PRIMARY KEY (`id_pessoa`)
);