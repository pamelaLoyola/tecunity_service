package tecsup.edu.tecunity.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "asesorias")
public class Asesoria implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="asesoria_id")
	private Integer idAsesorias;
	
	@ManyToOne
	@JoinColumn(name = "participantes_par_id")
	private Participante participantes;
	
	@ManyToOne
	@JoinColumn(name = "publicaciones_id_publicacion")
	private Publicacion publicaciones;

	public Integer getIdAsesorias() {
		return idAsesorias;
	}

	public void setIdAsesorias(Integer idAsesorias) {
		this.idAsesorias = idAsesorias;
	}

	public Participante getParticipantes() {
		return participantes;
	}

	public void setParticipantes(Participante participantes) {
		this.participantes = participantes;
	}

	public Publicacion getPublicaciones() {
		return publicaciones;
	}

	public void setPublicaciones(Publicacion publicaciones) {
		this.publicaciones = publicaciones;
	}

	@Override
	public String toString() {
		return "Asesorias [idAsesorias=" + idAsesorias + ", participantes=" + participantes + ", publicaciones="
				+ publicaciones + "]";
	}
	
	
}
