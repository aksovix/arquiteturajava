package br.edu.infnet.applocacaoproduto.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TB_VEICULO")
@PrimaryKeyJoinColumn(name = "VEI_ID_PRO")
public class Veiculo extends Produto {

	@Column(name = "VEI_ANOMODELO", nullable = false)
	private String anoModelo;
	
	@Column(name = "VEI_CILINDRADA", nullable = false)
	private float cilindrada;
	
	@Column(name = "VEI_PORTA_MALAS", nullable = false)
	private int portaMalas;
	
	public String getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}

	public float getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(float cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getPortaMalas() {
		return portaMalas;
	}

	public void setPortaMalas(int portaMalas) {
		this.portaMalas = portaMalas;
	}

	@Override
	public String toString() {
		return super.toString() + anoModelo + ";" + cilindrada + ";" + portaMalas;
	}
}