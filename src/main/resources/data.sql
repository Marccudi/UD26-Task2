#create database UD26T2;
#use UD26T2;
drop table if exists asignado_a;
drop table if exists cientificos;
drop table if exists proyectos;

create table proyectos(
	id char(4),
    nombre varchar(255),
    horas int,
    primary key (id)
);

create table cientificos(
	dni varchar(8),
    nomapels varchar(255),
    primary key (dni)
);

create table asignado_a(
	id int auto_increment,
	cientifico varchar(8),
    proyecto char(4),
    primary key (id, cientifico, proyecto),
    foreign key (cientifico) references cientificos(dni),
    foreign key (proyecto) references proyectos(id)
);

insert into proyectos values('1','SIDA', 64);
insert into proyectos values('2','Sifilis', 14);

insert into cientificos values('48037986','Marc');
insert into cientificos values('36879548','Manolo');

insert into asignado_a(cientifico, proyecto) values('48037986', '1');
insert into asignado_a(cientifico, proyecto) values('36879548', '2');
