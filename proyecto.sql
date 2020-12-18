create database bodega;
use bodega;
create table login(
rut int not null primary key,
contraseña varchar(255) not null

);
create table activos(
 id int not null primary key,
 producto varchar(255) not null,
 descripcion varchar(255) not null,
 entrada date not null,
tiempostock int,
estatus varchar(255) not null
);
INSERT INTO activos values(1,'mouse','logitec 203L','2019-12-17','1','si');
INSERT INTO activos values(2,'computador','olidata pentium 4gb','2020-12-17','0','si');
INSERT INTO activos values(3,'teclado','spectra','2018-12-17','2','no');
INSERT INTO login values(206435453,'1234');
INSERT INTO login values(1,'admin');