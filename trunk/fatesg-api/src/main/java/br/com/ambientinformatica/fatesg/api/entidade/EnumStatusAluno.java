package br.com.ambientinformatica.fatesg.api.entidade;

import br.com.ambientinformatica.util.IEnum;

public enum EnumStatusAluno implements IEnum{

	ATIVO("Ativo"),
	EVADIDO("Evadido"),
	INATIVO("Inativo");
	
	private final String descricao;

	private EnumStatusAluno(String descricao) {
	   this.descricao = descricao;
   }

	public String getDescricao() {
		return descricao;
	}
}
