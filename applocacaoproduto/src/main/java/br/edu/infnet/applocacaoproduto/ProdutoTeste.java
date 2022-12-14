package br.edu.infnet.applocacaoproduto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.applocacaoproduto.model.domain.Celular;
import br.edu.infnet.applocacaoproduto.model.domain.Computador;
import br.edu.infnet.applocacaoproduto.model.domain.Usuario;
import br.edu.infnet.applocacaoproduto.model.domain.Veiculo;
import br.edu.infnet.applocacaoproduto.model.service.ProdutoService;

@Order(3)
@Component
public class ProdutoTeste implements ApplicationRunner {
	
	@Autowired
	private ProdutoService service;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("## Cadastramento de Produto ##");

		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		// Volkswagen Gol 1.6 MSI (Flex) (Aut) 2023
		Veiculo p1 = new Veiculo();
		p1.setCodigo(100);
		p1.setMarca("Volkswagen");
		p1.setModelo("Gol 1.6 MSI Flex Aut");
		p1.setValor(110.0f);
		p1.setAnoModelo("2022/2023");
		p1.setCilindrada(1.6f);
		p1.setPortaMalas(285);
		p1.setUsuario(usuario);
		service.incluir(p1);

		// Samsung Galaxy S20 FE
		Celular p2 = new Celular();
		p2.setCodigo(200);
		p2.setMarca("Samsung");
		p2.setModelo("Galaxy S20 FE");
		p2.setValor(30.0f);
		p2.setPeso(190);
		p2.setBateria(4500);
		p2.setTela(6.5f);
		p2.setUsuario(usuario);
		service.incluir(p2);

		// Dell Notebook Inspiron 15
		Computador p3 = new Computador();
		p3.setCodigo(300);
		p3.setMarca("Dell");
		p3.setModelo("Notebook Inspiron 15");
		p3.setValor(50.0f);
		p3.setMemoria(16);
		p3.setCpu(4.5f);
		p3.setDisco(256);
		p3.setUsuario(usuario);
		service.incluir(p3);
	}
}