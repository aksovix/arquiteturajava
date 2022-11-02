package br.edu.infnet.applocacaoproduto.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.applocacaoproduto.model.domain.Computador;

@Repository
public interface ComputadorRepository extends CrudRepository<Computador, Integer> {

}
