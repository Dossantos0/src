SELECT f.tipo_pagamento, COUNT(*) AS total_usado
FROM Pedido p
JOIN FormaDePagamento f ON p.forma_pagamento_id = f.id
GROUP BY f.id
ORDER BY total_usado DESC
LIMIT 1;
