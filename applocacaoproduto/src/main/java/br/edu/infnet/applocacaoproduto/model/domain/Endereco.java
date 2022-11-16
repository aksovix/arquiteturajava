package br.edu.infnet.applocacaoproduto.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_ENDERECO")
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "END_ID", nullable = false)
	private Integer id;
	
	@Column(name = "END_CEP", nullable = false)
	private String cep;
	
	@Column(name = "END_LOGRADOURO", nullable = false)
	private String logradouro;
	
	@Column(name = "END_COMPLEMENTO", nullable = false)
	private String complemento;
	
	@Column(name = "END_BAIRRO", nullable = false)
	private String bairro;

	@Column(name = "END_LOCALIDADE", nullable = false)
	private String localidade;
	
	@Column(name = "END_UF", nullable = false)
	private String uf;
	
}