package br.com.caelum.financas.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Version;

@IdClass(ClienteId.class)
public class Cliente {
	@Version
	private Long version;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	@Id
	@Column(name="CODIGO_NACIONALIDADE")
	private Long nacionalidadeCodigo;
	
	@ManyToMany
	@JoinTable()
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

	 
	 

}
