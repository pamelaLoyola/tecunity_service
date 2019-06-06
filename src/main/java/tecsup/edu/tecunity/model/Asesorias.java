package tecsup.edu.tecunity.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "asesorias")
public class Asesorias implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="asesoria_id")
	private Integer idAsesorias;
	
	@ManyToOne
	@JoinColumn(name = "participantes_par_id")
	private Participantes participantes;
	
	@ManyToOne
	@JoinColumn(name = "publicaciones_id_publicacion")
	private Publicaciones publicaciones;

	public Integer getIdAsesorias() {
		return idAsesorias;
	}

	public void setIdAsesorias(Integer idAsesorias) {
		this.idAsesorias = idAsesorias;
	}

	public Participantes getParticipantes() {
		return participantes;
	}

	public void setParticipantes(Participantes participantes) {
		this.participantes = participantes;
	}

	public Publicaciones getPublicaciones() {
		return publicaciones;
	}

	public void setPublicaciones(Publicaciones publicaciones) {
		this.publicaciones = publicaciones;
	}

	@Override
	public String toString() {
		return "Asesorias [idAsesorias=" + idAsesorias + ", participantes=" + participantes + ", publicaciones="
				+ publicaciones + "]";
	}
	
	
}
