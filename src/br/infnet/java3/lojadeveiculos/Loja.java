package br.infnet.java3.lojadeveiculos;

public class Loja {
	private String nome;
	private String endereco;
	private Carro[] estoqueDeCarros;
	private Motocicleta[] estoqueDeMotocicletas;
	
	public Loja() {

	}
	
	public Loja(String nome, String endereco, int tam) { //tam eh o tamanho maximo dos vetores
		this.setNome(nome);
		this.setEndereco(endereco);
		this.estoqueDeCarros = new Carro[tam];
		this.estoqueDeMotocicletas = new Motocicleta[tam];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void adicionaCarro(Carro carro, int posicao) {
		this.estoqueDeCarros[posicao] = carro;
	}
	
	public void adicionaMoto(Motocicleta moto, int posicao) {
		this.estoqueDeMotocicletas[posicao] = moto;
	}
	
	public Carro pesquisaCarro(int atributo, String valor, int estoque) {
		for (int i = 0; i < estoque; i++) {
			switch (atributo) {
				case 1: if (estoqueDeCarros[i].getChassi().equals(valor)) return estoqueDeCarros[i]; break;
				case 2: if (estoqueDeCarros[i].getMontadora().equals(valor)) return estoqueDeCarros[i]; break;
				case 3: if (estoqueDeCarros[i].getModelo().equals(valor)) return estoqueDeCarros[i]; break;
				case 4: if (estoqueDeCarros[i].getTipo().equals(valor)) return estoqueDeCarros[i]; break;
				case 5: if (estoqueDeCarros[i].getCor().equals(valor)) return estoqueDeCarros[i]; break;
				case 6: if (estoqueDeCarros[i].getMotorizacao() == Float.parseFloat(valor)) return estoqueDeCarros[i]; break;
				case 7: if (estoqueDeCarros[i].getCambio().equals(valor)) return estoqueDeCarros[i]; break;
				case 8: if (estoqueDeCarros[i].getPreco() == Float.parseFloat(valor)) return estoqueDeCarros[i];
			}
		}
		return null;
	}
	
	public Motocicleta pesquisaMoto(int atributo, String valor, int estoque) {
		for (int i = 0; i < estoque; i++) {
			switch (atributo) {
				case 1: if (estoqueDeMotocicletas[i].getChassi().equals(valor)) return estoqueDeMotocicletas[i]; break;
				case 2: if (estoqueDeMotocicletas[i].getMontadora().equals(valor)) return estoqueDeMotocicletas[i]; break;
				case 3: if (estoqueDeMotocicletas[i].getModelo().equals(valor)) return estoqueDeMotocicletas[i]; break;
				case 4: if (estoqueDeMotocicletas[i].getTipo().equals(valor)) return estoqueDeMotocicletas[i]; break;
				case 5: if (estoqueDeMotocicletas[i].getCor().equals(valor)) return estoqueDeMotocicletas[i]; break;
				case 6: if (estoqueDeMotocicletas[i].getCilindrada() == Integer.parseInt(valor)) return estoqueDeMotocicletas[i]; break;
				case 7: if (estoqueDeMotocicletas[i].getCapacidadeDoTanque() == Integer.parseInt(valor)) return estoqueDeMotocicletas[i]; break;
				case 8: if (estoqueDeMotocicletas[i].getPreco() == Float.parseFloat(valor)) return estoqueDeMotocicletas[i];
			}
		}
		return null;
	}

	public void listaEstoqueDeCarros() {
		int i = 0;
		System.out.println("Estoque de carros");
		System.out.println("******************************************");
		while ((i < this.estoqueDeCarros.length) && (this.estoqueDeCarros[i] != null)) {
		//for (int i = 0; i < this.estoqueDeCarros.length; i++) {
			System.out.println(this.estoqueDeCarros[i].getChassi());
			System.out.println(this.estoqueDeCarros[i].getMontadora());
			System.out.println(this.estoqueDeCarros[i].getModelo());
			System.out.println(this.estoqueDeCarros[i].getTipo());
			System.out.println(this.estoqueDeCarros[i].getCor());
			System.out.println(this.estoqueDeCarros[i].getMotorizacao());
			System.out.println(this.estoqueDeCarros[i].getCambio());
			System.out.println(this.estoqueDeCarros[i].getPreco());
			System.out.println("-----------------------------------------");
			i++;
		}
	}

	public void listaEstoqueDeMotos() {
		System.out.println("Estoque de motos");
		System.out.println("******************************************");
		for (int i = 0; i < this.estoqueDeMotocicletas.length; i++) {
			System.out.println(this.estoqueDeMotocicletas[i].getChassi());
			System.out.println(this.estoqueDeMotocicletas[i].getModelo());
			System.out.println(this.estoqueDeMotocicletas[i].getMontadora());
			System.out.println(this.estoqueDeMotocicletas[i].getTipo());
			System.out.println(this.estoqueDeMotocicletas[i].getCor());
			System.out.println(this.estoqueDeMotocicletas[i].getCilindrada());
			System.out.println(this.estoqueDeMotocicletas[i].getCapacidadeDoTanque());
			System.out.println(this.estoqueDeMotocicletas[i].getPreco());
			System.out.println("-----------------------------------------");
		}
	}
}