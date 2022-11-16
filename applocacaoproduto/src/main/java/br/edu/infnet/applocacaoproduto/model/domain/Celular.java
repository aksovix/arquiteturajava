package br.edu.infnet.applocacaoproduto.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
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
}
