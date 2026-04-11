create database dbEstoque
go

use dbEstoque

create table tb_cliente(
	id			int identity(1,1),
	nome		varchar(30),
	cpf			varchar(13),
	email		varchar(35),
	sexo		varchar(1),
	data_nasci	date,
primary key (id)
);


create table tb_fabricante(
	id		int identity(1,1),
	nome	varchar(30),
primary key (id)
);


create table tb_fornecedor(
	id			int identity(1,1),
	nome		varchar(30),
	contato		varchar(20),
primary key (id)
);

create table tb_venda(
	id			int identity(1,1),
	dataVenda	date,
	valorTotal	money,
	idCliente	int,
primary key (id),
foreign key (idCliente) references tb_cliente (id)
);



create table tb_produto(
	id			int identity(1,1),
	descricao	varchar(30),
	valor		money,
	quantidade	int,
	idFabricante	int,
	idFornecedor	int,
primary key (id),
foreign key (idFabricante) references tb_fabricante (id),
foreign key (idFornecedor) references tb_fornecedor (id)
);


create table tb_itensVenda(
	id			int identity(1,1),
	idVenda		int,
	idProduto	int,
	quantidade	int,
	subTotal_itensVenda	int,
primary key (id),
foreign key (idVenda) references tb_venda (id),
foreign key (idProduto) references tb_produto (id)
);

