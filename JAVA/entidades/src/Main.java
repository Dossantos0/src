import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco(1, "Rua joaquim nabuco", 123, "Centro", "Cidade Arcocity", "Estado PE", "12345-976", "Apto 1", "Perto da praça");

        Categoria categoria = new Categoria(1, "Fast Food", "Hamburguer", "Lanches rápidos e saborosos");

        FormaDePagamento formaDePagamento = new FormaDePagamento(1, FormaDePagamento.TipoPagamento.CARTAO_DE_CREDITO);

        Restaurante restaurante = new Restaurante(1, "Baronni", "1234-5678", endereco, categoria, "10:00", true, 5.00);

        Produto produto = new Produto(1, "Hamburguer", 20.0, "Hamburguer delicioso", categoria, restaurante);

        Promocao promocao = new Promocao(1, "Desconto de 10%", 1234, "Desconto", 10.0, new Date());

        Pedido pedido = new Pedido(1, new Date(), restaurante, 50.0, 5.0, "Nenhuma observação", 0.0, promocao, endereco, formaDePagamento, Pedido.StatusEntrega.PENDENTE);

        HistoricoDePagamento historicoDePagamento = new HistoricoDePagamento(1, new Date(), 50.0, formaDePagamento);

        HistoricoDeEntrega historicoDeEntrega = new HistoricoDeEntrega(1, pedido, Pedido.StatusEntrega.ENTREGUE.toString(), new Date());

        PedidoProduto pedidoProduto = new PedidoProduto(1, pedido, produto, 2);

        Acompanhamento acompanhamento = new Acompanhamento(1, "Batata Frita", "Porção de batatas fritas", 10.0);

        PedidoProdutoAcomp pedidoProdutoAcomp = new PedidoProdutoAcomp(1, pedidoProduto, acompanhamento);

        System.out.println("Detalhes do Pedido:");
        System.out.println("Restaurante: " + restaurante.getNome());
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Quantidade: " + pedidoProduto.getQuantidade());
        System.out.println("Total: " + pedido.getValor());
        System.out.println("Status de Entrega: " + pedido.getStatusEntrega());
    }
}
