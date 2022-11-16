package br.edu.infnet.applocacaoproduto.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.applocacaoproduto.model.domain.Locatario;


//@FeignClient(url = "${app.locatario-api.url}", name = "locatarioClient")
public interface LocatarioClient {

//	@PostMapping(value = "/incluir")
//	public void incluir(@RequestBody Locatario locatario);
//	
//	@DeleteMapping(value = "/{id}/excluir")
//	public void excluir(@PathVariable Integer id);
//	
//	@GetMapping(value = "/{id}")
//	public List<Locatario> obterPorId(@PathVariable Integer id);
//	
//	@GetMapping(value = "/listar")
//	public List<Locatario> obterLista();
	
}