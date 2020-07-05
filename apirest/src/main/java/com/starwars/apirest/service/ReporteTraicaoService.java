package com.starwars.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starwars.apirest.models.ReporteTraicao;
import com.starwars.apirest.repository.ReporteTraicaoRepository;

@Service
public class ReporteTraicaoService {

	@Autowired
	private ReporteTraicaoRepository repository;

	public List<ReporteTraicao> findAll() {
		return this.repository.findAll();
	}

	public ReporteTraicao findById(long id) {
		return this.repository.findById(id).get();
	}

	public ReporteTraicao save(ReporteTraicao reporteTraicao) {
		return this.repository.save(reporteTraicao);
	}

	public void delete(ReporteTraicao reporteTraicao) {
		this.repository.delete(reporteTraicao);
	}

	public ReporteTraicao update(ReporteTraicao reporteTraicao) {
		return this.repository.save(reporteTraicao);
	}
	
}