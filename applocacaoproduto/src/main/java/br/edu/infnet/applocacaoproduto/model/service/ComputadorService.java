package br.edu.infnet.applocacaoproduto.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.applocacaoproduto.model.domain.Computador;
import br.edu.infnet.applocacaoproduto.model.repository.ComputadorRepository;

@Service
public class ComputadorService {

	@Autowired
	private ComputadorRepository computadorRepository;
	
	public void incluir(Computador computador) {
		computadorRepository.save(computador);
	}
	
	public void excluir(Integer id) {
		computadorRepository.deleteById(id);
	}
	
	public Collection<Computador> obterLista() {
		return (Collection<Computador>) computadorRepository.findAll();
	}
	
	public Optional<Computador> obterPorId(Integer id) {
		return computadorRepository.findById(id);
	}
}
