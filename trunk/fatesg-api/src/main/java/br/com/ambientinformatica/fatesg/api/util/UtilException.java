package br.com.ambientinformatica.fatesg.api.util;

import java.sql.SQLException;

public class UtilException {

   private static String lerExceptionRecursivamente(Throwable t, String ident){
      StringBuffer resp = new StringBuffer();
      if(t != null){
         resp.append(String.format("%s%s:%s  %s%n", ident, t.getClass().getName(), t.getMessage(), t.getLocalizedMessage()));
         for(StackTraceElement ste : t.getStackTrace()){
            resp.append(String.format("%s   at %s.%s(%s:%d)%n", ident, ste.getClassName(), ste.getMethodName(), ste.getFileName(), ste.getLineNumber()));
         }
         if(t instanceof SQLException){
            SQLException sqle = (SQLException) t;
            if(sqle.getNextException() != null){
               resp.append(String.format("%s-----%ncalling getNextException():%n%s%n-----", ident, lerExceptionRecursivamente(sqle.getNextException(), "")));
            }
         }
         resp.append(String.format("----------------------------------%n"));
         if(t.getCause() != null){
            resp.append(lerExceptionRecursivamente(t.getCause(), ident + "   "));
         }
      }
      return resp.toString();
   }
   
   public static String lerException(Throwable t){
      return lerExceptionRecursivamente(t, "");
   }
   

}
