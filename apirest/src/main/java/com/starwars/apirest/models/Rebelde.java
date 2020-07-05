package com.starwars.apirest.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rebelde")
public class Rebelde implements Serializable {

	private static final long serialVersionUID = 1L;

	public Rebelde() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "nome", length = 50, unique = true)
	private String nome;

	@Column(name = "idade", length = 1000)
	private Integer idade;

	@Column(name = "genero", length = 25)
	private String genero;

	@Column(name = "e_traidor")
	private boolean eTraidor = false;

	@OneToOne
	private Localizacao localizacao;

	@OneToMany
	private List<Inventario> inventario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Localizacao getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}

	public boolean iseTraidor() {
		return eTraidor;
	}

	public void seteTraidor(boolean eTraidor) {
		this.eTraidor = eTraidor;
	}

	public List<Inventario> getInventario() {
		return inventario;
	}

	public void setInventario(List<Inventario> inventario) {
		this.inventario = inventario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
