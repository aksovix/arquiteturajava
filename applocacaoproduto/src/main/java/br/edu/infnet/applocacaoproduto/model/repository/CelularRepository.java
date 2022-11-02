package br.edu.infnet.applocacaoproduto.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.applocacaoproduto.model.domain.Celular;

@Repository
public interface CelularRepository extends CrudRepository<Celular, Integer> {

}
