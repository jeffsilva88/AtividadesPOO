package exercicios.Ex06;

public class LivroFisico extends Produto {
	private int numeroPaginas;
	private double peso;

	public LivroFisico(String titulo, String autor, double preco, int numeroPaginas, double peso) {
		super(titulo, autor, preco);
		this.numeroPaginas = numeroPaginas;
		this.peso = peso;
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("📘 Livro Físico: " + getTitulo());
		System.out.println("Autor: " + getAutor());
		System.out.println("Preço: R$" + getPreco());
		System.out.println("Páginas: " + numeroPaginas);
		System.out.println("Peso: " + peso + " kg\n");
	}
}
