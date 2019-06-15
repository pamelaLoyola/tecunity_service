package tecsup.edu.tecunity.services;

import java.util.List;

import tecsup.edu.tecunity.models.Publicacion;

public interface IPublicacionesService {

	List<Publicacion> findAll();

	Publicacion findById(Integer id);

    void save(Publicacion publicaciones);

    void delete(Publicacion publicaciones);
}
