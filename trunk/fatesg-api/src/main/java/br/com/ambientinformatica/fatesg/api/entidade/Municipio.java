package br.com.ambientinformatica.fatesg.api.entidade;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import br.com.ambientinformatica.util.Entidade;

@Entity
public class Municipio extends Entidade implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator="municipio_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="municipio_seq", sequenceName="municipio_seq", allocationSize=1, initialValue=1)
	private Integer id;
	
	private Integer codigoIbge;
	
	private Integer codigoTc;
	
	private String descricao;
	
	@Enumerated(EnumType.STRING)
	private EnumUf uf;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCodigoIbge() {
		return codigoIbge;
	}

	public void setCodigoIbge(Integer codigoIbge) {
		this.codigoIbge = codigoIbge;
	}

	public Integer getCodigoTc() {
		return codigoTc;
	}

	public void setCodigoTc(Integer codigoTc) {
		this.codigoTc = codigoTc;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public EnumUf getUf() {
		return uf;
	}

	public void setUf(EnumUf uf) {
		this.uf = uf;
	}
	
}
