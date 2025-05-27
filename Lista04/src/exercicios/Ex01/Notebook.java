
package exercicios.Ex01;

public class Notebook extends ProdutoEletronico {
	private double tamanhoTela;

	public Notebook(String nome, double preco, int quantidadeEmEstoque, double tamanhoTela) {
		super(nome, preco, quantidadeEmEstoque);
		this.tamanhoTela = tamanhoTela;
	}

	public double getTamanhoTela() {
		return tamanhoTela;
	}

	public void setTamanhoTela(double tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}

	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Tamanho da Tela: " + tamanhoTela + " polegadas");
	}
}
