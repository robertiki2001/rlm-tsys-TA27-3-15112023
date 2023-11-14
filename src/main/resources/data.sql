DROP TABLE IF EXISTS venta;
DROP TABLE IF EXISTS productos;
DROP TABLE IF EXISTS cajeros;
DROP TABLE IF EXISTS maquinas_registradoras;


CREATE TABLE productos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    precio INT NOT NULL
);

INSERT INTO productos (id, nombre, precio) VALUES 
    ('Producto A', 10),
    ('Producto B', 15),
    ('Producto C', 20),
    ('Producto D', 25),
    ('Producto E', 30);



CREATE TABLE cajeros (
    id INT PRIMARY KEY,
    nom_apels VARCHAR(255) NOT NULL
);

INSERT INTO cajeros (id, nom_apels) VALUES 
    (101, 'Juan Pérez'),
    (102, 'María López'),
    (103, 'Pedro Ramírez'),
    (104, 'Luisa Martínez'),
    (105, 'Ana Sánchez');

CREATE TABLE maquinas_registradoras (
    id INT PRIMARY KEY,
    piso INT NOT NULL
);

INSERT INTO maquinas_registradoras (id, piso) VALUES 
    (501, 1),
    (502, 1),
    (503, 2),
    (504, 2),
    (505, 3);


CREATE TABLE venta (
    id INT AUTO_INCREMENT PRIMARY KEY
    id_cajero INT,
    id_maquina_registradora INT,
    id_producto INT,
    FOREIGN KEY (id_cajero) REFERENCES cajeros (id) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY (id_maquina_registradora) REFERENCES maquinas_registradoras (id) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY (id_producto) REFERENCES productos (id) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO venta (cajero, maquina, producto) VALUES 
    (101, 501, 1),
    (102, 502, 2),
    (103, 503, 3),
    (104, 504, 4),
    (105, 505, 5);
