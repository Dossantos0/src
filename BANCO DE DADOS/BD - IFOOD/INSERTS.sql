USE BancoDeDados;
INSERT INTO Endereco (rua, numero, bairro, cidade, estado, cep, complemento, ponto_ref)
VALUES
('Rua das Flores', 345, 'Jardim Bela Vista', 'São Paulo', 'SP', '01012-345', 'Apto 203', 'Perto do shopping'),
('Av. Brasil', 4567, 'Centro', 'Rio de Janeiro', 'RJ', '20050-000', 'Sala 12', 'Em frente à padaria'),
('Rua João Pessoa', 789, 'Vila Nova', 'Belo Horizonte', 'MG', '30100-000', 'Casa 56', 'Ao lado do supermercado'),
('Rua da Consolação', 432, 'Consolação', 'São Paulo', 'SP', '01301-000', 'Apto 45', 'Próximo ao metrô'),
('Rua da Praia', 1234, 'Centro', 'Florianópolis', 'SC', '88015-010', 'Cobertura', 'Perto da praia'),
('Av. dos Trabalhadores', 234, 'Vila Progresso', 'Curitiba', 'PR', '80010-000', 'Bloco B', 'Em frente ao mercado'),
('Rua dos Três Corações', 876, 'Santa Terezinha', 'Porto Alegre', 'RS', '90030-090', 'Apartamento 101', 'Perto da praça central'),
('Rua dos Carvalhos', 908, 'Vila Verde', 'Campinas', 'SP', '13080-100', 'Prédio comercial', 'Ao lado do restaurante'),
('Rua XV de Novembro', 123, 'Centro', 'São José', 'SC', '88100-100', 'Casa 22', 'Próximo ao banco'),
('Rua do Comércio', 654, 'Bairro Alto', 'Fortaleza', 'CE', '60000-000', 'Loja 9', 'Ao lado do estacionamento');

INSERT INTO Categoria (tipo, nome, descricao)
VALUES
('Pizza', 'Pizza de Calabresa', 'Pizza de massa fina com queijo e calabresa'),
('Bebidas', 'Refrigerante Coca-Cola', 'Refrigerante Coca-Cola em lata'),
('Sushi', 'Sushi de Salmão', 'Sushi com fatias de salmão fresco'),
('Lanches', 'Hambúrguer Artesanal', 'Hambúrguer com carne artesanal e queijo cheddar'),
('Massas', 'Spaghetti à Bolonhesa', 'Massa italiana com molho à bolonhesa'),
('Sobremesas', 'Torta de Limão', 'Torta com recheio cremoso de limão e cobertura de merengue'),
('Pizza', 'Pizza Marguerita', 'Pizza com molho de tomate, mussarela e manjericão'),
('Bebidas', 'Suco Natural de Laranja', 'Suco de laranja 100% natural'),
('Lanches', 'Sanduíche de Frango', 'Sanduíche de frango grelhado com alface e maionese'),
('Massas', 'Lasanha de Carne', 'Lasanha com molho de carne moída e queijo');

INSERT INTO FormaDePagamento (tipo_pagamento)
VALUES
('dinheiro'),
('cartão de crédito'),
('cartão de débito'),
('pix');

INSERT INTO Restaurante (nome, telefone, endereco_id, categoria_id, hora_funcio, is_retirada, valor_min_entrega)
VALUES
('Pizzaria Bella Vista', '11 98765-4321', 1, 1, '18:00:00', TRUE, 20.00),
('Sushibar Sushi House', '21 99876-5432', 2, 3, '12:00:00', TRUE, 25.00),
('Hamburgueria Big Bite', '31 98765-4321', 3, 4, '10:00:00', FALSE, 15.00),
('Restaurante Italiano La Trattoria', '41 99876-5432', 4, 5, '11:00:00', TRUE, 30.00),
('Café e Lanches da Rua', '51 98765-4321', 5, 6, '07:00:00', TRUE, 10.00),
('Sabor da Torta', '61 99876-5432', 6, 7, '09:00:00', TRUE, 12.00),
('La Pizzaria', '71 98765-4321', 7, 1, '19:00:00', TRUE, 20.00),
('Sushi Maki', '81 99876-5432', 8, 3, '11:00:00', FALSE, 28.00),
('Delícias da Rua', '91 98765-4321', 9, 4, '13:00:00', TRUE, 15.00),
('Burguer King', '11 98765-4321', 10, 4, '10:00:00', FALSE, 18.00);

INSERT INTO Produto (nome, preco, descricao, categoria_id, restaurante_id)
VALUES
('Pizza de Calabresa', 30.00, 'Pizza com queijo e calabresa', 1, 1),
('Coca-Cola', 5.00, 'Refrigerante Coca-Cola', 2, 2),
('Sushi de Salmão', 35.00, 'Sushi de salmão fresco', 3, 2),
('Hambúrguer Artesanal', 25.00, 'Hambúrguer artesanal com queijo cheddar', 4, 3),
('Spaghetti à Bolonhesa', 22.00, 'Spaghetti com molho bolonhesa', 5, 4),
('Torta de Limão', 12.00, 'Torta de limão com merengue', 6, 5),
('Pizza Marguerita', 28.00, 'Pizza com molho de tomate, mussarela e manjericão', 1, 1),
('Suco Natural de Laranja', 8.00, 'Suco de laranja natural', 2, 6),
('Sanduíche de Frango', 18.00, 'Sanduíche com frango grelhado', 4, 7),
('Lasanha de Carne', 32.00, 'Lasanha com molho de carne moída', 5, 8);

INSERT INTO Pedido (valor, forma_pagamento_id, endereco_id, data_pedido)
VALUES
(80.00, 1, 1, '2024-01-10'),
(55.00, 2, 2, '2024-02-11'),
(100.00, 3, 3, '2024-03-11'),
(60.00, 1, 4, '2024-11-12'),
(90.00, 2, 5, '2024-12-12');


INSERT INTO Pedido_produto (pedido_id, produto_id, quantidade)
VALUES
(1, 1, 2),  
(1, 2, 1); 

INSERT INTO Pedido_produto (pedido_id, produto_id, quantidade)
VALUES
(2, 1, 1),  
(2, 4, 1);  

INSERT INTO Pedido_produto (pedido_id, produto_id, quantidade)
VALUES
(3, 3, 3),  
(3, 2, 1);  

INSERT INTO Pedido_produto (pedido_id, produto_id, quantidade)
VALUES
(4, 4, 2); 

INSERT INTO Pedido_produto (pedido_id, produto_id, quantidade)
VALUES
(5, 7, 1),
(5, 3, 2);

