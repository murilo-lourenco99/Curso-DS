package atividades;

public class Pessoa {
	// atributos da classe pessoa
	private String nome;
	private int idade;
	private String genero;
	private String estadoCivil;
	private String email;
	private String cpf;
	private double peso;

	// construtor padrão
	public Pessoa() {
		System.out.println("uwu" + "\n");
	}

	// construtor com OVERDRIVE
	public Pessoa(String nome, int idade, String genero, String estadoCivil, String email, String cpf, double peso) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.estadoCivil = estadoCivil;
		this.email = email;
		this.cpf = cpf;
		this.peso = peso;
	}

	// alt + shift + s -> getters&setters
	// getters, setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
