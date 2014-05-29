package br.ic.unicamp.ecommerce.domain.produto;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUTO")
@Access(AccessType.PROPERTY)
public class Produto {

	private Integer id;
	private String nome;
	private String descricao;
	private Double valor;
	private Integer quantidadeEstoque;
	private Double peso;

	public Produto() { }

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="produto_sequence")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="nome", nullable=false, length=200)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name="descricao", nullable=false, length=255)
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name="valor", nullable=false, precision=2)
	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Column(name="qtd_estoque", nullable=false)
	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(Integer quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	@Column(name="peso", nullable=true, precision=3)
	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return String.format("Produto[id: %d, nome: %s]", id, nome);
	}
	
}