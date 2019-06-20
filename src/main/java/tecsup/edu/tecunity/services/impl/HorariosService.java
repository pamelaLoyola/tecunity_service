package tecsup.edu.tecunity.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tecsup.edu.tecunity.models.Horario;
import tecsup.edu.tecunity.repositories.HorariosRepository;
import tecsup.edu.tecunity.services.IHorariosService;

@Service(value = "horariosService")
public class HorariosService implements IHorariosService {

	@Autowired
	@Qualifier(value = "horariosRepository")
	private HorariosRepository horariosRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<Horario> findAll() {
		return this.horariosRepository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Horario findById(Integer id) {
		return this.horariosRepository.findById(id).orElse(null);
	}

	@Transactional
	@Override
	public void save(Horario horarios) {
		this.horariosRepository.save(horarios);
	}

	@Transactional
	@Override
	public void delete(Horario horarios) {
		this.horariosRepository.delete(horarios);
	}

}
