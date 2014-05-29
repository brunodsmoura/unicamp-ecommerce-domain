package br.ic.unicamp.ecommerce.domain.usuario;

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
@Table(name="USUARIO")
@Access(AccessType.PROPERTY)
public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 4118778849011722428L;

	private Long id;
	private String nome;
	private String email;
	private String telefone;
	
	public Usuario() { }

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="usuario_sequence")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name="nome", nullable=false, length=200)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name="email", nullable=false, length=150)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name="telefone", nullable=true, length=9)
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return String.format("Usuario[id: %d, nome: %s]", id, nome);
	}

}