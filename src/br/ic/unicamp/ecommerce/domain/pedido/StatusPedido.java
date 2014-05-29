package br.ic.unicamp.ecommerce.domain.pedido;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STATUS_PEDIDO")
@Access(AccessType.PROPERTY)
public class StatusPedido implements Serializable {

	private static final long serialVersionUID = 7378110310538623492L;

	private Long id;
	private String nome;
	
	public StatusPedido() { }

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="status_pedido_sequence")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name="nome", nullable=false, length=100)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return String.format("StatusPedido[id: %d, nome: %s]", id, nome);
	}
	
}