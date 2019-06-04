package tecsup.edu.tecunity.model;

import java.io.Serializable;
import java.sql.Time;

import javax.persistence.*;

@Entity
@Table(name = "horarios")
public class Horarios implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "horario_id")
	private Integer idHorarios;
	
	@Temporal(TemporalType.TIME)
	@Column(name = "hora_inicio")
	private Time horaInicio;
	
	@Temporal(TemporalType.TIME)
	@Column(name = "hora_fin")
	private Time horaFin;

	public Integer getIdHorarios() {
		return idHorarios;
	}

	public void setIdHorarios(Integer idHorarios) {
		this.idHorarios = idHorarios;
	}

	public Time getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Time horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Time getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(Time horaFin) {
		this.horaFin = horaFin;
	}

	@Override
	public String toString() {
		return "Horarios [idHorarios=" + idHorarios + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + "]";
	}

	
}
