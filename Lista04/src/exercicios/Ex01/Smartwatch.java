package exercicios.Ex01;

public class Smartwatch extends ProdutoEletronico {
	private boolean medeBatimentosCardiacos;

	public Smartwatch(String nome, double preco, int quantidadeEmEstoque, boolean medeBatimentosCardiacos) {
		super(nome, preco, quantidadeEmEstoque);
		this.medeBatimentosCardiacos = medeBatimentosCardiacos;
	}

	public boolean isMedeBatimentosCardiacos() {
		return medeBatimentosCardiacos;
	}

	public void setMedeBatimentosCardiacos(boolean medeBatimentosCardiacos) {
		this.medeBatimentosCardiacos = medeBatimentosCardiacos;
	}

	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		if (medeBatimentosCardiacos) {
			System.out.println("Mede Batimentos Cardíacos: Sim");
		} else {
			System.out.println("Mede Batimentos Cardíacos: Não");
		}
	}
}
