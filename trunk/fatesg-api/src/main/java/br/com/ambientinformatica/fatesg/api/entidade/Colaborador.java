package br.com.ambientinformatica.fatesg.api.entidade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import br.com.ambientinformatica.util.AmbientValidator;
import br.com.ambientinformatica.util.Entidade;
import br.com.ambientinformatica.util.UtilHash;
import br.com.ambientinformatica.util.UtilHash.Algoritimo;

@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Colaborador extends Entidade implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "colaborador_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "colaborador_seq", sequenceName = "colaborador_seq", allocationSize = 1, initialValue = 1)
	private Integer id;

	private String nome;

	private String senha;

	@Column(unique = true)
	private String cpfCnpj;

	private String rg;

	@Enumerated(EnumType.STRING)
	private EnumTipoSexo tipoSexo;

	private String tituloEleitor;

	private String reservista;

	private String telefone;

	private String celular;

	private String email;

	private String endereco;

	private String cep;

	private String historico;

	private boolean alterarSenha = false;

	private boolean confirmado = false;

	@Temporal(TemporalType.DATE)
	private Date dataAlteracaoSenha = new Date();

	@Temporal(TemporalType.DATE)
	private Date dataCriacao = new Date();

	@Temporal(TemporalType.DATE)
	private Date dataUltimoAcesso = new Date();

	@ManyToOne(optional=false)
	@NotNull(message="Informe o municipio", groups=AmbientValidator.class)
	private Municipio municipio;

	@Enumerated(EnumType.STRING)
	private EnumTipoColaborador tipo;

	@XmlTransient
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Curso> cursos = new ArrayList<Curso>();

	@XmlTransient
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	@ElementCollection(targetClass = EnumPapelUsuario.class,fetch = FetchType.EAGER)
	@Enumerated(EnumType.STRING)
	private Set<EnumPapelUsuario> papeis = new HashSet<>();

	public List<EnumPapelUsuario> getPapeisList(){
		return new ArrayList<EnumPapelUsuario>(this.papeis);
	}

	public void addPapel(EnumPapelUsuario papel){
		if(!this.isContemPapel(papel)){
			this.papeis.add(papel);
		}
	}
	public void removerPapel(EnumPapelUsuario papel) {
		if(this.isContemPapel(papel)){
			this.papeis.remove(papel);
		}
	}
	public boolean isContemPapel(EnumPapelUsuario papel){
		if(papeis != null){
			return papeis.contains(papel);
		}else{
			return false;
		}
	}

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
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getHistorico() {
		return historico;
	}
	public void setHistorico(String historico) {
		this.historico = historico;
	}
	public Integer getId() {
		return id;
	}
	public EnumTipoSexo getTipoSexo() {
		return tipoSexo;
	}
	public EnumTipoColaborador getTipo() {
		return tipo;
	}
	public void setTipoSexo(EnumTipoSexo tipoSexo) {
		this.tipoSexo = tipoSexo;
	}
	public void setTipo(EnumTipoColaborador tipo) {
		this.tipo = tipo;
	}
	public List<Curso> getCursos() {
		return cursos;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenhaNaoCriptografada(String senha) {
		this.senha = UtilHash.gerarStringHash(senha, Algoritimo.MD5);
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
	public Municipio getMunicipio() {
		return municipio;
	}
	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}
	public Date getDataAlteracaoSenha() {
		return (dataAlteracaoSenha != null ? (Date) dataAlteracaoSenha.clone(): null);
	}
	public void setDataAlteracaoSenha(Date dataAlteracaoSenha) {
		this.dataAlteracaoSenha = (dataAlteracaoSenha != null ? (Date) dataAlteracaoSenha.clone(): null);
	}
	public Date getDataUltimoAcesso() {
		return (dataUltimoAcesso != null ? (Date) dataUltimoAcesso.clone(): null);
	}
	public void setDataUltimoAcesso(Date dataUltimoAcesso) {
		this.dataUltimoAcesso = (dataUltimoAcesso != null ? (Date) dataUltimoAcesso.clone(): null);
	}
	public Date getDataCriacao() {
		return (dataCriacao != null ? (Date) dataCriacao.clone(): null);
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = (dataCriacao != null ? (Date) dataCriacao.clone(): null);
	}
	public Set<EnumPapelUsuario> getPapeis() {
		return papeis;
	}
	public void setPapeis(Set<EnumPapelUsuario> papeis) {
		this.papeis = papeis;
	}
	public boolean isAlterarSenha() {
		return alterarSenha;
	}
	public void setAlterarSenha(boolean alterarSenha) {
		this.alterarSenha = alterarSenha;
	}
	public boolean isConfirmado() {
		return confirmado;
	}
	public void setConfirmado(boolean confirmado) {
		this.confirmado = confirmado;
	}


}
