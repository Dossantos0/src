public class Categoria {
    private int id;
    private String tipo;
    private String nome;
    private String descricao;

    public Categoria(int id, String tipo, String nome, String descricao) {
        this.id = id;
        this.tipo = tipo;
        this.nome = nome;
        this.descricao = descricao;
    }

    // Métodos get privados
    private int getId() {
        return id;
    }

    private String getTipo() {
        return tipo;
    }

    private String getNome() {
        return nome;
    }

    private String getDescricao() {
        return descricao;
    }


    private void setId(int id) {
        this.id = id;
    }

    private void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
