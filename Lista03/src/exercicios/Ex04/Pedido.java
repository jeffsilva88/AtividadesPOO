package exercicios.Ex04;

public class Pedido {
    private Cliente cliente;
    private Produto produto;  // só 1 produto
    private double valorTotal;

    // Construtor
    public Pedido(Cliente cliente, Produto produto) {
        this.cliente = cliente;
        this.produto = produto;
        this.valorTotal = 0;
    }

    // Calcula o total com base no preço do único produto
    public void calcularTotal() {
        valorTotal = produto.getPreco();
    }

    // Exibe os detalhes do pedido
    public void exibirPedido() {
        System.out.println("Pedido do cliente: " + cliente.getNome());
        System.out.println("Produto:");
        System.out.println("- " + produto.getNome() + " - R$" + produto.getPreco());
        System.out.println("Valor Total: R$" + valorTotal);
    }
}
