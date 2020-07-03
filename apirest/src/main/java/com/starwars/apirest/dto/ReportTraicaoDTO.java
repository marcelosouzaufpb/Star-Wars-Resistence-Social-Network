package com.starwars.apirest.dto;

import com.starwars.apirest.models.Rebelde;

public class ReportTraicaoDTO {

	public ReportTraicaoDTO() {
	}

	private Rebelde traidor;

	private Rebelde autor;

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
