package br.edu.infnet.applocacaoproduto.model.domain;

public class Computador extends Produto {

	private int memoria;
	private float cpu;
	private int disco;
	
	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public float getCpu() {
		return cpu;
	}

	public void setCpu(float cpu) {
		this.cpu = cpu;
	}

	public int getDisco() {
		return disco;
	}

	public void setDisco(int disco) {
		this.disco = disco;
	}

	@Override
	public String toString() {
		return super.toString() + memoria + ";" + cpu + ";" + disco;
	}
}
