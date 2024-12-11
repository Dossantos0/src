SELECT p.id, SUM(pp.quantidade) AS total_produtos
FROM Pedido p
JOIN Pedido_produto pp ON p.id = pp.pedido_id
GROUP BY p.id
ORDER BY total_produtos DESC
LIMIT 1;
