package br.com.ambientinformatica.fatesg.api;

import br.com.ambientinformatica.util.IEnum;

public enum EnumModalidadeCurso implements IEnum {

	EAD("EAD"), 
	APERFEICOAMENTO("Aperfeiçoamento"), 
	TECNICO("Técnico"), 
	TECNOLOGO("Tecnólogo"), 
	GRADUACAO("Graduação"), 
	POS_GRADUCAO("Pós_Graduação");

	private final String descricao;

	private EnumModalidadeCurso(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String getDescricao() {
		return descricao;
	}
}
