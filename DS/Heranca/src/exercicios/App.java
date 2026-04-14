package exercicios;

public class App {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();

		aluno.setNome("Jimmy Page");
		aluno.setIdade(40);
		aluno.setCpf("12346789");
		aluno.setRm(58);
		aluno.setCurso("DS");

		System.out.println(aluno.getNome() + "\n" + aluno.getIdade() + "\n" + aluno.getCpf() + "\n" + aluno.getRm()
				+ "\n" + aluno.getCurso());
	}

}
