package tecsup.edu.tecunity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tecsup.edu.tecunity.model.Cursos;

@Repository(value = "cursosRepository")
public interface CursosRepository extends JpaRepository<Cursos, Integer> {

}
