package tecsup.edu.tecunity.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import tecsup.edu.tecunity.models.Carrera;
import tecsup.edu.tecunity.repositories.CarrerasRepository;
import tecsup.edu.tecunity.services.ICarrerasService;

@Service(value = "carrerasService")
public class CarrerasService implements ICarrerasService {
	
	@Autowired
	@Qualifier(value = "carrerasRepository")
	private CarrerasRepository carrerasRepository;

	@Transactional(readOnly = true)
	@Override
	public List<Carrera> findAll() {
		return this.carrerasRepository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Carrera findById(Integer id) {
		return this.carrerasRepository.findById(id).orElse(null);
	}

	@Transactional
	@Override
	public void save(Carrera carreras) {
		this.carrerasRepository.save(carreras);
	}

	@Transactional
	@Override
	public void delete(Carrera carreras) {
		this.carrerasRepository.delete(carreras);
	}

}
