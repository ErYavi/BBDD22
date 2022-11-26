INSERT INTO Cartero (DNI_Car, Nom_C, Apellidos_C) VALUES
('01542462N','Carlos','Castillo Romero'),
('54156156I','Paco','Montes'),
('15621566H','Nicolae','Neagu'),
('98854312B','Francisco','Fernandez Burgos');

INSERT INTO Ruta (ID_Ruta) VALUES
('RU-MAD-0001'),
('RU-MAD-0002'),
('RU-MAD-0003'),
('RU-MAD-0004'),
('RU-AVI-0001'),
('RU-CAD-0001');

INSERT INTO Turno (Jornada, Horario) VALUES
('Mañana', '09:00-13:00'),
('Tarde', '15:00-19:00');

INSERT INTO Provincia (NProvincia) VALUES
('Cadiz'),
('Avila'),
('Madrid');

INSERT INTO Municipio (NMunicipio, NProvincia) VALUES
('Jerez de la Frontera', 'Cadiz'),
('Avila', 'Avila'),
('Madrid', 'Madrid'),
('Alcobendas', 'Madrid'),
('Alcorcon','Madrid');

INSERT INTO Calle (Ncalle,Nmunicipio) VALUES
('Paseo de la Chopera','Alcobendas'),
('Paseo de Europa','Alcobendas'),
('Avenida de España', 'Alcobendas'),
('Paseo de la Castellana', 'Madrid'),
('Calle Mayor', 'Alcobendas'),
('Calle Mayor', 'Madrid'),
('Paseo de San Roque', 'Alcorcon'),
('Avenida de America','Alcorcon'),
('Avenida de America','Madrid');

INSERT INTO Direccion (Numero, Piso, Letra, Portal, NCalle, NMunicipio) VALUES # NA significa que NO APLICA.
('3','1','D','F','Paseo de Europa', 'Alcobendas'),
('39','4', 'NA', 'NA','Paseo de la Chopera', 'Alcobendas'),
('23','NA','NA','NA','Paseo de San Roque', 'Alcorcon'),
('49','6', 'NA', 'NA','Paseo de la Castellana', 'Madrid'),
('9','2', 'B', 'NA','Calle Mayor', 'Madrid'),
('22','6','H','C','Avenida de America','Alcorcon'),
('6','22','NA','NA','Avenida de America','Madrid'),
('39','8', 'NA', 'NA','Paseo de la Chopera', 'Alcobendas'),
('61','9', 'NA', 'NA','Paseo de la Castellana', 'Madrid'),
('15','5','C','A','Avenida de America','Madrid'),
('6','3','D','F','Paseo de Europa', 'Alcobendas');

INSERT INTO Centro_C (Cod_CC, NombreCC, Max_pq, Max_ct, NMunicipio) VALUES
('CC-MAD-01','Madrid Centro',550,1750,'Madrid'),
('CC-MAD-02','Madrid Norte',5000,80000,'Madrid'),
('CC-MAD-03','Madrid Sur',2000,10000,'Madrid'),
('CC-MAD-11','Alcorcon 1',550,1750,'Alcorcon'),
('CC-CA-01','Madrid Centro 1',550,1750,'Jerez de la Frontera'),
('CC-MAD-04','Alcobendas',8000,100000,'Alcobendas');

INSERT INTO Segmento (N_ini, N_fin, ID_Seg, NCalle, NMunicipio) VALUES
(1,50,'SE-MAD-01','Paseo de la Castellana', 'Madrid'),
(51,100,'SE-MAD-02','Paseo de la Castellana', 'Madrid'),
(1,20,'SE-ALC-04','Paseo de San Roque', 'Alcorcon'),
(1,50,'SE-ACB-04','Paseo de la Chopera', 'Alcobendas'),
(51,100,'SE-ACB-05','Paseo de la Chopera', 'Alcobendas'),
(1,20,'SE-ALC-11','Avenida de America', 'Alcorcon'),
(21,50,'SE-ALC-12','Avenida de America', 'Alcorcon'),
(1,20,'SE-MAD-03','Avenida de America', 'Madrid'),
(21,60,'SE-MAD-04','Avenida de America', 'Madrid');

