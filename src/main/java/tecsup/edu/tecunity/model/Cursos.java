package tecsup.edu.tecunity.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "cursos")
public class Cursos implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "curso_id")
	private Integer idCursos;
	
	@Column(name = "curso_nombre")
	private String nombre;

	public Integer getIdCursos() {
		return idCursos;
	}

	public void setIdCursos(Integer idCursos) {
		this.idCursos = idCursos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Cursos [idCursos=" + idCursos + ", nombre=" + nombre + "]";
	}

}
