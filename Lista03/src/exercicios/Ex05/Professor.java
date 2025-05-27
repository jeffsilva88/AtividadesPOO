package exercicios.Ex05;

public class Professor extends Pessoa {
    private double salario;
    private String disciplina;
    private String areaAtuacao;

    public Professor(String nome, int idade, String cpf, String endereco, double salario, String disciplina, String areaAtuacao) {
        super(nome, idade, cpf, endereco);
        this.salario = salario;
        this.disciplina = disciplina;
        this.areaAtuacao = areaAtuacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Professor:");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + getCpf());
        System.out.println("Endereco: " + getEndereco());
        System.out.println("Salario: R$ " + salario);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Area de atuação: " + areaAtuacao);
    }
}
