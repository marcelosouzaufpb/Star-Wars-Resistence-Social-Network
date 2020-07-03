package com.starwars.apirest.dto;

public class LocalizacaoDTO {

	public LocalizacaoDTO() {
	}

	private Integer latitude;

	private Integer longitude;

	private String nome;

	public Integer getLatitude() {
		return latitude;
	}

	public void setLatitude(Integer latitude) {
		this.latitude = latitude;
	}

	public Integer getLongitude() {
		return longitude;
	}

	public void setLongitude(Integer longitude) {
		this.longitude = longitude;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
