package br.edu.infnet.applocacaoproduto;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.applocacaoproduto.model.domain.Locatario;

@Component
public class LocatarioTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Locatario l1 = new Locatario();		
		l1.cpf = "12312312312";
		l1.email = "locatario@primeiro.com";
		l1.nome = "Primeiro locatario";
		System.out.println("Locatario - " + l1);
		
		Locatario l2 = new Locatario();		
		l2.cpf = "23423423423";
		l2.email = "locatario@segundo.com";
		l2.nome = "Segundo locatario";
		System.out.println("Locatario - " + l2);
		
		Locatario l3 = new Locatario();		
		l3.cpf = "34534534534";
		l3.email = "locatario@terceiro.com";
		l3.nome = "Terceiro locatario";
		System.out.println("Locatario - " + l3);
	}
}