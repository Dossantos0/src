USE bancodedados;

-- Desabilitar o modo seguro temporariamente
SET SQL_SAFE_UPDATES = 0;

-- Deletar os dados nas tabelas em ordem de dependência
DELETE FROM Pedido_Produto;
DELETE FROM Pedido;
DELETE FROM Produto;
DELETE FROM FormaDePagamento;
DELETE FROM Restaurante;
DELETE FROM Categoria;
DELETE FROM Endereco;

-- Reiniciar AUTO_INCREMENT
ALTER TABLE Produto AUTO_INCREMENT = 1;
ALTER TABLE Pedido AUTO_INCREMENT = 1;
ALTER TABLE Pedido_Produto AUTO_INCREMENT = 1;
ALTER TABLE FormaDePagamento AUTO_INCREMENT = 1;
ALTER TABLE Restaurante AUTO_INCREMENT = 1;
ALTER TABLE Categoria AUTO_INCREMENT = 1;
ALTER TABLE Endereco AUTO_INCREMENT = 1;

-- Reativar o modo seguro
SET SQL_SAFE_UPDATES = 1;

-- Consultar para verificar que as tabelas estão vazias
SELECT * FROM Produto;
SELECT * FROM Pedido;
SELECT * FROM Pedido_Produto;
SELECT * FROM Restaurante;
SELECT * FROM Categoria;
SELECT * FROM FormaDePagamento;
SELECT * FROM Endereco;
