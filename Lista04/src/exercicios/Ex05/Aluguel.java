package exercicios.Ex05;

public class Aluguel {
	private Veiculo veiculo;
	private String cliente;
	private int dias;

	public Aluguel(Veiculo veiculo, String cliente, int dias) {
		this.veiculo = veiculo;
		this.cliente = cliente;
		this.dias = dias;
	}

	public void exibirResumoAluguel() {
		System.out.println("=== Resumo do Aluguel ===");
		System.out.println("Cliente: " + cliente);
		veiculo.exibirDetalhes();
		System.out.println("Dias: " + dias);
		System.out.println("Total: R$" + (veiculo.getPrecoDiaria() * dias));
		System.out.println("=========================\n");
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}
}
