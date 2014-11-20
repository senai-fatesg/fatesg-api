package br.com.ambientinformatica.fatesg.api.dao;

import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.fatesg.api.CronogramaAula;
import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;

@Repository("cronogramaAulaDao")
public class CronogramaAulaDaoJpa extends PersistenciaJpa<CronogramaAula> implements CronogramaAulaDao{

   private static final long serialVersionUID = 1L;

}
