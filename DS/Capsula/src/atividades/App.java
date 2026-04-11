package atividades;
		//pacote + classe
// import model.Pessoa
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
						// Construtor, cria o objeto na memoria
		Pessoa p = new Pessoa();
		// construtor com overdrive
		Pessoa p2 = new Pessoa(
				"Joseph",
				21,
				"Homi",
				"Casado",
				"bruh@gmail.com",
				"1234567890",
				80
				);

		// atribuição
		System.out.println("Digite seu nome: ");
		String nome = ler.nextLine();
		p.setNome(nome);

		System.out.println("Digite sua idade: ");
		int idade = ler.nextInt();
		p.setIdade(idade);

		System.out.println("Digite seu genero: ");
		String genero = ler.next();
		p.setGenero(genero);

		System.out.println("Digite seu estado civil: ");
		String estadoCivil = ler.next();
		p.setEstadoCivil(estadoCivil);

		System.out.println("Digite seu e-mail:");
		String email = ler.next();
		p.setEmail(email);

		System.out.println("Digite seu cpf (11 digitos):");
		String cpf = ler.next();
		p.setCpf(cpf);

		System.out.println("Digite seu peso:");
		double peso = ler.nextDouble();
		p.setPeso(peso);

		// exibição
		System.out.println("\nSeja bem vindo " + p.getNome());
		System.out.println("Voce tem " + p.getIdade() + " anos");
		System.out.println("Seu genero é: " + p.getGenero());
		System.out.println("Seu estado civil é: " + p.getEstadoCivil());
		System.out.println("Seu e-mail: " + p.getEmail());
		System.out.println("Seu cpf: " + p.getCpf());
		System.out.println("Voce pesa: " + p.getPeso() + " quilos");


		ler.close();
	}
}
