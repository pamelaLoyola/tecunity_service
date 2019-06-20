package tecsup.edu.tecunity.services;

import java.util.List;

import tecsup.edu.tecunity.models.Asesoria;

public interface IAsesoriasService {

	List<Asesoria> findAll();

	Asesoria findById(Integer id);

    void save(Asesoria asesorias);

    void delete(Asesoria asesorias);
}
