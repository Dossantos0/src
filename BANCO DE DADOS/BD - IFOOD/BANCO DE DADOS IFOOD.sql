CREATE DATABASE BancoDeDados;
USE BancoDeDados;
CREATE TABLE Endereco (
    id INT AUTO_INCREMENT PRIMARY KEY,
    rua VARCHAR(50),
    numero INT,
    bairro VARCHAR(50),
    cidade VARCHAR(50),
    estado VARCHAR(40),
    cep VARCHAR(10),
    complemento VARCHAR(25),
    ponto_ref VARCHAR(50)
);

CREATE TABLE Categoria (
    id INT AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR(50),
    nome VARCHAR(50),
    descricao VARCHAR(255)
);

CREATE TABLE FormaDePagamento (
    id INT AUTO_INCREMENT PRIMARY KEY,
    tipo_pagamento ENUM('dinheiro', 'cartão de crédito', 'cartão de débito', 'pix')
);

CREATE TABLE Restaurante (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50),
    telefone VARCHAR(15),
    endereco_id INT,
    categoria_id INT,
    hora_funcio TIME,
    is_retirada BOOLEAN,
    valor_min_entrega DOUBLE,
    FOREIGN KEY (endereco_id) REFERENCES Endereco(id),
    FOREIGN KEY (categoria_id) REFERENCES Categoria(id)
);

CREATE TABLE Produto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50),
    preco DOUBLE,
    descricao VARCHAR(255),
    categoria_id INT,
    restaurante_id INT,
    FOREIGN KEY (categoria_id) REFERENCES Categoria(id),
    FOREIGN KEY (restaurante_id) REFERENCES Restaurante(id)
);

CREATE TABLE Promocao (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50),
    codigo INT,
    tipo VARCHAR(30),
    valor DOUBLE,
    validade DATE,
    restaurante_id INT,
    FOREIGN KEY (restaurante_id) REFERENCES Restaurante(id)
);

CREATE TABLE Pedido (
    id INT AUTO_INCREMENT PRIMARY KEY,
    data_pedido DATETIME,
    restaurante_id INT,
    valor DOUBLE,
    taxa_entrega DOUBLE,
    obs VARCHAR(50),
    troco DOUBLE,
    promocao_id INT,
    endereco_id INT,
    forma_pagamento_id INT,
    status_entrega ENUM('pendente', 'em transporte', 'entregue', 'cancelada'),
    FOREIGN KEY (restaurante_id) REFERENCES Restaurante(id),
    FOREIGN KEY (promocao_id) REFERENCES Promocao(id),
    FOREIGN KEY (endereco_id) REFERENCES Endereco(id),
    FOREIGN KEY (forma_pagamento_id) REFERENCES FormaDePagamento(id)
);


CREATE TABLE Avaliacao (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nota INT,
    pedido_id INT,
    restaurante_id INT,
    FOREIGN KEY (pedido_id) REFERENCES Pedido(id),
    FOREIGN KEY (restaurante_id) REFERENCES Restaurante(id)
);

CREATE TABLE Acompanhamento (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50),
    descricao VARCHAR(255),
    valor DOUBLE
);


CREATE TABLE HistoricoDePagamento (
    id INT AUTO_INCREMENT PRIMARY KEY,
    data_pagamento DATETIME,
    valor DOUBLE,
    forma_id INT,
    FOREIGN KEY (forma_id) REFERENCES FormaDePagamento(id)
);

CREATE TABLE Pedido_produto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    pedido_id INT,
    produto_id INT,
    quantidade INT,
    FOREIGN KEY (pedido_id) REFERENCES Pedido(id),
    FOREIGN KEY (produto_id) REFERENCES Produto(id)
);

CREATE TABLE Pedido_produto_acomp (
    id INT AUTO_INCREMENT PRIMARY KEY,
    pedido_produto_id INT,
    acompanhamento_id INT,
    FOREIGN KEY (pedido_produto_id) REFERENCES Pedido_produto(id),
    FOREIGN KEY (acompanhamento_id) REFERENCES Acompanhamento(id)
);

CREATE TABLE RestauranteFormaDePagamento (
    restaurante_id INT,
    forma_pagamento_id INT,
    PRIMARY KEY (restaurante_id, forma_pagamento_id),
    FOREIGN KEY (restaurante_id) REFERENCES Restaurante(id),
    FOREIGN KEY (forma_pagamento_id) REFERENCES FormaDePagamento(id)
);

