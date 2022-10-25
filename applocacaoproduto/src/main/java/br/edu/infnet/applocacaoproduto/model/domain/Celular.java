package br.edu.infnet.applocacaoproduto.model.domain;

public class Celular extends Produto {
	public int peso;
	public int bateria;
	public float tela;
	
	@Override
	public String toString() {
		return peso + ";" + bateria + ";" + tela;
	}

}
