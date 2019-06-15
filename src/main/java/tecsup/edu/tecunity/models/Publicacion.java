
package tecsup.edu.tecunity.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Calendar;

import javax.persistence.*;

@Entity
@Table(name = "publicaciones")
public class Publicacion implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "publicacion_id")
	private Integer idPublicaciones;
	
	@Column(name = "pub_titulo")
	private String titulo;
	
	@Column(name = "pub_descripcion")
	private String descripcion;
	
	@Column(name = "pub_etiqueta")
	private String etiqueta;
	
	@Column(name = "pub_estado")
	private String estado;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "pub_fecha")
	private Date fecha;
	
	@Column(name = "pub_tipo")
	private String tipo;
	
	@ManyToOne
	@JoinColumn(name = "cursos_curso_id")
	private Curso curso;
	
	@ManyToOne
	@JoinColumn(name = "horarios_horario_id")
	private Horario horario;
	
	@ManyToOne
	@JoinColumn(name = "participantes_par_id")
	private Participante participante;


	public Integer getIdPublicaciones() {
		return idPublicaciones;
	}


	public void setIdPublicaciones(Integer idPublicaciones) {
		this.idPublicaciones = idPublicaciones;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getEtiqueta() {
		return etiqueta;
	}


	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public Curso getCurso() {
		return curso;
	}


	public void setCurso(Curso curso) {
		this.curso = curso;
	}


	public Horario getHorario() {
		return horario;
	}


	public void setHorario(Horario horario) {
		this.horario = horario;
	}


	public Participante getParticipante() {
		return participante;
	}


	public void setParticipante(Participante participante) {
		this.participante = participante;
	}


	@Override
	public String toString() {
		return "Publicaciones [idPublicaciones=" + idPublicaciones + ", titulo=" + titulo + ", descripcion="
				+ descripcion + ", etiqueta=" + etiqueta + ", estado=" + estado + ", fecha=" + fecha + ", tipo=" + tipo
				+ ", curso=" + curso + ", horario=" + horario + ", participante=" + participante + "]";
	}
	
	
}
