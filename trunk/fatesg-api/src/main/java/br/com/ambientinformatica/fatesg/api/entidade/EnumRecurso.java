package br.com.ambientinformatica.fatesg.api.entidade;

import br.com.ambientinformatica.util.IEnum;

public enum EnumRecurso implements IEnum{

	LOUSA("Lousa"),
	DATASHOW("DataShow"),
	MULTIMIDIA("Multimídia"),
	PALESTRA("Palestra"),
	LABORATORIO_INFORMATICA("Laboratório");

	private final String descricao;


	private EnumRecurso(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String getDescricao() {
		return descricao;
	}

}