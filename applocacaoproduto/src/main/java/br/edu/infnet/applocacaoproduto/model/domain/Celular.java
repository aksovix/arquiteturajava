package br.edu.infnet.applocacaoproduto.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TB_CELULAR")
public class Celular extends Produto {

	private int peso;
	private int bateria;
	private float tela;
	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	public float getTela() {
		return tela;
	}

	public void setTela(float tela) {
		this.tela = tela;
	}

	@Override
	public String toString() {
		return super.toString() + peso + ";" + bateria + ";" + tela;
	}

}
