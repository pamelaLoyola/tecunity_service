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

import tecsup.edu.tecunity.model.Publicaciones;
import tecsup.edu.tecunity.service.IPublicacionesService;

@CrossOrigin(origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST,
        RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping(value = "/api")
public class PublicacionesController {


	@Autowired
	@Qualifier(value = "publicacionesService")
	private IPublicacionesService iPublicacionesService;
	
	@GetMapping(value ="/publicaciones/")
	List<Publicaciones> showAll(){
		return this.iPublicacionesService.findAll();
	}
	
	@GetMapping(value = "/publicacion/{id}")
	Publicaciones showIndividual(@PathVariable(value = "id") Integer id) {
		return this.iPublicacionesService.findById(id);
	}
	
	@PostMapping(value = "/publicacion")
	@ResponseStatus(HttpStatus.CREATED)
	Publicaciones create(@RequestBody Publicaciones publicacion) {
		this.iPublicacionesService.save(publicacion);
		return publicacion;
	}
	
	@PutMapping(value = "/publicacion/{id}")
	Publicaciones update (@RequestBody Publicaciones horario, @PathVariable(value = "id") Integer id) {
		Publicaciones currentPublicacion = this.iPublicacionesService.findById(id);
		this.iPublicacionesService.save(currentPublicacion);
		return currentPublicacion;
	}
	
	@DeleteMapping(value = "/publicacion/{id}")
	@ResponseStatus(HttpStatus.OK)
	void Delete(@PathVariable(value = "id") Integer id) {
		Publicaciones publicacion=this.iPublicacionesService
				.findById(id);
		this.iPublicacionesService.delete(publicacion);
	}
}
