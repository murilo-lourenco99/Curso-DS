package atividades;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Opc opc = new Opc();

		// 1 - Exibir Menu
		System.out.println("1 – Área do Retângulo\n" + "2 – Área do Triângulo\n" + "3 – Área do Círculo\n"
				+ "4 – Área do Losango\n" + "5 – Sair\n" + "Digite a opção que deseja: ");
		int opcao = ler.nextInt();
		opc.exibirMenu(opcao);

		// 2 - Saudação
		System.out.println("\nDigite seu nome: ");
		String nome = ler.next();

		String saudar = opc.saudacaoPersonalizada(nome);
		System.out.println(saudar);

		// 3 - Sorteio
			
		int[] digitado1 = opc.leituraSorteio();
		int[] sorteado1 = opc.numeroSorteio();

		System.out.println("\nNúmeros digitados: ");
		for(int i=0; i<2; i++) {
			System.out.print(digitado1[i] + " ");
		}
		
		System.out.println("\nNúmeros sorteados: ");
		for(int i=0; i<2; i++) {
			System.out.print(sorteado1[i] + " ");
		}
		
		opc.sorteio(digitado1, sorteado1);
		
		
		// 4 - Fatorial
		System.out.println("\nDigite o numero para o fatorial: ");
		int numero = ler.nextInt();

		int resultado = opc.calculoFatorial(numero);
		System.out.println("Resultado do Fatorial: " + resultado);

		ler.close();
	}

}
