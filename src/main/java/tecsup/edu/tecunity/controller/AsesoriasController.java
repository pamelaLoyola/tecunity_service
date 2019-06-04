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

import tecsup.edu.tecunity.model.Asesorias;
import tecsup.edu.tecunity.service.IAsesoriasService;

@CrossOrigin(origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST,
        RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping(value = "{/api}")
public class AsesoriasController {
	
	@Autowired
	@Qualifier(value = "asesoriasService")
	private IAsesoriasService iAsesoriasService;
	
	@GetMapping(value ="/asesorias/")
	List<Asesorias> showAll(){
		return this.iAsesoriasService.findAll();
	}
	
	@GetMapping(value = "/asesoria/${id}")
	Asesorias showIndividual(@PathVariable(value = "id") Integer id) {
		return this.iAsesoriasService.findById(id);
	}
	
	@PostMapping(value = "/asesoria")
	@ResponseStatus(HttpStatus.CREATED)
	Asesorias create(@RequestBody Asesorias asesoria) {
		this.iAsesoriasService.save(asesoria);
		return asesoria;
	}
	
	@PutMapping(value = "/asesoria/${id}")
	Asesorias update (@RequestBody Asesorias carreras, @PathVariable(value = "id") Integer id) {
		Asesorias currentAsesoria = this.iAsesoriasService.findById(id);
		this.iAsesoriasService.save(currentAsesoria);
		return currentAsesoria;
	}
	
	@DeleteMapping(value = "/asesoria/${id}")
	@ResponseStatus(HttpStatus.OK)
	void Delete(@PathVariable(value = "id") Integer id) {
		Asesorias asesoria=this.iAsesoriasService.findById(id);
		this.iAsesoriasService.delete(asesoria);
	}


}
