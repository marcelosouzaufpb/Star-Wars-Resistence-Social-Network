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

import com.starwars.apirest.models.Inventario;
import com.starwars.apirest.service.InventarioService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value="API REST Inventario")
public class InventarioController {

	@Autowired
	private InventarioService service;

	@GetMapping("/inventario")
	@ApiOperation(value="Retorna uma lista de Inventarios")
	public List<Inventario> listaInventario() {
		return this.service.findAll();
	}

	@GetMapping("/inventario/{id}")
	@ApiOperation(value="Retorna uma Inventario")
	public Inventario getInventarioById(@PathVariable(value = "id") Integer id) {
		return this.service.findById(id);
	}

	@PostMapping("/inventario")
	@ApiOperation(value="Salva um Inventario no DB")
	public Inventario salvarInventario(@RequestBody Inventario inventario) {
		return this.service.save(inventario);
	}

	@DeleteMapping("/inventario")
	@ApiOperation(value="Deleta um Inventario no DB")
	public void deletaInventario(@RequestBody Inventario inventario) {
		this.service.delete(inventario);
	}

	@PutMapping("/inventario")
	@ApiOperation(value = "Atualiza um Inventario no DB")
	public Inventario atualizaInventario(@RequestBody Inventario inventario) {
		return this.service.update(inventario);
	}

}
