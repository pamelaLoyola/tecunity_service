package tecsup.edu.tecunity.service;
import java.util.List;

import tecsup.edu.tecunity.model.Cursos;

public interface ICursosService {

	List<Cursos> findAll();

    Cursos findById(Integer id);

    void save(Cursos curso);

    void delete(Cursos curso);
}
