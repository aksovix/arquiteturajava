package br.edu.infnet.applocacaoproduto.controller;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.applocacaoproduto.model.domain.Locacao;

@Controller
public class LocacaoController {
	
	@GetMapping(value = "/locacao/lista")
	public String telaLista(Model model) {
		
		Locacao l1 = new Locacao();		
		l1.setInicio(LocalDateTime.now());
		l1.setFim(LocalDateTime.now().plusDays(2));
		l1.setDescricao("Primeira locação");
		l1.setProcessada(true);
		
		Locacao l2 = new Locacao();
		l2.setInicio(LocalDateTime.now());
		l2.setFim(LocalDateTime.now().plusDays(2));
		l2.setDescricao("Segunda locação");
		l2.setProcessada(false);
		
		Locacao l3 = new Locacao();
		l3.setInicio(LocalDateTime.now());
		l3.setFim(LocalDateTime.now().plusDays(2));
		l3.setDescricao("Terceira locação");
		l3.setProcessada(true);

		model.addAttribute("listagem", Arrays.asList(l1, l2, l3));

		return "locacao/lista";
	}
}
