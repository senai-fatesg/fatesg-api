package br.com.ambientinformatica.fatesg.api.entidade;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class CronogramaAula implements Serializable {

	/**
	 * author Glaicon Reis
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "cronogramaAula_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "cronogramaAula_seq", sequenceName = "cronogramaAula_seq", allocationSize = 1, initialValue = 1)
	private Long id;
	
	private String aula;
	
	private String conteudoProgramatico;
	
	private int horasAulas;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date data = new Date();
	
	@Enumerated(EnumType.STRING)
	private EnumRecurso recurso;

	@ManyToOne
	@JoinColumn(name = "disciplina_id")
	private Disciplina disciplina;
	
    @ManyToOne
	@JoinColumn(name = "planoDeEnsino_id")
	private PlanoDeEnsino planoDeEnsino;

	public String getAula() {
		return aula;
	}

	public void setAula(String aula) {
		this.aula = aula;
	}	
	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public PlanoDeEnsino getPlanoDeEnsino() {
		return planoDeEnsino;
	}

	public void setPlanoDeEnsino(PlanoDeEnsino planoDeEnsino) {
		this.planoDeEnsino = planoDeEnsino;
	}

	public Long getId() {
		return id;
	}

	public EnumRecurso getRecurso() {
		return recurso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aula == null) ? 0 : aula.hashCode());
		result = prime
				* result
				+ ((conteudoProgramatico == null) ? 0 : conteudoProgramatico
						.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + horasAulas;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((planoDeEnsino == null) ? 0 : planoDeEnsino.hashCode());
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
		if (aula == null) {
			if (other.aula != null)
				return false;
		} else if (!aula.equals(other.aula))
			return false;
		if (conteudoProgramatico == null) {
			if (other.conteudoProgramatico != null)
				return false;
		} else if (!conteudoProgramatico.equals(other.conteudoProgramatico))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (horasAulas != other.horasAulas)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (planoDeEnsino == null) {
			if (other.planoDeEnsino != null)
				return false;
		} else if (!planoDeEnsino.equals(other.planoDeEnsino))
			return false;
		if (recurso != other.recurso)
			return false;
		return true;
	}
	
}
