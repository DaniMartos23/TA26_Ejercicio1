
DROP table IF EXISTS proveedores;

create table proveedores(
	id char(4),
	nombre varchar(100),
	primary key (id)
);

DROP table IF EXISTS piezas;

create table piezas(
	codigo int auto_increment,
	nombre varchar(100)
	primary key (codigo)
);

DROP table IF EXISTS suministra;

create table suministra(
	id int auto_increment,
	codigopieza int,
	idproveedor char(4),
	precio int,
	primary key (id),
	foreign key(codigopieza) references piezas(codigo),
	foreign key(idproveedor) references proveedores(id)
);

insert into proveedores (id,nombre)values('JO','Jose');
insert into proveedores (id,nombre)values('DA','Dani');
insert into proveedores (id,nombre)values('PO','Pol');



insert into piezas (nombre )values('Placa Base');
insert into piezas (nombre)values('Fuente Alimentacion');
insert into piezas (nombre)values('Memoria Ram');

insert into suministra (codigopieza,idproveedor, precio)values(3,'JO',50);
insert into suministra (codigopieza,idproveedor, precio)values(2,'DA',60);
insert into suministra (codigopieza,idproveedor, precio)values(1,'PO',70);
