package tecsup.edu.tecunity.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import tecsup.edu.tecunity.models.Participante;
import tecsup.edu.tecunity.services.IParticipantesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
public class ParticipantesController {
	

	@Autowired
	@Qualifier(value = "participantesService")
	private IParticipantesService iParticipantesService;
	
	@GetMapping(value ="/participantes/")
	List<Participante> showAll(){
		return this.iParticipantesService.findAll();
	}
	
	@GetMapping(value = "/participante/{id}")
	Participante showIndividual(@PathVariable(value = "id") Integer id) {
		return this.iParticipantesService.findById(id);
	}
	
	@GetMapping(value = "/participanteCorreo/{correo}")
	Participante showParticipanteByCorreo(@PathVariable(value = "correo") String correo) {
		Participante participante = iParticipantesService.findByEmail(correo);
		return participante;
	}
	
	@PutMapping(value = "/participanteCorreo/{correo}")
	Participante updateByCorreo(@RequestBody Participante participante, @PathVariable(value = "correo") String correo) {
		Participante currentParticipante = iParticipantesService.findByEmail(correo);
		currentParticipante.setUsuario(participante.getUsuario());
        currentParticipante.setCiclo(participante.getCiclo());
        currentParticipante.setCelular(participante.getCelular());
        currentParticipante.setCarrera(participante.getCarrera());
        this.iParticipantesService.save(currentParticipante);
		return currentParticipante;
	}
	
	@PostMapping(value = "/participante")
	@ResponseStatus(HttpStatus.CREATED)
	Participante create(@RequestBody Participante participante) {
		Participante foundParticipante = iParticipantesService.findByEmail(participante.getEmail());
		if (foundParticipante != null ) {
			return foundParticipante;
		}
		this.iParticipantesService.save(participante);
		return participante;
	}
	
	@PutMapping(value = "/participante/{id}")
	Participante update (@RequestBody Participante participante, @PathVariable(value = "id") Integer id) {
		Participante currentParticipante = this.iParticipantesService.findById(id);
		currentParticipante.setUsuario(participante.getUsuario());
        currentParticipante.setCiclo(participante.getCiclo());
        currentParticipante.setCelular(participante.getCelular());
        currentParticipante.setCarrera(participante.getCarrera());
		this.iParticipantesService.save(currentParticipante);
		return currentParticipante;
	}
	
	@DeleteMapping(value = "/participante/{id}")
	@ResponseStatus(HttpStatus.OK)
	void Delete(@PathVariable(value = "id") Integer id) {
		Participante participante=this.iParticipantesService.findById(id);
		this.iParticipantesService.delete(participante);
	}

}
