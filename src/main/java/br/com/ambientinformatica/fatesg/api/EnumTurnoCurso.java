package br.com.ambientinformatica.fatesg.api;

import br.com.ambientinformatica.util.IEnum;

public enum EnumTurnoCurso implements IEnum {

	Matutino("Matutino"), Vespertino("Vespertino"), Noturno("Noturno"), Integral(
			"Integral");

	private final String descricao;

	EnumTurnoCurso(String descricao) {
		this.descricao = descricao;

	}

	@Override
	public String getDescricao() {
		return descricao;
	}

}
