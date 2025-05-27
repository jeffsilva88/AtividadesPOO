package exercicios.Ex03;

public class CursoProfissionalizante extends Curso {
	private boolean acessoPlataformaOnline;

	public CursoProfissionalizante(String nome, int cargaHoraria, double valorMensal, boolean acessoPlataformaOnline) {
		super(nome, cargaHoraria, valorMensal);
		this.acessoPlataformaOnline = acessoPlataformaOnline;
	}

	@Override
	public void exibirInformacoes() {
		System.out.println("Curso Profissionalizante: " + getNome());
		System.out.println("Carga Horária: " + getCargaHoraria() + "h");
		System.out.println("Mensalidade: R$" + getValorMensal());
		if (acessoPlataformaOnline) {
			System.out.println("Com acesso à plataforma online de apoio.");
		} else {
			System.out.println("Sem acesso à plataforma online.");
		}
	}

	public boolean isAcessoPlataformaOnline() {
		return acessoPlataformaOnline;
	}

	public void setAcessoPlataformaOnline(boolean acessoPlataformaOnline) {
		this.acessoPlataformaOnline = acessoPlataformaOnline;
	}
}
