import java.util.Date;

public class HistoricoDePagamento {
    private int id;
    private Date dataPagamento;
    private double valor;
    private FormaDePagamento formaDePagamento;

    public HistoricoDePagamento(int id, Date dataPagamento, double valor, FormaDePagamento formaDePagamento) {
        this.id = id;
        this.dataPagamento = dataPagamento;
        this.valor = valor;
        this.formaDePagamento = formaDePagamento;
    }

    private int getId() {
        return id;
    }

    private Date getDataPagamento() {
        return dataPagamento;
    }

    private double getValor() {
        return valor;
    }

    private FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    private void setValor(double valor) {
        this.valor = valor;
    }

    private void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

}
