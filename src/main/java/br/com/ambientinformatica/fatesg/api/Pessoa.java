package br.com.ambientinformatica.fatesg.api;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator="pessoa_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="pessoa_seq", sequenceName="pessoa_seq", allocationSize=1, initialValue=1)
   private Long id;
   
	@Column(unique=true)
   private Long cpfCnpj;
   
   private String nome;
   
   private String endereco;
   
   private String municipio;
   
   private String uf;
   
   private String cep;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public Long getCpfCnpj() {
      return cpfCnpj;
   }

   public void setCpfCnpj(Long cpfCnpj) {
      this.cpfCnpj = cpfCnpj;
   }

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

   public String getMunicipio() {
      return municipio;
   }

   public void setMunicipio(String municipio) {
      this.municipio = municipio;
   }

   public String getUf() {
      return uf;
   }

   public void setUf(String uf) {
      this.uf = uf;
   }

   public String getCep() {
      return cep;
   }

   public void setCep(String cep) {
      this.cep = cep;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((id == null) ? 0 : id.hashCode());
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
      Pessoa other = (Pessoa) obj;
      if (id == null) {
         if (other.id != null)
            return false;
      } else if (!id.equals(other.id))
         return false;
      return true;
   }
   
   
}
