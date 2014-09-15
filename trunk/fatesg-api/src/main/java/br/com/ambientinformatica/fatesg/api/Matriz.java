package br.com.ambientinformatica.fatesg.api;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Matriz implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "matriz_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "matriz_seq", sequenceName = "matriz_seq", allocationSize = 1, initialValue = 1)
	private Long id;
	
	private String descricao;
	
	private Date data;
	
	private String qtdPeriodos;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getQtdPeriodos() {
		return qtdPeriodos;
	}

	public void setQtdPeriodos(String qtdPeriodos) {
		this.qtdPeriodos = qtdPeriodos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((qtdPeriodos == null) ? 0 : qtdPeriodos.hashCode());
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
		Matriz other = (Matriz) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (qtdPeriodos == null) {
			if (other.qtdPeriodos != null)
				return false;
		} else if (!qtdPeriodos.equals(other.qtdPeriodos))
			return false;
		return true;
	}
	
	

}
