package br.com.caelum.financas.modelo;

import java.util.List;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Version;

@Entity
@IdClass(ClienteId.class)
public class Cliente {
	
	@Version
	private Long version;
	
	@Id
	private Long id;
	@Id
	private Long nacionalidadeCodigo;
	
	@Embedded
	@AssociationOverrides({
		@AssociationOverride(name="pais",  joinColumns=@JoinColumn(name="id_pais_cli")),
		
	})
	@AttributeOverrides({
		@AttributeOverride(name="rua", column=@Column(name="rua_cli")),
		@AttributeOverride(name="numero", column=@Column(name="numero_cli")),
		@AttributeOverride(name="bairro", column=@Column(name="bairro_cli")),
		@AttributeOverride(name="cidade", column=@Column(name="cidade_cli"))
		
	})
	private Endereco endereco;
	
	@ManyToMany(mappedBy="clientes")
	private List<Empresa> empresas;

 

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNacionalidadeCodigo() {
		return nacionalidadeCodigo;
	}

	public void setNacionalidadeCodigo(Long nacionalidadeCodigo) {
		this.nacionalidadeCodigo = nacionalidadeCodigo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Empresa> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}
	
	 

}
