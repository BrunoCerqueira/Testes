package br.com.caelum.financas.modelo;

import java.util.List;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Version;

public class Empresa {
	
	private Long version;
	
	private Long id;
	
	private Float lucro;
	
	@JoinTable(name="EMPRESA_CLIENTE", joinColumns= {@JoinColumn(name="nacionalidade",referencedColumnName="nacionalidadeCodigo")},
			inverseJoinColumns= {@JoinColumn(name="id_cliente",referencedColumnName="id")})
	private List<Cliente> clientes;
	
	@OneToMany(mappedBy="empresa")
	private List<Pessoa> pessoas;
	
	@OneToOne(mappedBy="empresa")
	private Conta conta;
	
	@JoinTable(name="empresa_tributo", joinColumns= {@JoinColumn(name="id_empresa", referencedColumnName="id")},
										inverseJoinColumns=@JoinColumn(name="id_tributo",referencedColumnName="id"))	
	@ManyToMany
	private List<Tributo> tributos;
	
	@Embedded
	@AssociationOverrides({
		@AssociationOverride(name="pais", joinColumns=@JoinColumn(name="id_pais_emp"))
	})
	@AttributeOverrides({
		@AttributeOverride(name="rua", column=@Column(name="rua_emp")),
		@AttributeOverride(name="numero", column=@Column(name="numero_cli")),
		@AttributeOverride(name="bairro", column=@Column(name="bairro_cli")),
		@AttributeOverride(name="cidade", column=@Column(name="cidade_cli"))
	})
	private Endereco endereco;

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public Float getLucro() {
		return lucro;
	}

	public void setLucro(Float lucro) {
		this.lucro = lucro;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Tributo> getTributos() {
		return tributos;
	}

	public void setTributos(List<Tributo> tributos) {
		this.tributos = tributos;
	}
	

}
