package tecsup.edu.tecunity.service;

import java.util.List;

import tecsup.edu.tecunity.model.Horarios;

public interface IHorariosService {

	List<Horarios> findAll();

	Horarios findById(Integer id);

    void save(Horarios horarios);

    void delete(Horarios horarios);
}
