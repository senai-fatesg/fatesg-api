package br.com.ambientinformatica.fatesg.api;

public enum EnumTipoSexo {
	Masculino,   
	Feminino;  
	
	 @Override
	    public String toString() {
	        switch (this) {
	            case Masculino: {
	                return "Masculino";
	            }
	            case Feminino: {
	                return "Feminino";
	            }

	        }
	        return null;
	    }

}
