package tecsup.edu.tecunity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tecsup.edu.tecunity.models.Curso;

@Repository(value = "cursosRepository")
public interface CursosRepository extends JpaRepository<Curso, Integer> {

}
