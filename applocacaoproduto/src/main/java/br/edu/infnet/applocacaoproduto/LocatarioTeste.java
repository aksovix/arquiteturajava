package br.edu.infnet.applocacaoproduto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.applocacaoproduto.model.domain.Locatario;
import br.edu.infnet.applocacaoproduto.model.domain.Usuario;
import br.edu.infnet.applocacaoproduto.model.service.LocatarioService;

@Order(3)
@Component
public class LocatarioTeste implements ApplicationRunner {
	
	@Autowired
	private LocatarioService service;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("## Cadastramento de Locatário ##");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Locatario l1 = new Locatario();		
		l1.setCpf("12312312312");
		l1.setEmail("locatario@primeiro.com");
		l1.setNome("Primeiro locatario");
		l1.setUsuario(usuario);
		service.incluir(l1);
		
		Locatario l2 = new Locatario();		
		l2.setCpf("23423423423");
		l2.setEmail("locatario@segundo.com");
		l2.setNome("Segundo locatario");
		l2.setUsuario(usuario);
		service.incluir(l2);
		
		Locatario l3 = new Locatario();		
		l3.setCpf("34534534534");
		l3.setEmail("locatario@terceiro.com");
		l3.setNome("Terceiro locatario");
		l3.setUsuario(usuario);
		service.incluir(l3);
	}
}