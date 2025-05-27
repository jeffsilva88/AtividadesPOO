package exercicios.Ex03;

public abstract class Curso {
	private String nome;
	private int cargaHoraria;
	private double valorMensal;

	public Curso(String nome, int cargaHoraria, double valorMensal) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.valorMensal = valorMensal;
	}

	public abstract void exibirInformacoes();

	public String getNome() {
		return nome;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public double getValorMensal() {
		return valorMensal;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public void setValorMensal(double valorMensal) {
		this.valorMensal = valorMensal;
	}
}
