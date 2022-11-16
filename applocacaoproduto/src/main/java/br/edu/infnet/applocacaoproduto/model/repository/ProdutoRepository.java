package br.edu.infnet.applocacaoproduto.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.applocacaoproduto.model.domain.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
	
	@Query("select pro					  "
		 + " from Produto pro			  "
		 + " where pro.usuario.id =:userid")
	List<Produto> obterLista(Integer userid);

}
