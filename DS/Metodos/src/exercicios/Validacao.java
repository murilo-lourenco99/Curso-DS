package exercicios;

import java.util.Scanner;

public class Validacao {
	Scanner ler = new Scanner(System.in);

	// Exercicio 1
	public void contarNome(String nome) {
		int contador = nome.length();

		if (contador <= 3) {
			System.out.println("Nome invalido, no minimo 4 letras");
		} else {
			System.out.println("Belo nome");
		}
	}

	// Exercicio 2
	public String checarIdade(int idade) {
		if (idade <= 17) {
			String check = "Menor de idade";
			return check;
		} else {
			String check = "Maior de idade";
			return check;
		}
	}

	// ex 3
	public void cepCorrecao() {
		System.out.println("Digite seu CEP: (8 digitos)");
		String cep = ler.next();

		if (cep.length() == 8) {
			String cepCerto = cep.substring(0, 5) + "-" + cep.substring(5);
			System.out.println("CEP corrigido: " + cepCerto);
		} else {
			System.out.println("Tem que ter 8 numeros só");
		}
	}

	// ex4
	public void cadastro(String nome, int idade, String email, double peso) {
		String nomeMaior = nome.toUpperCase();
		String emailMenor = email.toLowerCase();
		String pesoCasa = String.format("%.2f", peso);

		System.out.println("Nome: " + nomeMaior);
		System.out.println("Idade: " + idade);
		System.out.println("E-mail: " + emailMenor);
		System.out.println("Peso: " + pesoCasa);
	}

	// ex5
	void zeroCem() {
		int[] vetor = new int[101];

		System.out.println("\nZero a cem: ");
		for (int i = 100; i >= 0; i--) {
			if (i% 2 == 0) {
				if (i % 10 == 0) {
					System.out.print("\n" + i + " ");
				} else {
					System.out.print(i + " ");

				}
			} else {
				
			}
			
		}
	}

	
}
