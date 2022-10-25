package br.edu.infnet.applocacaoproduto.model.domain;

public class Veiculo extends Produto {
	public String anoModelo;
	public float cilindrada;
	public int portaMalas;
	
	@Override
	public String toString() {
		return anoModelo + ";" + cilindrada + ";" + portaMalas;
	}
}