package tecsup.edu.tecunity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tecsup.edu.tecunity.model.Publicaciones;

@Repository(value = "publicacionesRepository")
public interface PublicacionesRepository extends JpaRepository<Publicaciones, Integer> {

}
