package br.com.ambientinformatica.fatesg.api.dao;

import br.com.ambientinformatica.jpa.persistencia.Persistencia;
import br.com.ambientinformatica.fatesg.api.entidade.Aluno;

public interface AlunoDao extends Persistencia<Aluno>{
	
	public void verificarCampos(Aluno aluno);

}
