package br.com.ambientinformatica.fatesg.api.util;

import br.com.ambientinformatica.fatesg.api.entidade.Aluno;

import com.thoughtworks.xstream.XStream;

public class UtilXml {

   private static XStream xstream;

   static{
      xstream = new XStream();
      xstream.alias("pessoa", Aluno.class);
      xstream.alias("erro", ErroFatesgAPI.class);
   }
   
   public static XStream getXStreamInstance(){
      return xstream;
   }
   
   public static Object fromXml(String xml){
//      System.out.println("\n\n\n" + xml + "\n------------------------------------\n\n\n");
      return xstream.fromXML(xml);
   }
   
   public static String toXml(Object obj){
      String xml = xstream.toXML(obj);
//      System.out.println("\n\n\n" + xml + "\n------------------------------------\n\n\n");
      return xml;
   }
   
   public static String toXmlErro(Throwable t){
      ErroFatesgAPI erro = new ErroFatesgAPI(t);
      erro.setMensagem(t.getMessage());
      String xml = xstream.toXML(erro); 
//      System.out.println("\n\n\n" + xml + "\n------------------------------------\n\n\n");
      return xml; 
   }
}
