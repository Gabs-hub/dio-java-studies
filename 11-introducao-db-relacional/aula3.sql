CREATE DATABASE viagens;

USE viagens;

CREATE TABLE usuarios (
  id INT,
  nome VARCHAR(255) NOT NULL COMMENT 'Nome do usuário',
  email VARCHAR(255) NOT NULL UNIQUE COMMENT 'Endereço de e-mail do usuário',
  data_nascimento DATE NOT NULL COMMENT 'Data de nascimento do usuário',
  endereco VARCHAR(50) NOT NULL COMMENT 'Endereço do Cliente'
);

CREATE TABLE viagens.destinos (
  id INT,
  nome VARCHAR(255) NOT NULL UNIQUE COMMENT 'Nome do destino',
  descricao VARCHAR(255) NOT NULL COMMENT 'Descrição do destino'
);

CREATE TABLE viagens.reservas (
  id INT COMMENT 'Identificador único da reserva',
  id_usuario INT COMMENT 'Referência ao ID do usuário que fez a reserva',
  id_destino INT COMMENT 'Referência ao ID do destino da reserva',
  data DATE COMMENT 'Data da reserva',
  status VARCHAR(255) DEFAULT 'pendente' COMMENT 'Status da reserva (confirmada, pendente, cancelada, etc.)'
);

INSERT INTO viagens.usuarios (id, nome, email, data_nascimento, endereco) VALUES 
(1, 'João Silva', 'joao@example.com', '1990-05-15', 'Rua A, 123, Cidade X, Estado Y'),
(2, 'Maria Santos', 'maria@example.com', '1985-08-22', 'Rua B, 456, Cidade Y, Estado Z'),
(3, 'Pedro Souza', 'pedro@example.com', '1998-02-10', 'Avenida C, 789, Cidade X, Estado Y');

INSERT INTO viagens.destinos (id, nome, descricao) VALUES 
(1, 'Praia das Tartarugas', 'Uma bela praia com areias brancas e mar cristalino'),
(2, 'Cachoeira do Vale Verde', 'Uma cachoeira exuberante cercada por natureza'),
(3, 'Cidade Histórica de Pedra Alta', 'Uma cidade rica em história e arquitetura');

INSERT INTO viagens.reservas (id, id_usuario, id_destino, data, status) VALUES 
(1, 1, 2, '2023-07-10', 'confirmada'),
(2, 2, 1, '2023-08-05', 'pendente'),
(3, 3, 3, '2023-09-20', 'cancelada');

SELECT * FROM usuarios;
SELECT nome, email FROM usuarios;
SELECT * FROM usuarios WHERE nome = 'João Silva';
SELECT * FROM usuarios WHERE data_nascimento > '1990-01-01';
SELECT * FROM usuarios WHERE nome LIKE '%Silva%';
SELECT * FROM usuarios WHERE nome LIKE 'João%';



INSERT INTO usuarios VALUES (1, 'Arthur', 'arthur@teste.com', '1999-12-12', 'Rua I, Cidade J, Estado I++');
INSERT INTO destinos VALUES (1, 'Praia do Rosa', 'Uma linda praia');

UPDATE usuarios SET id = 4 WHERE email = 'arthur@teste.com';
DELETE FROM destinos WHERE nome = 'Praia do Rosa';



CREATE TABLE usuarios_nova (
  id INT,
  nome VARCHAR(255) NOT NULL COMMENT 'Nome do usuário',
  email VARCHAR(255) NOT NULL UNIQUE COMMENT 'Endereço de e-mail do usuário',
  data_nascimento DATE NOT NULL COMMENT 'Data de nascimento do usuário',
  endereco VARCHAR(100) NOT NULL COMMENT 'Endereço do Cliente'
);

INSERT INTO usuarios_nova SELECT * FROM usuarios;
DROP TABLE usuarios;
ALTER TABLE usuarios_nova RENAME usuarios;

ALTER TABLE usuarios MODIFY COLUMN endereco VARCHAR(150);



ALTER TABLE usuarios MODIFY COLUMN id INT PRIMARY KEY AUTO_INCREMENT;
ALTER TABLE reservas MODIFY COLUMN id INT PRIMARY KEY AUTO_INCREMENT;
ALTER TABLE destinos MODIFY COLUMN id INT PRIMARY KEY AUTO_INCREMENT;

ALTER TABLE reservas ADD CONSTRAINT fk_reservas_usuarios FOREIGN KEY(id_usuario) REFERENCES usuarios(id) ON DELETE CASCADE;
ALTER TABLE reservas ADD CONSTRAINT fk_reservas_destinos FOREIGN KEY(id_destino) REFERENCES destinos(id) ON DELETE CASCADE;

ALTER TABLE reservas ADD CONSTRAINT fk_usuarios FOREIGN KEY(id_usuario) REFERENCES usuarios(id) ON DELETE CASCADE;
ALTER TABLE reservas DROP CONSTRAINT fk_reservas_usuarios;

DELETE FROM usuarios WHERE id =1;
SELECT * FROM usuarios;