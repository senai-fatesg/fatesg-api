package br.com.ambientinformatica.fatesg.api;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;

public class Curso implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(unique = true)
	private String codigo;
	
	@Enumerated(EnumType.STRING)
	private EnumDescricaoCurso descricao;
	
	@Enumerated(EnumType.STRING)
	private EnumTurnoCurso turno;
	
	@Enumerated(EnumType.STRING)
	private EnumModalidadeCurso modalidade;
	
	private int cargaHoraria;
	
	private String nome;
	
	private String sigla;
	
	private Date dtInicio;
	
	private Date dtTermino;
	
	@OneToMany
	Matriz matriz;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public EnumDescricaoCurso getDescricao() {
		return descricao;
	}

	public void setDescricao(EnumDescricaoCurso descricao) {
		this.descricao = descricao;
	}

	public EnumTurnoCurso getTurno() {
		return turno;
	}

	public void setTurno(EnumTurnoCurso turno) {
		this.turno = turno;
	}

	public EnumModalidadeCurso getModalidade() {
		return modalidade;
	}

	public void setModalidade(EnumModalidadeCurso modalidade) {
		this.modalidade = modalidade;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cargaHoraria;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result
				+ ((dtInicio == null) ? 0 : dtInicio.hashCode());
		result = prime * result
				+ ((dtTermino == null) ? 0 : dtTermino.hashCode());
		result = prime * result
				+ ((modalidade == null) ? 0 : modalidade.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sigla == null) ? 0 : sigla.hashCode());
		result = prime * result + ((turno == null) ? 0 : turno.hashCode());
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
		if (descricao != other.descricao)
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
		return true;
	}
	
}
