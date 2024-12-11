SELECT f.tipo_pagamento, SUM(p.valor) AS total_vendas
FROM Pedido p
JOIN FormaDePagamento f ON p.forma_pagamento_id = f.id
WHERE YEAR(p.data_pedido) = YEAR(CURRENT_DATE - INTERVAL 1 MONTH) 
  AND MONTH(p.data_pedido) = MONTH(CURRENT_DATE - INTERVAL 1 MONTH)
GROUP BY f.id;
