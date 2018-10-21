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

@Entity
public class Pais {

	@Version
	private Long version;
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
	
	@Enumerated(EnumType.ORDINAL)
	private TipoPais tipoPais;
    
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
   
   public TipoPais getTipoPais() {
	return tipoPais;
}

public void setTipoPais(TipoPais tipoPais) {
	this.tipoPais = tipoPais;
}

public enum TipoPais{
	   TERCEIRO_MUNDO,
	   PRIMEIRO_MUNDO;
   }
}
