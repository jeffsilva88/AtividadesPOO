package exercicios.Ex06;

public class ContaPoupanca extends ContaBancaria {
	private double taxaJuros;

	public ContaPoupanca(String numero, String titular, double saldoInicial, double taxaJuros) {
		super(numero, titular, saldoInicial);
		this.taxaJuros = taxaJuros;
	}

	public void aplicarJuros() {
		saldo += saldo * (taxaJuros / 100);
	}

	@Override
	public boolean sacar(double valor) {
		if (valor > 0 && saldo >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}
}
