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

insert into tb_fornecedor (nome, contato) values
('Atacadão', 'Carlos Santos'),
('Assai', 'Maria Stella'),
('Roldão', 'Paulo César');

insert into tb_venda (dataVenda, valorTotal, idCliente) values
('2014-02-01', '4500.00', 1),
('2014-03-02', '3400.00', 1),
('2014-02-10', '2100.00', 2),
('2014-02-15', '2700.00', 3),
('2014-03-17', '560.00', 3),
('2014-04-09', '1200.00', 4),
('2014-05-07', '3500.00', 5),
('2014-05-07', '3400.00', 1),
('2014-05-05', '4000.00', 2);