package br.edu.infnet.applocacaoproduto.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.applocacaoproduto.model.domain.Celular;

@Controller
public class CelularController {

	private static Map<Integer, Celular> mapa = new HashMap<Integer, Celular>();	
	private static Integer id = 1;

	public static void incluir(Celular celular) {
		celular.setId(id++);
		mapa.put(celular.getId(), celular);
		
		System.out.println("> " + celular);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Celular> obterLista(){
		return mapa.values();
	}
		
	@GetMapping(value = "/celular/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());

		return "celular/lista";
	}
	
	@GetMapping(value = "/celular/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);
		
		return "redirect:/celular/lista";
	}
}