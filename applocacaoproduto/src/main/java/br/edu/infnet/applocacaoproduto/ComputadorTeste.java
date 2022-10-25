package br.edu.infnet.applocacaoproduto;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.applocacaoproduto.model.domain.Computador;

@Component
public class ComputadorTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		// Dell Notebook Inspiron 15
		Computador c1 = new Computador();		
		c1.memoria = 16;
		c1.cpu = 4.5f;
		c1.disco = 256;
		System.out.println("Computador - " + c1);
		
		// Itautec I5 3470 3ªgeração 120gbssd 16gb 3.20ghz
		Computador c2 = new Computador();			
		c2.memoria = 16;
		c2.cpu = 3.2f;
		c2.disco = 120;
		System.out.println("Computador - " + c2);
		
		// ProDesk HP 400 G6 Mini
		Computador c3 = new Computador();			
		c3.memoria = 8;
		c3.cpu = 2.0f;
		c3.disco = 256;
		System.out.println("Computador - " + c3);
	}
}