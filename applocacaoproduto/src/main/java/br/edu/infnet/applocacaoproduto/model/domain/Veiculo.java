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
@Table(name = "TB_VEICULO")
@PrimaryKeyJoinColumn(name = "VEI_ID_PRO")
public class Veiculo extends Produto {

	@Column(name = "VEI_ANOMODELO", nullable = false)
	private String anoModelo;
	
	@Column(name = "VEI_CILINDRADA", nullable = false)
	private float cilindrada;
	
	@Column(name = "VEI_PORTA_MALAS", nullable = false)
	private int portaMalas;
}