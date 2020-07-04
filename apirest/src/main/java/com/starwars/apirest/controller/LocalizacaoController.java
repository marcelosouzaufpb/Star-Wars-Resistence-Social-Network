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
import com.starwars.apirest.service.LocalizacaoService;

@RestController
@RequestMapping(value = "/api")
public class LocalizacaoController {

	@Autowired
	private LocalizacaoService service;

	@GetMapping("/localizacao")
	public List<Localizacao> listaLocalizacao() {
		return this.service.findAll();
	}

	@GetMapping("/localizacao/{id}")
	public Localizacao getLocalizacaoById(@PathVariable(value = "id") Integer id) {
		return this.service.findById(id);
	}

	@PostMapping("/localizacao")
	public Localizacao salvarLocalizacao(@RequestBody Localizacao localizacao) {
		return this.service.save(localizacao);
	}

	@DeleteMapping("/localizacao")
	public void deletaLocalizacao(@RequestBody Localizacao localizacao) {
		this.service.delete(localizacao);
	}

	@PutMapping("/localizacao")
	public Localizacao atualizaLocalizacao(@RequestBody Localizacao localizacao) {
		return this.service.update(localizacao);
	}

}
