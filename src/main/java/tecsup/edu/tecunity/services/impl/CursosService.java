package tecsup.edu.tecunity.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tecsup.edu.tecunity.models.Curso;
import tecsup.edu.tecunity.repositories.CursosRepository;
import tecsup.edu.tecunity.services.ICursosService;

@Service(value = "cursosService")
public class CursosService implements ICursosService {
	
	@Autowired
	@Qualifier(value = "cursosRepository")
	private CursosRepository cursosRepository;

	@Transactional(readOnly = true)
	@Override
	public List<Curso> findAll() {
		return this.cursosRepository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Curso findById(Integer id) {
		return this.cursosRepository.findById(id).orElse(null);
	}
	
	@Transactional
	@Override
	public void save(Curso curso) {
		this.cursosRepository.save(curso);
	}

	@Transactional
	@Override
	public void delete(Curso curso) {
		this.cursosRepository.delete(curso);
		
	}

}
