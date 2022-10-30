package br.edu.infnet.applocacaoproduto.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.applocacaoproduto.model.domain.Veiculo;

@Controller
public class VeiculoController {

	private static Map<Integer, Veiculo> mapa = new HashMap<Integer, Veiculo>();	
	private static Integer id = 1;

	public static void incluir(Veiculo veiculo) {
		veiculo.setId(id++);
		mapa.put(veiculo.getId(), veiculo);
		
		System.out.println("> " + veiculo);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Veiculo> obterLista(){
		return mapa.values();
	}
		
	@GetMapping(value = "/veiculo/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());

		return "veiculo/lista";
	}
	
	@GetMapping(value = "/veiculo/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);
		
		return "redirect:/veiculo/lista";
	}
	
}
