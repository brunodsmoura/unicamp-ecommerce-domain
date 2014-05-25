package br.ic.unicamp.ecommerce.domain.log;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="LOG")
@Access(AccessType.PROPERTY)
public class Log implements Serializable {
	
	private static final long serialVersionUID = -3197022639580474587L;

	private Long id;
	private Date dataCriacao;
	private Long codigoUsuario;
	private String tabela;
	private String conteudo;
	
	public Log() {	}

	@Id
	@Column(name="id_log")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name="dt_criacao", nullable=false)
	@Temporal(TemporalType.DATE)
	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	@Column(name="cd_usuario", nullable=false)
	public Long getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(Long codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	@Column(name="nm_tabela", nullable=false, length=100)
	public String getTabela() {
		return tabela;
	}

	public void setTabela(String tabela) {
		this.tabela = tabela;
	}

	@Column(name="ds_conteudo", nullable=false, length=255)
	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	@Override
	public String toString() {
		return String.format("Log[id: %d, usuario: %d]", id, codigoUsuario);
	}

}