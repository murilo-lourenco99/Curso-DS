create database db_crianca;

use db_crianca;

create table tb_sexo(
	id			int,
	descricao	varchar(9),
primary key (id)
);

insert into tb_sexo (id, descricao) values
(1, 'Masculino'),
(2, 'Feminino'),
(3, 'Outro');

create table tb_status(
	id			int,
	descricao	varchar(20),
primary key (id)
);

insert into tb_status (id, descricao) values
(1, 'Disponivel'),
(2, 'Indisponivel'),
(3, 'Aguardando adoção'),
(4, 'Adotado');


create table tb_observacao(
	id			int,
	descricao	varchar(60),
primary key (id)
);

insert into tb_observacao (id, descricao) values
(1, 'Criança com necessidades especiais'),
(2, 'Criança com problemas de saúde'),
(3, 'Criança com dificuldades de aprendizado'),
(4, 'Criança com problemas familiares'),
(5, 'Criança com problemas emocionais');


create table tb_laudo(
	id			int,
	descricao	varchar(60),
primary key (id)
);

insert into tb_laudo (id, descricao) values
(1, 'Laudo médico'),
(2, 'Laudo psicológico'),
(3, 'Laudo social'),
(4, 'Laudo de avaliação'),
(5, 'Laudo de acompanhamento');



create table tb_historico(
	id				int,
	id_observacao	int,
primary key (id),
foreign key (id_observacao) references tb_observacao(id)
);

insert into tb_historico (id, id_observacao) values
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5);


create table tb_genitor(
	id			int,
	nome		varchar(30),
	cpf			varchar(11),
	telefone	varchar(9),
	id_sexo		int,
primary key (id),
foreign key (id_sexo) references tb_sexo(id)
);

insert into tb_genitor (id, nome, cpf, telefone, sexo) values
(1, 'João Silva', '12345678901', '999999999', 1),
(2, 'Maria Souza', '23456789012', '888888888', 2),
(3, 'Pedro Oliveira', '34567890123', '777777777', 1),
(4, 'Ana Carolina', '45678901234', '666666666', 2),
(5, 'Carlos Alberto', '56789012345', '555555555', 1);


create table tb_padrinho(
	id			int,
	nome		varchar(30),
	cpf			varchar(11),
	telefone	varchar(9),
	sexo		int,
primary key (id),
foreign key (sexo) references tb_sexo(id)
);

insert into tb_padrinho (id, nome, cpf, telefone, sexo) values
(1, 'Luiz Fernando', '67890123456', '444444444', 1),
(2, 'Ana Luiza', '78901234567', '333333333', 2),
(3, 'Carlos Henrique', '89012345678', '222222222', 1),
(4, 'Maria Eduarda', '90123456789', '111111111', 2),
(5, 'Pedro Augusto', '01234567890', '000000000', 1);


create table tb_prontuario(
	id			int,
	id_laudo	int,
primary key (id),
foreign key (id_laudo) references tb_laudo(id)
);

insert into tb_prontuario (id, id_laudo) values
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5);



create table tb_crianca(
	id				int,
	nome			varchar(30),
	dt_nascimento	date,
	id_status		int,
	id_sexo			int,
	id_historico	int,
	id_prontuario	int,
primary key (id),
foreign key (id_status) references tb_status(id),
foreign key (id_sexo) references tb_sexo(id),
foreign key (id_historico) references tb_historico(id),
foreign key (id_prontuario) references tb_prontuario(id)
);

insert into tb_crianca (id, nome, dt_nascimento, id_status, id_sexo, id_historico, id_prontuario) values
(1, 'Pedro Henrique', '2010-01-01', 1, 1, 1, 1),
(2, 'Luana Gabriela', '2012-02-02', 2, 2, 2, 2),
(3, 'Gabriel Lucas', '2015-03-03', 3, 1, 3, 3),
(4, 'Beatriz Sofia', '2018-04-04', 4, 2, 4, 4),
(5, 'Mateus Vinicius', '2020-05-05', 5, 1, 5, 5);


create table tb_filiacao(
	id			int,
	id_crianca	int,
	id_genitor	int,
primary key (id),
foreign key (id_crianca) references tb_crianca(id),
foreign key (id_genitor) references tb_genitor(id)
);

insert into tb_filiacao (id, id_crianca, id_genitor) values
(1, 1, 1),
(2, 2, 2),
(3, 3, 3),
(4, 4, 4),
(5, 5, 5);



create table tb_apadrinhamento(
	id			int,
	id_crianca	int,
	id_padrinho	int,
primary key (id),
foreign key (id_crianca) references tb_crianca(id),
foreign key (id_padrinho) references tb_padrinho(id)
);

insert into tb_apadrinhamento (id, id_crianca, id_padrinho) values
(1, 1, 1),
(2, 2, 2),
(3, 3, 3),
(4, 4, 4),
(5, 5, 5);