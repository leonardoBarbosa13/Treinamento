package br.com.treinamentoApi.controller;

import java.util.List;
import java.util.Objects;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import br.com.treinamentoApi.dto.AdressDto;
import br.com.treinamentoApi.form.AdressForm;
import br.com.treinamentoApi.modelo.Adress;
import br.com.treinamentoApi.respository.AdressRepository;

@RestController
@RequestMapping("/adress")
public class AdressController {

	@Autowired
	private AdressRepository adressRepository;
	
	@GetMapping()
	public List<Adress> all(){
		return adressRepository.findAll();
	}
	
	@GetMapping(value ="/{id}")
		public ResponseEntity<Adress> detail(@PathVariable Adress id){
			return new ResponseEntity<Adress>(id, HttpStatus.OK);
		}
	
	@PostMapping()
	public Adress newAdress(@RequestBody Adress newAdress) {
		return adressRepository.save(newAdress);
	}
	
	@PutMapping(value ="/{id}")
	@Transactional
	public ResponseEntity<AdressDto> replaceAdress( @PathVariable Long id, @RequestBody AdressForm form){
		Adress adress = form.atulizar(id,adressRepository);
			if(Objects.nonNull(adress)) {
				return ResponseEntity.ok(new AdressDto(adress));
			}
			return ResponseEntity.notFound().build();
	}

	@DeleteMapping(value = "/{id}")
	@Transactional
	public ResponseEntity<?> remove(@PathVariable long id){
		Optional<Adress> optional = adressRepository.findById(id);
		if(optional.isPresent()) {
			adressRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}
	
}
