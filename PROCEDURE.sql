CREATE DEFINER=`root`@`localhost` PROCEDURE `autoresx`(
in _id_autor varchar(11),
in _nombre_autor1 varchar(6),
in _nombre_autor2 varchar(6),
in _apellido_autor1 varchar(6),
in _apellido_autor2 varchar(6),
in _fecha_nacimiento_Autor datetime(6),
in _id_PaisAF varchar(11),
in accion varchar(40)
)
BEGIN
case accion
when 'nuevo' then
insert into autores(nombre_autor1, nombre_autor2, apellido_autor1, apellido_autor2, fecha_nacimiento_Autor, id_PaisAF)
values (_nombre_autor1, _nombre_autor2, _apellido_autor1, _apellido_autor2, _fecha_nacimiento_Autor,_id_PaisAF);
 
when 'editar' then
update autores set
nombre_autor1=_nombre_autor1, nombre_autor2=_nombre_autor2, apellido_autor1=_apellido_autor1, apellido_autor2=_apellido_autor2, fecha_nacimiento_Autor=_fecha_nacimiento_Autor, id_PaisAF=_id_PaisAF
where id_autor=_id_autor;

when 'eliminar' then 
delete from autores where id_autor=_id_autor;

when 'consultar' then
select * from usuarios where id_autor=_id_autor;

end case;
END