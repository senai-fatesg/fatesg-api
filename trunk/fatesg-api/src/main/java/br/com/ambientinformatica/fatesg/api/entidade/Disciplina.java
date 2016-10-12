package br.com.ambientinformatica.fatesg.api.entidade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
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

@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Disciplina implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator="disciplina_seq", strategy=GenerationType.SEQUENCE )
	@SequenceGenerator(name="disciplina_seq", sequenceName="disciplina_seq", initialValue=1, allocationSize=1)
	private Integer id;

	private String codigo;
	
	private String nome;

	private int cargaHoraria;

	@XmlTransient
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "disciplina", cascade=CascadeType.ALL, orphanRemoval=true)
	private List<CronogramaAula> cronogramas = new ArrayList<CronogramaAula>();

	@XmlTransient
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "disciplina", cascade=CascadeType.ALL)
	private List<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();

	@XmlTransient
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "disciplinas", cascade=CascadeType.ALL)
	private List<Aluno> alunos = new ArrayList<Aluno>();

	@XmlTransient
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "disciplinas", cascade=CascadeType.ALL)
	private List<Colaborador> colaboradores = new ArrayList<Colaborador>();

	@XmlTransient
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "disciplinas", cascade=CascadeType.ALL)
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
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cargaHoraria;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((matrizes == null) ? 0 : matrizes.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Disciplina other = (Disciplina) obj;

		if (cargaHoraria != other.cargaHoraria)
			return false;
		
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (matrizes == null) {
			if (other.matrizes != null)
				return false;
		} else if (!matrizes.equals(other.matrizes))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}
