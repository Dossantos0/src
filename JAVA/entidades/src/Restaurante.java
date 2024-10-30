public class Restaurante {
    private int id;
    private String nome;
    private String telefone;
    private Endereco endereco;
    private Categoria categoria;
    private String horaFuncionamento;
    private boolean isRetirada;
    private double valorMinEntrega;

    public Restaurante(int id, String nome, String telefone, Endereco endereco, Categoria categoria, String horaFuncionamento, boolean isRetirada, double valorMinEntrega) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.categoria = categoria;
        this.horaFuncionamento = horaFuncionamento;
        this.isRetirada = isRetirada;
        this.valorMinEntrega = valorMinEntrega;
    }

    private int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    private String getTelefone() {
        return telefone;
    }

    private Endereco getEndereco() {
        return endereco;
    }

    private Categoria getCategoria() {
        return categoria;
    }

    private String getHoraFuncionamento() {
        return horaFuncionamento;
    }

    private boolean isRetirada() {
        return isRetirada;
    }

    private double getValorMinEntrega() {
        return valorMinEntrega;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    private void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    private void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    private void setHoraFuncionamento(String horaFuncionamento) {
        this.horaFuncionamento = horaFuncionamento;
    }

    private void setRetirada(boolean isRetirada) {
        this.isRetirada = isRetirada;
    }

    private void setValorMinEntrega(double valorMinEntrega) {
        this.valorMinEntrega = valorMinEntrega;
    }
}
