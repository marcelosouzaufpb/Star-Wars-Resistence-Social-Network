package com.starwars.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.starwars.apirest.models.Localizacao;
import com.starwars.apirest.repository.LocalizacaoRepository;

@RestController
@RequestMapping(value = "/api")
public class LocalizacaoController {

	@Autowired
	LocalizacaoRepository localizacaoRepository;
	

	@GetMapping("/localizacao")
	public List<Localizacao> listaProdutos() {
		return localizacaoRepository.findAll();
	}
	
	@GetMapping("/localizacao/{id}")
	public Localizacao getLocalizacaoById(@PathVariable(value = "id") Integer id) {
		return localizacaoRepository.findById(id);
	}
	
	@PostMapping("/localizacao")
	public Localizacao salvarLocalizacao(@RequestBody Localizacao localizacao) {
		return localizacaoRepository.save(localizacao);
	}
	
	@DeleteMapping("/localizacao")
	public void deletaLocalizacao(@RequestBody Localizacao localizacao) {
		localizacaoRepository.delete(localizacao);
	}
	
	@PutMapping("/localizacao")
	public Localizacao atualizaLocalizacao(@RequestBody Localizacao localizacao) {
		return localizacaoRepository.save(localizacao);
	}

}
