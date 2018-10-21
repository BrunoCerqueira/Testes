package br.com.caelum.financas.modelo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

/**
 * Created by leonardocordeiro on 24/02/17.
 */

@Entity
@DiscriminatorValue(value="ESTADUAL")
public class TributoEstadual extends Tributo {
	
	 
	 
	private String descricaoEstado;

	public String getDescricaoEstado() {
		return descricaoEstado;
	}

	public void setDescricaoEstado(String descricaoEstado) {
		this.descricaoEstado = descricaoEstado;
	}
}