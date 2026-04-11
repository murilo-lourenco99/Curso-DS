use dbEstoque

insert into tb_cliente (nome, cpf, email, sexo, data_nasci)
values ('Armando José Santana', '12345678900', 'armandojsantana@outlook.com', 'm', '1961-02-21'),
       ('Sheila Carvalho Leal', '4567899823', 'scarvalho@ig.com.br', 'f', '1978-09-13'),
       ('Carlos Henrique Souza', '76598278299', 'chenrique@ig.com.br', 'm', '1981-09-08'),
       ('Maria Aparecida Souza', '87365309899', 'mapdasouza@outlook.com', 'f', '1962-07-07'),
       ('Adriana Nogueira Silva', '76345309388', 'drica1977@ig.com.br', 'f', '1977-04-09'),
       ('Paulo Henrique Silva', '87390123111', 'phsilva80@hotmail.com', 'm', '1987-02-02');

insert into tb_fabricante (nome)
values ('Unilever'),
       ('P&G'),
       ('Bunge');

insert into tb_fornecedor (nome, contato)
values ('Atacadão', 'Carlos Santos'),
       ('Assai', 'Maria Stella'),
       ('Roldão', 'Paulo César');


insert into tb_venda (dataVenda, valorTotal, idCliente)
values ('2014-02-01', 4500.00, 1),
       ('2014-03-02', 3400.00, 1),
       ('2014-02-10', 2100.00, 2),
       ('2014-02-15', 2700.00, 3),
       ('2014-03-17', 560.00, 3),
       ('2014-04-09', 1200.00, 4),
       ('2014-05-07', 3500.00, 5),
       ('2014-05-07', 3400.00, 1),
       ('2014-05-05', 4000.00, 2);


insert into tb_produto (descricao, valor, quantidade, idFabricante, idFornecedor)
values ('Amaciante Downy', 5.76, 1500, 2, 1),
       ('Amaciante Comfort',5.45, 2300, 1, 1),
       ('Sabão em Pó OMO', 5.99, 1280, 1, 2),
       ('Margarina Qually', 4.76, 2500, 3, 1),
       ('Salsicha Hot Dog Sadia', 6.78, 2900, 3, 2),
       ('Mortadela Perdigão', 2.50, 1200, 3,3),
       ('Hamburguer Sadia', 9.89, 1600, 3,1),
       ('Fralda Pampers', 36.00, 340, 2,3),
       ('Xampu Seda', 5.89, 800, 1,2),
       ('Condicionador Seda', 6.50, 700, 1,3);


insert into tb_itensVenda (idVenda, idProduto, quantidade, subTotal_itensVenda)
values (1,1,200,1500.00),
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
 -- 3 fabricantes: Malwee, Marisol e Cia da Malha

insert into tb_fabricante (nome)
values ('Malwee'),
       ('Marisol'),
       ('Cia da Malha');


select *
from tb_fabricante;

-- Cadastrar 2 vendedores

insert into tb_fornecedor (nome, contato)
values ('Cinemark', 'João Santana'),
       ('Baianinho', 'Raquel Torres');
select * from tb_fornecedor;

-- Cadastrar 3 produtos para cada fabricante

insert into tb_produto (descricao, valor, quantidade, idFabricante, idFornecedor)
values ('Espada de bronze',2700.91,3,4,4),
       ('Tapiocá',5.90,90,5,5),
       ('Playstation 2',100.91,10,6,4);

select * from tb_produto;

-- Cadastrar 5 clientes

insert into tb_cliente (nome, cpf, email, sexo, data_nasci)
values ('Polnareff','12345678901','polnareff@gmail.com','m','1995-07-25'),
       ('Doppio','98765432109','doppio@gmail.com','m','1982-03-12'),
       ('Hornet','45678901234','ediro@gmail.com','f','2001-01-01'),
       ('Markiplier','32109876543','marquinhos@gmail.com','m','1976-09-18'),
       ('Jimmy','78901234567','jimmy@gmail.com','m','1990-05-30');
select * from tb_cliente;

/* Cadastrar 1 venda para cada cliente, sendo que cada venda terá 2
itens de venda. */
insert into tb_venda (dataVenda, valorTotal, idCliente)
values ('2015-01-15', 12.00, 7),
       ('2015-06-20', 900.00, 8),
       ('2015-03-08', 400.50, 9),
       ('2015-11-25', 1500.00, 10),
       ('2015-09-12', 5450.00, 11);


