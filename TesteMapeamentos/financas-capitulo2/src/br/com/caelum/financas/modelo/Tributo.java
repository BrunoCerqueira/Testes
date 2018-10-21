package br.com.caelum.financas.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.Version;

/**
 * Created by leonardocordeiro on 24/02/17.
 */

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TIPO_TRIBUTO")
public abstract class Tributo {

  @Version
  private Long version;
  
  @Id
  @Column(name="id")
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  
  @ManyToMany(mappedBy="tributos")
  private List<Empresa> empresas;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}
  
  
  
  
  
}