package br.edu.infnet.applocacaoproduto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.applocacaoproduto.model.service.ComputadorService;

@Controller
public class ComputadorController {

	@Autowired
	private ComputadorService service;

	@GetMapping(value = "/computador/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", service.obterLista());

		return "computador/lista";
	}
	
	@GetMapping(value = "/computador/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		service.excluir(id);
		
		return "redirect:/computador/lista";
	}
}