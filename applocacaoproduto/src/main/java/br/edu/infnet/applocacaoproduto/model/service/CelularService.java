package br.edu.infnet.applocacaoproduto.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.applocacaoproduto.model.domain.Celular;
import br.edu.infnet.applocacaoproduto.model.repository.CelularRepository;

@Service
public class CelularService {

	@Autowired
	private CelularRepository celularRepository;
	
	public void incluir(Celular celular) {
		celularRepository.save(celular);
	}
	
	public void excluir(Integer id) {
		celularRepository.deleteById(id);
	}
	
	public Collection<Celular> obterLista() {
		return (Collection<Celular>) celularRepository.findAll();
	}
	
	public Optional<Celular> obterPorId(Integer id) {
		return celularRepository.findById(id);
	}
}
