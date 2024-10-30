public class Endereco {
    private int id;
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String complemento;
    private String pontoRef;

    public Endereco(int id, String rua, int numero, String bairro, String cidade, String estado, String cep, String complemento, String pontoRef) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.complemento = complemento;
        this.pontoRef = pontoRef;
    }

    private int getId() {
        return id;
    }

    private String getRua() {
        return rua;
    }

    private int getNumero() {
        return numero;
    }

    private String getBairro() {
        return bairro;
    }

    private String getCidade() {
        return cidade;
    }

    private String getEstado() {
        return estado;
    }

    private String getCep() {
        return cep;
    }

    private String getComplemento() {
        return complemento;
    }

    private String getPontoRef() {
        return pontoRef;
    }

    // Métodos set privados
    private void setId(int id) {
        this.id = id;
    }

    private void setRua(String rua) {
        this.rua = rua;
    }

    private void setNumero(int numero) {
        this.numero = numero;
    }

    private void setBairro(String bairro) {
        this.bairro = bairro;
    }

    private void setCidade(String cidade) {
        this.cidade = cidade;
    }

    private void setEstado(String estado) {
        this.estado = estado;
    }

    private void setCep(String cep) {
        this.cep = cep;
    }

    private void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    private void setPontoRef(String pontoRef) {
        this.pontoRef = pontoRef;
    }
}

