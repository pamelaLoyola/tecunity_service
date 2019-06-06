package tecsup.edu.tecunity.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import tecsup.edu.tecunity.model.Carreras;
import tecsup.edu.tecunity.repository.CarrerasRepository;
import tecsup.edu.tecunity.service.ICarrerasService;

@Service(value = "carrerasService")
public class CarrerasService implements ICarrerasService {
	
	@Autowired
	@Qualifier(value = "carrerasRepository")
	private CarrerasRepository carrerasRepository;

	@Transactional(readOnly = true)
	@Override
	public List<Carreras> findAll() {
		return this.carrerasRepository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Carreras findById(Integer id) {
		return this.carrerasRepository.findById(id).orElse(null);
	}

	@Transactional
	@Override
	public void save(Carreras carreras) {
		this.carrerasRepository.save(carreras);
	}

	@Transactional
	@Override
	public void delete(Carreras carreras) {
		this.carrerasRepository.delete(carreras);
	}

}
