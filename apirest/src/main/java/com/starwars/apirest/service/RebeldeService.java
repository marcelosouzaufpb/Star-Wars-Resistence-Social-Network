package com.starwars.apirest.service;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starwars.apirest.models.Inventario;
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
		if (rebelde.getInventario() != null) {
			ArrayList<Inventario> inventarios = new ArrayList<Inventario>();
			for (Inventario i : rebelde.getInventario()) {
				this.inventarioService.save(i);
				inventarios.add(i);
			}
			rebelde.setInventario(inventarios);
		}
		if (rebelde.getLocalizacao() != null) {
			rebelde.setLocalizacao(this.localizacaoService.save(rebelde.getLocalizacao()));
		}
		return this.repository.save(rebelde);
	}

	public void delete(Rebelde rebelde) {
		this.repository.delete(rebelde);
	}

	public Rebelde update(Rebelde rebelde) {
		return this.save(rebelde);
	}
}
