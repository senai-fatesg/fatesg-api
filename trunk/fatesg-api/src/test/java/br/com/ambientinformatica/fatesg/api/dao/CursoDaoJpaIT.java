package br.com.ambientinformatica.fatesg.api.dao;

import java.sql.Connection;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.solutioin.test.UtilSql;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value="classpath:context.xml")
public class CursoDaoJpaIT {
   
   @Autowired
   private CursoDao cursoDao;
   
   @Autowired
   private DataSource ds;
   
   private static boolean iniciado;
   
   @Before
   public void iniciar(){
      if(!iniciado){
         try {
            Connection con = ds.getConnection();
            UtilSql.executarSql(con, "sql/cursos.sql");
            con.close();
            iniciado = true;
         } catch (Exception e) {
            e.printStackTrace();
         }
      }
   }
   
   @Test
   public void listarParceiroPorNomeNomeCurtoCpfCnpj(){

      try{
         List<Parceiro> parceiros1 = parceiroDao.listarParceiroPorNomeNomeCurtoCpfCnpj("Maria", true, null, null, null);
         Assert.assertEquals(1, parceiros1.size());
         
         List<Parceiro> parceiros2 = parceiroDao.listarParceiroPorNomeNomeCurtoCpfCnpj("Valor", true, true, true, true);
         Assert.assertEquals(1, parceiros2.size());
         
         List<Parceiro> parceiros3 = parceiroDao.listarParceiroPorNomeNomeCurtoCpfCnpj("111.111.222-11", true, null, null, null);
         Assert.assertEquals(1, parceiros3.size());
         
         List<Parceiro> parceiros4 = parceiroDao.listarParceiroPorNomeNomeCurtoCpfCnpj("111.111.222", true, null, null, null);
         Assert.assertEquals(0, parceiros4.size());
         
         List<Parceiro> parceiros5 = parceiroDao.listarParceiroPorNomeNomeCurtoCpfCnpj("01.123.123/0001-98", true, null, null, null);
         Assert.assertEquals(1, parceiros5.size());
         
         List<Parceiro> parceiros6 = parceiroDao.listarParceiroPorNomeNomeCurtoCpfCnpj("01.123.123/0001", true, null, null, null);
         Assert.assertEquals(0, parceiros6.size());
         
         List<Parceiro> parceiros7 = parceiroDao.listarParceiroPorNomeNomeCurtoCpfCnpj(null, true, null, null, null);
         Assert.assertEquals(3, parceiros7.size());
      } catch (Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }
   
   @Test
   public void consultaPorCpfCnpj(){
      try {
         Parceiro parceiro = parceiroDao.consultaPorCpfCnpj("111.111.111-11");
         Assert.assertNotNull(parceiro);
         Assert.assertEquals("Maria do Carmos", parceiro.getNome());

         Parceiro parceiro1 = parceiroDao.consultaPorCpfCnpj("123.123.555-22");
         Assert.assertNull(parceiro1);

      } catch (Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }

}
