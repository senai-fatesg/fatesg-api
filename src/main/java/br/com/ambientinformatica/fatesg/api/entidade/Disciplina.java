package br.com.ambientinformatica.fatesg.api.entidade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
public class Disciplina extends Entidade implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator="disciplina_seq", strategy=GenerationType.SEQUENCE )
	@SequenceGenerator(name="disciplina_seq", sequenceName="disciplina_seq", initialValue=1, allocationSize=1)
	private Integer id;
	
	private Integer chaveDisciplinaCorporatum;

	private String codigo;
	
	private String nome;

	private int cargaHoraria;

	@XmlTransient
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "disciplina")
	private List<CronogramaAula> cronogramas = new ArrayList<CronogramaAula>();

	@XmlTransient
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "disciplina")
	private List<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();

	@XmlTransient
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "disciplinas")
	private List<Aluno> alunos = new ArrayList<Aluno>();

	@XmlTransient
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "disciplinas")
	private List<Colaborador> colaboradores = new ArrayList<Colaborador>();

	@XmlTransient
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "disciplinas")
	private List<Matriz> matrizes = new ArrayList<Matriz>();



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public List<Colaborador> getColaboradores() {
		return colaboradores;
	}

	public void setColaboradores(List<Colaborador> colaboradores) {
		this.colaboradores = colaboradores;
	}

	public List<Matriz> getMatrizes() {
		return matrizes;
	}

	public void setMatrizes(List<Matriz> matrizes) {
		this.matrizes = matrizes;
	}
	

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Integer getId() {
		return id;
	}

	public Integer getChaveDisciplinaCorporatum() {
		return chaveDisciplinaCorporatum;
	}

	public void setChaveDisciplinaCorporatum(Integer chaveDisciplinaCorporatum) {
		this.chaveDisciplinaCorporatum = chaveDisciplinaCorporatum;
	}
	
}
