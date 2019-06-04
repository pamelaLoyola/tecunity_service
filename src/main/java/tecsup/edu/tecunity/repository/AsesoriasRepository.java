package tecsup.edu.tecunity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tecsup.edu.tecunity.model.Asesorias;

@Repository(value = "asesoriasRepository")
public interface AsesoriasRepository extends JpaRepository<Asesorias, Integer> {

}
