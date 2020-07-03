package com.starwars.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.starwars.apirest.models.Inventario;

public interface InventarioRepository extends JpaRepository<Inventario, Long> {

	public Inventario findById(Integer id);
}
