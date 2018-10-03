drop database if exists colegio;
create database colegio;
use colegio;


drop table if exists cursos;
create table  cursos(
codigo int not null,
nombre varchar (25) not null,
primary key(codigo)
);

drop table if exists profesores;
create table  profesores(
id int not null,
nombres varchar (30) not null,
apellidos varchar (30) not null,
correo_electronico varchar(50) not null,
primary key (id)
);

drop table if exists materias;
create table  materias(
codigo int not null,
semestre varchar(10) not null,
nombre varchar (50) not null,
curso_adscrita int not null,
profesor_asignado int not null,
primary key(codigo),
foreign key (curso_adscrita) references cursos(codigo),
foreign key (profesor_asignado) references profesores(id)
);

drop table if exists alumnos;
create table  alumnos(
id int not null,
nombres varchar (30) not null,
apellidos varchar (30) not null,
correo_electronico varchar(50) not null,
curso_matriculado int not null,
primary key (id),
foreign key (curso_matriculado) references cursos(codigo)
);



/* CURSOS */
INSERT INTO CURSOS VALUES (012345, 'Contabilidad');

/* PROFESORES */
INSERT INTO PROFESORES VALUES (986532, 'Juan Felipe', 'Calderón Ramírez', 'jf.calderon@example.com');

/* MATERIAS */
INSERT INTO MATERIAS VALUES (255486, '2018-2', 'Introducción a la economía', 012345, 986532);

/* ALUMNOS */
INSERT INTO ALUMNOS VALUES (1102835284, 'Luis Enrique', 'Velásquez Gómez', 'luis.velasquezg@myemail.com', 012345);
