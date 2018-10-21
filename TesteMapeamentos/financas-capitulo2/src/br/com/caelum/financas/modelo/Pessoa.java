package br.com.caelum.financas.modelo;

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
import javax.persistence.ManyToOne;
import javax.persistence.Version;

/**
 * Created by leonardocordeiro on 24/02/17.
 */

@Entity
public class Pessoa {

	@Version
	private Long version;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Embedded
	@AssociationOverrides({
		@AssociationOverride(name="pais", joinColumns=@JoinColumn(name="id_pais_pes"))
	})
	@AttributeOverrides({
		@AttributeOverride(name="rua", column=@Column(name="rua_pes")),
		@AttributeOverride(name="numero", column=@Column(name="numero_pes")),
		@AttributeOverride(name="bairro", column=@Column(name="bairro_pes")),
		@AttributeOverride(name="cidade", column=@Column(name="cidade_pes"))
	})
	private Endereco endereco;
	
	@JoinColumn(name="id_empresa")
	@ManyToOne
	private Empresa empresa;

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

}
