package br.com.ambientinformatica.fatesg.api;

import br.com.ambientinformatica.util.IEnum;

public enum EnumTipoColaborador implements IEnum {
	Administrativo("Administrativo"),
	Professor("Professor"),
	Orientador_Estágio("Orientador_Estágio"),
	Orientador_TCC("Orientador_TCC"),
	Pesquisador("Pesquisador"),
	Coordenador_de_Estagio("Coordenador_de_Estagio"),
	Coordenador_de_Curso("Coordenador_de_Curso"),
	Coordenador_Pedagógico("Coordenador_Pedagógico"),
	Gerente_Educacional("Gerente_Educacional"),
	Diretor("Diretor");
	
	private final String descricao;

	EnumTipoColaborador(String descricao) {
		this.descricao = descricao;
			
	}
	@Override
	public String getDescricao() {
		return descricao;
	}

	
}
