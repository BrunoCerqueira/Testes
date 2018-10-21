package br.com.caelum.financas.modelo;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

/**
 * Created by leonardocordeiro on 24/02/17.
 */

public class Pais {

	private Long version;
    
    private Integer codigo;
	
    
   private String nome;

public Long getVersion() {
	return version;
}

public void setVersion(Long version) {
	this.version = version;
}

public Integer getCodigo() {
	return codigo;
}

public void setCodigo(Integer codigo) {
	this.codigo = codigo;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}
    
public enum TipoPais{
	   TERCEIRO_MUNDO,
	   PRIMEIRO_MUNDO;
   }
}
