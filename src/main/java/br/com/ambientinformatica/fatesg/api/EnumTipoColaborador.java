package br.com.ambientinformatica.fatesg.api;

import br.com.ambientinformatica.util.IEnum;

public enum EnumTipoColaborador implements IEnum {
	
	ADMINISTRATIVO("Administrativo"),
	PROFESSOR("Professor"),
	ORIENTADOR_ESTAGIO("Orientador Estágio"),
	ORIENTADOR_TCC("Orientador TCC"),
	PESQUISADOR("Pesquisador"),
	COORDENADOR_DE_ESTAGIO("Coordenador de Estágio"),
	COORDENADOR_DE_CURSO("Coordenador de Curso"),
	COORDENADOR_PEDAGOGICO("Coordenador Pedagógico"),
	GERENTE_EDUCACIONAL("Gerente Educacional"),
	DIRETOR("Diretor");
	
	private final String descricao;

	EnumTipoColaborador(String descricao) {
		this.descricao = descricao;
			
	}
	@Override
	public String getDescricao() {
		return descricao;
	}

	
}
