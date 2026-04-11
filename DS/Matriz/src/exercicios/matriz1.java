package exercicios;

import java.util.Scanner;

public class matriz1 {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int matriz [] [], i, j;
	
	// definição da matriz [parece o vetor]
	matriz = new int [3] [3];

	// leitura da matriz
	for(i=0; i<3; i++) { // controle da linha da matriz
		for(j=0; j<3; j++) { // controle das colunas
			System.out.println("Entre com o valor da coluna " +j+ " linha " +i+ " :");
			matriz [i] [j] = ler.nextInt();
		}
	}
	// apresentação da matriz
	for(i=0; i<3; i++) {
		System.out.println();
		for(j=0; j<3; j++) {
			System.out.print("| "+matriz [i] [j] + " |");
		}
	}
	
	ler.close();
}
}
