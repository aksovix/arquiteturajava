package br.edu.infnet.applocacaoproduto;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.applocacaoproduto.model.domain.Locacao;

@Component
public class LocacaoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("## Cadastramento de Locação ##");
		
		Locacao l1 = new Locacao();		
		l1.setInicio(LocalDateTime.now());
		l1.setFim(LocalDateTime.now().plusDays(2));
		l1.setDescricao("Primeira locação");
		l1.setProcessada(true);
		System.out.println("> " + l1);
		
		Locacao l2 = new Locacao();
		l2.setInicio(LocalDateTime.now());
		l2.setFim(LocalDateTime.now().plusDays(2));
		l2.setDescricao("Segunda locação");
		l2.setProcessada(false);
		System.out.println("> " + l2);
		
		Locacao l3 = new Locacao();
		l3.setInicio(LocalDateTime.now());
		l3.setFim(LocalDateTime.now().plusDays(2));
		l3.setDescricao("Terceira locação");
		l3.setProcessada(true);
		System.out.println("> " + l3);
	}
}