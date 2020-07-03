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

import com.starwars.apirest.models.Rebelde;
import com.starwars.apirest.repository.RebeldeRepository;

@RestController
@RequestMapping(value = "/api")
public class RebeldeController {

	@Autowired
	RebeldeRepository rebeldeRepository;

	@GetMapping("/rebelde")
	public List<Rebelde> listaRebelde() {
		return rebeldeRepository.findAll();
	}

	@GetMapping("/rebelde/{id}")
	public Rebelde getRebeldeById(@PathVariable(value = "id") Integer id) {
		return rebeldeRepository.findById(id);
	}

	@PostMapping("/rebelde")
	public Rebelde salvarRebelde(@RequestBody Rebelde rebelde) {
		return rebeldeRepository.save(rebelde);
	}

	@DeleteMapping("/rebelde")
	public void deletaRebelde(@RequestBody Rebelde rebelde) {
		rebeldeRepository.delete(rebelde);
	}

	@PutMapping("/rebelde")
	public Rebelde atualizaRebelde(@RequestBody Rebelde rebelde) {
		return rebeldeRepository.save(rebelde);
	}

}
