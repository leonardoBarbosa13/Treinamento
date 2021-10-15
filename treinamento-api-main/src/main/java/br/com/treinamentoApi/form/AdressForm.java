package br.com.treinamentoApi.form;

import java.util.Optional;

import br.com.treinamentoApi.modelo.Adress;
import br.com.treinamentoApi.respository.AdressRepository;

public class AdressForm {

	private Integer numero;
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;
	
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public Adress atulizar(Long id, AdressRepository adressRepository) {
		Optional<Adress> adress = adressRepository.findById(id);
		
		if(adress.isPresent()) {
			adress.get().setNumero(this.numero);
			adress.get().setRua(this.rua);
			adress.get().setBairro(this.bairro);
			adress.get().setCidade(this.cidade);
			adress.get().setEstado(this.estado);
			adress.get().setPais(this.pais);
			return adress.get();
		}
		
		return null;
	}
	
}
