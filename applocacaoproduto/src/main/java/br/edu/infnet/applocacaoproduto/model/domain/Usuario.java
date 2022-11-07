package br.edu.infnet.applocacaoproduto.model.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
	
	@OneToMany
	@JoinColumn(name = "LOC_ID_USU")
	private List<Locatario> locatarios;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Locatario> getLocatarios() {
		return locatarios;
	}

	public void setLocatarios(List<Locatario> locatarios) {
		this.locatarios = locatarios;
	}
	
	@Override
	public String toString() {
		return id + ";" + nome + ";" + email + ";" + senha;
	}
}