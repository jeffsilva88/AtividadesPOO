package exercicios.Ex05;

public class VeiculoPremium extends Veiculo {
	private String servicoLuxo;

	public VeiculoPremium(String modelo, String placa, double precoDiaria, String servicoLuxo) {
		super(modelo, placa, precoDiaria);
		this.servicoLuxo = servicoLuxo;
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("Veículo Premium: " + getModelo());
		System.out.println("Placa: " + getPlaca());
		System.out.println("Preço da diária: R$" + getPrecoDiaria());
		System.out.println("Serviço de luxo incluso: " + servicoLuxo);
	}
}
