package atividades;

import java.util.Scanner;
import java.util.Random;;

public class Opc {
	Scanner ler = new Scanner(System.in);
	Random ran = new Random();

	// 1
	public void exibirMenu(int opcao) {
		switch (opcao) {
		case 1:
			System.out.println("Área do Retângulo");
			break;
		case 2:
			System.out.println("Área do Triângulo");
			break;
		case 3:
			System.out.println("Área do Círculo");
			break;
		case 4:
			System.out.println("Área do Losango");
			break;
		case 5:
			System.out.println("Você saiu yep :D");
			break;
		default:
			System.out.println("Opção indisponivel");
			break;
		}
	}

	// 2
	public String saudacaoPersonalizada(String nome) {
		String saudacao = "\nOlá, " + nome + ". Que belo nome, seja bem-vindo(a)!";
		return saudacao;
	}

	// 3
	public int[] leituraSorteio() {
		int[] digitado = new int[2];

		for (int i = 0; i < digitado.length; i++) {
			System.out.println("\nDigite o " + (i + 1) + "° numero: (0 a 10)");
			digitado[i] = ler.nextInt();
		}
		return digitado;
	}

	public int[] numeroSorteio() {
		int[] sorteado = new int[2];

		for (int i = 0; i < sorteado.length; i++) {
			sorteado[i] = ran.nextInt(5);
		}
		return sorteado;
	}

	public void sorteio(int[] digitado1, int[] sorteado1) {
		boolean win = false;

		for (int i = 0; i < digitado1.length; i++) {
			for (int j = 0; j < sorteado1.length; j++) {
				if (digitado1[i] == sorteado1[j]) {
					win = true;
				}
			}
		}

		if (win == true) {
			System.out.println("\nVecedor eba =D ");
		} else {
			System.out.println("\nPerdedor :'(");
		}
	}

	// 4
	public int calculoFatorial(int numero) {
		int total = 1;

		for (int i = 1; i < numero; i++) {
			total = total * i;
		}
		return total;
	}

}
