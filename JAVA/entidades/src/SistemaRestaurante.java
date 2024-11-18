import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SistemaRestaurante {
    static List<Restaurante> restaurantes = new ArrayList<>();
    static Carrinho carrinho = new Carrinho();

    public static void main(String[] args) {
        try {
            UIManager.put("OptionPane.background", Color.RED);
            UIManager.put("Panel.background", Color.RED);
            UIManager.put("OptionPane.messageForeground", Color.WHITE);
            UIManager.put("OptionPane.messageFont", new Font("SansSerif", Font.BOLD, 14));
            UIManager.put("Button.background", Color.WHITE);
            UIManager.put("Button.foreground", Color.RED);
            UIManager.put("Button.font", new Font("SansSerif", Font.PLAIN, 12)); 

            inicializarDados();
            mostrarMenuPrincipal();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void mostrarMenuPrincipal() {
        while (true) {
            String menu = """
                Seja Bem-Vindo ao Menu de Escolhas
                1: Adicionar Pedido ao Carrinho
                2: Exibir Restaurantes Disponíveis
                3: Exibir Produtos no Carrinho
                4: Prosseguir para Pagamento
                5: Encerrar o Serviço
                """;
            String escolha = JOptionPane.showInputDialog(null, menu, "Menu Principal", JOptionPane.QUESTION_MESSAGE);

            if (escolha == null) {
                JOptionPane.showMessageDialog(null, "Saindo do sistema. Obrigado!");
                break;
            }

            switch (escolha) {
                case "1" -> listarRestaurantes();
                case "2" -> listarRestaurantes();
                case "3" -> exibirCarrinho();
                case "4" -> JOptionPane.showMessageDialog(null, "Pagamento realizado com sucesso!");
                case "5" -> {
                    JOptionPane.showMessageDialog(null, "Saindo do sistema. Obrigado!");
                    return;
                }
                default -> JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        }
    }

    private static void listarRestaurantes() {
        StringBuilder lista = new StringBuilder("Restaurantes Disponíveis:\n");
        for (int i = 0; i < restaurantes.size(); i++) {
            lista.append(i + 1).append(". ").append(restaurantes.get(i).getNome()).append("\n");
        }

        String escolha = JOptionPane.showInputDialog(lista.append("\nEscolha o número do restaurante:"));
        try {
            int indice = Integer.parseInt(escolha) - 1;
            if (indice >= 0 && indice < restaurantes.size()) {
                mostrarProdutos(restaurantes.get(indice));
            } else {
                JOptionPane.showMessageDialog(null, "Número inválido. Tente novamente.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Tente novamente.");
        }
    }

    private static void mostrarProdutos(Restaurante restaurante) {
        StringBuilder lista = new StringBuilder("Produtos em ").append(restaurante.getNome()).append(":\n");
        for (int i = 0; i < restaurante.getProdutos().size(); i++) {
            Produto produto = restaurante.getProdutos().get(i);
            lista.append(i + 1).append(". ").append(produto.getNome())
                    .append(" - R$ ").append(produto.getPreco()).append("\n");
        }

        String escolha = JOptionPane.showInputDialog(lista.append("\nEscolha o número do produto:"));
        try {
            int indice = Integer.parseInt(escolha) - 1;
            if (indice >= 0 && indice < restaurante.getProdutos().size()) {
                listarAdicionais(restaurante.getProdutos().get(indice));
            } else {
                JOptionPane.showMessageDialog(null, "Número inválido. Tente novamente.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Tente novamente.");
        }
    }

    private static void listarAdicionais(Produto produto) {
        StringBuilder lista = new StringBuilder("Adicionais para ").append(produto.getNome()).append(":\n");
        for (int i = 0; i < produto.getAdicionais().size(); i++) {
            Adicional adicional = produto.getAdicionais().get(i);
            lista.append(i + 1).append(". ").append(adicional.getNome())
                    .append(" - R$ ").append(adicional.getPreco()).append("\n");
        }

        String escolha = JOptionPane.showInputDialog(lista.append("\nEscolha os números dos adicionais separados por vírgula (ou deixe vazio para nenhum):"));
        try {
            List<Adicional> adicionaisSelecionados = new ArrayList<>();
            if (escolha != null && !escolha.trim().isEmpty()) {
                String[] indices = escolha.split(",");
                for (String indice : indices) {
                    int pos = Integer.parseInt(indice.trim()) - 1;
                    if (pos >= 0 && pos < produto.getAdicionais().size()) {
                        adicionaisSelecionados.add(produto.getAdicionais().get(pos));
                    }
                }
            }
            adicionarAoCarrinho(produto, adicionaisSelecionados);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Tente novamente.");
        }
    }

    private static void exibirCarrinho() {
        if (carrinho.getItens().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O carrinho está vazio.");
            return;
        }

        StringBuilder resumo = new StringBuilder("Itens no Carrinho:\n");
        double total = 0;

        for (ItemCarrinho item : carrinho.getItens()) {
            resumo.append("- ").append(item.getProduto().getNome()).append(" - R$ ").append(item.getProduto().getPreco()).append("\n");
            if (!item.getAdicionais().isEmpty()) {
                resumo.append("  Adicionais:\n");
                for (Adicional adicional : item.getAdicionais()) {
                    resumo.append("    * ").append(adicional.getNome()).append(" - R$ ").append(adicional.getPreco()).append("\n");
                }
            }
            total += item.getProduto().getPreco() + item.getTotalAdicionais();
        }

        resumo.append("\nTotal: R$ ").append(total);
        JOptionPane.showMessageDialog(null, resumo.toString());
    }

    private static void adicionarAoCarrinho(Produto produto, List<Adicional> adicionais) {
        carrinho.adicionarItem(new ItemCarrinho(produto, adicionais));
        JOptionPane.showMessageDialog(null, produto.getNome() + " adicionado ao carrinho!");
    }

    private static void inicializarDados() {
        Restaurante restaurante1 = new Restaurante("Sushi Zen");
        Produto produto1 = new Produto("Sushi Combo", 50.0);
        produto1.adicionarAdicional(new Adicional("Molho Tarê", 5.0));
        produto1.adicionarAdicional(new Adicional("Gengibre", 3.0));
        restaurante1.adicionarProduto(produto1);

        Restaurante restaurante2 = new Restaurante("El Taco Loco");
        Produto produto2 = new Produto("Tacos", 20.0);
        produto2.adicionarAdicional(new Adicional("Guacamole", 4.0));
        produto2.adicionarAdicional(new Adicional("Cheddar", 5.0));
        restaurante2.adicionarProduto(produto2);

        restaurantes.add(restaurante1);
        restaurantes.add(restaurante2);
    }
}

class Restaurante {
    private String nome;
    private List<Produto> produtos = new ArrayList<>();

    public Restaurante(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }
}

class Produto {
    private String nome;
    private double preco;
    private List<Adicional> adicionais = new ArrayList<>();

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public List<Adicional> getAdicionais() {
        return adicionais;
    }

    public void adicionarAdicional(Adicional adicional) {
        adicionais.add(adicional);
    }
}

class Adicional {
    private String nome;
    private double preco;

    public Adicional(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

class Carrinho {
    private List<ItemCarrinho> itens = new ArrayList<>();

    public List<ItemCarrinho> getItens() {
        return itens;
    }

    public void adicionarItem(ItemCarrinho item) {
        itens.add(item);
    }
}

class ItemCarrinho {
    private Produto produto;
    private List<Adicional> adicionais;

    public ItemCarrinho(Produto produto, List<Adicional> adicionais) {
        this.produto = produto;
        this.adicionais = adicionais;
    }

    public Produto getProduto() {
        return produto;
    }

    public List<Adicional> getAdicionais() {
        return adicionais;
    }

    public double getTotalAdicionais() {
        return adicionais.stream().mapToDouble(Adicional::getPreco).sum();
    }
}