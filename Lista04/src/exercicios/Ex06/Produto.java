package exercicios.Ex06;

public abstract class Produto {
	private String titulo;
	private String autor;
	private double preco;

	public Produto(String titulo, String autor, double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public abstract void exibirDetalhes();
}
