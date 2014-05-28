package br.ic.unicamp.ecommerce.domain.produto;

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
@Table(name="FABRICANTE")
@Access(AccessType.PROPERTY)
public class Fabricante implements Serializable {

	private static final long serialVersionUID = -8582549443039198598L;
	
	private Integer id;
	private String nome;
	
	public Fabricante() { }

	@Id
	@Column(name="id_fabricante")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="fabricante_sequence")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="nm_fabricante", nullable = false, length = 255)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return String.format("Fabricante[id: %d, nome: %s]", id, nome);
	}

}