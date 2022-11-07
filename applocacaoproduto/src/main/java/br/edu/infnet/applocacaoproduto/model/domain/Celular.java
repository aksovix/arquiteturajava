package br.edu.infnet.applocacaoproduto.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TB_CELULAR")
@PrimaryKeyJoinColumn(name = "CEL_ID_PRO")
public class Celular extends Produto {

	@Column(name = "CEL_PESO", nullable = false)
	private int peso;
	
	@Column(name = "CEL_BATERIA", nullable = false)
	private int bateria;
	
	@Column(name = "CEL_TELA", nullable = false)
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
