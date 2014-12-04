package br.com.ambientinformatica.fatesg.api.dao;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.fatesg.api.entidade.Matriz;
import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;

@Repository("matrizDao")
public class MatrizDaoJpa extends PersistenciaJpa<Matriz> implements MatrizDao {

	private static final long serialVersionUID = 1L;

	@Override
	public void verificarCampos(Matriz matriz) {

		String descricao = matriz.getDescricao();
		Date date = matriz.getData();
		int qtdPeriodos = matriz.getQtdPeriodos();

		if (descricao.equals("")) {
			throw new IllegalArgumentException("*Campo Obrigátorio: Descrição");
		}
		if (date.equals("")) {
			throw new IllegalArgumentException("*Campo Obrigátorio: Data");
		}
		if (qtdPeriodos == 0) {
			throw new IllegalArgumentException(
					"*Campo Obrigátorio: Quantitade de Periodo");
		}

	}

	@Override
	public List<Matriz> consultarPeloNome(String nome) {
		Session session = this.em.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Matriz.class);

		if (StringUtils.isNotBlank(nome)) {
			criteria.add(Restrictions.ilike("nome", nome.toUpperCase(),
					MatchMode.START));
		}
		return criteria.list();
	}
}
