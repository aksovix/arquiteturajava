package br.edu.infnet.applocacaoproduto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppLocacaoProdutoController {

	@GetMapping(value = "/")
	public String telaHome() {
		return "home";
	}
}
