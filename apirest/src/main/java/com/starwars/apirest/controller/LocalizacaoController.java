package com.starwars.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Localizacao")
public class LocalizacaoController {

	@Autowired
	private LocalizacaoService service;

	@GetMapping("/localizacao")
	@ApiOperation(value = "Retorna uma lista de Localizacoes")
	public List<Localizacao> listaLocalizacao() {
		return this.service.findAll();
	}

	@GetMapping("/localizacao/{id}")
	@ApiOperation(value = "Retorna uma Localizacao")
	public Localizacao getLocalizacaoById(@PathVariable(value = "id") Integer id) {
		return this.service.findById(id);
	}

	@PostMapping("/localizacao")
	@ApiOperation(value = "Salva um Localizacao no DB")
	public Localizacao salvarLocalizacao(@RequestBody Localizacao localizacao) {
		return this.service.save(localizacao);
	}

	@DeleteMapping("/localizacao")
	@ApiOperation(value = "Deleta uma Localizacao no DB")
	public void deletaLocalizacao(@RequestBody Localizacao localizacao) {
		this.service.delete(localizacao);
	}

	@PutMapping("/localizacao")
	@ApiOperation(value = "Atualiza uma Localizacao no DB")
	public Localizacao atualizaLocalizacao(@RequestBody Localizacao localizacao) {
		return this.service.update(localizacao);
	}

}
