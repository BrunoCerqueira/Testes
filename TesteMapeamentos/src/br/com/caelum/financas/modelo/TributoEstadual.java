package br.com.caelum.financas.modelo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by leonardocordeiro on 24/02/17.
 */
@Entity
@DiscriminatorValue(value="ESTADUAL")
public class TributoEstadual extends Tributo {
	
	 
	@Column(name="DESCRICAO_ESTADO")
	private String descricaoEstado;

	public String getDescricaoEstado() {
		return descricaoEstado;
	}

	public void setDescricaoEstado(String descricaoEstado) {
		this.descricaoEstado = descricaoEstado;
	}
}