package tecsup.edu.tecunity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tecsup.edu.tecunity.models.Asesoria;

@Repository(value = "asesoriasRepository")
public interface AsesoriasRepository extends JpaRepository<Asesoria, Integer> {

}
