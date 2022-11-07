package br.edu.infnet.applocacaoproduto.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.InheritanceType;

@Entity
@Table(name = "TB_PRODUTO")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PRO_ID", nullable = false)
	private Integer id;
	
	@Column(name = "PRO_CD", nullable = false)
	private int codigo;
	
	@Column(name = "PRO_MARCA", nullable = false)
	private String marca;
	
	@Column(name = "PRO_MODELO", nullable = false)
	private String modelo;
	
	@Column(name = "PRO_VALOR", nullable = false)
	private float valor;
	
	public Produto() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return id + ";" + codigo + ";" + marca + ";" + modelo+ ";" + valor;
	}
}
