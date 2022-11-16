package br.edu.infnet.applocacaoproduto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.applocacaoproduto.model.domain.Locatario;
import br.edu.infnet.applocacaoproduto.model.domain.Usuario;
import br.edu.infnet.applocacaoproduto.model.service.LocatarioService;

@Controller
public class LocatarioController {

	@Autowired
	private LocatarioService service;

	@GetMapping(value = "/locatario/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", service.obterLista());

		return "locatario/lista";
	}
	
	@GetMapping(value = "/locatario")
	public String telaCadastro() {
		return "locatario/cadastro";
	}
	
	@PostMapping(value = "/cep")
	public String obterCep(Model model, @RequestParam String cep){
		
		model.addAttribute("endereco", service.obterEndereco(cep));
		
		return "locatario/cadastro";
	}

	@PostMapping(value = "/locatario/incluir")
	public String incluir(Locatario locatario, @SessionAttribute("user") Usuario usuario) {
		
		locatario.setUsuario(usuario);
		
		service.incluir(locatario);
		
		return "redirect:/locatario/lista";
	}
	
	@GetMapping(value = "/locatario/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		service.excluir(id);
		
		return "redirect:/locatario/lista";
	}
	
}
