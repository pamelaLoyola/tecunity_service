package tecsup.edu.tecunity.services;
import java.util.List;

import tecsup.edu.tecunity.models.Curso;

public interface ICursosService {

	List<Curso> findAll();

    Curso findById(Integer id);

    void save(Curso curso);

    void delete(Curso curso);
}
