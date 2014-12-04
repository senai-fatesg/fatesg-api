package br.com.ambientinformatica.fatesg.api.dao;

import java.util.List;

import br.com.ambientinformatica.fatesg.api.entidade.Matriz;
import br.com.ambientinformatica.jpa.persistencia.Persistencia;

public interface MatrizDao extends Persistencia<Matriz> {

	List<Matriz> consultarPeloNome(String nome);
	public void verificarCampos(Matriz matriz);
}
