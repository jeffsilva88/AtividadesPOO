package exercicios.Ex02;

public class Cao extends Animal {
	private String raca;

	public Cao(String nome, int idade, String raca) {
		super(nome, idade);
		this.raca = raca;
	}

	public void tomarBanho() {
		System.out.println(getNome() + " está tomando banho (Cão).");
	}

	@Override
	public void exibirInformacoes() {
		System.out.println("Cão: " + getNome() + ", Idade: " + getIdade() + ", Raça: " + raca);
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
}
