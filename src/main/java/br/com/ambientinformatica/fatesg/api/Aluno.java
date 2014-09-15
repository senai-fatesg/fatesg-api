package br.com.ambientinformatica.fatesg.api;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Aluno implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "aluno_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "aluno_seq", sequenceName = "aluno_seq", allocationSize = 1, initialValue = 1)
	private Long id;

	private String certificado2Grau;
	
	@Enumerated(EnumType.STRING)
	private EnumStatusAluno status;

	public Long getId() {
		return id;
	}

	public String getCertificado2Grau() {
		return certificado2Grau;
	}

	public void setCertificado2Grau(String certificado2Grau) {
		this.certificado2Grau = certificado2Grau;
	}	
	
	public EnumStatusAluno getStatus() {
		return status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((certificado2Grau == null) ? 0 : certificado2Grau.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		Aluno other = (Aluno) obj;
		if (certificado2Grau == null) {
			if (other.certificado2Grau != null)
				return false;
		} else if (!certificado2Grau.equals(other.certificado2Grau))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (status != other.status)
			return false;
		return true;
	}		
	
}
