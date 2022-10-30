package br.edu.infnet.applocacaoproduto.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.applocacaoproduto.model.domain.Veiculo;

@Controller
public class VeiculoController {
	
	@GetMapping(value = "/veiculo/lista")
	public String telaLista(Model model) {
		
		// Volkswagen Gol 1.6 MSI (Flex) (Aut) 2023
		Veiculo v1 = new Veiculo();
		v1.setCodigo(123);
		v1.setMarca("Volkswagen");
		v1.setModelo("Gol 1.6 MSI Flex Aut");
		v1.setValor(110.0f);
		v1.setAnoModelo("2022/2023");
		v1.setCilindrada(1.6f);
		v1.setPortaMalas(285);
		
		// Chevrolet Prisma 1.4 MPFI LT 8v Flex 4P Manual
		Veiculo v2 = new Veiculo();	
		v2.setCodigo(456);
		v2.setMarca("Chevrolet");
		v2.setModelo("Prisma 1.4 MPFI LT 8v Flex 4P Manual");
		v2.setValor(120.0f);
		v2.setAnoModelo("2022/2023");
		v2.setCilindrada(1.4f);
		v2.setPortaMalas(519);
		
		// Fiat Fastback 1.3 Turbo 270 Flex Limited Edition AT6
		Veiculo v3 = new Veiculo();	
		v3.setCodigo(789);
		v3.setMarca("Fiat");
		v3.setModelo("Fastback 1.3 Turbo 270 Flex Limited Edition AT6");
		v3.setValor(240.0f);
		v3.setAnoModelo("2022/2023");
		v3.setCilindrada(1.3f);
		v3.setPortaMalas(519);

		model.addAttribute("listagem", Arrays.asList(v1, v2, v3));

		return "veiculo/lista";
	}
}
