package br.com.ambientinformatica.fatesg.api.entidade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import br.com.ambientinformatica.util.AmbientValidator;
import br.com.ambientinformatica.util.Entidade;
import br.com.ambientinformatica.util.UtilCpf;



@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Aluno extends Entidade implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "aluno_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "aluno_seq", sequenceName = "aluno_seq", allocationSize = 1, initialValue = 1)
	private Long id;

	private String nome;

	@Column(unique = true)
	private String cpfCnpj;

	private String rg;

	@Enumerated(EnumType.STRING)
	private EnumTipoSexo tipoSexo;

	@Enumerated(EnumType.STRING)
	private EnumStatusAluno status = EnumStatusAluno.ATIVO;

	private String tituloEleitor;

	private String reservista;

	private String telefone;

	private String celular;

	private String email;

	private String endereco;

	@ManyToOne(optional=false)
	@NotNull(message="Informe o municipio", groups=AmbientValidator.class)
	private Municipio municipio;

	private String cep;

	private String certificado2Grau;

	@XmlTransient
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Curso> cursos = new ArrayList<Curso>();

	@XmlTransient
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getTituloEleitor() {
		return tituloEleitor;
	}

	public void setTituloEleitor(String tituloEleitor) {
		this.tituloEleitor = tituloEleitor;
	}

	public String getReservista() {
		return reservista;
	}

	public void setReservista(String reservista) {
		this.reservista = reservista;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCertificado2Grau() {
		return certificado2Grau;
	}

	public void setCertificado2Grau(String certificado2Grau) {
		this.certificado2Grau = certificado2Grau;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
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

	public EnumTipoSexo getTipoSexo() {
		return tipoSexo;
	}

	public void setTipoSexo(EnumTipoSexo tipoSexo) {
		this.tipoSexo = tipoSexo;
	}

	public EnumStatusAluno getStatus() {
		return status;
	}

	public void setStatus(EnumStatusAluno status) {
		this.status = status;
	}

}
