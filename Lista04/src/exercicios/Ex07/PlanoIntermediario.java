package exercicios.Ex07;

public class PlanoIntermediario extends Plano {
	private boolean aulasEmGrupo;

	public PlanoIntermediario(String nomeCliente, double precoMensal, boolean aulasEmGrupo) {
		super(nomeCliente, precoMensal);
		this.aulasEmGrupo = aulasEmGrupo;
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("🤸 Plano Intermediário");
		System.out.println("Cliente: " + getNomeCliente());
		System.out.println("Preço: R$" + getPrecoMensal());
		System.out.println("Benefícios: Musculação + Aulas em Grupo: " + (aulasEmGrupo ? "Sim" : "Não") + "\n");
	}
}
