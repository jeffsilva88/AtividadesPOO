package exercicios.Ex05;

public abstract class Veiculo {
	private String modelo;
	private String placa;
	private double precoDiaria;

	public Veiculo(String modelo, String placa, double precoDiaria) {
		this.modelo = modelo;
		this.placa = placa;
		this.precoDiaria = precoDiaria;
	}

	public abstract void exibirDetalhes();

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getPrecoDiaria() {
		return precoDiaria;
	}

	public void setPrecoDiaria(double precoDiaria) {
		this.precoDiaria = precoDiaria;
	}
}
