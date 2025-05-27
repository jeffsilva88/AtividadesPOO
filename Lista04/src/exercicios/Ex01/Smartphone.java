package exercicios.Ex01;

public class Smartphone extends ProdutoEletronico {
	private int cameraMegapixels;

	public Smartphone(String nome, double preco, int quantidadeEmEstoque, int cameraMegapixels) {
		super(nome, preco, quantidadeEmEstoque);
		this.cameraMegapixels = cameraMegapixels;
	}

	public int getCameraMegapixels() {
		return cameraMegapixels;
	}

	public void setCameraMegapixels(int cameraMegapixels) {
		this.cameraMegapixels = cameraMegapixels;
	}

	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Câmera: " + cameraMegapixels + " MP");
	}
}
