package br.edu.infnet.applocacaoproduto.model.domain;

public class Veiculo extends Produto {

	private String anoModelo;
	private float cilindrada;
	private int portaMalas;
	
	public String getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}

	public float getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(float cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getPortaMalas() {
		return portaMalas;
	}

	public void setPortaMalas(int portaMalas) {
		this.portaMalas = portaMalas;
	}

	@Override
	public String toString() {
		return super.toString() + anoModelo + ";" + cilindrada + ";" + portaMalas;
	}
}