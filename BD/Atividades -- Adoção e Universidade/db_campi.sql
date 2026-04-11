create database db_campi;

use db_campi;


create table tb_campi(
	id		int primary key identity (1,1),
	nome		varchar(20),
	logradouro	varchar(10),
	rua		varchar(25),
	cidade		varchar(18),
	estado		varchar(15)
);

create table tb_curso(
	id		int primary key identity (1,1),
	nome	varchar(20),
	turno	varchar(16)
);


create table tb_aluno(
	id		int primary key identity (1,1),
	nome	varchar(20),
	cpf		varchar(15),
	telefone	varchar(15),
);

create table tb_disciplina(
	id		int primary key identity (1,1),
	nome	varchar(20),
	peridodo	varchar(10) 
);

create table tb_professor(
	id		int primary key identity (1,1),
	nome	varchar(20),
	formacao	varchar(30)
);

create table tb_turma(
	id		int primary key identity (1,1),
	nome	varchar(15),
	qtd_alunos	int,
	ano_formacao	datetime,
	numero_sala	int,
	id_curso	int foreign key references tb_curso(id),
	id_campi	int foreign key references tb_campi(id)
);

create table tb_matricula(
	id	int primary key identity(1,1),
	data_matricula	 datetime,
	id_aluno	int foreign key references tb_aluno(id),
	id_turma	int foreign key references tb_turma(id),
);

create table tb_atribuicao(
	id	int primary key identity(1,1),
	data_atribuicao		date,
	id_turma	int foreign key references tb_turma(id),
	id_disciplina	int foreign key references tb_disciplina(id),
	id_professor	int foreign key references tb_professor(id),
);