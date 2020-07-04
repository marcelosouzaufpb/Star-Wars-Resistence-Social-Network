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

import com.starwars.apirest.models.ReporteTraicao;
import com.starwars.apirest.service.ReporteTraicaoService;

@RestController
@RequestMapping(value = "/api")
public class ReporteTraicaoController {

	@Autowired
	private ReporteTraicaoService service;

	@GetMapping("/reporteTraicao")
	public List<ReporteTraicao> listaReporteTraicao() {
		return this.service.findAll();
	}

	@GetMapping("/reporteTraicao/{id}")
	public ReporteTraicao getReporteTraicaoById(@PathVariable(value = "id") Integer id) {
		return this.service.findById(id);
	}

	@PostMapping("/reporteTraicao")
	public ReporteTraicao salvarReporteTraicao(@RequestBody ReporteTraicao reporteTraicao) {
		return this.service.save(reporteTraicao);
	}

	@DeleteMapping("/reporteTraicao")
	public void deletaReporteTraicao(@RequestBody ReporteTraicao reporteTraicao) {
		this.service.delete(reporteTraicao);
	}

	@PutMapping("/reporteTraicao")
	public ReporteTraicao atualizaReporteTraicao(@RequestBody ReporteTraicao reporteTraicao) {
		return this.service.update(reporteTraicao);
	}
}
