package com.starwars.apirest.dto;

public class InventarioDTO {

	public InventarioDTO() {
	}

	private String item;

	private Integer pontos;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Integer getPontos() {
		return pontos;
	}

	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}
}
