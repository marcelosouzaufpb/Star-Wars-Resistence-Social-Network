package com.starwars.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.starwars.apirest.models.Rebelde;

public interface RebeldeRepository extends JpaRepository<Rebelde, Long> {

	public Rebelde findById(Integer id);

	@Query(value = "SELECT * FROM rebelde WHERE rebelde.e_traidor = ?1", nativeQuery = true)
	public List<Rebelde> findRebeldeByTraicao(Boolean eTraidor);
	
}
