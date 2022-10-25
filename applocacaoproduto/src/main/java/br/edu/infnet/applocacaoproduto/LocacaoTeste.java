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
		Locacao p1 = new Locacao();		
		p1.inicio = LocalDateTime.now();
		p1.fim = LocalDateTime.now().plusDays(2);
		p1.descricao = "Primeira locação";
		p1.processada = true;
		System.out.println("Locacao - " + p1);
		
		Locacao p2 = new Locacao();
		p2.inicio = LocalDateTime.now();
		p2.fim = LocalDateTime.now().plusDays(2);
		p2.descricao = "Segunda locação";
		p2.processada = true;
		System.out.println("Locacao - " + p2);
		
		Locacao p3 = new Locacao();
		p3.inicio = LocalDateTime.now();
		p3.fim = LocalDateTime.now().plusDays(2);
		p3.descricao = "Terceira locação";
		p3.processada = true;
		System.out.println("Locacao - " + p3);
	}
}