package br.com.ambientinformatica.fatesg.api.entidade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.ambientinformatica.util.Entidade;

@Entity
public class Matriz extends Entidade implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "matriz_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "matriz_seq", sequenceName = "matriz_seq", allocationSize = 1, initialValue = 1)
	private Long id;

	private String descricao;

	@Temporal(TemporalType.TIMESTAMP)
	private Date data = new Date();

	private int qtdPeriodos;

	@ManyToOne
	@JoinColumn(name="id_curso")
	private Curso curso;

	@ManyToMany
	private List<Disciplina> disciplinas = new ArrayList<>();

	public void add(Disciplina disciplina){
		if(!this.disciplinas.contains(disciplina)){
			this.disciplinas.add(disciplina);
		}
	}

	public void remover(Disciplina disciplina) {
		if(this.disciplinas.contains(disciplina)){
			this.disciplinas.remove(disciplina);
		}
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

	public int getQtdPeriodos() {
		return qtdPeriodos;
	}

	public void setQtdPeriodos(int qtdPeriodos) {
		this.qtdPeriodos = qtdPeriodos;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Long getId() {
		return id;
	}

}
