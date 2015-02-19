
package br.infnet.java3.lojadeveiculos;

public class Loja {
	private String endereco;
	private String nome;
	private Carro[] estoqueDeCarros;
	private Motocicleta[] estoqueDeMotocicletas;
	
	Loja() {
		this.endereco = "";
		this.nome = "";
		this.estoqueDeCarros = new Carro[20];
		this.estoqueDeMotocicletas = new Motocicleta[20];
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

	public void listarEstoqueDeCarros() {
		System.out.println("Estoque de carros");
		System.out.println("******************************************");
		for (int i = 0; i < this.estoqueDeCarros.length; i++) {
			System.out.println(this.estoqueDeCarros[i].getChassi());
			System.out.println(this.estoqueDeCarros[i].getMontadora());
			System.out.println(this.estoqueDeCarros[i].getModelo());
			System.out.println(this.estoqueDeCarros[i].getTipo());
			System.out.println(this.estoqueDeCarros[i].getCor());
			System.out.println(this.estoqueDeCarros[i].getMotorizacao());
			System.out.println(this.estoqueDeCarros[i].getCambio());
			System.out.println(this.estoqueDeCarros[i].getPreco());
			System.out.println("-----------------------------------------");
		}
	}

	public void listarEstoqueDeMotos() {
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
