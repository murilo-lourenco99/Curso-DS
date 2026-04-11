package atividades;

public class Exercicio4 {
	public static void main(String[] args) {
		final int TAM = 3;
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
		  
			// apresentação da matriz somente com os valores na primeira coluna
		  System.out.println("\nNumeros da primeira coluna: ");
		  for(int i=TAM; i>-1; i--) {
			  System.out.print("[ ");
			  for(int j=TAM; j>-1; j--) {
				  if (i == j) {
					  System.out.print(a[i][j] + " ");
				  }
		  }
				System.out.println(" ]");

		}
		  
}
}