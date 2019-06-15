package tecsup.edu.tecunity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tecsup.edu.tecunity.models.Carrera;

@Repository(value = "carrerasRepository")
public interface CarrerasRepository extends JpaRepository<Carrera, Integer> {

}
