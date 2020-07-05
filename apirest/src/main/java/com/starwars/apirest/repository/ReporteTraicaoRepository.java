package com.starwars.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.starwars.apirest.models.Rebelde;
import com.starwars.apirest.models.ReporteTraicao;

public interface ReporteTraicaoRepository extends JpaRepository<ReporteTraicao, Long> {

	public ReporteTraicao findById(Integer id);

	@Query(value = "SELECT reporte_traicao.traidor FROM reporte_traicao", nativeQuery = true)
	public List<Rebelde> findReportadosByRebelde();

}
