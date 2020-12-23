package Pedidos;

public class Item {
    private int quantidade;
    private Produto produto;

    public double obterSubtotal() {
        return quantidade * produto.getPreco();
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
