package exercicios.Ex05;

public class CarroEconomico extends Veiculo {
	private boolean possuiArCondicionado;

	public CarroEconomico(String modelo, String placa, double precoDiaria, boolean possuiArCondicionado) {
		super(modelo, placa, precoDiaria);
		this.possuiArCondicionado = possuiArCondicionado;
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("Carro Econômico: " + getModelo());
		System.out.println("Placa: " + getPlaca());
		System.out.println("Preço da diária: R$" + getPrecoDiaria());
		System.out.println("Ar-condicionado: " + (possuiArCondicionado ? "Sim" : "Não"));
	}
}
