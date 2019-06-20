package tecsup.edu.tecunity.services;

import java.util.List;

import tecsup.edu.tecunity.models.Horario;

public interface IHorariosService {

	List<Horario> findAll();

	Horario findById(Integer id);

    void save(Horario horarios);

    void delete(Horario horarios);
}
