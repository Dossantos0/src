import java.util.Date;

public class Pedido {
    private int id;
    private Date dataPedido; // Pode ser alterado para um tipo de data
    private Restaurante restaurante; // Assume que o restaurante é um objeto da classe Restaurante
    private double valor;
    private double taxaEntrega;
    private String obs;
    private double troco;
    private Promocao promocao;
    private Endereco endereco;
    private FormaDePagamento formaPagamento;
    private StatusEntrega statusEntrega;

    public Pedido(int id, Date dataPedido, Restaurante restaurante, double valor, double taxaEntrega, String obs, double troco, Promocao promocao, Endereco endereco, FormaDePagamento formaPagamento, StatusEntrega statusEntrega) {
        this.id = id;
        this.dataPedido = dataPedido;
        this.restaurante = restaurante;
        this.valor = valor;
        this.taxaEntrega = taxaEntrega;
        this.obs = obs;
        this.troco = troco;
        this.promocao = promocao;
        this.endereco = endereco;
        this.formaPagamento = formaPagamento;
        this.statusEntrega = statusEntrega;
    }

    private int getId() {
        return id;
    }

    private Date getDataPedido() {
        return dataPedido;
    }

    private Restaurante getRestaurante() {
        return restaurante;
    }

    public double getValor() {
        return valor;
    }

    private double getTaxaEntrega() {
        return taxaEntrega;
    }

    private String getObs() {
        return obs;
    }

    private double getTroco() {
        return troco;
    }

    private Promocao getPromocao() {
        return promocao;
    }

    private Endereco getEndereco() {
        return endereco;
    }

    private FormaDePagamento getFormaPagamento() {
        return formaPagamento;
    }

    public StatusEntrega getStatusEntrega() {
        return statusEntrega;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    private void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    private void setValor(double valor) {
        this.valor = valor;
    }

    private void setTaxaEntrega(double taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }

    private void setObs(String obs) {
        this.obs = obs;
    }

    private void setTroco(double troco) {
        this.troco = troco;
    }

    private void setPromocao(Promocao promocao) {
        this.promocao = promocao;
    }

    private void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    private void setFormaPagamento(FormaDePagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    private void setStatusEntrega(StatusEntrega statusEntrega) {
        this.statusEntrega = statusEntrega;
    }

    public enum StatusEntrega {
        ATIVO,
        INATIVO,
        ENTREGUE,
        PENDENTE,
        EM_ANDAMENTO
    }
}
