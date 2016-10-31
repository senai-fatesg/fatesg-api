package br.com.ambientinformatica.fatesg.api.entidade;

import br.com.ambientinformatica.util.IEnum;

public enum EnumPapelUsuario implements IEnum{

	   ADMIN("Administrador"),
	   USUARIO("Usuário"),
		PROFESSOR("professor");
		
		private final String descricao;
		
		private EnumPapelUsuario(String descricao) {
			this.descricao = descricao;
		}

		@Override
		public String getDescricao() {
			return descricao;
		}
   
}
