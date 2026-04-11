use dbEstoque

insert into tb_cliente (nome, cpf, email, sexo, data_nasci) values
('Armando José Santana', '12345678900', 'armandojsantana@outlook.com', 'm', '1961-02-21'),
('Sheila Carvalho Leal', '4567899823', 'scarvalho@ig.com.br', 'f', '1978-09-13'),
('Carlos Henrique Souza', '76598278299', 'chenrique@ig.com.br', 'm', '1981-09-08'),
('Maria Aparecida Souza', '87365309899', 'mapdasouza@outlook.com', 'f', '1962-07-07'),
('Adriana Nogueira Silva', '76345309388', 'drica1977@ig.com.br', 'f', '1977-04-09'),
('Paulo Henrique Silva', '87390123111', 'phsilva80@hotmail.com', 'm', '1987-02-02');

insert into tb_fabricante (nome) values
	('Unilever'),
	('P&G'),
	('Bunge');
	select distinct (nome) from tb_fabricante;

insert into tb_fornecedor (nome, contato) values
('Atacadão', 'Carlos Santos'),
('Assai', 'Maria Stella'),
('Roldão', 'Paulo César');

insert into tb_venda (dataVenda, valorTotal, idCliente) values
('2014-02-01', 4500.00, 1),
('2014-03-02', 3400.00, 1),
('2014-02-10', 2100.00, 2),
('2014-02-15', 2700.00, 3),
('2014-03-17', 560.00, 3),
('2014-04-09', 1200.00, 4),
('2014-05-07', 3500.00, 5),
('2014-05-07', 3400.00, 1),
('2014-05-05', 4000.00, 2);


insert into tb_produto (descricao,valor,quantidade,idFabricante,idFornecedor) values
('Amaciante Downy', 5.76, 1500, 2, 1),
('Amaciante Comfort',5.45, 2300, 1, 1),
('Sabão em Pó OMO', 5.99, 1280, 1, 2),
('Margarina Qually', 4.76, 2500, 3, 1),
('Salsicha Hot Dog Sadia', 6.78, 2900, 3, 2),
('Mortadela Perdigão', 2.50, 1200, 3,3),
('Hamburguer Sadia', 9.89, 1600, 3,1),
('Fralda Pampers', 36.00, 340, 2,3),
('Xampu Seda', 5.89, 800, 1,2),
('Condicionador Seda', 6.50, 700, 1,3);

insert into tb_itensVenda (idVenda, idProduto, quantidade, subTotal_itensVenda) values
(1,1,200,1500.00),
(1,2,300,3000.00),
(2,4,120,1400.00),
(2,2,200,1000.00),
(2,3,130,1000.00),
(3,5,200,2100.00),
(4,4,120,1000.00),
(4,5,450,700.00),
(5,5,200,560.00),
(6,7,200,600.00),
(6,6,300,600.00);


-- Inserção de dados

insert into tb_fabricante (nome) values
	('Malwee'),
	('Marisol'),
	('Cia da malha');
	select * from tb_fabricante

insert tb_produto (descricao, valor, quantidade, idFabricante, idFornecedor) values
	('Espada de bronze',2700.91,3,4,4),
	('Tapiocá',5.90,90,5,5),
	('Playstation 2',100.91,10,6,4);
	select * from tb_produto;
	
insert into tb_cliente (nome, cpf, email, sexo, data_nasci) values
	('Polnareff','12345678901','polnareff@gmail.com','m','1995-07-25'),
	('Doppio','98765432109','doppio@gmail.com','m','1982-03-12'),
	('Hornet','45678901234','ediro@gmail.com','f','2001-01-01'),
	('Markiplier','32109876543','marquinhos@gmail.com','m','1976-09-18'),
	('Jimmy','78901234567','jimmy@gmail.com','m','1990-05-30');
	select * from tb_cliente;

insert into tb_fornecedor (nome, contato) values
	('Cinemark', 'João Santana'),
	('Baianinho', 'Raquel Torres');
	select * from tb_fornecedor;

insert into tb_venda (dataVenda, valorTotal, idCliente) values
	('2015-01-15', 12.00, 7),
	('2015-06-20', 900.00, 8),
	('2015-03-08', 400.50, 9),
	('2015-11-25', 1500.00, 10),
	('2015-09-12', 5450.00, 11);
	select * from tb_venda;


insert into tb_itensVenda (idVenda, idProduto, quantidade, subTotal_itensVenda) values
	(12,11,9,100.00),
	(13,12,290,1700.00),
	(14,11,1200,1100.00),
	(15,13,200,1500.00),
	(16,12,500,900.00),
	(17,11,1100,1550.00);
	select * from tb_itensVenda;


-- Consultas UPDATE	e UPDATE

update tb_fabricante set nome = 'Turma da Malha'
	where nome = 'Cia da Malha';
	select nome from tb_fabricante;
 