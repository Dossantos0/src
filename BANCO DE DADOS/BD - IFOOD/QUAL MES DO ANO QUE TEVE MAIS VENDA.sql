SELECT MONTH(p.data_pedido) AS mes, YEAR(p.data_pedido) AS ano, SUM(p.valor) AS total_vendido
FROM Pedido p
GROUP BY ano, mes
ORDER BY total_vendido DESC
LIMIT 1;
