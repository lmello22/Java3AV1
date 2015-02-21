package br.infnet.java3.lojadeveiculos;

public class Motocicleta {
	private String chassi;
	private String montadora;
	private String modelo;
	private String tipo;
	private String cor;
	private int cilindrada;
	private int capacidadeDoTanque;
	private float preco;
	
	public Motocicleta() {
		
	}
	
	public Motocicleta(String chassi, String montadora, String modelo, String tipo, String cor, int cilindrada,	int capacidadeDoTanque, float preco) {
		this.setChassi(chassi);
		this.setMontadora(montadora);
		this.setModelo(modelo);
		this.setTipo(tipo);
		this.setCor(cor);
		this.setCilindrada(cilindrada);
		this.setCapacidadeDoTanque(capacidadeDoTanque);
		this.setPreco(preco);
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getMontadora() {
		return montadora;
	}

	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getCapacidadeDoTanque() {
		return capacidadeDoTanque;
	}

	public void setCapacidadeDoTanque(int capacidadeDoTanque) {
		this.capacidadeDoTanque = capacidadeDoTanque;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void mostraMoto() {
		System.out.println("---Dados da moto---");
		System.out.println(this.getChassi());
		System.out.println(this.getMontadora());
		System.out.println(this.getModelo());
		System.out.println(this.getTipo());
		System.out.println(this.getCor());
		System.out.println(this.getCilindrada());
		System.out.println(this.getCapacidadeDoTanque());
		System.out.println(this.getPreco());
		System.out.println("-------------------");
	}
}
