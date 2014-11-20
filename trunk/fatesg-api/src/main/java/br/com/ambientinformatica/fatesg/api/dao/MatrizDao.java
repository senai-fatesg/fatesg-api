package br.com.ambientinformatica.fatesg.api.dao;

import br.com.ambientinformatica.fatesg.api.Matriz;
import br.com.ambientinformatica.jpa.persistencia.Persistencia;

public interface MatrizDao extends Persistencia<Matriz> {

	public void verificarCampos(Matriz matriz);
}
