package exercicios.Ex07;

public abstract class Plano {
	private String nomeCliente;
	private double precoMensal;

	public Plano(String nomeCliente, double precoMensal) {
		this.nomeCliente = nomeCliente;
		this.precoMensal = precoMensal;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public double getPrecoMensal() {
		return precoMensal;
	}

	public void setPrecoMensal(double precoMensal) {
		this.precoMensal = precoMensal;
	}

	public abstract void exibirDetalhes();
}
