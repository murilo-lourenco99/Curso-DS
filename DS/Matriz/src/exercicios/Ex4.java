package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Ex4 {
public static void main(String[] args) {
	int i, j, TAM = 3, numeroGerado;	
	int num, win = TAM*TAM, pontos = 0, round = 1;
	int matriz [][] = new int [TAM] [TAM];
	boolean achou;
	boolean[] sorteados = new boolean[76];
	
	Random ran = new Random();
	Scanner ler = new Scanner(System.in);
	
	// criação do bingo
	for (i = 0; i < TAM; i++) {
	    for (j = 0; j < TAM; j++) {
	        do {
	            numeroGerado = ran.nextInt(75) + 1;
	        } while (sorteados[numeroGerado] == true); // esse laço garante que nenhum numero se repita

	        matriz[i][j] = numeroGerado;
	        sorteados[numeroGerado] = true; // marca como "já foi"
	    }
	}
	
	// escolha de numero pelo jogador
    while (pontos < win) {
    	System.out.println("\nDigite um numero pra jogar no BINGO!! " +round+ "° Rodada: ");
		num = ler.nextInt();
		achou = false;
		
		// comparando os numeros
		for(i=0; i<TAM; i++) {
			for(j=0; j<TAM; j++) {
				if (matriz[i][j] == num) {
	                pontos++;
	                achou = true;
	                matriz[i][j] = -1; // "Marca" o numero
	                System.out.println("ACERTOU UM NÚMERO!");
	            }
			}
		}
		if(!achou) {
			System.out.println("Essse numero não esta na cartela :( tente novamente");
		}
		
		round++;
    }
    
	// apresentação de vitoria
	if(pontos == win) {
		System.out.println("GANHOU O BINGO!!!!");
		System.out.println("E levou " +round+ " Rodadas!!");
	}
	
	System.out.println("========= SUA CARTELA =========");
  for(i = 0; i<TAM; i++) {
      for(j = 0;j< TAM; j++) {
          System.out.printf("| %2d ", matriz[i][j]); // o %2d junto do printf deixa todas as "celulas" do mesmo tamanho
      }
       System.out.println(" |");
   } 
	
	ler.close();	
}
}
