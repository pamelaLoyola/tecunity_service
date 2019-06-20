package tecsup.edu.tecunity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tecsup.edu.tecunity.models.Horario;

@Repository(value = "horariosRepository")
public interface HorariosRepository extends JpaRepository<Horario, Integer> {

}