insert into tb_itensVenda (idVenda, idProduto, quantidade, subTotal_itensVenda)
values (12, 11, 9, 100.00),
       (13, 12, 290, 1700.00),
       (8, 11, 1200, 1100.00),
       (11, 13, 200, 1500.00),
       (12, 12, 500, 900.00),
       (2, 11, 1100, 1550.00);

-- CONSULTAS UPDATE E DELETE:

 -- Alterar o nome do fabricante Cia da Malha para Turma da Malha
update tb_fabricante
set nome = 'Turma da Malha'
where nome = 'Cia da Malha';

/* Alterar o valor das vendas do cliente de código 1, concedendo ao
mesmo 10% de desconto */
update tb_venda
set valorTotal = (valorTotal * 0.90)
where idCliente = 1;

-- Aumentar em 20% o preço dos produtos do fabricante de código 2
update tb_produto
set valor = (valor * 1.20)
where idFabricante = 2;

-- Diminuir a quantidade 10 do produto de código 3 do estoque
update tb_produto
set quantidade = quantidade - 10
where id = 3;

-- Remover o segundo item de venda da venda de código 2
select *
from tb_itensVenda
where idVenda = 2;

delete
from tb_itensVenda
where id = 4;

-- Remover todos os itens da venda código 3
delete
from tb_itensVenda
where idVenda = 3;


/* Remover o fabricante de código 1. Você conseguiu? O que
aconteceu?
 -- Não dá para remover o fabricante código 1 pois ele é referenciado na tabela tb_produto.
*/

 -- CONSULTAS INNER JOIN:

 -- a) Listar as descrições dos produtos ao lado do nome dos fabricantes;
select descricao 'Descrição', nome 'Fabricante' from tb_produto
	inner join tb_fabricante on tb_produto.idFabricante = tb_fabricante.id;

-- b) Listar as descrições dos produtos ao lado do nome dos fornecedores;

select descricao 'Descrição',
                 nome 'Fornecedor'
from tb_produto
inner join tb_fornecedor on tb_produto.idFornecedor = tb_fornecedor.id;

-- c) Listar a soma das quantidades dos produtos agrupadas pelo nome do fabricante;

select nome 'Fabricante',
            sum(quantidade) 'Soma da quantidade'
from tb_produto
inner join tb_fabricante on tb_produto.idFabricante = tb_fabricante.id
group by nome
order by [Soma da quantidade] desc;

-- d) Listar o total das vendas ao lado do nome do cliente;

select nome 'Nome',
            valorTotal 'Total vendas'
from tb_cliente
inner join tb_venda on tb_cliente.id = tb_venda.idCliente
order by [Total vendas] desc;

-- e) Listar a média dos preços dos produtos agrupados pelo nome do fornecedor;

select nome 'Fornecedor',
            avg(valor) 'Media dos preços'
from tb_produto
inner join tb_fornecedor on tb_produto.idFornecedor = tb_fornecedor.id
group by nome
order by [Media dos preços] desc;

-- f) Listar a soma das vendas agrupadas pelo nome do cliente em ordem alfabética;

select nome 'Cliente',
            sum(valorTotal) 'Soma das vendas'
from tb_venda
inner join tb_cliente on tb_venda.idCliente = tb_cliente.id
group by nome
order by nome asc;

-- g) Listar a soma dos preços dos produtos agrupados pelo nome do fabricante;

select nome 'Fabricante',
            sum(valor) 'Soma dos preços'
from tb_produto
inner join tb_fabricante on tb_produto.idFabricante = tb_fabricante.id
group by nome
order by [Soma dos preços] desc;

-- h) Listar a média dos preços dos produtos agrupados pelo nome do fornecedor (Repetido)

select nome 'Fornecedor',
            avg(valor) 'Media dos preços'
from tb_produto
inner join tb_fornecedor on tb_produto.idFornecedor = tb_fornecedor.id
group by nome
order by [Media dos preços] desc;

-- i) Listar a soma das vendas agrupadas pelo nome do produto (CORRIGIDO)

select descricao 'Produto',
                 sum(subTotal_itensVenda) 'Soma das vendas'
from tb_itensVenda
inner join tb_produto on tb_itensVenda.idProduto = tb_produto.id
group by descricao
order by [Soma das vendas] desc;

-- j) Listar a soma das vendas pelo nome do cliente somente das vendas realizadas em fevereiro de 2014

select nome 'Cliente',
            sum(valorTotal) 'Soma das vendas'
from tb_venda
inner join tb_cliente on tb_venda.idCliente = tb_cliente.id
where datepart(year, tb_venda.dataVenda) = 2014
  and datepart(month, tb_venda.dataVenda) = 2
group by nome
order by nome asc;