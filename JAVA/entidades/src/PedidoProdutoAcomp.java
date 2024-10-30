public class PedidoProdutoAcomp {
    private int id;
    private PedidoProduto pedidoProduto;
    private Acompanhamento acompanhamento;

    public PedidoProdutoAcomp(int id, PedidoProduto pedidoProduto, Acompanhamento acompanhamento) {
        this.id = id;
        this.pedidoProduto = pedidoProduto;
        this.acompanhamento = acompanhamento;
    }

    public int getId() {
        return id;
    }

    public PedidoProduto getPedidoProduto() {
        return pedidoProduto;
    }

    public Acompanhamento getAcompanhamento() {
        return acompanhamento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPedidoProduto(PedidoProduto pedidoProduto) {
        this.pedidoProduto = pedidoProduto;
    }

    public void setAcompanhamento(Acompanhamento acompanhamento) {
        this.acompanhamento = acompanhamento;
    }
}
