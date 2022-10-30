package br.edu.infnet.applocacaoproduto.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.applocacaoproduto.model.domain.Locacao;

@Controller
public class LocacaoController {

	private static Map<Integer, Locacao> mapa = new HashMap<Integer, Locacao>();	
	private static Integer id = 1;

	public static void incluir(Locacao locacao) {
		locacao.setId(id++);
		mapa.put(locacao.getId(), locacao);
		
		System.out.println("> " + locacao);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Locacao> obterLista(){
		return mapa.values();
	}
		
	@GetMapping(value = "/locacao/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());

		return "locacao/lista";
	}
	
	@GetMapping(value = "/locacao/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);
		
		return "redirect:/locacao/lista";
	}
}