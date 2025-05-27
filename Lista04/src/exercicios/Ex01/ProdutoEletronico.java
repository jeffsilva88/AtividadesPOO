package exercicios.Ex01;

public abstract class ProdutoEletronico {
	private String nome;
	private double preco;
	private int quantidadeEmEstoque;

	public ProdutoEletronico(String nome, double preco, int quantidadeEmEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}

	public boolean comprar(int quantidade) {
		if (quantidade <= quantidadeEmEstoque) {
			quantidadeEmEstoque -= quantidade;
			return true;
		}
		return false;
	}

	public void exibirDetalhes() {
		System.out.println("Nome: " + nome);
		System.out.println("Preço: R$" + preco);
		System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
}
