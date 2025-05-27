package exercicios.Ex04;

public class PacienteComum extends Paciente {

    public PacienteComum(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void exibirDados() {
        System.out.println("Paciente Comum: " + getNome());
        System.out.println("Idade: " + getIdade());
    }
}
