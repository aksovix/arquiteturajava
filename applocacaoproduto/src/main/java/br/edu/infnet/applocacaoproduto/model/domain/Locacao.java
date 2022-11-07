package br.edu.infnet.applocacaoproduto.model.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Transient;

//@Entity
//@Table(name = "TB_LOCACAO")
public class Locacao {

//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Id
//	@Column(name = "LOA_ID", nullable = false)
	private Integer id;
	
//	@Column(name = "LOA_INICIO", nullable = false)
	private LocalDateTime inicio;
	
//	@Column(name = "LOA_FIM", nullable = false)
	private LocalDateTime fim;
	
//	@Column(name = "LOA_DESCRICAO", nullable = false)
	private String descricao;
	
//	@Column(name = "LOA_PROCESSADA", nullable = false)
	private boolean processada;
	
//	@ManyToOne
//	@JoinColumn(name="loc_id", nullable=false)
	@Transient
	private Locatario locatario;
	
//	@OneToMany(mappedBy="locacao")
	@Transient
	private List<Produto> produtos;
	
	public Locacao() {
		inicio = LocalDateTime.now();
		fim = LocalDateTime.now().plusDays(3);
		processada = false;
	}
	
	public Locacao(Locatario locatario) {
		this();
		this.locatario = locatario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public LocalDateTime getInicio() {
		return inicio;
	}

	public void setInicio(LocalDateTime inicio) {
		this.inicio = inicio;
	}

	public LocalDateTime getFim() {
		return fim;
	}

	public void setFim(LocalDateTime fim) {
		this.fim = fim;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isProcessada() {
		return processada;
	}

	public void setProcessada(boolean processada) {
		this.processada = processada;
	}

	public Locatario getLocatario() {
		return locatario;
	}

	public void setLocatario(Locatario locatario) {
		this.locatario = locatario;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public String toString() {
		return descricao + ";" + inicio + ";" + fim + ";" +  processada + ";" + locatario + ";" + produtos.size();
	}
}
