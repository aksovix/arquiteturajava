package br.edu.infnet.applocacaoproduto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.applocacaoproduto.model.domain.Computador;
import br.edu.infnet.applocacaoproduto.model.domain.Usuario;
import br.edu.infnet.applocacaoproduto.model.service.ComputadorService;

@Order(7)
@Component
public class ComputadorTeste implements ApplicationRunner {
	
	@Autowired
	private ComputadorService service;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("## Cadastramento de Computador ##");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		// Dell Notebook Inspiron 15
		Computador c1 = new Computador();
		c1.setCodigo(300);
		c1.setMarca("Dell");
		c1.setModelo("Notebook Inspiron 15");
		c1.setValor(50.0f);
		c1.setMemoria(16);
		c1.setCpu(4.5f);
		c1.setDisco(256);
		c1.setUsuario(usuario);
		service.incluir(c1);
		
		// Itautec I5 3470 3ªgeração 120gbssd 16gb 3.20ghz
		Computador c2 = new Computador();
		c2.setCodigo(310);
		c2.setMarca("Itautec");
		c2.setModelo("I5 3470");
		c2.setValor(35.0f);
		c2.setMemoria(16);
		c2.setCpu(3.2f);
		c2.setDisco(120);
		c2.setUsuario(usuario);
		service.incluir(c2);
		
		// ProDesk HP 400 G6 Mini
		Computador c3 = new Computador();
		c3.setCodigo(320);
		c3.setMarca("ProDesk");
		c3.setModelo("HP 400 G6 Mini");
		c3.setValor(40.0f);
		c3.setMemoria(8);
		c3.setCpu(2.0f);
		c3.setDisco(256);
		c3.setUsuario(usuario);
		service.incluir(c3);
	}
}