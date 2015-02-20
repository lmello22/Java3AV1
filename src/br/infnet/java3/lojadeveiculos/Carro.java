package br.infnet.java3.lojadeveiculos;

public class Carro {
	private String chassi;
	private String montadora;
	private String modelo;
	private String tipo;
	private String cor;
	private float motorizacao;
	private String cambio;
	private float preco;

	public Carro() {
		
	}
	
	public Carro(String chassi, String montadora, String modelo, String tipo, String cor, float motorizacao, String cambio,	float preco) {
		this.setChassi(chassi);
		this.setMontadora(montadora);
		this.setModelo(modelo);
		this.setTipo(tipo);
		this.setCor(cor);
		this.setMotorizacao(motorizacao);
		this.setCambio(cambio);
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

	public float getMotorizacao() {
		return motorizacao;
	}

	public void setMotorizacao(float motorizacao) {
		this.motorizacao = motorizacao;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
}