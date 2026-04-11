package exercicios;

import java.util.Random;

public class Ex2 {
public static void main(String[] args) {
	int i, j, TAM = 3,
		maior = -11, menor = 11, linha1 = 0, coluna1 = 0, linha2 = 0, coluna2 = 0,
			matriz [] [] = new int [TAM] [TAM];
	
	Random ran = new Random();
	
	for(i=0; i<TAM; i++) {
		for(j=0; j<TAM; j++) {
			matriz [i] [j] = ran.nextInt()%10;
		}
	}
	
	for(i=0; i<TAM; i++) {
		for(j=0; j<TAM; j++) {
			if(matriz [i] [j] > maior) {
				maior = matriz [i] [j];
				linha1 = i;
				coluna1 = j;
			}
			else if (matriz [i] [j] < menor) {
				menor = matriz [i] [j];
				linha2 = i;
				coluna2 = j;
			}
		}
	}
	
	// apresentação da matriz
			for(i=0; i<3; i++) {
				System.out.println();
				for(j=0; j<3; j++) {
					System.out.print("| " +matriz [i] [j] + " |");
				}
			}
			
			System.out.println("\nO menor valor: " +menor);
			System.out.println("O maior valor: " +maior);
			System.out.println("Posição do maior: " +linha1+ " , " +coluna1);
			System.out.println("Posição do menor: " +linha2+ " , " +coluna2);
			
}
}
