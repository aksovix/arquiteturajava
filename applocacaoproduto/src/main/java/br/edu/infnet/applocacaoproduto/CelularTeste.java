package br.edu.infnet.applocacaoproduto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.applocacaoproduto.model.domain.Celular;
import br.edu.infnet.applocacaoproduto.model.service.CelularService;

@Order(5)
@Component
public class CelularTeste implements ApplicationRunner {
	
	@Autowired
	private CelularService service;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("## Cadastramento de Celular ##");
		
		// Samsung Galaxy S20 FE
		Celular c1 = new Celular();
		c1.setCodigo(123);
		c1.setMarca("Samsung");
		c1.setModelo("Galaxy S20 FE");
		c1.setValor(30.0f);
		c1.setPeso(190);
		c1.setBateria(4500);
		c1.setTela(6.5f);
		service.incluir(c1);
		
		// Huawei Mate 50 Pro
		Celular c2 = new Celular();
		c2.setCodigo(456);
		c2.setMarca("Huawei");
		c2.setModelo("Mate 50 Pro");
		c2.setValor(40.0f);
		c2.setPeso(205);
		c2.setBateria(4700);
		c2.setTela(6.74f);
		service.incluir(c2);
		
		// Apple iPhone 14 Pro Max
		Celular c3 = new Celular();
		c3.setCodigo(789);
		c3.setMarca("Apple");
		c3.setModelo("iPhone 14 Pro Max");
		c3.setValor(40.0f);
		c3.setPeso(240);
		c3.setBateria(4323);
		c3.setTela(6.7f);
		service.incluir(c3);
	}
}