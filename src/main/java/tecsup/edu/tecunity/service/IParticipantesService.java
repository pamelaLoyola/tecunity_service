package tecsup.edu.tecunity.service;

import java.util.List;

import tecsup.edu.tecunity.model.Participantes;

public interface IParticipantesService {

	List<Participantes> findAll();

	Participantes findById(Integer id);

    void save(Participantes participantes);

    void delete(Participantes participantes);
}
