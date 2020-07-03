package com.starwars.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

}
