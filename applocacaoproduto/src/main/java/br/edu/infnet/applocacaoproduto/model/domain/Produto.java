package br.edu.infnet.applocacaoproduto.model.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor
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
	
	@ManyToMany(mappedBy = "produtos")
	private List<Locacao> locacoes;
	
	@ManyToOne
	@JoinColumn(name = "PRO_ID_USU")
	private Usuario usuario;
}
