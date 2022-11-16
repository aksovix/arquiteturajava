package br.edu.infnet.applocacaoproduto.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.applocacaoproduto.model.domain.Locacao;

@Repository
public interface LocacaoRepository extends CrudRepository<Locacao, Integer> {
	
	@Query("select loc 					  "
		 + "  from Locacao loc 			  "
		 + " where loc.usuario.id =:userid")	
	List<Locacao> obterLista(Integer userid);

}
