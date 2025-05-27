package exercicios.Ex05;

public class Suv extends Veiculo {
	private boolean tracao4x4;

	public Suv(String modelo, String placa, double precoDiaria, boolean tracao4x4) {
		super(modelo, placa, precoDiaria);
		this.tracao4x4 = tracao4x4;
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("SUV: " + getModelo());
		System.out.println("Placa: " + getPlaca());
		System.out.println("Preço da diária: R$" + getPrecoDiaria());
		System.out.println("Tração 4x4: " + (tracao4x4 ? "Sim" : "Não"));
	}
}
