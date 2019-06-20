INSERT INTO carreras (carrera_id, carrera_nombre) VALUES (NULL, 'Dise�o de Software e Integracion de Sistemas');
INSERT INTO carreras (carrera_id, carrera_nombre) VALUES (NULL, 'Administraci�n de Redes y Comunicaci�n de datos');

INSERT INTO cursos (curso_id, curso_nombre) VALUES (NULL, 'Desarrollo de Aplicaciones Empresariales');
INSERT INTO cursos (curso_id, curso_nombre) VALUES (NULL, 'Estructura de Datos y Algoritmos');

INSERT INTO horarios (horario_id, hora_inicio, hora_fin) VALUES (NULL, '08:00:00', '10:00:00');
INSERT INTO horarios (horario_id, hora_inicio, hora_fin) VALUES (NULL, '09:00:00', '11:00:00');

INSERT INTO participantes (par_id, par_nombre, par_usuario, par_email, par_foto, par_celular, par_ciclo, carreras_carrera_id) VALUES (NULL, 'Alvaro Ma�uico', 'Alvaro98', 'alvaro.manuico@tecsup.edu.pe', 'alvaro.jpg', '972930579', 'IV', '2');
INSERT INTO participantes (par_id, par_nombre, par_usuario, par_email, par_foto, par_celular, par_ciclo, carreras_carrera_id) VALUES (NULL, 'Pamela Loyola', 'Pamelaa', 'pamela.loyola@tecsup.edu.pe', 'pamela.jpg', '948543049', 'IV', '2');
INSERT INTO participantes (par_id, par_nombre, par_usuario, par_email, par_foto, par_celular, par_ciclo, carreras_carrera_id) VALUES (NULL, 'Yenifer Santiago', 'Yeni', 'yenifer.santiago@tecsup.edu.pe', 'yenifer.jpg', '995532983', 'IV', '12');

INSERT INTO publicaciones (publicacion_id, pub_titulo, pub_descripcion, pub_etiqueta, pub_estado, pub_fecha , pub_tipo, cursos_curso_id, horarios_horario_id, participantes_par_id) VALUES (NULL, 'Ayuda con Spring', 'Realizar relacion de muchos a muchos ', 'spring, java', 'en curso', '2019-06-05', '1', '12', '2', '12');
INSERT INTO publicaciones (publicacion_id, pub_titulo, pub_descripcion, pub_etiqueta, pub_estado, pub_fecha , pub_tipo, cursos_curso_id, horarios_horario_id, participantes_par_id) VALUES (NULL, 'Ayuda con React', 'Registrar usuarios', 'react, python', 'en curso', '2019-06-09', '1', '2', '12', '22');

INSERT INTO asesorias (asesoria_id, participantes_par_id, publicaciones_id_publicacion) VALUES (NULL, '12', '2');
INSERT INTO asesorias (asesoria_id, participantes_par_id, publicaciones_id_publicacion) VALUES (NULL, '2', '2');