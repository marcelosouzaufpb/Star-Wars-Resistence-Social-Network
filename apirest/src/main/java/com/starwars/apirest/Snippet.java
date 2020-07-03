package com.starwars.apirest;

public class Snippet {
	@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer id;
	
		@Column(name = "nome")
		private String nome;
	
		@Column(name = "idade")
		private Integer idade;
	
		@Column(name = "genero")
		private String genero;
	
		@Column(name = "e_traidor")
		private boolean eTraidor = false;
	
		@OneToOne
		private Localizacao localizacao;
	
		@OneToOne
		private Inventario inventario;
	
		public Integer getId() {
			return id;
		}
	
		public void setId(Integer id) {
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
	
		public Inventario getInventario() {
			return inventario;
		}
	
		public void setInventario(Inventario inventario) {
			this.inventario = inventario;
		}
	
	}
	
}

