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
@Table(name = "TB_COMPUTADOR")
@PrimaryKeyJoinColumn(name = "COM_ID_PRO")
public class Computador extends Produto {

	@Column(name = "COM_MEMORIA", nullable = false)
	private int memoria;
	
	@Column(name = "COM_CPU", nullable = false)
	private float cpu;
	
	@Column(name = "COM_DISCO", nullable = false)
	private int disco;
}
