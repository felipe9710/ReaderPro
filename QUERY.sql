#use readerpro;


#Muestra los audiolibros y quien los escribio:

#SELECT audiolibros.id_audiolibro, audiolibros.titulo, autores.nombre_autor1, autores.apellido_autor1
#FROM audiolibros
#INNER JOIN autores ON audiolibros.id_audiolibro=autores.id_autor;


#Muestra los audiolibros con calificacion 5 y mas de 4000 reproducciones de la editorial Planeta:

#SELECT audiolibros.id_audiolibro, audiolibros.titulo, audiolibros.calificacion, audiolibros.reproducciones, editoriales.id_editorial, editoriales.nombre_editorial
#FROM audiolibros
#INNER JOIN editoriales ON audiolibros.id_editorialAF=editoriales.id_editorial
#WHERE  audiolibros.reproducciones > '4000' AND audiolibros.calificacion = '5' AND editoriales.nombre_editorial = "Planeta";


#Muestra los audiolibros en español de la editorial Norma del narrador id= 1 o 2:

#SELECT audiolibros.id_audiolibro, audiolibros.titulo, audiolibros.idioma, editoriales.id_editorial, editoriales.nombre_editorial, narradores.id_narrador, narradores.nombre_narrador1, narradores.apellido_narrado1
#FROM ((audiolibros
#INNER JOIN editoriales ON audiolibros.id_editorialAF=editoriales.id_editorial )
#INNER JOIN narradores ON  audiolibros.id_narradorAF=narradores.id_narrador)
#WHERE audiolibros.idioma = "Español" AND editoriales.nombre_editorial = "Norma" AND (narradores.id_narrador = '1' OR narradores.id_narrador = '2'); 