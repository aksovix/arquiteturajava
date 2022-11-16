package br.edu.infnet.applocacaoproduto.model.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "TB_LOCACAO")
public class Locacao {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "LOA_ID")
	private Integer id;
	
	@DateTimeFormat(iso = ISO.DATE_TIME)
	@Column(name = "LOA_INICIO")
	private LocalDateTime inicio;

	@DateTimeFormat(iso = ISO.DATE_TIME)
	@Column(name = "LOA_FIM")
	private LocalDateTime fim;
	
	@Column(name = "LOA_DESCRICAO")
	private String descricao;
	
	@Column(name = "LOA_PROCESSADA")
	private boolean processada;
	
	@OneToOne(cascade = CascadeType.DETACH) 
	@JoinColumn(name = "LOC_ID")
	private Locatario locatario;
	
	@ManyToMany(cascade = CascadeType.DETACH)
	private List<Produto> produtos;
	
	@ManyToOne
	@JoinColumn(name = "LOA_ID_USU")
	private Usuario usuario;
}
