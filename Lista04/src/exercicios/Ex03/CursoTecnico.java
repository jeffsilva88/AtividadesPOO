package exercicios.Ex03;

public class CursoTecnico extends Curso {
	private int duracaoEstagio;

	public CursoTecnico(String nome, int cargaHoraria, double valorMensal, int duracaoEstagio) {
		super(nome, cargaHoraria, valorMensal);
		this.duracaoEstagio = duracaoEstagio;
	}

	@Override
	public void exibirInformacoes() {
		System.out.println("Curso Técnico: " + getNome());
		System.out.println("Carga Horária: " + getCargaHoraria() + "h");
		System.out.println("Mensalidade: R$" + getValorMensal());
		System.out.println("Estágio obrigatório de " + duracaoEstagio + " meses.");
	}

	public int getDuracaoEstagio() {
		return duracaoEstagio;
	}

	public void setDuracaoEstagio(int duracaoEstagio) {
		this.duracaoEstagio = duracaoEstagio;
	}
}
