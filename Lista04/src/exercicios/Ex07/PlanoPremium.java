package exercicios.Ex07;

public class PlanoPremium extends Plano {
	private boolean personalTrainer;
	private boolean nutricionista;

	public PlanoPremium(String nomeCliente, double precoMensal, boolean personalTrainer, boolean nutricionista) {
		super(nomeCliente, precoMensal);
		this.personalTrainer = personalTrainer;
		this.nutricionista = nutricionista;
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("💎 Plano Premium");
		System.out.println("Cliente: " + getNomeCliente());
		System.out.println("Preço: R$" + getPrecoMensal());
		System.out.println("Benefícios: Musculação + Aulas em Grupo +");
		System.out.println("  → Personal Trainer: " + (personalTrainer ? "Sim" : "Não"));
		System.out.println("  → Nutrição Exclusiva: " + (nutricionista ? "Sim" : "Não") + "\n");
	}
}
