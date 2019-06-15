package tecsup.edu.tecunity.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import tecsup.edu.tecunity.models.Asesoria;
import tecsup.edu.tecunity.services.IAsesoriasService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
public class AsesoriasController {
	
	@Autowired
	@Qualifier(value = "asesoriasService")
	private IAsesoriasService iAsesoriasService;
	
	@GetMapping(value ="/asesorias/")
	List<Asesoria> showAll(){
		return this.iAsesoriasService.findAll();
	}
	
	@GetMapping(value = "/asesoria/{id}")
	Asesoria showIndividual(@PathVariable(value = "id") Integer id) {
		return this.iAsesoriasService.findById(id);
	}
	
	@PostMapping(value = "/asesoria")
	@ResponseStatus(HttpStatus.CREATED)
	Asesoria create(@RequestBody Asesoria asesoria) {
		this.iAsesoriasService.save(asesoria);
		return asesoria;
	}
	
	@PutMapping(value = "/asesoria/{id}")
	Asesoria update (@RequestBody Asesoria asesoria, @PathVariable(value = "id") Integer id) {
		Asesoria currentAsesoria = this.iAsesoriasService.findById(id);
		this.iAsesoriasService.save(currentAsesoria);
		return currentAsesoria;
	}
	
	@DeleteMapping(value = "/asesoria/{id}")
	@ResponseStatus(HttpStatus.OK)
	void Delete(@PathVariable(value = "id") Integer id) {
		Asesoria asesoria=this.iAsesoriasService.findById(id);
		this.iAsesoriasService.delete(asesoria);
	}


}
