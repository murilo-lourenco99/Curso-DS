package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Ex4_teste {
    public static void main(String[] args) {
        // 1. CONFIGURAÇÕES INICIAIS
        int TAM = 3; // Tamanho da matriz (3x3)
        int[][] matriz = new int[TAM][TAM];
        boolean[] sorteados = new boolean[76]; // Para garantir números de 1 a 75 sem repetir
        int pontos = 0, round = 1, num;
        int win = TAM * TAM; // Total de pontos para ganhar
        boolean achou;

        Random ran = new Random();
        Scanner ler = new Scanner(System.in);

        // 2. CRIAÇÃO DA CARTELA (Sem números repetidos)
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                int numeroGerado;
                do {
                    numeroGerado = ran.nextInt(75) + 1;
                } while (sorteados[numeroGerado]); // Se já saiu, gera outro

                matriz[i][j] = numeroGerado;
                sorteados[numeroGerado] = true;
            }
        }

        // 3. LOOP PRINCIPAL DO JOGO
        while (pontos < win) {
            // Exibição visual da cartela
            System.out.println("\n========= SUA CARTELA =========");
            for (int i = 0; i < TAM; i++) {
                for (int j = 0; j < TAM; j++) {
                    if (matriz[i][j] == -1) {
                        System.out.print("| XX "); // Mostra XX se o número foi marcado
                    } else {
                        System.out.printf("| %2d ", matriz[i][j]); // Mostra o número formatado
                    }
                }
                System.out.println(" |");
            }

            System.out.println("\n" + round + "ª Rodada - Digite um número (1-75): ");
            num = ler.nextInt();
            achou = false;

            // Comparando o número digitado com a matriz toda
            for (int i = 0; i < TAM; i++) {
                for (int j = 0; j < TAM; j++) {
                    if (matriz[i][j] == num) {
                        pontos++;
                        achou = true;
                        matriz[i][j] = -1; // Marca o número na matriz
                        System.out.println(">>> ACERTOU UM NÚMERO! <<<");
                    }
                }
            }

            if (!achou) {
                System.out.println("--- Esse número não está na cartela :( ---");
            }

            round++;
        }

        // 4. APRESENTAÇÃO DE VITÓRIA
        System.out.println("\n===============================");
        System.out.println("      BINGO! VOCÊ VENCEU!      ");
        System.out.println("   Finalizado em " + (round - 1) + " rodadas.   ");
        System.out.println("===============================");

        ler.close();
    }
}