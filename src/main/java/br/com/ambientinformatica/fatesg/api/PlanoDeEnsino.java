package br.com.ambientinformatica.fatesg.api;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	
	private String metodologiaEnsino;
	
	private String recursoDidatico;
	
	@OneToOne
	@JoinColumn(name="disciplina_id") 
	private Disciplina disciplina; 
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "planoDeEnsino")
	private List<Avaliacao> avaliacoes;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "planoDeEnsino")
	private List<CronogramaAula> cronogramas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getMetodologiaEnsino() {
		return metodologiaEnsino;
	}

	public void setMetodologiaEnsino(String metodologiaEnsino) {
		this.metodologiaEnsino = metodologiaEnsino;
	}

	public String getBaseTecnologica() {
		return baseTecnologica;
	}

	public void setBaseTecnologica(String baseTecnologica) {
		this.baseTecnologica = baseTecnologica;
	}	
	
	public String getRecursoDidatico() {
		return recursoDidatico;
	}

	public void setRecursoDidatico(String recursoDidatico) {
		this.recursoDidatico = recursoDidatico;
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
				+ ((avaliacoes == null) ? 0 : avaliacoes.hashCode());
		result = prime * result
				+ ((baseTecnologica == null) ? 0 : baseTecnologica.hashCode());
		result = prime * result
				+ ((bibliografia == null) ? 0 : bibliografia.hashCode());
		result = prime * result
				+ ((competencia == null) ? 0 : competencia.hashCode());
		result = prime * result
				+ ((cronogramas == null) ? 0 : cronogramas.hashCode());
		result = prime * result
				+ ((disciplina == null) ? 0 : disciplina.hashCode());
		result = prime * result
				+ ((habilidade == null) ? 0 : habilidade.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime
				* result
				+ ((metodologiaEnsino == null) ? 0 : metodologiaEnsino
						.hashCode());
		result = prime * result
				+ ((recursoDidatico == null) ? 0 : recursoDidatico.hashCode());
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
		if (avaliacoes == null) {
			if (other.avaliacoes != null)
				return false;
		} else if (!avaliacoes.equals(other.avaliacoes))
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
		if (cronogramas == null) {
			if (other.cronogramas != null)
				return false;
		} else if (!cronogramas.equals(other.cronogramas))
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
		if (metodologiaEnsino == null) {
			if (other.metodologiaEnsino != null)
				return false;
		} else if (!metodologiaEnsino.equals(other.metodologiaEnsino))
			return false;
		if (recursoDidatico == null) {
			if (other.recursoDidatico != null)
				return false;
		} else if (!recursoDidatico.equals(other.recursoDidatico))
			return false;
		return true;
	}
		
}
