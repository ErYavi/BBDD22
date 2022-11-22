INSERT INTO Cartero (DNI_Car, Nom_C, Apellidos_C) VALUES
('01542462N','Carlos','Castillo Romero');

INSERT INTO Ruta (ID_Ruta) VALUES
('RU-MAD-0001');

INSERT INTO Turno (Jornada, Horario) VALUES
('Mañana', '09:00-13:00');

INSERT INTO Provincia (NProvincia) VALUES
('Cadiz'),
('Avila'),
('Madrid');

INSERT INTO Municipio (NMunicipio, NProvincia) VALUES
('Jerez de la Frontera', 'Cadiz'),
('Avila', 'Avila'),
('Madrid', 'Madrid'),
('Alcobendas', 'Madrid');

INSERT INTO Calle (Ncalle,Nmunicipio) VALUES
('Paseo de la Chopera','Alcobendas'),
('Paseo de Europa','Alcobendas'),
('Avenida de España', 'Alcobendas'),
('Paseo de la Castellana', 'Madrid'),
('Paseo de San Roque', 'Avila');

INSERT INTO Direccion (Numero, Piso, Letra, Portal, NCalle) VALUES
(3,1,'D','21','Paseo de Europa')