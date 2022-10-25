package br.edu.infnet.applocacaoproduto.model.domain;

import java.time.LocalDateTime;

public class Locacao {

	private LocalDateTime inicio;
	private LocalDateTime fim;
	private String descricao;
	private boolean processada;
	
	public LocalDateTime getInicio() {
		return inicio;
	}

	public void setInicio(LocalDateTime inicio) {
		this.inicio = inicio;
	}

	public LocalDateTime getFim() {
		return fim;
	}

	public void setFim(LocalDateTime fim) {
		this.fim = fim;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isProcessada() {
		return processada;
	}

	public void setProcessada(boolean processada) {
		this.processada = processada;
	}

	@Override
	public String toString() {
		return inicio + ";" + fim + ";" + descricao + ";" + processada;
	}
}
