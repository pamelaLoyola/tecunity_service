package tecsup.edu.tecunity.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "carreras")
public class Carreras implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "carrera_id")
	private Integer idCarreras;
	
	@Column(name = "carrera_nombre")
	private String nombre;

	public Integer getIdCarreras() {
		return idCarreras;
	}

	public void setIdCarreras(Integer idCarreras) {
		this.idCarreras = idCarreras;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Carreras [idCarreras=" + idCarreras + ", nombre=" + nombre + "]";
	}
	
	
}
