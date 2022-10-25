package br.edu.infnet.applocacaoproduto.model.domain;

public class Locatario {
	public String nome;
	public String cpf;
	public String email;
	
	@Override
	public String toString() {
		return nome + ";" + cpf + ";" + email;
	}
}
