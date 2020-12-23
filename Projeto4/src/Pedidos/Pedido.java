package Pedidos;

public class Pedido {
    private int codigo;
    private String data;

    public double obterTotal() {
        return 2;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
