package atividades;

public class Exercicio3 {
	public static void main(String[] args) {
		final int TAM = 4;
		int a[][], numero = 1;
		
		a = new int[TAM][TAM];
		
		// leitura dos valores da matriz
		for(int i=0; i<TAM; i++) {
			for(int j=0; j<TAM; j++) {
				a[i][j] = numero;
				numero++;
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
		  
			// apresentação da matriz somente com os valores na diagonal
		  System.out.println("\nNumeros da Diagonal: ");
		  for(int i=0; i<TAM; i++) {
			  System.out.print("[ ");
			  for(int j=0; j<TAM; j++) {
				  if (i == j) {
					  System.out.print(a[i][j] + " ");
				  }
		  }
				System.out.println(" ]");

		}
		  
	}
}
