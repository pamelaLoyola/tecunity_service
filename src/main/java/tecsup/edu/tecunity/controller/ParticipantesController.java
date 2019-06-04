package tecsup.edu.tecunity.controller;

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

import tecsup.edu.tecunity.model.Participantes;
import tecsup.edu.tecunity.service.IParticipantesService;

@CrossOrigin(origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST,
        RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping(value = "{/api}")
public class ParticipantesController {
	

	@Autowired
	@Qualifier(value = "participantesService")
	private IParticipantesService iParticipantesService;
	
	@GetMapping(value ="/horarios/")
	List<Participantes> showAll(){
		return this.iParticipantesService.findAll();
	}
	
	@GetMapping(value = "/horario/${id}")
	Participantes showIndividual(@PathVariable(value = "id") Integer id) {
		return this.iParticipantesService.findById(id);
	}
	
	@PostMapping(value = "/horario")
	@ResponseStatus(HttpStatus.CREATED)
	Participantes create(@RequestBody Participantes participante) {
		this.iParticipantesService.save(participante);
		return participante;
	}
	
	@PutMapping(value = "/horario/${id}")
	Participantes update (@RequestBody Participantes participante, @PathVariable(value = "id") Integer id) {
		Participantes currentParticipante = this.iParticipantesService.findById(id);
		this.iParticipantesService.save(currentParticipante);
		return currentParticipante;
	}
	
	@DeleteMapping(value = "/horario/${id}")
	@ResponseStatus(HttpStatus.OK)
	void Delete(@PathVariable(value = "id") Integer id) {
		Participantes participante=this.iParticipantesService.findById(id);
		this.iParticipantesService.delete(participante);
	}

}
