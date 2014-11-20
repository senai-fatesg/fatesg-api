package br.com.ambientinformatica.fatesg.api.dao;

import br.com.ambientinformatica.fatesg.api.Curso;
import br.com.ambientinformatica.jpa.persistencia.Persistencia;

public interface CursoDao extends Persistencia<Curso>{
	
	public void verificarCampos(Curso curso);
}
