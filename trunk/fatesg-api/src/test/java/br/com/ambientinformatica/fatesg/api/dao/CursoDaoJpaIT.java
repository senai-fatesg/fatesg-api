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

import br.com.ambientinformatica.fatesg.api.entidade.Curso;

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
	public void listarTodos(){

		try{
			/*
			 * Criar outros testes para metodos existentes
			 */
			List<Curso> parceiros1 = cursoDao.listar();
			Assert.assertEquals(3, parceiros1.size());

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

}
