package tecsup.edu.tecunity.service;

import java.util.List;

import tecsup.edu.tecunity.model.Asesorias;

public interface IAsesoriasService {

	List<Asesorias> findAll();

	Asesorias findById(Integer id);

    void save(Asesorias asesorias);

    void delete(Asesorias asesorias);
}
