package br.edu.infnet.applocacaoproduto.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.applocacaoproduto.model.domain.Locatario;

@Controller
public class LocatarioController {

	private static Map<Integer, Locatario> mapa = new HashMap<Integer, Locatario>();	
	private static Integer id = 1;

	public static void incluir(Locatario locatario) {
		locatario.setId(id++);
		mapa.put(locatario.getId(), locatario);
		
		System.out.println("> " + locatario);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Locatario> obterLista(){
		return mapa.values();
	}
		
	@GetMapping(value = "/locatario/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());

		return "locatario/lista";
	}
	
	@GetMapping(value = "/locatario/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);
		
		return "redirect:/locatario/lista";
	}
	
}
