package br.edu.infnet.applocacaoproduto;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.applocacaoproduto.model.domain.Veiculo;

@Component
public class VeiculoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		// Volkswagen Gol 1.6 MSI (Flex) (Aut) 2023
		Veiculo v1 = new Veiculo();	
		v1.anoModelo = "2022/2023";
		v1.cilindrada = 1.6f;
		v1.portaMalas = 285;
		System.out.println("Veiculo - " + v1);
		
		// Chevrolet Prisma 1.4 MPFI LT 8v Flex 4P Manual
		Veiculo v2 = new Veiculo();	
		v2.anoModelo = "2022/2023";
		v2.cilindrada = 1.3f;
		v2.portaMalas = 519;
		System.out.println("Veiculo - " + v2);
		
		// Fiat Fastback 1.3 Turbo 270 Flex Limited Edition AT6
		Veiculo v3 = new Veiculo();
		v3.anoModelo = "2022/2023";
		v3.cilindrada = 1.3f;
		v3.portaMalas = 519;
		System.out.println("Veiculo - " + v3);
	}
}