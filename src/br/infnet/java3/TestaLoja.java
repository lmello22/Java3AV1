package br.infnet.java3;

import br.infnet.java3.lojadeveiculos.*;
import java.util.Scanner;

public class TestaLoja {

	static Scanner sc = new Scanner(System.in);
	static int ultimoCarro = 0; //indice do ultimo elemento do vetor
	static int ultimaMoto = 0; //indice do ultimo elemento do vetor
	
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
		
		loja.adicionaCarro(new Carro("chassi1", "montadora1", "modelo1", "tipo1", "cor1", 1.0f, "cambio1", 22000.0f), ultimoCarro);
		ultimoCarro++;
		loja.adicionaCarro(new Carro("chassi2", "montadora2", "modelo2", "tipo2", "cor2", 2.0f, "cambio2", 23000.0f), ultimoCarro);
		ultimoCarro++;
		loja.adicionaCarro(new Carro("chassi3", "montadora3", "modelo3", "tipo3", "cor3", 1.8f, "cambio3", 24000.0f), ultimoCarro);
		ultimoCarro++;
		loja.adicionaCarro(new Carro("chassi4", "montadora4", "modelo4", "tipo4", "cor4", 1.6f, "cambio4", 25000.0f), ultimoCarro);
		ultimoCarro++;
						
		do {
			System.out.println("*****Loja de veiculos " + loja.getNome() + "*****");
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
				case 3: menuPesquisaCarro(loja); break;
				case 4: menuPesquisaMoto(loja); break;
				case 5: loja.listaEstoqueDeCarros(); break;
				case 6: loja.listaEstoqueDeMotos(); break;
				case 7: System.out.println("Tchau!"); break;
				default: System.out.println("Opcao incorreta!");
				
			}
		} while (opcao != 7);
		
		sc.close();
	}
	
	static void menuPesquisaCarro(Loja loja) {
		int opcao;
		Carro carro = null;
		do {
			System.out.println("Pesquisar por qual atributo?");
			System.out.println("1 - Chassi");
			System.out.println("2 - Montadora");
			System.out.println("3 - Modelo");
			System.out.println("4 - Tipo");
			System.out.println("5 - Cor");
			System.out.println("6 - Motorizacao");
			System.out.println("7 - Cambio");
			System.out.println("8 - Preco");
			System.out.println("9 - Voltar ao menu principal");
			System.out.print("Opcao: ");
			opcao = sc.nextInt();
			System.out.println("Digite o valor para pesquisa: ");
			switch (opcao) {
				case 1: case 2:	case 3:	case 4:	case 5:	case 6: case 7: case 8: {
					carro = loja.pesquisaCarro(opcao, sc.next(), ultimoCarro);
					if (carro != null)
						carro.mostraCarro();
					else
						System.out.println("Nao encontrado.");
					break;
				}
				case 9: return;
				default: System.out.println("Opcao incorreta!");
			}
		} while (opcao != 9);
	}
	
	static void menuPesquisaMoto(Loja loja) {
		int opcao;
		Motocicleta moto = null;
		do {
			System.out.println("Pesquisar por qual atributo?");
			System.out.println("1 - Chassi");
			System.out.println("2 - Montadora");
			System.out.println("3 - Modelo");
			System.out.println("4 - Tipo");
			System.out.println("5 - Cor");
			System.out.println("6 - Cilindrada");
			System.out.println("7 - Capacidade do tanque");
			System.out.println("8 - Preco");
			System.out.println("9 - Voltar ao menu principal");
			System.out.print("Opcao: ");
			opcao = sc.nextInt();
			System.out.println("Digite o valor para pesquisa: ");
			switch (opcao) {
				case 1: case 2:	case 3:	case 4:	case 5:	case 6: case 7: case 8: {
					moto = loja.pesquisaMoto(opcao, sc.next(), ultimaMoto);
					if (moto != null)
						moto.mostraMoto();
					else
						System.out.println("Nao encontrado.");
					break;
				}
				case 9: return;
				default: System.out.println("Opcao incorreta!");
			}
		} while (opcao != 9);
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