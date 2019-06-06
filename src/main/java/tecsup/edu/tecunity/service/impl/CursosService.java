package tecsup.edu.tecunity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tecsup.edu.tecunity.model.Cursos;
import tecsup.edu.tecunity.repository.CursosRepository;
import tecsup.edu.tecunity.service.ICursosService;

@Service(value = "cursosService")
public class CursosService implements ICursosService {
	
	@Autowired
	@Qualifier(value = "cursosRepository")
	private CursosRepository cursosRepository;

	@Transactional(readOnly = true)
	@Override
	public List<Cursos> findAll() {
		return this.cursosRepository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Cursos findById(Integer id) {
		return this.cursosRepository.findById(id).orElse(null);
	}
	
	@Transactional
	@Override
	public void save(Cursos curso) {
		this.cursosRepository.save(curso);
	}

	@Transactional
	@Override
	public void delete(Cursos curso) {
		this.cursosRepository.delete(curso);
		
	}

}
