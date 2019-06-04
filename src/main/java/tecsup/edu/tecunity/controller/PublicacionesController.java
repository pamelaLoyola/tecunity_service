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
import tecsup.edu.tecunity.model.Publicaciones;
import tecsup.edu.tecunity.service.IHorariosService;
import tecsup.edu.tecunity.service.IPublicacionesService;

@CrossOrigin(origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST,
        RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping(value = "{/api}")
public class PublicacionesController {


	@Autowired
	@Qualifier(value = "publicacionesService")
	private IPublicacionesService iPublicacionesService;
	
	@GetMapping(value ="/horarios/")
	List<Publicaciones> showAll(){
		return this.iPublicacionesService.findAll();
	}
	
	@GetMapping(value = "/horario/${id}")
	Publicaciones showIndividual(@PathVariable(value = "id") Integer id) {
		return this.iPublicacionesService.findById(id);
	}
	
	@PostMapping(value = "/horario")
	@ResponseStatus(HttpStatus.CREATED)
	Publicaciones create(@RequestBody Publicaciones horario) {
		this.iPublicacionesService.save(horario);
		return horario;
	}
	
	@PutMapping(value = "/horario/${id}")
	Publicaciones update (@RequestBody Publicaciones horario, @PathVariable(value = "id") Integer id) {
		Publicaciones currentHorario = this.iPublicacionesService.findById(id);
		this.iPublicacionesService.save(currentHorario);
		return currentHorario;
	}
	
	@DeleteMapping(value = "/horario/${id}")
	@ResponseStatus(HttpStatus.OK)
	void Delete(@PathVariable(value = "id") Integer id) {
		Publicaciones horario=this.iPublicacionesService
				.findById(id);
		this.iPublicacionesService.delete(horario);
	}
}
