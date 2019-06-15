package tecsup.edu.tecunity.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tecsup.edu.tecunity.models.Publicacion;
import tecsup.edu.tecunity.repositories.PublicacionesRepository;
import tecsup.edu.tecunity.services.IPublicacionesService;

@Service(value= "publicacionesService")
public class PublicacionesService implements IPublicacionesService {
	
	@Autowired
	//@Qualifier(value = "publicacionesRespository")
	private PublicacionesRepository publicacionesRepository;

	@Transactional(readOnly = true)
	@Override
	public List<Publicacion> findAll() {
		return this.publicacionesRepository.findAll();
	}
	
	@Transactional(readOnly = true)
	@Override
	public Publicacion findById(Integer id) {
		return this.publicacionesRepository.findById(id).orElse(null);
	}

	@Transactional
	@Override
	public void save(Publicacion publicaciones) {
		this.publicacionesRepository.save(publicaciones);
	}

	@Transactional
	@Override
	public void delete(Publicacion publicaciones) {
		this.publicacionesRepository.delete(publicaciones);
	}

}
