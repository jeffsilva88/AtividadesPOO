package exercicios.Ex02;

public class Gato extends Animal {
	private boolean gostaDeBrincar;

	public Gato(String nome, int idade, boolean gostaDeBrincar) {
		super(nome, idade);
		this.gostaDeBrincar = gostaDeBrincar;
	}

	public void tosar() {
		System.out.println(getNome() + " está sendo tosado (Gato).");
	}

	@Override
	public void exibirInformacoes() {
		System.out.println("Gato: " + getNome() + ", Idade: " + getIdade());
		if (gostaDeBrincar) {
			System.out.println("Gosta de brincar: Sim");
		} else {
			System.out.println("Gosta de brincar: Não");
		}
	}

	public boolean isGostaDeBrincar() {
		return gostaDeBrincar;
	}

	public void setGostaDeBrincar(boolean gostaDeBrincar) {
		this.gostaDeBrincar = gostaDeBrincar;
	}
}
