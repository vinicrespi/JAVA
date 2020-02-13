# HeidiSQL Dump 
#
# --------------------------------------------------------
# Host:                 127.0.0.1
# Database:             carros
# Server version:       5.0.45-community-nt
# Server OS:            Win32
# Target-Compatibility: MySQL 4.0
# Extended INSERTs:     Y
# max_allowed_packet:   1048576
# HeidiSQL version:     3.0 Revision: 572
# --------------------------------------------------------

/*!40100 SET CHARACTER SET latin1*/;


#
# Database structure for database 'carros'
#

CREATE DATABASE `carros` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `carros`;


#
# Table structure for table 'automoveis'
#

CREATE TABLE `automoveis` (
  `aut_placa` varchar(10) NOT NULL,
  `Modelos_mod_cod` int(10) unsigned NOT NULL,
  `aut_ano` int(10) unsigned default NULL,
  `aut_preco` decimal(10,0) default NULL,
  `aut_cor` varchar(255) default NULL,
  `aut_combustivel` varchar(255) default NULL,
  `aut_km` decimal(10,0) default NULL,
  `aut_arcondicionado` int(10) unsigned default NULL,
  `aut_vidroeletrico` int(10) unsigned default NULL,
  `aut_airbag` int(10) unsigned default NULL,
  `aut_travaeletrica` int(10) unsigned default NULL,
  `aut_alarme` int(10) unsigned default NULL,
  `aut_desembacador` int(10) unsigned default NULL,
  `aut_rodaliga` int(10) unsigned default NULL,
  `aut_volantehidraulico` int(10) unsigned default NULL,
  `aut_arquente` int(10) unsigned default NULL,
  `aut_abs` int(10) unsigned default NULL,
  `aut_cambioaut` int(10) unsigned default NULL,
  `aut_cdplayer` int(10) unsigned default NULL,
  `aut_isufilm` int(10) unsigned default NULL,
  `aut_limpadortraseiro` int(10) unsigned default NULL,
  `aut_outros` varchar(255) default NULL,
  `aut_vendido` int(10) unsigned default NULL,
  PRIMARY KEY  (`aut_placa`),
  KEY `Automoveis_FKIndex1` (`Modelos_mod_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



#
# Dumping data for table 'automoveis'
#

/*!40000 ALTER TABLE `automoveis` DISABLE KEYS*/;
LOCK TABLES `automoveis` WRITE;
INSERT INTO `automoveis` (`aut_placa`, `Modelos_mod_cod`, `aut_ano`, `aut_preco`, `aut_cor`, `aut_combustivel`, `aut_km`, `aut_arcondicionado`, `aut_vidroeletrico`, `aut_airbag`, `aut_travaeletrica`, `aut_alarme`, `aut_desembacador`, `aut_rodaliga`, `aut_volantehidraulico`, `aut_arquente`, `aut_abs`, `aut_cambioaut`, `aut_cdplayer`, `aut_isufilm`, `aut_limpadortraseiro`, `aut_outros`, `aut_vendido`) VALUES ('ABC1234','2','2001','54000','Prata','Flex','0','1','1','1','1','1','0','0','1','0','0','0','0','0','0','Nada','0'),
	('ABC9090','4','2009','100000','Amarelo','Flex','120000','1','0','1','0','1','0','1','0','1','0','1','0','1','0','C4','0'),
	('MEA1100','1','1999','26000','Cinza','GNV/Gasolina','100000','1','1','1','1','0','1','1','1','1','0','1','1','0','1','Sem itens.','0'),
	('ZXC3456','3','2009','1000','Preto','Flex','0','1','1','1','1','1','1','1','1','0','0','0','0','0','0','ZXC','1');
UNLOCK TABLES;
/*!40000 ALTER TABLE `automoveis` ENABLE KEYS*/;


#
# Table structure for table 'clientes'
#

CREATE TABLE `clientes` (
  `cli_cod` int(10) unsigned NOT NULL auto_increment,
  `cli_nome` varchar(255) default NULL,
  `cli_end` varchar(255) default NULL,
  `cli_bairro` varchar(255) default NULL,
  `cli_cidade` varchar(255) default NULL,
  `cli_cep` varchar(255) default NULL,
  `cli_uf` varchar(255) default NULL,
  `cli_fone` varchar(255) default NULL,
  `cli_email` varchar(255) default NULL,
  `cli_datanasc` date default NULL,
  `cli_sexo` char(1) default NULL,
  PRIMARY KEY  (`cli_cod`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;



#
# Dumping data for table 'clientes'
#

/*!40000 ALTER TABLE `clientes` DISABLE KEYS*/;
LOCK TABLES `clientes` WRITE;
INSERT INTO `clientes` (`cli_cod`, `cli_nome`, `cli_end`, `cli_bairro`, `cli_cidade`, `cli_cep`, `cli_uf`, `cli_fone`, `cli_email`, `cli_datanasc`, `cli_sexo`) VALUES ('2','Cliente 123','Rua Marques de Olinda','Anita Garibaldi','Joinville','89234-098','SC','98-98989898','cliente@empresa.com.br','2009-01-01','M'),
	('3','José da Silva','Rua Central, 345','Enseada','São Francisco do Sul','89240-000','RJ','21-09097878','jose@dasilva.com.br','1956-09-20','M');
UNLOCK TABLES;
/*!40000 ALTER TABLE `clientes` ENABLE KEYS*/;


#
# Table structure for table 'funcionarios'
#

CREATE TABLE `funcionarios` (
  `func_cod` int(10) unsigned NOT NULL auto_increment,
  `func_nome` varchar(255) default NULL,
  `func_end` varchar(255) default NULL,
  `func_bairro` varchar(255) default NULL,
  `func_cidade` varchar(255) default NULL,
  `func_cep` varchar(255) default NULL,
  `func_uf` varchar(255) default NULL,
  `func_fone` varchar(255) default NULL,
  `func_email` varchar(255) default NULL,
  `func_datanasc` date default NULL,
  `func_sexo` varchar(1) default NULL,
  PRIMARY KEY  (`func_cod`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;



#
# Dumping data for table 'funcionarios'
#

/*!40000 ALTER TABLE `funcionarios` DISABLE KEYS*/;
LOCK TABLES `funcionarios` WRITE;
INSERT INTO `funcionarios` (`func_cod`, `func_nome`, `func_end`, `func_bairro`, `func_cidade`, `func_cep`, `func_uf`, `func_fone`, `func_email`, `func_datanasc`, `func_sexo`) VALUES ('2','Funcionario 12','Rua Principal 1','Centro','Joinville','89230-999','ES','11-23455432','funcionario@empresa.com.br','1977-03-23','M'),
	('3','Indianara Gonçalves','Rua das Palmeiras, 1000','Boa Vista','Joinville','34876-121','SC','12-09090909','indianara@gonçalves.com.br','1985-01-26','F');
UNLOCK TABLES;
/*!40000 ALTER TABLE `funcionarios` ENABLE KEYS*/;


#
# Table structure for table 'marcas'
#

CREATE TABLE `marcas` (
  `marca_cod` int(10) unsigned NOT NULL auto_increment,
  `marca_desc` varchar(255) default NULL,
  PRIMARY KEY  (`marca_cod`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;



#
# Dumping data for table 'marcas'
#

/*!40000 ALTER TABLE `marcas` DISABLE KEYS*/;
LOCK TABLES `marcas` WRITE;
INSERT INTO `marcas` (`marca_cod`, `marca_desc`) VALUES ('1','Volkswagem'),
	('2','Fiat'),
	('3','Ford'),
	('4','Chevrolet'),
	('5','Citroen'),
	('6','Renault'),
	('7','Peugeot'),
	('8','Mitsubishi'),
	('9','Honda'),
	('10','Toyota');
UNLOCK TABLES;
/*!40000 ALTER TABLE `marcas` ENABLE KEYS*/;


#
# Table structure for table 'modelos'
#

CREATE TABLE `modelos` (
  `mod_cod` int(10) unsigned NOT NULL auto_increment,
  `Marca_marca_cod` int(10) unsigned NOT NULL,
  `mod_desc` varchar(255) default NULL,
  PRIMARY KEY  (`mod_cod`),
  KEY `Modelos_FKIndex1` (`Marca_marca_cod`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;



#
# Dumping data for table 'modelos'
#

/*!40000 ALTER TABLE `modelos` DISABLE KEYS*/;
LOCK TABLES `modelos` WRITE;
INSERT INTO `modelos` (`mod_cod`, `Marca_marca_cod`, `mod_desc`) VALUES ('1','7','Megane Scenic'),
	('2','5','Gol'),
	('3','6','Palio'),
	('4','7','C4'),
	('5','1','Fusca'),
	('6','1','Polo'),
	('7','1','Golf'),
	('8','2','Strada'),
	('9','2','Tempra'),
	('10','6','Sandero'),
	('11','7','206'),
	('12','7','307'),
	('13','8','Eclipse'),
	('14','9','Fit'),
	('15','10','Corolla');
UNLOCK TABLES;
/*!40000 ALTER TABLE `modelos` ENABLE KEYS*/;


#
# Table structure for table 'operacao'
#

CREATE TABLE `operacao` (
  `opr_cod` int(10) unsigned NOT NULL auto_increment,
  `Clientes_cli_cod` int(10) unsigned NOT NULL,
  `Funcionarios_func_cod` int(10) unsigned NOT NULL,
  `Automoveis_aut_placa` varchar(10) NOT NULL,
  `opr_data` date default NULL,
  `opr_hora` time default NULL,
  `opr_tipo` varchar(255) default NULL,
  PRIMARY KEY  (`opr_cod`),
  KEY `Operacao_FKIndex1` (`Automoveis_aut_placa`),
  KEY `Operacao_FKIndex2` (`Funcionarios_func_cod`),
  KEY `Operacao_FKIndex3` (`Clientes_cli_cod`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;



#
# Dumping data for table 'operacao'
#

/*!40000 ALTER TABLE `operacao` DISABLE KEYS*/;
LOCK TABLES `operacao` WRITE;
INSERT INTO `operacao` (`opr_cod`, `Clientes_cli_cod`, `Funcionarios_func_cod`, `Automoveis_aut_placa`, `opr_data`, `opr_hora`, `opr_tipo`) VALUES ('1','2','3','ABC1234','2009-08-06','11:39:17','Compra'),
	('2','3','3','ZXC3456','2009-08-06','11:37:26','Venda'),
	('3','3','2','ABC9090','2009-08-06','11:36:27','Compra'),
	('4','3','3','MEA1100','2009-08-06','11:38:50','Compra');
UNLOCK TABLES;
/*!40000 ALTER TABLE `operacao` ENABLE KEYS*/;
