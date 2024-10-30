import java.util.Date;

public class Promocao {
    private int id;
    private String nome;
    private int codigo;
    private String tipo;
    private double valor;
    private Date validade; // Se desejar, pode ser alterado para um tipo de data

    public Promocao(int id, String nome, int codigo, String tipo, double valor, Date validade) {
        this.id = id;
        this.nome = nome;
        this.codigo = codigo;
        this.tipo = tipo;
        this.valor = valor;
        this.validade = validade;
    }

    private int getId() {
        return id;
    }

    private String getNome() {
        return nome;
    }

    private int getCodigo() {
        return codigo;
    }

    private String getTipo() {
        return tipo;
    }

    private double getValor() {
        return valor;
    }

    private Date getValidade() {
        return validade;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    private void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private void setValor(double valor) {
        this.valor = valor;
    }

    private void setValidade(Date validade) {
        this.validade = validade;
    }
}
