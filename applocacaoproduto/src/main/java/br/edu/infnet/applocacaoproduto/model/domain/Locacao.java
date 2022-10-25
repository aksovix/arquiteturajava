package br.edu.infnet.applocacaoproduto.model.domain;

import java.time.LocalDateTime;

public class Locacao {
	public LocalDateTime inicio;
	public LocalDateTime fim;
	public String descricao;
	public boolean processada;
	
	@Override
	public String toString() {
		return inicio + ";" + fim + ";" + descricao + ";" + processada;
	}
}
