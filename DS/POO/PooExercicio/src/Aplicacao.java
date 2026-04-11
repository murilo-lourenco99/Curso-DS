import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		Scanner ler =new Scanner(System.in);
		
		Aluno a1 = new Aluno();
		System.out.println("Digite o nome do aluno: ");
		a1.nome = ler.next();
		
		System.out.println("Digite a idade do aluno: ");
		a1.idade = ler.nextInt();
		
		System.out.println("Digite o cpf do aluno: ");
		a1.cpf = ler.next();
		
		System.out.println("Digite a data do nascimento do aluno: ");
		a1.dataNasc = ler.next();
		
		System.out.println("o nome do aluno é: "  + a1.nome);
		System.out.println("A idade do aluno é: " + a1.idade);
		System.out.println("O cpf do aluno é: " + a1.cpf);
		System.out.println("A data de nascimento do aluno: " + a1.dataNasc);
		
		Professor prof1 = new Professor();
		System.out.println("Digite o nome do Professor: ");
		prof1.nome = ler.next();
				
		System.out.println("Digite o cpf do aluno: ");
		prof1.cpf = ler.next();
		
		
		System.out.println("o nome do Professor é: "  + prof1.nome);
		System.out.println("O cpf do Professor é: " + prof1.cpf);
		
		ler.close();
	}
}
