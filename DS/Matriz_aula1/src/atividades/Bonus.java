package atividades;

public class Bonus {
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
		 
			// apresentação da matriz somente com os valores na diagonal invertida
		  		// tam -1 = 2 , se o contador i + j = 2 (tam-1) = print
		  System.out.println("\nNumeros da Diagonal: ");
		  for(int i=0; i<TAM; i++) {
			  System.out.print("[ ");
			  for(int j=0; j<TAM; j++) {
				  if (i + j == TAM - 1) {
					  System.out.print(a[i][j] + " ");
				  }
		  }
				System.out.println(" ]");

		}		  
		
		
	}
}
