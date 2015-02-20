package br.infnet.java3;

import br.infnet.java3.lojadeveiculos.*;
import java.util.Scanner;

public class TestaLoja {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String nome, endereco; //dados da loja
		int tam; //tamanho maximo do vetor de carros/motos
		int opcao; //opcao do menu
		int ultimoCarro, ultimaMoto; //indice do ultimo elemento do vetor
		ultimoCarro = ultimaMoto = 0; //programa iniciando; vetor vazio
		
		Loja loja;
		
		System.out.println("----------Loja de Veiculos----------");
		System.out.println("***Dados da loja***");
		System.out.println("Informe os dados da loja: ");
		System.out.print("Nome: ");
		nome = sc.next();
		System.out.print("Endereco: ");
		endereco = sc.next();
		System.out.println("Quantidade maxima de carros/motos em estoque: ");
		tam = sc.nextInt();
		
		loja = new Loja(nome, endereco, tam);
		
		do {
			System.out.println("1 - Incluir carro");
			System.out.println("2 - Incluir moto");
			System.out.println("3 - Pesquisar carro");
			System.out.println("4 - Pesquisar moto");
			System.out.println("5 - Listar estoque de carros");
			System.out.println("6 - Listar estoque de motos");
			System.out.println("7 - Sair");
			System.out.print("Opcao: ");
			opcao = sc.nextInt();
			switch (opcao) {
				case 1: loja.adicionaCarro(leCarro(), ultimoCarro); ultimoCarro++; break;
				case 2: loja.adicionaMoto(leMoto(), ultimaMoto); ultimaMoto++; break;
//				case 3: loja.pesquisaCarro(); break;
//				case 4: loja.pesquisaMoto(); break;
				case 5: loja.listaEstoqueDeCarros(); break;
				case 6: loja.listaEstoqueDeMotos(); break;
				case 7: System.out.println("Tchau!"); break;
				default: System.out.println("Opcao incorreta!");
				
			}
		} while (opcao != 7);
		
		sc.close();
	}
	
	static Carro leCarro() {
		String chassi, montadora, modelo, tipo, cor, cambio;
		float motorizacao, preco;

		System.out.println("Informe os dados do carro: ");
		System.out.print("Chassi: ");
		chassi = sc.next();
		System.out.print("Montadora: ");
		montadora = sc.next();
		System.out.print("Modelo: ");
		modelo = sc.next();
		System.out.print("Tipo: ");
		tipo = sc.next();
		System.out.print("Cor: ");
		cor = sc.next();
		System.out.print("Motorizacao: ");
		motorizacao = sc.nextFloat();
		System.out.print("Cambio: ");
		cambio = sc.next();
		System.out.print("Preco: ");
		preco = sc.nextFloat();
		
		return new Carro(chassi, montadora, modelo, tipo, cor, motorizacao, cambio, preco);
	}
	
	static Motocicleta leMoto() {
		String chassi, montadora, modelo, tipo, cor;
		int cilindrada, capacidadeDoTanque;
		float preco;

		System.out.println("Informe os dados da moto: ");
		System.out.print("Chassi: ");
		chassi = sc.next();
		System.out.print("Montadora: ");
		montadora = sc.next();
		System.out.print("Modelo: ");
		modelo = sc.next();
		System.out.print("Tipo: ");
		tipo = sc.next();
		System.out.print("Cor: ");
		cor = sc.next();
		System.out.print("Cilindrada: ");
		cilindrada = sc.nextInt();
		System.out.print("CapacidadeDoTanque: ");
		capacidadeDoTanque = sc.nextInt();
		System.out.print("Preco: ");
		preco = sc.nextFloat();
		
		return new Motocicleta(chassi, montadora, modelo, tipo, cor, cilindrada, capacidadeDoTanque, preco);
	}
}