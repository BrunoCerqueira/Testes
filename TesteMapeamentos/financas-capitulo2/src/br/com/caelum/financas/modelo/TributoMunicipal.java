package br.com.caelum.financas.modelo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by leonardocordeiro on 24/02/17.
 */

@Entity
@DiscriminatorValue(value="MUNICIPAL")
public class TributoMunicipal extends Tributo {
	
	@Column(name="descricao")
	private String descricaoMunicipio;

	public String getDescricaoMunicipio() {
		return descricaoMunicipio;
	}

	public void setDescricaoMunicipio(String descricaoMunicipio) {
		this.descricaoMunicipio = descricaoMunicipio;
	}
  
}
