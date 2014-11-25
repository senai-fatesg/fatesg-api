package br.com.ambientinformatica.fatesg.api.dao;

import java.util.List;

import br.com.ambientinformatica.jpa.persistencia.Persistencia;
import br.com.ambientinformatica.fatesg.api.entidade.Colaborador;

public interface ColaboradorDao extends Persistencia<Colaborador> {
	
	List<Colaborador> consultarPeloNome(String nome);

	public void verificarCampos(Colaborador colaborador);
}
