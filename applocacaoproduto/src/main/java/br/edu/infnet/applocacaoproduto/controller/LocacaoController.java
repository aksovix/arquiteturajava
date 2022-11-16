package br.edu.infnet.applocacaoproduto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.applocacaoproduto.model.domain.Locacao;
import br.edu.infnet.applocacaoproduto.model.domain.Usuario;
import br.edu.infnet.applocacaoproduto.model.service.LocacaoService;
import br.edu.infnet.applocacaoproduto.model.service.LocatarioService;
import br.edu.infnet.applocacaoproduto.model.service.ProdutoService;

@Controller
public class LocacaoController {

	@Autowired
	private LocacaoService locacaoService;
	
	@Autowired
	private LocatarioService locatarioService;
	
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping(value = "/locacao")
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("locatarios", locatarioService.obterLista(usuario));

		model.addAttribute("produtos", produtoService.obterLista(usuario));
		
		return "locacao/cadastro";
	}
	
	@GetMapping(value = "/locacao/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("listagem", locacaoService.obterLista(usuario));

		return "locacao/lista";
	}
	
	@PostMapping(value = "/locacao/incluir")
	public String incluir(Locacao locacao, @SessionAttribute("user") Usuario usuario) {
		
		System.out.println("Solicitante: " + locacao.getLocatario());		
		System.out.println("Produtos: " + locacao.getProdutos());
		
		locacao.setUsuario(usuario);
		
		locacaoService.incluir(locacao);
		
		return "redirect:/locacao/lista";
	}

	@GetMapping(value = "/locacao/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		locacaoService.excluir(id);
		
		return "redirect:/locacao/lista";
	}
}