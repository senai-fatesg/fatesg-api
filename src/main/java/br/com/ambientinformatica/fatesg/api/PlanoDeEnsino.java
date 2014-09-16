package br.com.ambientinformatica.fatesg.api;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class PlanoDeEnsino implements Serializable{

	/**
	 * author Glaicon Reis
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "planoDeEnsino_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "planoDeEnsino_seq", sequenceName = "planoDeEnsino_seq", allocationSize = 1, initialValue = 1)
	private Long id;
	
	private String competencia;
	
	private String habilidade;
	
	private String baseTecnologica;
	
	private String bibliografia;
	
	@OneToMany
	Avaliacao avaliacao;
	
	@OneToMany
	CronogramaAula cronogramaAula;
	
	@OneToOne
	Disciplina disciplina;

	public Long getId() {
		return id;
	}

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}


	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}


	public CronogramaAula getCronogramaAula() {
		return cronogramaAula;
	}


	public void setCronogramaAula(CronogramaAula cronogramaAula) {
		this.cronogramaAula = cronogramaAula;
	}


	public Disciplina getDisciplina() {
		return disciplina;
	}


	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}


	public String getCompetencia() {
		return competencia;
	}

	public void setCompetencia(String competencia) {
		this.competencia = competencia;
	}

	public String getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(String habilidade) {
		this.habilidade = habilidade;
	}

	public String getBaseTecnologica() {
		return baseTecnologica;
	}

	public void setBaseTecnologica(String baseTecnologica) {
		this.baseTecnologica = baseTecnologica;
	}

	public String getBibliografia() {
		return bibliografia;
	}

	public void setBibliografia(String bibliografia) {
		this.bibliografia = bibliografia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((avaliacao == null) ? 0 : avaliacao.hashCode());
		result = prime * result
				+ ((baseTecnologica == null) ? 0 : baseTecnologica.hashCode());
		result = prime * result
				+ ((bibliografia == null) ? 0 : bibliografia.hashCode());
		result = prime * result
				+ ((competencia == null) ? 0 : competencia.hashCode());
		result = prime * result
				+ ((cronogramaAula == null) ? 0 : cronogramaAula.hashCode());
		result = prime * result
				+ ((disciplina == null) ? 0 : disciplina.hashCode());
		result = prime * result
				+ ((habilidade == null) ? 0 : habilidade.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		PlanoDeEnsino other = (PlanoDeEnsino) obj;
		if (avaliacao == null) {
			if (other.avaliacao != null)
				return false;
		} else if (!avaliacao.equals(other.avaliacao))
			return false;
		if (baseTecnologica == null) {
			if (other.baseTecnologica != null)
				return false;
		} else if (!baseTecnologica.equals(other.baseTecnologica))
			return false;
		if (bibliografia == null) {
			if (other.bibliografia != null)
				return false;
		} else if (!bibliografia.equals(other.bibliografia))
			return false;
		if (competencia == null) {
			if (other.competencia != null)
				return false;
		} else if (!competencia.equals(other.competencia))
			return false;
		if (cronogramaAula == null) {
			if (other.cronogramaAula != null)
				return false;
		} else if (!cronogramaAula.equals(other.cronogramaAula))
			return false;
		if (disciplina == null) {
			if (other.disciplina != null)
				return false;
		} else if (!disciplina.equals(other.disciplina))
			return false;
		if (habilidade == null) {
			if (other.habilidade != null)
				return false;
		} else if (!habilidade.equals(other.habilidade))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}