package exercicios.Ex06;

public class Ebook extends Produto {
	private double tamanhoArquivoMB;
	private boolean recursosDigitaisExclusivos;

	public Ebook(String titulo, String autor, double preco, double tamanhoArquivoMB,
			boolean recursosDigitaisExclusivos) {
		super(titulo, autor, preco);
		this.tamanhoArquivoMB = tamanhoArquivoMB;
		this.recursosDigitaisExclusivos = recursosDigitaisExclusivos;
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("📱 E-book: " + getTitulo());
		System.out.println("Autor: " + getAutor());
		System.out.println("Preço: R$" + getPreco());
		System.out.println("Tamanho: " + tamanhoArquivoMB + " MB");
		System.out.println("Recursos Digitais Exclusivos: " + (recursosDigitaisExclusivos ? "Sim" : "Não") + "\n");
	}
}
