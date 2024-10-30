public class PedidoProduto {
    private int id;
    private Pedido pedido;
    private Produto produto;
    private int quantidade;

    public PedidoProduto(int id, Pedido pedido, Produto produto, int quantidade) {
        this.id = id;
        this.pedido = pedido;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    private int getId() {
        return id;
    }

    private Pedido getPedido() {
        return pedido;
    }

    private Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    private void setProduto(Produto produto) {
        this.produto = produto;
    }

    private void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
