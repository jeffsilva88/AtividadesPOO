package exercicios.Ex04;

public class Cliente {
    private String nome;
    private String email;
    private String endereco;


    public Cliente(String nome, String email, String endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    
    public void fazerPedido(Pedido pedido) {
        pedido.calcularTotal();
        System.out.println("Pedido realizado por: " + nome);
    }

    public void exibirDados() {
        System.out.println("Cliente: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Endereço: " + endereco);
    }

    public String getNome() {
        return nome;
    }
}
