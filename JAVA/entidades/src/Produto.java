public class Produto {
    private int id;
    private String nome;
    private double preco;
    private String descricao;
    private Categoria categoria;
    private Restaurante restaurante;

    public Produto(int id, String nome, double preco, String descricao, Categoria categoria, Restaurante restaurante) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.categoria = categoria;
        this.restaurante = restaurante;
    }

    private int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    private double getPreco() {
        return preco;
    }

    private String getDescricao() {
        return descricao;
    }

    private Categoria getCategoria() {
        return categoria;
    }

    private Restaurante getRestaurante() {
        return restaurante;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setPreco(double preco) {
        this.preco = preco;
    }

    private void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    private void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    private void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }
}
