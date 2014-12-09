package br.com.ambientinformatica.fatesg.api.entidade;

import br.com.ambientinformatica.util.IEnum;

public enum EnumTipoSexo implements IEnum{
	
	MASCULINO("Masculino"), 
	FEMININO("Feminino");

	private final String descricao;

	EnumTipoSexo(String descricao) {
		this.descricao = descricao;
			
	}

	@Override
	public String getDescricao() {
		return descricao;
	}
}

