select * from cliente;
select * from produto;
select * from venda;

create table cliente (
	id bigint not null,
	nome varchar(50) not null,
	idade integer not null,
	constraint pk_id_cliente primary key(id)
);

create table produto (
	id bigint not null,
	nome varchar(50) not null,
	valor integer not null,
	constraint pk_id_produto primary key(id)
);

create table venda (
	id bigint not null,
	id_cli bigint not null,
	id_prod bigint not null,
	constraint pk_id_venda primary key(id),
	constraint fk_id_cliente foreign key(id_cli) references cliente(id),
	constraint fk_id_produto foreign key(id_prod) references produto(id)
);

create sequence sq_cli
start 1
increment 1
owned by cliente.id;

create sequence sq_prod
start 1
increment 1
owned by produto.id;

create sequence sq_venda
start 1
increment 1
owned by venda.id;

insert into cliente (id,nome,idade) values(nextval('sq_cli'),'Daniel', '29');
insert into cliente (id,nome,idade) values(nextval('sq_cli'),'Aline', '23');
insert into cliente (id,nome,idade) values(nextval('sq_cli'),'Felipe', '36');

insert into produto (id,nome,valor) values(nextval('sq_prod'),'Pendrive', '35');
insert into produto (id,nome,valor) values(nextval('sq_prod'),'Mouse', '20');
insert into produto (id,nome,valor) values(nextval('sq_prod'),'Teclado', '30');

insert into venda (id,id_cli,id_prod) values(nextval('sq_venda'),'1','1');
insert into venda (id,id_cli,id_prod) values(nextval('sq_venda'),'2','2');
insert into venda (id,id_cli,id_prod) values(nextval('sq_venda'),'3','3');

select * 
from cliente c, produto p ,venda v
where v.id=c.id;

select c.nome, p.nome
from cliente c, produto p
where c.id = p.id;

select c.nome as nome_cliente, p.nome as nome_produto
from cliente as c, produto as p
where c.id = p.id;

select c.nome as nome_cliente, v.id as id_venda
from cliente as c
inner join venda as v on c.id=v.id;