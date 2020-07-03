package com.starwars.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.starwars.apirest.models.ReporteTraicao;

public interface ReporteTraicaoRepository extends JpaRepository<ReporteTraicao, Long> {

	public ReporteTraicao findById(Integer id);
}
