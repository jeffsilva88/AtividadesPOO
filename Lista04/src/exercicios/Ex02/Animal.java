package exercicios.Ex02;

public abstract class Animal {
	private String nome;
	private int idade;

	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public abstract void exibirInformacoes();

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
