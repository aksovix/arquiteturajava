package br.edu.infnet.applocacaoproduto.model.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "TB_LOCACAO")
public class Locacao {

//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Id
	private Integer id;
	private LocalDateTime inicio;
	private LocalDateTime fim;
	private String descricao;
	private boolean processada;
	private Locatario locatario;
	private List<Produto> produtos;
	
	public Locacao() {
		inicio = LocalDateTime.now();
		fim = LocalDateTime.now().plusDays(3);
		processada = false;
	}
	
	public Locacao(Locatario locatario) {
		this();
		this.locatario = locatario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
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

	public Locatario getLocatario() {
		return locatario;
	}

	public void setLocatario(Locatario locatario) {
		this.locatario = locatario;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public String toString() {
		return descricao + ";" + inicio + ";" + fim + ";" +  processada + ";" + locatario + ";" + produtos.size();
	}
}
