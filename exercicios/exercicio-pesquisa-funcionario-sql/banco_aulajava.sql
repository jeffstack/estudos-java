-- Jefferson Nascimento dos Santos
create database aulajava;
go
use aulajava;
go

create table cargos (
    cd_cargo int not null primary key,
    ds_cargo char(20) not null
);
go

create table funcionarios (
    cd_func int not null primary key,
    nome_func char(30) not null,
    sal_func money not null,
    cd_cargo int not null,
    constraint fk_funcionarios_cargos foreign key (cd_cargo) references cargos(cd_cargo)
);
go

insert into cargos values (1, 'Administrativo');
insert into cargos values (2, 'Financeiro');
insert into cargos values (3, 'Tecnologia');
go

insert into funcionarios values (1, 'Marcelo', 2000.00, 1);
insert into funcionarios values (2, 'Ana', 2500.00, 2);
insert into funcionarios values (3, 'Carlos', 3000.00, 3);
insert into funcionarios values (4, 'Mariana', 2800.00, 1);
go
