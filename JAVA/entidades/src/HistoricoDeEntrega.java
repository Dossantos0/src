import java.util.Date;

public class HistoricoDeEntrega {
    private int id;
    private Pedido pedido;
    private String statusEntrega;
    private Date dataEntrega;

    public HistoricoDeEntrega(int id, Pedido pedido, String statusEntrega, Date dataEntrega) {
        this.id = id;
        this.pedido = pedido;
        this.statusEntrega = statusEntrega;
        this.dataEntrega = dataEntrega;
    }

    private int getId() {
        return id;
    }

    private Pedido getPedido() {
        return pedido;
    }

    private String getStatusEntrega() {
        return statusEntrega;
    }

    private Date getDataEntrega() {
        return dataEntrega;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    private void setStatusEntrega(String statusEntrega) {
        this.statusEntrega = statusEntrega;
    }

    private void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

}
