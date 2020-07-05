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

import com.starwars.apirest.models.Rebelde;
import com.starwars.apirest.service.RebeldeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/starwars")
@Api(value = "API REST Rebelde")
public class RebeldeController {

	@Autowired
	private RebeldeService service;

	@GetMapping("/rebelde")
	@ApiOperation(value = "Retorna uma lista de Rebeldes")
	public List<Rebelde> listaRebelde() {
		return this.service.findAll();
	}

	@GetMapping("/rebelde/{id}")
	@ApiOperation(value = "Retorna um Rebelde")
	public Rebelde getRebeldeById(@PathVariable(value = "id") Integer id) {
		return this.service.findById(id);
	}

	@PostMapping("/rebelde")
	@ApiOperation(value = "Salva um Rebelde no DB")
	public Rebelde salvarRebelde(@RequestBody Rebelde rebelde) {
		return this.service.save(rebelde);
	}

	@DeleteMapping("/rebelde/{eTraidor}")
	@ApiOperation(value = "Deleta um Rebelde no DB")
	public void deletaRebelde(@PathVariable(value = "eTraidor") Rebelde rebelde) {
		this.service.delete(rebelde);
	}

	@PutMapping("/rebelde")
	@ApiOperation(value = "Atualiza um Rebelde no DB")
	public Rebelde atualizaRebelde(@RequestBody Rebelde rebelde) {
		return this.service.update(rebelde);
	}

	@GetMapping("/traidor")
	@ApiOperation(value = "Retorna uma lista com todos rebeldes que sao traidores")
	public List<Rebelde> getRebeldeByTraidor(@RequestBody Boolean eTraidor) {
		return this.service.getRebeldeByTraicao(eTraidor);
	}

}
