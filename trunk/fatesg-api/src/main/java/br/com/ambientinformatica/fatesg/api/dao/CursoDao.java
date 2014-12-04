package br.com.ambientinformatica.fatesg.api.dao;

import java.util.List;

import br.com.ambientinformatica.fatesg.api.entidade.Curso;
import br.com.ambientinformatica.jpa.persistencia.Persistencia;

public interface CursoDao extends Persistencia<Curso> {

	List<Curso> consultarPeloNome(String nome);

	public void verificarCampos(Curso curso);
}
