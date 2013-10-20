CREATE DATABASE puzzle;

USE puzzle;



CREATE TABLE IF NOT EXISTS usuario (

	id int(10) unsigned NOT NULL AUTO_INCREMENT,
	
	nome varchar(200) NOT NULL,
	
	data_do_jogo date NOT NULL,
	
	horario varchar(400) NOT NULL, 
	
	duracao_do_jogo varchar(30) NOT NULL,
	
	PRIMARY KEY (id)

) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1;



insert into usuario (id,nome,data_do_jogo,horario,duracao_do_jogo) values (1,'Anderson',CURDATE(),CURTIME(),'3:34');

insert into usuario (id,nome,data_do_jogo,horario,duracao_do_jogo) values (2,'Anderson',CURDATE(),CURTIME(),'13:34');



drop table usuario;


delete from usuario where id = 1;


select * from usuario;