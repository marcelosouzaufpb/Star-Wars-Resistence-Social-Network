package com.starwars.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starwars.apirest.models.Localizacao;
import com.starwars.apirest.repository.LocalizacaoRepository;

@Service
public class LocalizacaoService {

	@Autowired
	private LocalizacaoRepository repository;

	public List<Localizacao> findAll() {
		return this.repository.findAll();
	}

	public Localizacao findById(long id) {
		return this.repository.findById(id).get();
	}

	public Localizacao save(Localizacao localizacao) {
		return this.repository.save(localizacao);
	}

	public void delete(Localizacao localizacao) {
		this.repository.delete(localizacao);
	}

	public Localizacao update(Localizacao localizacao) {
		return this.repository.save(localizacao);

	}
}
