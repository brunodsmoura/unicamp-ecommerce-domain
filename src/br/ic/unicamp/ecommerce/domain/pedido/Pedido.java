package br.ic.unicamp.ecommerce.domain.pedido;

import java.util.List;

public class Pedido {
	
	private Long id;
	private Integer numeroPedido;
	private Double valorTotal;
	private StatusPedido status;
	
	private List<ItemPedido> itensPedido;
	
	public Pedido() { }

}