INSERT INTO Usuario_Gen(Id_Gen,Nom_Gen,Apellidos_Gen,Numero,Piso,Letra,Portal,Ncalle,Nmunicipio) VALUES
(1,'Juan','Illo','3','1','D','F','Paseo de Europa', 'Alcobendas'),
(2,'Hermegildo','Rupert','39','4', 'NA', 'NA','Paseo de la Chopera', 'Alcobendas'),
(3,'Jhonny','Test','23','NA','NA','NA','Paseo de San Roque', 'Alcorcon'),
(4,'Ruben','Doblas','49','6', 'NA', 'NA','Paseo de la Castellana', 'Madrid'),
(5,'Martin','Mendez','9','2', 'B', 'NA','Calle Mayor', 'Madrid'),
(6,'Pedro','Perez','22','6','H','C','Avenida de America','Alcorcon'),
(7,'Mohammed','Al-Ahbuki','6','22','NA','NA','Avenida de America','Madrid');

INSERT INTO Ruta_Incluye_Seg(Norden,ID_seg,ID_ruta,Ncalle,Nmunicipio) VALUES
('1','SE-MAD-01','RU-MAD-0001','Paseo de la Castellana', 'Madrid'),
('2','SE-MAD-02','RU-MAD-0001','Paseo de la Castellana', 'Madrid'),
('1','SE-ALC-11','RU-MAD-0002','Avenida de America', 'Alcorcon'),
('2','SE-ALC-04','RU-MAD-0002','Paseo de San Roque', 'Alcorcon'),
('1','SE-ALC-11','RU-MAD-0003','Avenida de America', 'Alcorcon'),
('2','SE-ALC-12','RU-MAD-0003','Avenida de America', 'Alcorcon'),
('1','SE-MAD-03','RU-MAD-0004','Avenida de America', 'Madrid');

INSERT INTO Oficina(Cod_O,Nmunicipio,Cod_CC) VALUES
('OF-ALC-01','Alcorcon','CC-MAD-11'),
('OF-MAD-01','Madrid','CC-MAD-01'),
('OF-MAD-02','Madrid','CC-MAD-02'),
('OF-MAD-03','Madrid','CC-MAD-03'),
('OF-ACB-01','Alcobendas','CC-MAD-04'),
('OF-ACB-02','Alcobendas','CC-MAD-04');

INSERT INTO Coche(Capacidad,Matricula,Cod_O) VALUES
(0.75,'4563CBH','OF-ALC-01'),
(1,'6598JKY','OF-ACB-01'),
(1.5,'1285DLK','OF-MAD-02'),
(1.25,'9421MFD','OF-MAD-03');

INSERT INTO Reparto(FechaR,Id_Reparto,DNI_Car,Id_ruta,Matricula) VALUES
('2022-06-23','RE-MAD-01','98854312B','RU-MAD-0001','4563CBH'),
('2022-09-15','RE-MAD-02','01542462N','RU-MAD-0002','6598JKY'),
('2022-01-03','RE-MAD-03','54156156I','RU-MAD-0002','6598JKY'),
('2022-03-28','RE-MAD-04','01542462N','RU-MAD-0003','4563CBH'),
('2022-08-05','RE-ACB-01','15621566H','RU-MAD-0001','1285DLK'),
('2022-10-01','RE-ACB-02','54156156I','RU-MAD-0003','9421MFD'),
('2022-10-01','RE-ACB-03','15621566H','RU-MAD-0003','6598JKY'),
('2022-07-21','RE-ALC-01','98854312B','RU-MAD-0003','9421MFD');

INSERT INTO Area_envio(ID_Area,Cod_O) VALUES
('AR-MAD-01','OF-MAD-01'),
('AR-MAD-02','OF-MAD-02'),
('AR-MAD-03','OF-MAD-03'),
('AR-ALC-01','OF-ALC-01'),
('AR-ACB-01','OF-ACB-01'),
('AR-ACB-02','OF-ACB-02');

INSERT INTO Trabajo(Fecha_ini,Jornada,Cod_O,DNI_Car) VALUES
('2022-01-01','Mañana','OF-MAD-01','98854312B'),
('2022-01-01','Mañana','OF-MAD-02','01542462N'),
('2022-01-01','Tarde','OF-MAD-03','01542462N'),
('2022-01-01','Tarde','OF-ACB-01','54156156I'),
('2022-01-01','Tarde','OF-ALC-01','15621566H');

INSERT INTO Area_Incluye_Seg(ID_area,Id_seg) VALUES
('AR-MAD-01','SE-MAD-01'),
('AR-MAD-01','SE-MAD-02'),
('AR-MAD-03','SE-ALC-11'),
('AR-MAD-03','SE-ALC-12'),
('AR-ALC-01','SE-ALC-04'),
('AR-ACB-02','SE-ACB-04'),
('AR-ACB-01','SE-ACB-05');

