SELECT e.rua, e.numero, COUNT(*) AS total_entregas
FROM Pedido p
JOIN Endereco e ON p.endereco_id = e.id
GROUP BY e.id
ORDER BY total_entregas DESC
LIMIT 1;
