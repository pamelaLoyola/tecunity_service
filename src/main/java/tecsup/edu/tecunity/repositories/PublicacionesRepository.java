package tecsup.edu.tecunity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tecsup.edu.tecunity.models.Publicacion;

@Repository(value = "publicacionesRepository")
public interface PublicacionesRepository extends JpaRepository<Publicacion, Integer> {

}
