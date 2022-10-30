package br.edu.infnet.applocacaoproduto.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.applocacaoproduto.model.domain.Computador;

@Controller
public class ComputadorController {

	private static Map<Integer, Computador> mapa = new HashMap<Integer, Computador>();	
	private static Integer id = 1;

	public static void incluir(Computador computador) {
		computador.setId(id++);
		mapa.put(computador.getId(), computador);
		
		System.out.println("> " + computador);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Computador> obterLista(){
		return mapa.values();
	}
		
	@GetMapping(value = "/computador/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());

		return "computador/lista";
	}
	
	@GetMapping(value = "/computador/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);
		
		return "redirect:/computador/lista";
	}
}