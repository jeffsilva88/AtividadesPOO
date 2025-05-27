package exercicios.Ex04;

public class PacienteConvenio extends Paciente {
    private String nomeConvenio;
    private int numeroCarteira;

    public PacienteConvenio(String nome, int idade, String nomeConvenio, int numeroCarteira) {
        super(nome, idade);
        this.nomeConvenio = nomeConvenio;
        this.numeroCarteira = numeroCarteira;
    }

    @Override
    public void exibirDados() {
        System.out.println("Paciente Convênio: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Convênio: " + nomeConvenio);
        System.out.println("Nº da Carteira: " + numeroCarteira);
    }

    public String getNomeConvenio() {
        return nomeConvenio;
    }

    public void setNomeConvenio(String nomeConvenio) {
        this.nomeConvenio = nomeConvenio;
    }

    public int getNumeroCarteira() {
        return numeroCarteira;
    }

    public void setNumeroCarteira(int numeroCarteira) {
        this.numeroCarteira = numeroCarteira;
    }
}
