package br.com.caelum.financas.modelo;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class Endereco {
	
	
	
	@Column(name="rua")
	private String rua;
	
	@Column(name="numero")
	private Long numero;
	
	@Column(name="bairro")
	private String bairro;
	
	@Column(name="cidade")
	private String cidade;
	
	@JoinColumn(name="codigo_pais")
	@ManyToOne
	private Pais pais;

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	

}
