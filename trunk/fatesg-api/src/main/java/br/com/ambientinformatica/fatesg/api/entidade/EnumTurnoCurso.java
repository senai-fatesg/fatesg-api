package br.com.ambientinformatica.fatesg.api.entidade;

import br.com.ambientinformatica.util.IEnum;

public enum EnumTurnoCurso implements IEnum {

	MATUTINO("Matutino"), 
	VESPERTINO("Vespertino"), 
	NOTURNO("Noturno"), 
	INTEGRAL("Integral");

	private final String descricao;

	EnumTurnoCurso(String descricao) {
		this.descricao = descricao;

	}

	@Override
	public String getDescricao() {
		return descricao;
	}

}
