package exercicios.Ex03;

public class CursoRegular extends Curso {
	private boolean possuiMaterialDidatico;

	public CursoRegular(String nome, int cargaHoraria, double valorMensal, boolean possuiMaterialDidatico) {
		super(nome, cargaHoraria, valorMensal);
		this.possuiMaterialDidatico = possuiMaterialDidatico;
	}

	@Override
	public void exibirInformacoes() {
		System.out.println("Curso Regular: " + getNome());
		System.out.println("Carga Horária: " + getCargaHoraria() + "h");
		System.out.println("Mensalidade: R$" + getValorMensal());
		if (possuiMaterialDidatico) {
			System.out.println("Inclui material didático.");
		} else {
			System.out.println("Não inclui material didático.");
		}
	}

	public boolean isPossuiMaterialDidatico() {
		return possuiMaterialDidatico;
	}

	public void setPossuiMaterialDidatico(boolean possuiMaterialDidatico) {
		this.possuiMaterialDidatico = possuiMaterialDidatico;
	}
}
