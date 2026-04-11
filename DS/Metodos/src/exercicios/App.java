package exercicios;

import java.util.Scanner;

public class App {

	// metodo main
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Validacao app = new Validacao();

		// exercicio 1
		System.out.println("Exercicio 1");
		System.out.println("Digite seu nome: ");
		String nome = ler.next();
		app.contarNome(nome);

		// exercicio 2
		System.out.println("\nExercicio 2");
		System.out.println("Digite sua idade:");
		int idade = ler.nextInt();

		String analisa = app.checarIdade(idade);
		System.out.println(analisa);

		// exrecicio 3
		System.out.println("\nExercicio 3");
		app.cepCorrecao();

		// exrecicio 4
		System.out.println("\nExercicio 4");
		System.out.println("Digite seu nome: ");
		nome = ler.next();

		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();

		System.out.println("Digite seu e-mail: ");
		String email = ler.next();

		System.out.println("Digite seu peso: ");
		double peso = ler.nextDouble();

		app.cadastro(nome, idade, email, peso);

		// exercicio 5
		app.zeroCem();

		ler.close();
	}

}
