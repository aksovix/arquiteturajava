package br.edu.infnet.applocacaoproduto.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.applocacaoproduto.model.domain.Endereco;


@FeignClient(url = "https://viacep.com.br/ws", name = "cepClient")
public interface CepClient {

	@GetMapping(value = "/{cep}/json")
	public Endereco obterEndereco(@PathVariable String cep);
}
