package tecsup.edu.tecunity.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import tecsup.edu.tecunity.model.Asesorias;
import tecsup.edu.tecunity.repository.AsesoriasRepository;
import tecsup.edu.tecunity.service.IAsesoriasService;

@Service(value = "asesoriasService")
public class AsesoriasService implements IAsesoriasService {

	@Autowired
    @Qualifier(value = "asesoriasRepository")
    private AsesoriasRepository asesoriasRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<Asesorias> findAll() {
		return this.asesoriasRepository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Asesorias findById(Integer id) {
		return this.asesoriasRepository.findById(id).orElse(null);
	}

	@Transactional
	@Override
	public void save(Asesorias asesorias) {
		this.asesoriasRepository.save(asesorias);
	}

	@Transactional
	@Override
	public void delete(Asesorias asesorias) {
		this.asesoriasRepository.delete(asesorias);
	}

}
