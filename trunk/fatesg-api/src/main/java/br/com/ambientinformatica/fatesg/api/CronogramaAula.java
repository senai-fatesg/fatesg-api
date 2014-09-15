package br.com.ambientinformatica.fatesg.api;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class CronogramaAula implements Serializable {

	/**
	 * author Glaicon Reis
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "cronogramaAula_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "cronogramaAula_seq", sequenceName = "cronogramaAula_seq", allocationSize = 1, initialValue = 1)
	private Long id;
	
	private int aula;
	
	private String conteudoProgramatico;
	
	private int horasAulas;
	
	private Date date;
	
	@Enumerated(EnumType.STRING)
	private EnumRecurso recurso;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAula() {
		return aula;
	}

	public void setAula(int aula) {
		this.aula = aula;
	}

	public String getConteudoProgramatico() {
		return conteudoProgramatico;
	}

	public void setConteudoProgramatico(String conteudoProgramatico) {
		this.conteudoProgramatico = conteudoProgramatico;
	}

	public int getHorasAulas() {
		return horasAulas;
	}

	public void setHorasAulas(int horasAulas) {
		this.horasAulas = horasAulas;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public EnumRecurso getRecurso() {
		return recurso;
	}

	public void setRecurso(EnumRecurso recurso) {
		this.recurso = recurso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + aula;
		result = prime
				* result
				+ ((conteudoProgramatico == null) ? 0 : conteudoProgramatico
						.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + horasAulas;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((recurso == null) ? 0 : recurso.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CronogramaAula other = (CronogramaAula) obj;
		if (aula != other.aula)
			return false;
		if (conteudoProgramatico == null) {
			if (other.conteudoProgramatico != null)
				return false;
		} else if (!conteudoProgramatico.equals(other.conteudoProgramatico))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (horasAulas != other.horasAulas)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (recurso != other.recurso)
			return false;
		return true;
	}
	
}
