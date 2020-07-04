package com.starwars.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starwars.apirest.models.Rebelde;
import com.starwars.apirest.repository.RebeldeRepository;

@Service
public class RebeldeService {

	@Autowired
	private RebeldeRepository repository;

	@Autowired
	private InventarioService inventarioService;

	@Autowired
	private LocalizacaoService localizacaoService;

	public List<Rebelde> findAll() {
		return this.repository.findAll();
	}

	public Rebelde findById(long id) {
		return this.repository.findById(id).get();
	}

	public Rebelde save(Rebelde rebelde) {
		rebelde.setInventario(this.inventarioService.save(rebelde.getInventario()));
		rebelde.setLocalizacao(this.localizacaoService.save(rebelde.getLocalizacao()));
		return this.repository.save(rebelde);
	}

	public void delete(Rebelde rebelde) {
		this.repository.delete(rebelde);
	}

	public Rebelde update(Rebelde rebelde) {
		return this.repository.save(rebelde);
	}
}
