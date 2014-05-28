package br.ic.unicamp.ecommerce.domain.produto;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
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

}
