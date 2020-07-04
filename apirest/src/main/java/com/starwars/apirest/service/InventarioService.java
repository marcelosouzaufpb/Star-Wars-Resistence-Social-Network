package com.starwars.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starwars.apirest.models.Inventario;
import com.starwars.apirest.repository.InventarioRepository;

@Service
public class InventarioService {

	@Autowired
	private InventarioRepository repository;

	public List<Inventario> findAll() {
		return this.repository.findAll();
	}

	public Inventario findById(long id) {
		return this.repository.findById(id).get();
	}

	public Inventario save(Inventario inventario) {
		return this.repository.save(inventario);
	}

	public void delete(Inventario inventario) {
		this.repository.delete(inventario);
	}

	public Inventario update(Inventario inventario) {
		return this.repository.save(inventario);

	}
}
