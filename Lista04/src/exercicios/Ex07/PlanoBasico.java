package exercicios.Ex07;

public class PlanoBasico extends Plano {

	public PlanoBasico(String nomeCliente, double precoMensal) {
		super(nomeCliente, precoMensal);
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("🏋️ Plano Básico");
		System.out.println("Cliente: " + getNomeCliente());
		System.out.println("Preço: R$" + getPrecoMensal());
		System.out.println("Benefícios: Acesso à musculação\n");
	}
}
