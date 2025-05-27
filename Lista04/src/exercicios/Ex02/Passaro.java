package exercicios.Ex02;

public class Passaro extends Animal {
	private String tipoCanto;

	public Passaro(String nome, int idade, String tipoCanto) {
		super(nome, idade);
		this.tipoCanto = tipoCanto;
	}

	public void limparGaiola() {
		System.out.println("Limpando gaiola de " + getNome() + " (Pássaro).");
	}

	@Override
	public void exibirInformacoes() {
		System.out.println("Pássaro: " + getNome() + ", Idade: " + getIdade() + ", Tipo de canto: " + tipoCanto);
	}

	public String getTipoCanto() {
		return tipoCanto;
	}

	public void setTipoCanto(String tipoCanto) {
		this.tipoCanto = tipoCanto;
	}
}
