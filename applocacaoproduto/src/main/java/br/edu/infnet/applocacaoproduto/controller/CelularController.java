package br.edu.infnet.applocacaoproduto.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.applocacaoproduto.model.domain.Celular;
import br.edu.infnet.applocacaoproduto.model.service.CelularService;

@Controller
public class CelularController {

	@Autowired
	private CelularService service;

	@GetMapping(value = "/celular/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", service.obterLista());

		return "celular/lista";
	}
	
	@GetMapping(value = "/celular")
	public String telaCadastro() {
		return "celular/cadastro";
	}
	
	@PostMapping(value = "/celular/incluir")
	@Transactional
	public String incluir(Celular celular) {
		
		service.incluir(celular);
		
		return "redirect:/celular/lista";
	}

	
	@GetMapping(value = "/celular/{id}/excluir")
	@Transactional
	public String exclusao(@PathVariable Integer id) {

		service.excluir(id);
		
		return "redirect:/celular/lista";
	}
}