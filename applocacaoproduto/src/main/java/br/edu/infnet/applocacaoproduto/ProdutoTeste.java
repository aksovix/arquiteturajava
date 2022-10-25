package br.edu.infnet.applocacaoproduto;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.applocacaoproduto.model.domain.Produto;

@Component
public class ProdutoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		// Volkswagen Gol 1.6 MSI (Flex) (Aut) 2023
		Produto p1 = new Produto();		
		p1.codigo = 123;
		p1.marca = "Volkswagen";
		p1.modelo = "Gol";
		p1.valor = 125.00f;
		System.out.println("Produto - " + p1);
		
		// Samsung Galaxy S20 FE
		Produto p2 = new Produto();
		p2.codigo = 123;
		p2.marca = "Samsung";
		p2.modelo = "Galaxy S20 FE";
		p2.valor = 30.0f;
		System.out.println("Produto - " + p2);
		
		// Dell Notebook Inspiron 15
		Produto p3 = new Produto();
		p3.codigo = 123;
		p3.marca = "Dell";
		p3.modelo = "Notebook Inspiron 15";
		p3.valor = 50.0f;
		System.out.println("Produto - " + p3);
	}
}