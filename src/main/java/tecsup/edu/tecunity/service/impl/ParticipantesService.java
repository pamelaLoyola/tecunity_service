package tecsup.edu.tecunity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tecsup.edu.tecunity.model.Participantes;
import tecsup.edu.tecunity.repository.ParticipantesRepository;
import tecsup.edu.tecunity.service.IParticipantesService;

@Service(value = "participantesService")
public class ParticipantesService implements IParticipantesService {
	
	@Autowired
	@Qualifier(value = "participantesRepository")
	private ParticipantesRepository participantesRepository;

	@Transactional(readOnly = true)
	@Override
	public List<Participantes> findAll() {
		return this.participantesRepository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Participantes findById(Integer id) {
		return this.participantesRepository.findById(id).orElse(null);
	}

	@Transactional
	@Override
	public void save(Participantes participantes) {
		this.participantesRepository.save(participantes);
	}

	@Transactional
	@Override
	public void delete(Participantes participantes) {
		this.participantesRepository.delete(participantes);
	}

}
