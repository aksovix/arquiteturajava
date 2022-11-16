package br.edu.infnet.applocacaoproduto;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.applocacaoproduto.model.domain.Celular;
import br.edu.infnet.applocacaoproduto.model.domain.Computador;
import br.edu.infnet.applocacaoproduto.model.domain.Locacao;
import br.edu.infnet.applocacaoproduto.model.domain.Locatario;
import br.edu.infnet.applocacaoproduto.model.domain.Usuario;
import br.edu.infnet.applocacaoproduto.model.domain.Veiculo;
import br.edu.infnet.applocacaoproduto.model.service.LocacaoService;

@Order(7)
@Component
public class LocacaoTeste implements ApplicationRunner {
	
	@Autowired
	private LocacaoService service;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("## Cadastramento de Locação ##");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);

		// Volkswagen Gol 1.6 MSI (Flex) (Aut) 2023
		Veiculo veiculo = new Veiculo();
		veiculo.setId(1);
		
		// Samsung Galaxy S20 FE
		Celular celular = new Celular();
		celular.setId(2);
		
		// Dell Notebook Inspiron 15
		Computador computador = new Computador();
		computador.setId(3);
		
		// Locatario 1
		Locatario locatario1 = new Locatario();		
		locatario1.setId(1);
		
		// Locatario 2
		Locatario locatario2 = new Locatario();		
		locatario2.setId(2);
		
		// Locatario 3
		Locatario locatario3 = new Locatario();		
		locatario3.setId(3);
		
		Locacao l1 = new Locacao();
		l1.setInicio(LocalDateTime.now());
		l1.setFim(LocalDateTime.now().plusDays(3));
		l1.setDescricao("Primeira locação");
		l1.setProcessada(true);
		l1.setLocatario(locatario1);
		l1.setProdutos(Arrays.asList(veiculo));
		l1.setUsuario(usuario);
		service.incluir(l1);
		
		// Locação 2		
		Locacao l2 = new Locacao();
		l2.setInicio(LocalDateTime.now());
		l2.setFim(LocalDateTime.now().plusDays(3));
		l2.setDescricao("Segunda locação");
		l2.setProcessada(false);
		l2.setLocatario(locatario2);
		l2.setProdutos(Arrays.asList(veiculo, celular));
		l2.setUsuario(usuario);
		service.incluir(l2);
		
		// Locação 3
		Locacao l3 = new Locacao();
		l3.setInicio(LocalDateTime.now());
		l3.setFim(LocalDateTime.now().plusDays(3));
		l3.setDescricao("Terceira locação");
		l3.setLocatario(locatario3);
		l3.setProdutos(Arrays.asList(veiculo, celular, computador));
		l3.setUsuario(usuario);
		service.incluir(l3);
	}
}