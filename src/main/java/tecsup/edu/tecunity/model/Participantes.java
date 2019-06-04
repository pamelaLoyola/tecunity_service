package tecsup.edu.tecunity.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "participantes")
public class Participantes implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "par_id")
	private Integer idParticipante;
	
	@Column(name = "par_nombre")
	private String nombre;
	
	@Column(name = "par_usuario")
	private String usuario;
	
	@Column(name = "par_email")
	private String email;
	
	@Column(name = "par_foto")
	private String foto;
	
	@Column(name = "par_celular")
	private String celular;
	
	@Column(name = "par_ciclo")
	private String ciclo;
	
	@ManyToOne
	@JoinColumn(name = "carreras_carrera_id")
	private Carreras carrera;

	public Integer getIdParticipante() {
		return idParticipante;
	}

	public void setIdParticipante(Integer idParticipante) {
		this.idParticipante = idParticipante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public Carreras getCarrera() {
		return carrera;
	}

	public void setCarrera(Carreras carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "Participantes [idParticipante=" + idParticipante + ", nombre=" + nombre + ", usuario=" + usuario
				+ ", email=" + email + ", foto=" + foto + ", celular=" + celular + ", ciclo=" + ciclo + ", carrera="
				+ carrera + "]";
	}


	
}
