package br.edu.infnet.applocacaoproduto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.applocacaoproduto.model.domain.Veiculo;
import br.edu.infnet.applocacaoproduto.model.service.VeiculoService;

@Controller
public class VeiculoController {

	@Autowired
	private VeiculoService service;
		
	@GetMapping(value = "/veiculo/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", service.obterLista());

		return "veiculo/lista";
	}
	
	@GetMapping(value = "/veiculo")
	public String telaCadastro() {
		return "veiculo/cadastro";
	}
	
	@PostMapping(value = "/veiculo/incluir")
	public String incluir(Veiculo veiculo) {
		
		service.incluir(veiculo);
		
		return "redirect:/veiculo/lista";
	}
	
	@GetMapping(value = "/veiculo/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		service.excluir(id);
		
		return "redirect:/veiculo/lista";
	}
	
}
