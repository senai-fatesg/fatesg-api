package br.com.ambientinformatica.fatesg.api;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Avaliacao implements Serializable {

	/**
	 * @author Glaicon Reis
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "avaliacao_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "avaliacao_seq", sequenceName = "avaliacao_seq", allocationSize = 1, initialValue = 1)
	private Long id;
	
	private String tipo;
	
	private String criterio;
	
	private String observacao;

	@ManyToOne 
	@JoinColumn(name="planoDeEnsino_id")
	private PlanoDeEnsino planoDeEnsino;
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCriterio() {
		return criterio;
	}

	public void setCriterio(String criterio) {
		this.criterio = criterio;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((criterio == null) ? 0 : criterio.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((observacao == null) ? 0 : observacao.hashCode());
		result = prime * result
				+ ((planoDeEnsino == null) ? 0 : planoDeEnsino.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		Avaliacao other = (Avaliacao) obj;
		if (criterio == null) {
			if (other.criterio != null)
				return false;
		} else if (!criterio.equals(other.criterio))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (observacao == null) {
			if (other.observacao != null)
				return false;
		} else if (!observacao.equals(other.observacao))
			return false;
		if (planoDeEnsino == null) {
			if (other.planoDeEnsino != null)
				return false;
		} else if (!planoDeEnsino.equals(other.planoDeEnsino))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}
	
	
}
