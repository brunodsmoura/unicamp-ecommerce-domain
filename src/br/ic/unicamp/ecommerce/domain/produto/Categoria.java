package br.ic.unicamp.ecommerce.domain.produto;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author mpatutti
 */
@Entity
@Table(name = "CATEGORIA")
@Access(AccessType.FIELD)
public class Categoria implements Serializable {
	
    private static final long serialVersionUID = 1L;
    
    private Integer id;
    private String nome;
    private Categoria categoriaPai;

    public Categoria() { }

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="categoria_sequence")
    public Integer getId(){
    	return this.id;
    }
    
    public void setId(Integer id){
    	this.id = id;
    }

    @Column(name = "nome", nullable = false)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @ManyToOne(optional=true)
    @JoinColumn(name="id_categoria_pai")
    public Categoria getCategoriaPai(){
    	return this.categoriaPai;
    }
    
    public void setCategoriaPai(Categoria categoriaPai){
    	this.categoriaPai = categoriaPai;
    }
    
    @Override
    public String toString() {
        return String.format("Categoria[id: %d, nome: %s]", id, nome) ;
    }
    
}