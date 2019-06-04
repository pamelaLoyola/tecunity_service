package tecsup.edu.tecunity.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "asesorias")
public class Asesorias implements Serializable {
	
	private Integer idAsesorias;
	private Integer participantes;
	private Integer publicaciones;
}
