package tecsup.edu.tecunity.service;

import java.util.List;

import tecsup.edu.tecunity.model.Carreras;

public interface ICarrerasService {

	List<Carreras> findAll();

	Carreras findById(Integer id);

    void save(Carreras carreras);

    void delete(Carreras carreras);
}
