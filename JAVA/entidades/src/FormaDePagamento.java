public class FormaDePagamento {
    private int id;
    private TipoPagamento tipoPagamento;

    public FormaDePagamento(int id, TipoPagamento tipoPagamento) {
        this.id = id;
        this.tipoPagamento = tipoPagamento;
    }

    private int getId() {
        return id;
    }

    private TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }


    private void modificarFormaDePagamento(int novoId, TipoPagamento novoTipoPagamento) {
        setId(novoId);
        setTipoPagamento(novoTipoPagamento);
    }

    private void mostrarDetalhes() {
        System.out.println("ID: " + getId());
        System.out.println("Tipo de Pagamento: " + getTipoPagamento());
    }

    public enum TipoPagamento {
        DINHEIRO,
        CARTAO_CREDITO,
        CARTAO_DEBITO,
        CARTAO_DE_CREDITO,
        PIX
    }
}
