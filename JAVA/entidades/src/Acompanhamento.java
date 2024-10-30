public class Acompanhamento {
    private int id;
    private String nome;
    private String descricao;
    private double valor;

    public Acompanhamento(int id, String nome, String descricao, double valor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    private int getId() {
        return id;
    }

    private String getNome() {
        return nome;
    }

    private String getDescricao() {
        return descricao;
    }

    private double getValor() {
        return valor;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    private void setValor(double valor) {
        this.valor = valor;
    }

    public void modificarAcompanhamento(int novoId, String novoNome, String novaDescricao, double novoValor) {
        setId(novoId);
        setNome(novoNome);
        setDescricao(novaDescricao);
        setValor(novoValor);
    }

    public void mostrarDetalhes() {
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Valor: " + getValor());
    }
}
