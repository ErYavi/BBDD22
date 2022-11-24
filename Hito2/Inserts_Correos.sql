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
('Calle Mayor', 'Alcobendas'),
('Calle Mayor', 'Madrid'),
('Paseo de San Roque', 'Avila');

INSERT INTO Direccion (Numero, Piso, Letra, Portal, NCalle, NMunicipio) VALUES # NA significa que NO APLICA.
('3','1','D','F','Paseo de Europa', 'Alcobendas'),
('39','4', 'NA', 'NA','Paseo de la Chopera', 'Alcobendas'),
('23','NA','NA','NA','Paseo de San Roque', 'Avila'),
('349','4', 'NA', 'NA','Paseo de la Castellana', 'Madrid'),
('349','2', 'B', 'NA','Calle Mayor', 'Madrid');

INSERT INTO Centro_C (Cod_CC, NombreCC, Max_pq, Max_ct, NMunicipio) VALUES
('CC-MAD-01','Madrid Centro',550,1750,'Madrid'),
('CC-MAD-02','Madrid Norte',5000,80000,'Madrid'),
('CC-MAD-03','Madrid Sur',2000,10000,'Madrid'),
('CC-AV-01','Avila 1',550,1750,'Avila'),
('CC-CA-01','Madrid Centro 1',550,1750,'Jerez de la Frontera'),
('CC-MAD-04','Alcobendas',8000,100000,'Alcobendas');

INSERT INTO Segmento (N_ini, N_fin, ID_Seg, NCalle, NMunicipio) VALUES
()
