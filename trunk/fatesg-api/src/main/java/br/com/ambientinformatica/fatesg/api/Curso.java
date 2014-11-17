package br.com.ambientinformatica.fatesg.api;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Curso implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String descricao;

	@Enumerated(EnumType.STRING)
	private EnumTurnoCurso turno;

	@Enumerated(EnumType.STRING)
	private EnumModalidadeCurso modalidade;

	private int cargaHoraria;

	private String nome;

	private String sigla;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dtInicio = new Date();

	@Temporal(TemporalType.TIMESTAMP)
	private Date dtTermino = new Date();

	@ManyToOne
	@JoinColumn(name = "unidadeEnsino_id")
	private UnidadeEnsino unidadeEnsino;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "curso")
	private List<Matriz> matriz;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "cursos", targetEntity = Aluno.class)
	private List<Aluno> alunos;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "cursos", targetEntity = Colaborador.class)
	private List<Colaborador> colaboradores;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public Date getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	public Date getDtTermino() {
		return dtTermino;
	}

	public void setDtTermino(Date dtTermino) {
		this.dtTermino = dtTermino;
	}

	public UnidadeEnsino getUnidadeEnsino() {
		return unidadeEnsino;
	}

	public void setUnidadeEnsino(UnidadeEnsino unidadeEnsino) {
		this.unidadeEnsino = unidadeEnsino;
	}

	public List<Matriz> getMatriz() {
		return matriz;
	}

	public void setMatriz(List<Matriz> matriz) {
		this.matriz = matriz;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public EnumTurnoCurso getTurno() {
		return turno;
	}

	public EnumModalidadeCurso getModalidade() {
		return modalidade;
	}

	public void setTurno(EnumTurnoCurso turno) {
		this.turno = turno;
	}

	public void setModalidade(EnumModalidadeCurso modalidade) {
		this.modalidade = modalidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alunos == null) ? 0 : alunos.hashCode());
		result = prime * result + cargaHoraria;
		result = prime * result
				+ ((colaboradores == null) ? 0 : colaboradores.hashCode());
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result
				+ ((dtInicio == null) ? 0 : dtInicio.hashCode());
		result = prime * result
				+ ((dtTermino == null) ? 0 : dtTermino.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((matriz == null) ? 0 : matriz.hashCode());
		result = prime * result
				+ ((modalidade == null) ? 0 : modalidade.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sigla == null) ? 0 : sigla.hashCode());
		result = prime * result + ((turno == null) ? 0 : turno.hashCode());
		result = prime * result
				+ ((unidadeEnsino == null) ? 0 : unidadeEnsino.hashCode());
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
		Curso other = (Curso) obj;
		if (alunos == null) {
			if (other.alunos != null)
				return false;
		} else if (!alunos.equals(other.alunos))
			return false;
		if (cargaHoraria != other.cargaHoraria)
			return false;
		if (colaboradores == null) {
			if (other.colaboradores != null)
				return false;
		} else if (!colaboradores.equals(other.colaboradores))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (dtInicio == null) {
			if (other.dtInicio != null)
				return false;
		} else if (!dtInicio.equals(other.dtInicio))
			return false;
		if (dtTermino == null) {
			if (other.dtTermino != null)
				return false;
		} else if (!dtTermino.equals(other.dtTermino))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (matriz == null) {
			if (other.matriz != null)
				return false;
		} else if (!matriz.equals(other.matriz))
			return false;
		if (modalidade != other.modalidade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sigla == null) {
			if (other.sigla != null)
				return false;
		} else if (!sigla.equals(other.sigla))
			return false;
		if (turno != other.turno)
			return false;
		if (unidadeEnsino == null) {
			if (other.unidadeEnsino != null)
				return false;
		} else if (!unidadeEnsino.equals(other.unidadeEnsino))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", descricao=" + descricao + ", turno="
				+ turno + ", modalidade=" + modalidade + ", cargaHoraria="
				+ cargaHoraria + ", nome=" + nome + ", sigla=" + sigla
				+ ", dtInicio=" + dtInicio + ", dtTermino=" + dtTermino
				+ ", unidadeEnsino=" + unidadeEnsino + ", matriz=" + matriz
				+ ", alunos=" + alunos + ", colaboradores=" + colaboradores
				+ "]";
	}

}
