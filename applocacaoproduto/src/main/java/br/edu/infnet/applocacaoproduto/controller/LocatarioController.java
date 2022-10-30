package br.edu.infnet.applocacaoproduto.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.applocacaoproduto.model.domain.Locatario;

@Controller
public class LocatarioController {
	
	@GetMapping(value = "/locatario/lista")
	public String telaLista(Model model) {
		
		Locatario l1 = new Locatario();		
		l1.setCpf("12312312312");
		l1.setEmail("locatario@primeiro.com");
		l1.setNome("Primeiro locatario");
		
		Locatario l2 = new Locatario();		
		l2.setCpf("23423423423");
		l2.setEmail("locatario@segundo.com");
		l2.setNome("Segundo locatario");
		
		Locatario l3 = new Locatario();		
		l3.setCpf("34534534534");
		l3.setEmail("locatario@terceiro.com");
		l3.setNome("Terceiro locatario");

		model.addAttribute("listagem", Arrays.asList(l1, l2, l3));

		return "locatario/lista";
	}
}
