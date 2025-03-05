CREATE DATABASE catalogo;
USE catalogo;

CREATE TABLE jogos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    desenvolvedora VARCHAR(255) NOT NULL,
    genero VARCHAR(255) NOT NULL,
    ano VARCHAR(255) NOT NULL,
    zerou ENUM('Sim', 'Não')
);