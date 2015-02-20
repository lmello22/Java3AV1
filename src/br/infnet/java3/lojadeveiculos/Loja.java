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
	
	public Carro pesquisaCarro(String chassi) {
		for (int i = 0; i < estoqueDeCarros.length; i++)
			if (estoqueDeCarros[i].getChassi().equals(chassi)) return estoqueDeCarros[i];
		return null;
	}

	public Motocicleta pesquisaMoto(String chassi) {
		for (int i = 0; i < estoqueDeMotocicletas.length; i++)
			if (estoqueDeMotocicletas[i].getChassi().equals(chassi)) return estoqueDeMotocicletas[i];
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