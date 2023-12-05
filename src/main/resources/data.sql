DROP DATABASE pruebaTecnicaBack;
CREATE DATABASE pruebaTecnicaBack;
USE pruebaTecnicaBack;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS games;
DROP TABLE IF EXISTS videogames;
DROP TABLE IF EXISTS parties;


CREATE TABLE usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    role VARCHAR(100) NOT NULL
);

INSERT INTO usuario (username, password, role) VALUES 
    ('Pablo', '123','player'),
    ('Marta', '456','player'),
    ('Carla', '123','admin');
    
    CREATE TABLE videogames (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

INSERT INTO videogames (name) VALUES 
    ('Tetris'),
    ('Fortnite'),
    ('Tekken7');

CREATE TABLE games (
    id INT AUTO_INCREMENT PRIMARY KEY,
    registration_date DATETIME DEFAULT CURRENT_TIMESTAMP,
    state VARCHAR(20) NOT NULL,
    id_usuario int,
    id_videogame int,
    FOREIGN KEY (id_usuario) REFERENCES usuario (id) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY (id_videogame) REFERENCES videogames (id) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO games (state, id_usuario, id_videogame) VALUES 
    ('En progreso', 1, 1),
    ('Terminada', 2, 2),
    ('Cancelada', 3, 3);



CREATE TABLE parties (
    id INT AUTO_INCREMENT PRIMARY KEY,
    content VARCHAR(100) NOT NULL,
    registration_date DATETIME DEFAULT CURRENT_TIMESTAMP,
    id_usuario int,
    FOREIGN KEY (id_usuario) REFERENCES usuario (id) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO parties (content, id_usuario) VALUES 
    ('Hola buenas chavales', 1),
    ('Eii como va!', 2),
    ('Le damos o que', 3);

INSERT INTO usuario (id, password, role, username) VALUES (5, '$2a$10$qL4eqIngUC4eXzi9yymeMehNrEcTtBVuMQdk5kpWNolQOhKMy8o52', 'user', 'robert');