package com.starwars.apirest.controller;

import java.util.ArrayList;
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

import com.starwars.apirest.models.ReporteTraicao;
import com.starwars.apirest.service.ReporteTraicaoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/starwars")
@Api(value = "API REST Reporte Traicao")
public class ReporteTraicaoController {

	@Autowired
	private ReporteTraicaoService service;

	@GetMapping("/reporteTraicao")
	@ApiOperation(value = "Retorna uma lista de Reporte Traicao")
	public List<ReporteTraicao> listaReporteTraicao() {
		return this.service.findAll();
	}

	@GetMapping("/reporteTraicao/{id}")
	@ApiOperation(value = "Retorna um Reporte Traicao")
	public ReporteTraicao getReporteTraicaoById(@PathVariable(value = "id") Integer id) {
		return this.service.findById(id);
	}

	@PostMapping("/reporteTraicao")
	@ApiOperation(value = "Salva um Reporte Traicao no DB")
	public ReporteTraicao salvarReporteTraicao(@RequestBody ReporteTraicao reporteTraicao) {
		return this.service.save(reporteTraicao);
	}

	@DeleteMapping("/reporteTraicao")
	@ApiOperation(value = "Deleta um Reporte Traicao no DB")
	public void deletaReporteTraicao(@RequestBody ReporteTraicao reporteTraicao) {
		this.service.delete(reporteTraicao);
	}

	@PutMapping("/reporteTraicao")
	@ApiOperation(value = "Atualiza um Reporte Traicao no DB")
	public ReporteTraicao atualizaReporteTraicao(@RequestBody ReporteTraicao reporteTraicao) {
		return this.service.update(reporteTraicao);
	}

}
