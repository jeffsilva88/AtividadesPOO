package exercicios.Ex06;

public class AudioBook extends Produto {
	private double duracaoHoras;
	private boolean controleDeVelocidade;

	public AudioBook(String titulo, String autor, double preco, double duracaoHoras, boolean controleDeVelocidade) {
		super(titulo, autor, preco);
		this.duracaoHoras = duracaoHoras;
		this.controleDeVelocidade = controleDeVelocidade;
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("🎧 Audiobook: " + getTitulo());
		System.out.println("Autor: " + getAutor());
		System.out.println("Preço: R$" + getPreco());
		System.out.println("Duração: " + duracaoHoras + " horas");
		System.out.println("Controle de Velocidade: " + (controleDeVelocidade ? "Sim" : "Não") + "\n");
	}
}
