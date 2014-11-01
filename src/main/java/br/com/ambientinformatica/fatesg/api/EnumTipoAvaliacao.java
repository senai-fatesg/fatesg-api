package br.com.ambientinformatica.fatesg.api;

import br.com.ambientinformatica.util.IEnum;

public enum EnumTipoAvaliacao implements IEnum{
	N1("N1"),
	N2("N2"),
	NT("NT");

	private final String descricao;
	
	EnumTipoAvaliacao(String descricao) {
		this.descricao = descricao;			
	}
	@Override
	public String getDescricao() {
		return descricao;
	}
}
