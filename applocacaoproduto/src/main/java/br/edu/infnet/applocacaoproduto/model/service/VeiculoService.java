package br.edu.infnet.applocacaoproduto.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.applocacaoproduto.model.domain.Veiculo;
import br.edu.infnet.applocacaoproduto.model.repository.VeiculoRepository;

@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepository veiculoRepository;
	
	public void incluir(Veiculo veiculo) {
		veiculoRepository.save(veiculo);
	}
	
	public void excluir(Integer id) {
		veiculoRepository.deleteById(id);
	}
	
	public Collection<Veiculo> obterLista() {
		return (Collection<Veiculo>) veiculoRepository.findAll();
	}
	
	public Optional<Veiculo> obterPorId(Integer id) {
		return veiculoRepository.findById(id);
	}
}
