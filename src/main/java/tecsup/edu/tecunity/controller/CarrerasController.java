package tecsup.edu.tecunity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import tecsup.edu.tecunity.model.Carreras;
import tecsup.edu.tecunity.service.ICarrerasService;

@CrossOrigin(origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST,
        RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping(value = "{/api}")
public class CarrerasController {
	
	@Autowired
	@Qualifier(value = "carrerasService")
	private ICarrerasService iCarrerasService;
	
	@GetMapping(value ="/carreras/")
	List<Carreras> showAll(){
		return this.iCarrerasService.findAll();
	}
	
	@GetMapping(value = "/carrera/${id}")
	Carreras showIndividual(@PathVariable(value = "id") Integer id) {
		return this.iCarrerasService.findById(id);
	}
	
	@PostMapping(value = "/carrera")
	@ResponseStatus(HttpStatus.CREATED)
	Carreras create(@RequestBody Carreras carreras) {
		this.iCarrerasService.save(carreras);
		return carreras;
	}
	
	@PutMapping(value = "/carrera/${id}")
	Carreras update (@RequestBody Carreras carreras, @PathVariable(value = "id") Integer id) {
		Carreras currentCarreras = this.iCarrerasService.findById(id);
		this.iCarrerasService.save(currentCarreras);
		return currentCarreras;
	}
	
	@DeleteMapping(value = "/carrera/${id}")
	@ResponseStatus(HttpStatus.OK)
	void Delete(@PathVariable(value = "id") Integer id) {
		Carreras carreras=this.iCarrerasService.findById(id);
		this.iCarrerasService.delete(carreras);
	}

}
