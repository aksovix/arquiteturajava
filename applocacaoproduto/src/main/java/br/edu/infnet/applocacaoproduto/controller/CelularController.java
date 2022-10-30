package br.edu.infnet.applocacaoproduto.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.applocacaoproduto.model.domain.Celular;

@Controller
public class CelularController {
	
	@GetMapping(value = "/celular/lista")
	public String telaLista(Model model) {
		
		// Samsung Galaxy S20 FE
		Celular c1 = new Celular();
		c1.setCodigo(123);
		c1.setMarca("Samsung");
		c1.setModelo("Galaxy S20 FE");
		c1.setValor(30.0f);
		c1.setPeso(190);
		c1.setBateria(4500);
		c1.setTela(6.5f);
		
		// Huawei Mate 50 Pro
		Celular c2 = new Celular();
		c2.setCodigo(456);
		c2.setMarca("Huawei");
		c2.setModelo("Mate 50 Pro");
		c2.setValor(40.0f);
		c2.setPeso(205);
		c2.setBateria(4700);
		c2.setTela(6.74f);
		
		// Apple iPhone 14 Pro Max
		Celular c3 = new Celular();
		c3.setCodigo(789);
		c3.setMarca("Apple");
		c3.setModelo("iPhone 14 Pro Max");
		c3.setValor(40.0f);
		c3.setPeso(240);
		c3.setBateria(4323);
		c3.setTela(6.7f);

		model.addAttribute("listagem", Arrays.asList(c1, c2, c3));

		return "celular/lista";
	}
}
