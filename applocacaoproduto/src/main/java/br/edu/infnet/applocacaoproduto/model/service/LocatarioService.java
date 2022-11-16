package br.edu.infnet.applocacaoproduto.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.applocacaoproduto.clients.CepClient;
import br.edu.infnet.applocacaoproduto.model.domain.Endereco;
import br.edu.infnet.applocacaoproduto.model.domain.Locatario;
import br.edu.infnet.applocacaoproduto.model.domain.Usuario;
import br.edu.infnet.applocacaoproduto.model.repository.LocatarioRepository;

@Service
public class LocatarioService {

	@Autowired
	private CepClient cepClient;
	
	@Autowired
	private LocatarioRepository locatarioRepository;
	
	public void incluir(Locatario locatario) {
		locatarioRepository.save(locatario);
	}
	
	public void excluir(Integer id) {
		locatarioRepository.deleteById(id);
	}
	
	public Collection<Locatario> obterLista() {
		return (Collection<Locatario>) locatarioRepository.findAll();
	}
	
	public Optional<Locatario> obterPorId(Integer id) {
		return locatarioRepository.findById(id);
	}
	
	public Endereco obterEndereco(String cep) {
		return cepClient.obterEndereco(cep);
	}
	
	public Collection<Locatario> obterLista(Usuario usuario){
		return (Collection<Locatario>) locatarioRepository.obterLista(usuario.getId());
	}
}
