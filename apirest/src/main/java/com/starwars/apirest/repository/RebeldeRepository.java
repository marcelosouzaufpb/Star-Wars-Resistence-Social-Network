package com.starwars.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.starwars.apirest.models.Rebelde;

public interface RebeldeRepository extends JpaRepository<Rebelde, Long> {

	public Rebelde findById(Integer id);
}
