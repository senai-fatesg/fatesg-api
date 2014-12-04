package br.com.ambientinformatica.fatesg.api.dao;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.fatesg.api.entidade.Curso;
import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;

@Repository("cursoDao")
public class CursoDaoJpa extends PersistenciaJpa<Curso> implements CursoDao {

	private static final long serialVersionUID = 1L;

	@Override
	public void verificarCampos(Curso curso) {

		String codigo = curso.getId();
		String nome = curso.getNome();
		String descricao = curso.getDescricao();
		int cargaHoraria = curso.getCargaHoraria();
		String sigla = curso.getSigla();

		if (codigo.equals("")) {
			throw new IllegalArgumentException(
					"*Campo Obrigátorio: Código do Curso");
		}
		if (nome.equals("")) {
			throw new IllegalArgumentException(
					"*Campo Obrigátorio: Nome do Curso");
		}
		if (descricao.equals("")) {
			throw new IllegalArgumentException("*Campo Obrigátorio: Descrição");
		}
		if (cargaHoraria == 0) {
			throw new IllegalArgumentException(
					"*Campo Obrigátorio: Carga Horária");
		}
		if (sigla.equals("")) {
			throw new IllegalArgumentException(
					"*Campo Obrigátorio: Sigla do Curso");
		}
	}

	@Override
	public List<Curso> consultarPeloNome(String nome) {
		Session session = this.em.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Curso.class);
		
		if (StringUtils.isNotBlank(nome)) {
			criteria.add(Restrictions.ilike("nome", nome.toUpperCase(), MatchMode.START));
		}
			return criteria.list();
	}
}