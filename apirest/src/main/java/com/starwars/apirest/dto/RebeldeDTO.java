package com.starwars.apirest.dto;

public class RebeldeDTO {

	public RebeldeDTO() {
	}

	private String nome;

	private Integer idade;

	private String genero;

	private boolean eTraidor;

	private LocalizacaoDTO localizacao;

	private InventarioDTO inventario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public boolean iseTraidor() {
		return eTraidor;
	}

	public void seteTraidor(boolean eTraidor) {
		this.eTraidor = eTraidor;
	}

	public LocalizacaoDTO getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(LocalizacaoDTO localizacao) {
		this.localizacao = localizacao;
	}

	public InventarioDTO getInventario() {
		return inventario;
	}

	public void setInventario(InventarioDTO inventario) {
		this.inventario = inventario;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

}
