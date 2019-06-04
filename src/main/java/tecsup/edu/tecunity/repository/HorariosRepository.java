package tecsup.edu.tecunity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tecsup.edu.tecunity.model.Horarios;

@Repository(value = "horariosRepository")
public interface HorariosRepository extends JpaRepository<Horarios, Integer> {

}
