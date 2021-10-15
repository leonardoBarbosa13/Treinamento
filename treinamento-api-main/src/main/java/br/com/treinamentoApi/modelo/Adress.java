package br.com.treinamentoApi.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adress {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer numero;
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;
	
	public Long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public Integer getNumero() {
		return numero;
	}
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((rua == null) ? 0 : rua.hashCode());
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Adress other = (Adress) obj;
		if(numero == null) {
			if(other.numero != null)
				return false;
		} else if(!numero.equals(other.numero))
			return false;
		if(id == null) {
			if(other.id != null)
				return false;
		} else if(id.equals(other.id))
			return false;
		if(rua == null) {
			if(other.rua != null)
				return false;
		} else if(!rua.equals(other.rua))
			return false;
		if(bairro == null) {
			if(other.bairro != null)
				return false;
		} else if(!bairro.equals(other.bairro))
			return false;
		if(cidade == null ) {
			if(other.cidade != null)
				return false;
		} else if(!cidade.equals(other.cidade))
			return false;
		if(estado == null) {
			if(other.estado != null)
				return false;
		} else if(estado.equals(other.estado))
			return false;
		if(pais == null) {
			if(other.pais != null)
				return false;
		} else if(pais.equals(other.pais))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Adress [id=" + id + ", numero=" + numero + ", rua=" + rua + ", bairro=" + bairro + ", cidade=" + cidade + ", estado" + estado + ", pais" + pais
				+ "]";
	}
}
