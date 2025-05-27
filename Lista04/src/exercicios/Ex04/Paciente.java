package exercicios.Ex04;

public abstract class Paciente {
	private String nome;
	private int idade;

	public Paciente(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public abstract void exibirDados();

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
