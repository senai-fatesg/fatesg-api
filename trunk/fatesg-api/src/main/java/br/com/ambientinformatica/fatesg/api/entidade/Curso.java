package br.com.ambientinformatica.fatesg.api.entidade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Curso implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator="curso_seq", strategy=GenerationType.SEQUENCE )
	@SequenceGenerator(name="curso_seq", sequenceName="curso_seq", initialValue=1, allocationSize=1)
	private Integer id;
	
	private String codigo;

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

	@XmlTransient
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "curso", cascade=CascadeType.ALL, orphanRemoval=true)
	private List<Matriz> matriz = new ArrayList<Matriz>();

	@XmlTransient
	@ManyToMany(mappedBy="cursos", fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Aluno> alunos = new ArrayList<Aluno>();

	@XmlTransient
	@ManyToMany(mappedBy="cursos", fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Colaborador> colaboradores = new ArrayList<Colaborador>();

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
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((dtInicio == null) ? 0 : dtInicio.hashCode());
		result = prime * result + ((dtTermino == null) ? 0 : dtTermino.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((matriz == null) ? 0 : matriz.hashCode());
		result = prime * result + ((modalidade == null) ? 0 : modalidade.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sigla == null) ? 0 : sigla.hashCode());
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
		if (cargaHoraria != other.cargaHoraria)
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
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
		return true;
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", codigo=" + codigo + ", descricao=" + descricao + ", turno=" + turno + ", nome="
				+ nome + ", sigla=" + sigla + "]";
	}
	
	

}
