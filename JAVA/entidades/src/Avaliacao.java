public class Avaliacao {
    private int id;
    private int nota;
    private Pedido pedido;
    private Restaurante restaurante;

    public Avaliacao(int id, int nota, Pedido pedido, Restaurante restaurante) {
        this.id = id;
        this.nota = nota;
        this.pedido = pedido;
        this.restaurante = restaurante;
    }


    private int getId() {
        return id;
    }

    private int getNota() {
        return nota;
    }

    private Pedido getPedido() {
        return pedido;
    }

    private Restaurante getRestaurante() {
        return restaurante;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setNota(int nota) {
        this.nota = nota;
    }

    private void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    private void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

}