package br.edu.infnet.applocacaoproduto;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.applocacaoproduto.model.domain.Celular;

@Component
public class CelularTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		// Samsung Galaxy S20 FE
		Celular c1 = new Celular();	
		c1.peso = 190;
		c1.bateria = 4500;
		c1.tela = 6.5f;
		System.out.println("Celular - " + c1);
		
		// Huawei Mate 50 Pro
		Celular c2 = new Celular();
		c2.peso = 205;
		c2.bateria = 4700;
		c2.tela = 6.74f;
		System.out.println("Celular - " + c2);
		
		// Apple iPhone 14 Pro Max
		Celular c3 = new Celular();
		c3.peso = 240;
		c3.bateria = 4323;
		c3.tela = 6.7f;
		System.out.println("Celular - " + c3);
	}
}