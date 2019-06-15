package tecsup.edu.tecunity.services;

import java.util.List;

import tecsup.edu.tecunity.models.Carrera;

public interface ICarrerasService {

	List<Carrera> findAll();

	Carrera findById(Integer id);

    void save(Carrera carreras);

    void delete(Carrera carreras);
}
