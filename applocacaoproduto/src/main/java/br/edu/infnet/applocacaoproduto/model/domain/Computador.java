package br.edu.infnet.applocacaoproduto.model.domain;

public class Computador extends Produto {
	public int memoria;
	public float cpu;
	public int disco;
	
	@Override
	public String toString() {
		return memoria + ";" + cpu + ";" + disco;
	}
}
