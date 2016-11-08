package br.com.ambientinformatica.fatesg.api.entidade;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import br.com.ambientinformatica.util.Entidade;

@Entity
public class UnidadeEnsino extends Entidade implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "unidadeEnsino_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "unidadeEnsino_seq", sequenceName = "unidadeEnsino_seq", allocationSize = 1, initialValue = 1)
	private Integer id;
	
	private Integer chaveUnidadeEnsinoCorporatum;
	
	private String nome;
	
	private String endereco;
	
	private String telefone;
	
	private String sigla;
	
	@ManyToOne
	@JoinColumn(name = "instituicao_id")
	private Instituicao instituicao;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "unidadeEnsino")
	private List<Curso> cursos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public Instituicao getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public Integer getId() {
		return id;
	}

	public Integer getChaveUnidadeEnsinoCorporatum() {
		return chaveUnidadeEnsinoCorporatum;
	}

	public void setChaveUnidadeEnsinoCorporatum(Integer chaveUnidadeEnsinoCorporatum) {
		this.chaveUnidadeEnsinoCorporatum = chaveUnidadeEnsinoCorporatum;
	}
	
}
