package tecsup.edu.tecunity.service;

import java.util.List;

import tecsup.edu.tecunity.model.Publicaciones;

public interface IPublicacionesService {

	List<Publicaciones> findAll();

	Publicaciones findById(Integer id);

    void save(Publicaciones publicaciones);

    void delete(Publicaciones publicaciones);
}
