package exercicios.Ex04;

public class PacienteVip extends Paciente {
    private String beneficioExclusivo;

    public PacienteVip(String nome, int idade, String beneficioExclusivo) {
        super(nome, idade);
        this.beneficioExclusivo = beneficioExclusivo;
    }

    @Override
    public void exibirDados() {
        System.out.println("Paciente VIP: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Benefício: " + beneficioExclusivo);
    }

    public String getBeneficioExclusivo() {
        return beneficioExclusivo;
    }

    public void setBeneficioExclusivo(String beneficioExclusivo) {
        this.beneficioExclusivo = beneficioExclusivo;
    }
}
