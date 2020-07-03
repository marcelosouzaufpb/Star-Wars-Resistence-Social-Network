package com.starwars.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.starwars.apirest.models.Localizacao;

public interface LocalizacaoRepository extends JpaRepository<Localizacao, Integer> {

}
