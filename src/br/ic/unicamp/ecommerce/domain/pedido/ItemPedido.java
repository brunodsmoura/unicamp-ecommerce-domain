package br.ic.unicamp.ecommerce.domain.pedido;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import br.ic.unicamp.ecommerce.domain.produto.Produto;

@Entity
@Table(name="ITEM_PEDIDO")
@Access(AccessType.PROPERTY)
public class ItemPedido implements Serializable {

	private static final long serialVersionUID = -12210815716901726L;

	private ItemPedidoPK pk;
	private Integer quantidade;
	
	public ItemPedido() { pk = new ItemPedidoPK(); }

	@EmbeddedId
	public ItemPedidoPK getPk(){
		return pk;
	}
	
	public void setPk(ItemPedidoPK pk){
		this.pk = pk;
	}
	
	@Transient
	public Pedido getPedido() {
		return pk.getPedido();
	}

	public void setPedido(Pedido pedido) {
		pk.setPedido(pedido);
	}

	@Transient
	public Produto getProduto() {
		return pk.getProduto();
	}

	public void setProduto(Produto produto) {
		pk.setProduto(produto);
	}

	@Column(name="quantidade", nullable=false)
	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
}