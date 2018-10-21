package br.com.caelum.financas.modelo;

import java.io.Serializable;

public class ClienteId implements Serializable {
	
	private static final long serialVersionUID = -7851637118215908808L;
	private Long id;
	private Long nacionalidadeCodigo;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nacionalidadeCodigo == null) ? 0 : nacionalidadeCodigo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClienteId other = (ClienteId) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nacionalidadeCodigo == null) {
			if (other.nacionalidadeCodigo != null)
				return false;
		} else if (!nacionalidadeCodigo.equals(other.nacionalidadeCodigo))
			return false;
		return true;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	

}
