package br.com.ambientinformatica.fatesg.api.entidade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import br.com.ambientinformatica.util.Entidade;

@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Instituicao extends Entidade implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "instituicao_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "instituicao_seq", sequenceName = "instituicao_seq", allocationSize = 1, initialValue = 1)
	private Integer id;
	
	private Integer chaveInstituicaoCorporatum;

	private String nomeFantasia;

	private String razaoSocial;

	private String inscricaoEstadual;

	private String cnpj;

	private String descricao;

	@XmlTransient
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "instituicao")
	private List<UnidadeEnsino> unidades = new ArrayList<UnidadeEnsino>();

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<UnidadeEnsino> getUnidades() {
		return unidades;
	}

	public void setUnidades(List<UnidadeEnsino> unidades) {
		this.unidades = unidades;
	}

	public Integer getId() {
		return id;
	}

	public Integer getChaveInstituicaoCorporatum() {
		return chaveInstituicaoCorporatum;
	}

	public void setChaveInstituicaoCorporatum(Integer chaveInstituicaoCorporatum) {
		this.chaveInstituicaoCorporatum = chaveInstituicaoCorporatum;
	}

}
