package br.edu.infnet.applocacaoproduto;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.applocacaoproduto.controller.LocatarioController;
import br.edu.infnet.applocacaoproduto.model.domain.Locatario;

@Order(2)
@Component
public class LocatarioTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("## Cadastramento de Locatário ##");
		
		Locatario l1 = new Locatario();		
		l1.setCpf("12312312312");
		l1.setEmail("locatario@primeiro.com");
		l1.setNome("Primeiro locatario");
		LocatarioController.incluir(l1);
		
		Locatario l2 = new Locatario();		
		l2.setCpf("23423423423");
		l2.setEmail("locatario@segundo.com");
		l2.setNome("Segundo locatario");
		LocatarioController.incluir(l2);
		
		Locatario l3 = new Locatario();		
		l3.setCpf("34534534534");
		l3.setEmail("locatario@terceiro.com");
		l3.setNome("Terceiro locatario");
		LocatarioController.incluir(l3);
	}
}