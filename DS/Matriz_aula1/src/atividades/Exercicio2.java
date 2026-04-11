package atividades;

public class Exercicio2 {
	public static void main(String[] args) {
		final int TAM = 5;
		int a[][], b = 0, numero = 1;
		
		a = new int[TAM][TAM];
		
		// leitura dos valores da matriz
		for(int i=0; i<TAM; i++) {
			for(int j=0; j<TAM; j++) {
				a[i][j] = numero;
				numero++;
			}
		}
		
		// calculo da soma no B
		for(int i=0; i<TAM; i++) {
			for (int j=0; j<TAM; j++) {
				b += a[i][j];
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
		    System.out.println("\n A soma é = " +b);

		    
	}
	}

