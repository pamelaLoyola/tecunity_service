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

import tecsup.edu.tecunity.models.Publicacion;
import tecsup.edu.tecunity.services.IPublicacionesService;

//@CrossOrigin(origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
public class PublicacionesController {


	@Autowired
	@Qualifier(value = "publicacionesService")
	private IPublicacionesService iPublicacionesService;
	
	@GetMapping(value ="/publicaciones/")
	List<Publicacion> showAll(){
		return this.iPublicacionesService.findAll();
	}
	
	@GetMapping(value = "/publicacion/{id}")
	Publicacion showIndividual(@PathVariable(value = "id") Integer id) {
		return this.iPublicacionesService.findById(id);
	}
	
	@PostMapping(value = "/publicacion")
	@ResponseStatus(HttpStatus.CREATED)
	Publicacion create(@RequestBody Publicacion publicacion) {
		this.iPublicacionesService.save(publicacion);
		return publicacion;
	}
	
	@PutMapping(value = "/publicacion/{id}")
	Publicacion update (@RequestBody Publicacion publicacion, @PathVariable(value = "id") Integer id) {
		Publicacion currentPublicacion = this.iPublicacionesService.findById(id);
		currentPublicacion.setTipo(publicacion.getTipo());
		currentPublicacion.setEstado(publicacion.getEstado());
		this.iPublicacionesService.save(currentPublicacion);
		return currentPublicacion;
	}
	
	@DeleteMapping(value = "/publicacion/{id}")
	@ResponseStatus(HttpStatus.OK)
	void Delete(@PathVariable(value = "id") Integer id) {
		Publicacion publicacion=this.iPublicacionesService
				.findById(id);
		this.iPublicacionesService.delete(publicacion);
	}
}
