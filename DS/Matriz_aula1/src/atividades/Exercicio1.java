package atividades;
import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 4;
		int a[][];
		
		a = new int[TAM][TAM];
		
		// leitura dos valores da matriz
		for(int i=0; i<TAM; i++) {
			for(int j=0; j<TAM; j++) {
				System.out.println("Digite o " +(i+1)+ "° valor do vetor: ");
				a[i][j] = ler.nextInt();
			}
		}
		
		// apresentação da matriz
		  for(int i=0; i<TAM; i++) {
			  System.out.print("[ ");
			  for(int j=0; j<TAM; j++) {
					System.out.print(a[i][j] + " ");
    
		  }
				System.out.println(" ]");

		}

		  ler.close();
}
}