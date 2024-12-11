SELECT p.nome, SUM(pp.quantidade) AS total_vendido
FROM Produto p
JOIN Pedido_produto pp ON p.id = pp.produto_id
GROUP BY p.id
ORDER BY total_vendido ASC
LIMIT 1;
