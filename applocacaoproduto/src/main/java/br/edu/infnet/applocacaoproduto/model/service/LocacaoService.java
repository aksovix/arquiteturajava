package br.edu.infnet.applocacaoproduto.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.applocacaoproduto.model.domain.Locacao;

@Service
public class LocacaoService {

	private Map<Integer, Locacao> mapa = new HashMap<Integer, Locacao>();	
	private Integer id = 1;

	public void incluir(Locacao locacao) {
		locacao.setId(id++);
		mapa.put(locacao.getId(), locacao);
		
		System.out.println("> " + locacao);
	}
	
	public void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public List<Locacao> obterLista() {
		return new ArrayList<Locacao>(mapa.values());
	}
	
	public Locacao obterPorId(Integer id) {
		return mapa.get(id);
	}
}
