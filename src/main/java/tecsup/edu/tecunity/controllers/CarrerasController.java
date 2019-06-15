package tecsup.edu.tecunity.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import tecsup.edu.tecunity.models.Carrera;
import tecsup.edu.tecunity.services.ICarrerasService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
public class CarrerasController {
	
	@Autowired
	@Qualifier(value = "carrerasService")
	private ICarrerasService iCarrerasService;
	
	@GetMapping(value ="/carreras/")
	List<Carrera> showAll(){
		return this.iCarrerasService.findAll();
	}
	
	@GetMapping(value = "/carrera/{id}")
	Carrera showIndividual(@PathVariable(value = "id") Integer id) {
		return this.iCarrerasService.findById(id);
	}
	
	@PostMapping(value = "/carrera")
	@ResponseStatus(HttpStatus.CREATED)
	Carrera create(@RequestBody Carrera carreras) {
		this.iCarrerasService.save(carreras);
		return carreras;
	}
	
	@PutMapping(value = "/carrera/{id}")
	Carrera update (@RequestBody Carrera carreras, @PathVariable(value = "id") Integer id) {
		Carrera currentCarreras = this.iCarrerasService.findById(id);
		this.iCarrerasService.save(currentCarreras);
		return currentCarreras;
	}
	
	@DeleteMapping(value = "/carrera/{id}")
	@ResponseStatus(HttpStatus.OK)
	void Delete(@PathVariable(value = "id") Integer id) {
		Carrera carreras=this.iCarrerasService.findById(id);
		this.iCarrerasService.delete(carreras);
	}

}
