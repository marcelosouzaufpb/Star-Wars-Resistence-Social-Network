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

import com.starwars.apirest.models.Inventario;
import com.starwars.apirest.repository.InventarioRepository;

@RestController
@RequestMapping(value = "/api")
public class InventarioController {

	@Autowired
	InventarioRepository inventarioRepository;

	@GetMapping("/inventario")
	public List<Inventario> listaInventario() {
		return inventarioRepository.findAll();
	}

	@GetMapping("/inventario/{id}")
	public Inventario getInventarioById(@PathVariable(value = "id") Integer id) {
		return inventarioRepository.findById(id);
	}

	@PostMapping("/inventario")
	public Inventario salvarInventario(@RequestBody Inventario inventario) {
		return inventarioRepository.save(inventario);
	}

	@DeleteMapping("/inventario")
	public void deletaInventario(@RequestBody Inventario inventario) {
		inventarioRepository.delete(inventario);
	}

	@PutMapping("/inventario")
	public Inventario atualizaInventario(@RequestBody Inventario inventario) {
		return inventarioRepository.save(inventario);
	}

}
