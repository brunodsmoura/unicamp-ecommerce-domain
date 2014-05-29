package br.ic.unicamp.ecommerce.domain.pedido;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="ENTREGA_PEDIDO")
@Access(AccessType.PROPERTY)
public class EntregaPedido implements Serializable {
	
	private static final long serialVersionUID = 4995556626159904123L;

	private Pedido pedido;
	private Date dataPostagem;
	private String numeroPostagem;
	
	public EntregaPedido() { }

	@OneToOne
	@PrimaryKeyJoinColumn(name="id_pedido", referencedColumnName="id")
	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Temporal(TemporalType.DATE)
	@Column(name="dt_postagem", nullable=false)
	public Date getDataPostagem() {
		return dataPostagem;
	}

	public void setDataPostagem(Date dataPostagem) {
		this.dataPostagem = dataPostagem;
	}

	@Column(name="nr_postagem", nullable=false)
	public String getNumeroPostagem() {
		return numeroPostagem;
	}

	public void setNumeroPostagem(String numeroPostagem) {
		this.numeroPostagem = numeroPostagem;
	}
	
}