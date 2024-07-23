UPDATE usuarios SET endereco = 'Rua I, 365, Cidade J, Estado I++' WHERE id = 4;

ALTER TABLE usuarios 
ADD rua VARCHAR(100), 
ADD numero VARCHAR(10), 
ADD cidade VARCHAR(50), 
ADD estado VARCHAR(20);

SET sql_safe_updates = 0;

UPDATE usuarios
SET rua = SUBSTRING_INDEX(SUBSTRING_INDEX(endereco, ',', 1), ',', -1),
    numero = SUBSTRING_INDEX(SUBSTRING_INDEX(endereco, ',', 2), ',', -1),
    cidade = SUBSTRING_INDEX(SUBSTRING_INDEX(endereco, ',', 3), ',', -1),
    estado = SUBSTRING_INDEX(endereco, ',', -1);

SET sql_safe_updates = 1;

ALTER TABLE usuarios DROP COLUMN endereco;




INSERT INTO usuarios (nome, email, data_nascimento, rua, numero, cidade, estado) VALUES ('Usuario sem reservas', 'semreservar@teste.com', '1990-10-10', 'Rua','123','cidade','estado');

SELECT * FROM usuarios us
INNER JOIN reservas rs
	ON us.id = rs.id_usuario;

SELECT * FROM usuarios us
INNER JOIN reservas rs
	ON us.id = rs.id_usuario;

INSERT INTO viagens.destinos (nome, descricao) VALUES 
('Destino sem reserva', 'Uma bela praia com areias brancas e mar cristalino');

SELECT * FROM reservas rs
RIGHT JOIN destinos des
	ON des.id = rs.id_destino;

SELECT * FROM destinos des
LEFT JOIN reservas rs
	ON des.id = rs.id_destino;
    
    


-- Usuários que não fizeram nenhuma reserva
SELECT nome
FROM usuarios
WHERE id NOT IN (SELECT id_usuario FROM reservas);

-- Subconsulta para encontrar os destinos menos populares (com menos reservas):

SELECT nome
FROM destinos
WHERE id NOT IN (SELECT id_destino FROM reservas)
ORDER BY id;

-- contagem de reservas por usuario

SELECT nome, (SELECT COUNT(*) FROM reservas WHERE id_usuario = usuarios.id) AS total_reservas
FROM usuarios;