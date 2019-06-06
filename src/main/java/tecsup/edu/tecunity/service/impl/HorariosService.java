package tecsup.edu.tecunity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tecsup.edu.tecunity.model.Horarios;
import tecsup.edu.tecunity.repository.HorariosRepository;
import tecsup.edu.tecunity.service.IHorariosService;

@Service(value = "horariosService")
public class HorariosService implements IHorariosService {

	@Autowired
	@Qualifier(value = "horariosRepository")
	private HorariosRepository horariosRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<Horarios> findAll() {
		return this.horariosRepository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Horarios findById(Integer id) {
		return this.horariosRepository.findById(id).orElse(null);
	}

	@Transactional
	@Override
	public void save(Horarios horarios) {
		this.horariosRepository.save(horarios);
	}

	@Transactional
	@Override
	public void delete(Horarios horarios) {
		this.horariosRepository.delete(horarios);
	}

}
