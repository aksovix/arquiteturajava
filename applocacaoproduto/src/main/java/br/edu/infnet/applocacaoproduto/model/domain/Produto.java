package br.edu.infnet.applocacaoproduto.model.domain;

public class Produto {
	public int codigo;
	public String marca;
	public String modelo;
	public float valor;
	
	@Override
	public String toString() {
		return codigo + ";" + marca + ";" + modelo+ ";" + valor;
	}
}
