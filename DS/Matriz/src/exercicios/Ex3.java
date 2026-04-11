package exercicios;

import java.util.Random;

public class Ex3 {
public static void main(String[] args) {
	int i, j, soma,
		matriz [][] = new int [3] [4];
	// matriz 3x4
	
	Random ran = new Random();
	
	for(i=0; i<3; i++) {
		soma = 0;
		
		for(j=0; j<4; j++) {
			if(j < 3) {
				matriz [i] [j] = ran.nextInt(10);
				
				soma += matriz [i] [j];	
			} 
			else {
				matriz [i] [j] = soma;
			}
		}
	}
	 // apresentção do resultado
	for(i=0; i<3; i++) {
		System.out.println();
		for(j=0; j<4; j++) {
			System.out.print("| " +matriz [i][j]+ " |");
		}
	}
	
}
}
