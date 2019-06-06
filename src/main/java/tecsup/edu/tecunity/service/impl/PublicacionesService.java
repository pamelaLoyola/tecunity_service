package tecsup.edu.tecunity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tecsup.edu.tecunity.model.Publicaciones;
import tecsup.edu.tecunity.repository.PublicacionesRepository;
import tecsup.edu.tecunity.service.IPublicacionesService;

@Service(value= "publicacionesService")
public class PublicacionesService implements IPublicacionesService {
	
	@Autowired
	//@Qualifier(value = "publicacionesRespository")
	private PublicacionesRepository publicacionesRepository;

	@Transactional(readOnly = true)
	@Override
	public List<Publicaciones> findAll() {
		return this.publicacionesRepository.findAll();
	}
	
	@Transactional(readOnly = true)
	@Override
	public Publicaciones findById(Integer id) {
		return this.publicacionesRepository.findById(id).orElse(null);
	}

	@Transactional
	@Override
	public void save(Publicaciones publicaciones) {
		this.publicacionesRepository.save(publicaciones);
	}

	@Transactional
	@Override
	public void delete(Publicaciones publicaciones) {
		this.publicacionesRepository.delete(publicaciones);
	}

}
