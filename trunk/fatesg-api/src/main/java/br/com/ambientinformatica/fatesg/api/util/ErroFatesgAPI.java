package br.com.ambientinformatica.fatesg.api.util;


public class ErroFatesgAPI {

   private String mensagem;
   
   private String stackTrace;
   
   public ErroFatesgAPI() {

   }
   
   public ErroFatesgAPI(Throwable t) {
      this.stackTrace = UtilException.lerException(t);
   }

   public String getStackTrace() {
      return stackTrace;
   }

   public void setStackTrace(String stackTrace) {
      this.stackTrace = stackTrace;
   }

   public String getMensagem() {
      return mensagem;
   }

   public void setMensagem(String mensagem) {
      this.mensagem = mensagem;
   }
   
}
