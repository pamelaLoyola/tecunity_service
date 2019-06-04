package tecsup.edu.tecunity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tecsup.edu.tecunity.model.Participantes;

@Repository(value = "participantesRepository")
public interface ParticipantesRepository extends JpaRepository<Participantes, Integer>{

}
