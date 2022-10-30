package br.edu.infnet.applocacaoproduto;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.applocacaoproduto.model.domain.Celular;
import br.edu.infnet.applocacaoproduto.model.domain.Computador;
import br.edu.infnet.applocacaoproduto.model.domain.Locacao;
import br.edu.infnet.applocacaoproduto.model.domain.Locatario;
import br.edu.infnet.applocacaoproduto.model.domain.Veiculo;

@Order(1)
@Component
public class LocacaoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("## Cadastramento de Locação ##");

		// Volkswagen Gol 1.6 MSI (Flex) (Aut) 2023
		Veiculo veiculo = new Veiculo();
		veiculo.setCodigo(123);
		veiculo.setMarca("Volkswagen");
		veiculo.setModelo("Gol 1.6 MSI Flex Aut");
		veiculo.setValor(110.0f);
		veiculo.setAnoModelo("2022/2023");
		veiculo.setCilindrada(1.6f);
		veiculo.setPortaMalas(285);
		
		// Samsung Galaxy S20 FE
		Celular celular = new Celular();
		celular.setCodigo(123);
		celular.setMarca("Samsung");
		celular.setModelo("Galaxy S20 FE");
		celular.setValor(30.0f);
		celular.setPeso(190);
		celular.setBateria(4500);
		celular.setTela(6.5f);
		
		// Dell Notebook Inspiron 15
		Computador computador = new Computador();
		computador.setCodigo(123);
		computador.setMarca("Dell");
		computador.setModelo("Notebook Inspiron 15");
		computador.setValor(50.0f);
		computador.setMemoria(16);
		computador.setCpu(4.5f);
		computador.setDisco(256);
		
		// Locação 1
		Locatario locatario = new Locatario();		
		locatario.setCpf("12312312312");
		locatario.setEmail("locatario@primeiro.com");
		locatario.setNome("Primeiro locatario");
		
		Locacao l1 = new Locacao(locatario);		
		l1.setDescricao("Primeira locação");
		l1.setProcessada(true);
		l1.setProdutos(Arrays.asList(veiculo));
		System.out.println("> " + l1);
		
		// Locação 2
		locatario = new Locatario();
		locatario.setCpf("23423423423");
		locatario.setEmail("locatario@segundo.com");
		locatario.setNome("Segundo locatario");
		
		Locacao l2 = new Locacao();		
		l2.setDescricao("Segunda locação");
		l2.setProcessada(false);
		l2.setLocatario(locatario);
		l2.setProdutos(Arrays.asList(veiculo, celular));
		System.out.println("> " + l2);
		
		// Locação 3
		locatario = new Locatario();	
		locatario.setCpf("34534534534");
		locatario.setEmail("locatario@terceiro.com");
		locatario.setNome("Terceiro locatario");
		
		Locacao l3 = new Locacao();		
		l3.setDescricao("Terceira locação");
		l3.setLocatario(locatario);
		l3.setProdutos(Arrays.asList(veiculo, celular, computador));
		System.out.println("> " + l3);
	}
}