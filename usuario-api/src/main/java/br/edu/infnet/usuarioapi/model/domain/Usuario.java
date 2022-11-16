package br.edu.infnet.usuarioapi.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "TB_USUARIO")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USU_ID", nullable = false)
	private Integer id;
	
	@Column(name = "USU_NOME", nullable = false)
	private String nome;
	
	@Column(name = "USU_EMAIL", nullable = false)
	private String email;

	@Column(name = "USU_SENHA", nullable = false)
	private String senha;
}