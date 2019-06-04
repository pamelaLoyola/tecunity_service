package tecsup.edu.tecunity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tecsup.edu.tecunity.model.Carreras;

@Repository(value = "carrerasRepository")
public interface CarrerasRepository extends JpaRepository<Carreras, Integer> {

}