INSERT INTO Area_Incluye_Area(Id_Padre,ID_hijo) VALUES
('AR-MAD-01','AR-MAD-02');

INSERT INTO Cartero_Reparte_Area(ID_area,DNI_Car) VALUES
('AR-MAD-01','01542462N'),
('AR-ALC-01','54156156I'),
('AR-ACB-01','15621566H');

INSERT INTO Carta(CT,Formato,DNI_Car,ID_Emisor,Id_Receptor,ID_reparto) VALUES
('CT2659480245','A5','01542462N',1,4,'RE-MAD-01'),
('CT0141252132','A4','98854312B',2,7,'RE-MAD-02'),
('CT4445355515','A4','54156156I',3,5,'RE-ACB-01'),
('CT7484549645','A5','15621566H',4,1,'RE-ALC-01');

INSERT INTO Usuario_Iden(eMail,Apellidos_iden,DNI_Usuario,Nom_iden) VALUES
('perico@gmail.com','Cayo','51651065F','Perico'),
('juanito@gmail.com','Juanes','85465165K','Enrique'),
('alvaro@gmail.com','Mendez','03213215V','Alvaro'),
('pedro@gmail.com','Picapiedra','13468455Z','Pedro'),
('omar@gmail.com','Muntes','45456546W','Omar');

INSERT INTO Autorizacion(DNI_Autorizado,DNI_Autoriza) VALUES
('85465165K','03213215V'),
('13468455Z','51651065F'),
('13468455Z','45456546W');

INSERT INTO Recogida(ID_Rec,Fecha_Rec,Numero,Piso,Letra,Portal,NCalle,NMunicipio,DNI_Usuario,DNI_Car) VALUES
('RD-ACB-01','2022-05-21','6','3','D','F','Paseo de Europa', 'Alcobendas','85465165K','54156156I'),
('RD-MAD-01','2022-09-03','15','5','C','A','Avenida de America','Madrid','51651065F','54156156I'),
('RD-MAD-02','2022-01-15','61','9', 'NA', 'NA','Paseo de la Castellana', 'Madrid','03213215V','15621566H'),
('RD-ACB-02','2022-08-14','39','8', 'NA', 'NA','Paseo de la Chopera', 'Alcobendas','13468455Z','01542462N'),
('RD-MAD-03','2022-02-6','6','22','NA','NA','Avenida de America','Madrid','45456546W','98854312B');

INSERT INTO Paquete(PQ,Dimensiones,Peso,ID_Rec,ID_Emisor,ID_Receptor,DNI_Car,ID_Reparto) VALUES
('PQ2648658902','6X5',50.6,NULL,1,5,'54156156I','RE-MAD-01'),
('PQ8465184684','7X8',60.2,NULL,4,3,'54156156I','RE-ALC-01'),
('PQ2135484652','15X8',70.8,'RD-ACB-01',2,5,'15621566H','RE-MAD-02'),
('PQ4171564165','20x15',45.8,NULL,6,5,'54156156I','RE-MAD-01');

INSERT INTO Certificada(CE,Urgencia,DNI_Emisor,DNI_Receptor,DNI_Car,ID_Reparto) VALUES
('CE3216945678','Alta','85465165K','03213215V','01542462N','RE-MAD-02'),
('CE2846511856','Alta','45456546W','13468455Z','54156156I','RE-ACB-01'),
('CE9895623102','Baja','51651065F','85465165K','15621566H','RE-ACB-02'),
('CE9369559254','Baja','13468455Z','03213215V','98854312B','RE-MAD-03');

INSERT INTO Entrega_Cert(Hora,Fecha,DNI_Usuario,CE,DNI_Car) VALUES # La hora esta en formato hh:mm:ss
('15:20:56','2022-06-22','03213215V','CE3216945678','01542462N'),
('17:05:23','2022-11-06','13468455Z','CE2846511856','54156156I'),
('16:45:37','2022-03-03','85465165K','CE9895623102','15621566H'),
('10:02:15','2022-08-15','03213215V','CE9369559254','98854312B');

INSERT INTO Iden_Vive_Dir(DNI_Usuario,Numero,Piso,Letra,Portal,NCalle,NMunicipio) VALUES
('85465165K','6','3','D','F','Paseo de Europa', 'Alcobendas'),
('51651065F','15','5','C','A','Avenida de America','Madrid'),
('03213215V','61','9', 'NA', 'NA','Paseo de la Castellana', 'Madrid'),
('13468455Z','39','8', 'NA', 'NA','Paseo de la Chopera', 'Alcobendas'),
('45456546W','6','22','NA','NA','Avenida de America','Madrid');
