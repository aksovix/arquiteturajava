package br.edu.infnet.applocacaoproduto.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TB_COMPUTADOR")
@PrimaryKeyJoinColumn(name = "COM_ID_PRO")
public class Computador extends Produto {

	@Column(name = "COM_MEMORIA", nullable = false)
	private int memoria;
	
	@Column(name = "COM_CPU", nullable = false)
	private float cpu;
	
	@Column(name = "COM_DISCO", nullable = false)
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
