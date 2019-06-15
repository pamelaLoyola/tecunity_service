package tecsup.edu.tecunity.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import tecsup.edu.tecunity.models.Asesoria;
import tecsup.edu.tecunity.repositories.AsesoriasRepository;
import tecsup.edu.tecunity.services.IAsesoriasService;

@Service(value = "asesoriasService")
public class AsesoriasService implements IAsesoriasService {

	@Autowired
    @Qualifier(value = "asesoriasRepository")
    private AsesoriasRepository asesoriasRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<Asesoria> findAll() {
		return this.asesoriasRepository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Asesoria findById(Integer id) {
		return this.asesoriasRepository.findById(id).orElse(null);
	}

	@Transactional
	@Override
	public void save(Asesoria asesorias) {
		this.asesoriasRepository.save(asesorias);
	}

	@Transactional
	@Override
	public void delete(Asesoria asesorias) {
		this.asesoriasRepository.delete(asesorias);
	}

}
