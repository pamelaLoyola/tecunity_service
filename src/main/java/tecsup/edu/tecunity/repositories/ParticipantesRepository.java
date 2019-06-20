package tecsup.edu.tecunity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tecsup.edu.tecunity.models.Participante;

@Repository(value = "participantesRepository")
public interface ParticipantesRepository extends JpaRepository<Participante, Integer>{
	 Participante findByEmail(String correo);
}
