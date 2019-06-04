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

import tecsup.edu.tecunity.model.Horarios;
import tecsup.edu.tecunity.service.IHorariosService;

@CrossOrigin(origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST,
        RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping(value = "{/api}")
public class HorariosController {


	@Autowired
	@Qualifier(value = "horariosService")
	private IHorariosService iHorariosService;
	
	@GetMapping(value ="/horarios/")
	List<Horarios> showAll(){
		return this.iHorariosService.findAll();
	}
	
	@GetMapping(value = "/horario/${id}")
	Horarios showIndividual(@PathVariable(value = "id") Integer id) {
		return this.iHorariosService.findById(id);
	}
	
	@PostMapping(value = "/horario")
	@ResponseStatus(HttpStatus.CREATED)
	Horarios create(@RequestBody Horarios horario) {
		this.iHorariosService.save(horario);
		return horario;
	}
	
	@PutMapping(value = "/horario/${id}")
	Horarios update (@RequestBody Horarios horario, @PathVariable(value = "id") Integer id) {
		Horarios currentHorario = this.iHorariosService.findById(id);
		this.iHorariosService.save(currentHorario);
		return currentHorario;
	}
	
	@DeleteMapping(value = "/horario/${id}")
	@ResponseStatus(HttpStatus.OK)
	void Delete(@PathVariable(value = "id") Integer id) {
		Horarios horario=this.iHorariosService.findById(id);
		this.iHorariosService.delete(horario);
	}
}
