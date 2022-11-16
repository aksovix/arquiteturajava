package br.edu.infnet.applocacaoproduto.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.applocacaoproduto.model.domain.Locacao;
import br.edu.infnet.applocacaoproduto.model.domain.Usuario;
import br.edu.infnet.applocacaoproduto.model.repository.LocacaoRepository;

@Service
public class LocacaoService {
	
	@Autowired
	private LocacaoRepository locacaoRepository;
	
	public void incluir(Locacao locacao) {
		locacaoRepository.save(locacao);
	}
	
	public void excluir(Integer id) {
		locacaoRepository.deleteById(id);
	}
	
	public Collection<Locacao> obterLista() {
		return (Collection<Locacao>) locacaoRepository.findAll();
	}		

	public Collection<Locacao> obterLista(Usuario usuario){
		return (Collection<Locacao>) locacaoRepository.obterLista(usuario.getId());
	}	
	
	public Optional<Locacao> obterPorId(Integer id) {
		return locacaoRepository.findById(id);
	}
}
