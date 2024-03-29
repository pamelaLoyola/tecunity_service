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

import tecsup.edu.tecunity.models.Curso;
import tecsup.edu.tecunity.services.ICursosService;;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
public class CursosController {

	@Autowired
	@Qualifier(value = "cursosService")
	private ICursosService iCursosService;
	
	@GetMapping(value ="/cursos/")
	List<Curso> showAll(){
		return this.iCursosService.findAll();
	}
	
	@GetMapping(value = "/curso/{id}")
	Curso showIndividual(@PathVariable(value = "id") Integer id) {
		return this.iCursosService.findById(id);
	}
	
	@PostMapping(value = "/curso")
	@ResponseStatus(HttpStatus.CREATED)
	Curso create(@RequestBody Curso curso) {
		this.iCursosService.save(curso);
		return curso;
	}
	
	@PutMapping(value = "/curso/{id}")
	Curso update (@RequestBody Curso carreras, @PathVariable(value = "id") Integer id) {
		Curso currentCurso = this.iCursosService.findById(id);
		this.iCursosService.save(currentCurso);
		return currentCurso;
	}
	
	@DeleteMapping(value = "/curso/{id}")
	@ResponseStatus(HttpStatus.OK)
	void Delete(@PathVariable(value = "id") Integer id) {
		Curso curso=this.iCursosService.findById(id);
		this.iCursosService.delete(curso);
	}

}
