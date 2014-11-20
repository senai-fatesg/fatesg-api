package br.com.ambientinformatica.fatesg.api.dao;

import java.util.List;

import br.com.ambientinformatica.fatesg.api.Instituicao;
import br.com.ambientinformatica.jpa.persistencia.Persistencia;

public interface InstituicaoDao extends Persistencia<Instituicao>{
	
	List<Instituicao> consultarPeloNome(String nomeFantasia);

	public void verificarCampos(Instituicao instituicao);

}
