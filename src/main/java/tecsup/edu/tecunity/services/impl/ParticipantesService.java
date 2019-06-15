package tecsup.edu.tecunity.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tecsup.edu.tecunity.models.Participante;
import tecsup.edu.tecunity.repositories.ParticipantesRepository;
import tecsup.edu.tecunity.services.IParticipantesService;

@Service(value = "participantesService")
public class ParticipantesService implements IParticipantesService {
	
	@Autowired
	@Qualifier(value = "participantesRepository")
	private ParticipantesRepository participantesRepository;

	@Transactional(readOnly = true)
	@Override
	public List<Participante> findAll() {
		return this.participantesRepository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Participante findById(Integer id) {
		return this.participantesRepository.findById(id).orElse(null);
	}

	@Transactional
	@Override
	public void save(Participante participantes) {
		this.participantesRepository.save(participantes);
	}

	@Transactional
	@Override
	public void delete(Participante participantes) {
		this.participantesRepository.delete(participantes);
	}

	@Override
	public Participante findByEmail(String email) {
		return this.participantesRepository.findByEmail(email);
	}

}
