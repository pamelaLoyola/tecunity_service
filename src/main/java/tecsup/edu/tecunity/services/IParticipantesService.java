package tecsup.edu.tecunity.services;

import java.util.List;

import tecsup.edu.tecunity.models.Participante;

public interface IParticipantesService {

	List<Participante> findAll();

	Participante findById(Integer id);
	
	Participante findByEmail(String email);

    void save(Participante participantes);

    void delete(Participante participantes);
}
