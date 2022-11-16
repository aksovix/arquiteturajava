package br.edu.infnet.applocacaoproduto.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.applocacaoproduto.model.domain.Locatario;

@Repository
public interface LocatarioRepository extends CrudRepository<Locatario, Integer> {

	@Query("select loc 					   "
		 + " from Locatario loc			   "
		 + " where loc.usuario.id = :userid")
	List<Locatario> obterLista(Integer userid);
}
