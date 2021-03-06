package com.starwars.apirest.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reporte_traicao")
public class ReporteTraicao {

	public ReporteTraicao() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "traidor")
	private Rebelde traidor;

	@Column(name = "autor")
	private Rebelde autor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Rebelde getTraidor() {
		return traidor;
	}

	public void setTraidor(Rebelde traidor) {
		this.traidor = traidor;
	}

	public Rebelde getAutor() {
		return autor;
	}

	public void setAutor(Rebelde autor) {
		this.autor = autor;
	}
}
