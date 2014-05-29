package br.ic.unicamp.ecommerce.domain.pedido;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.ic.unicamp.ecommerce.domain.produto.Produto;

@Embeddable
public class ItemPedidoPK implements Serializable {

	private static final long serialVersionUID = 822683517592717562L;

	private Pedido pedido;
	private Produto produto;
	
	public ItemPedidoPK() { }

	@ManyToOne
	@JoinColumn(name="id_pedido")
	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@ManyToOne
	@JoinColumn(name="id_produto")
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}