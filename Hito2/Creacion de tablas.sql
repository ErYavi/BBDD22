DROP SCHEMA IF EXISTS Correos;

CREATE SCHEMA Correos
DEFAULT CHARACTER SET utf8
COLLATE utf8_spanish2_ci;

USE Correos;

CREATE TABLE Cartero
(
  DNI_Car VARCHAR(9) NOT NULL,
  Nom_C VARCHAR(20) NOT NULL,
  Apellidos_C VARCHAR(30) NOT NULL,
  PRIMARY KEY (DNI_Car)
);

CREATE TABLE Ruta
(
  ID_Ruta VARCHAR(9) NOT NULL,
  PRIMARY KEY (ID_Ruta)
);

CREATE TABLE Turno
(
  Jornada VARCHAR(30) NOT NULL,
  Horario VARCHAR(30) NOT NULL,
  PRIMARY KEY (Jornada)
);

CREATE TABLE Provincia
(
  NProvincia VARCHAR(20) NOT NULL,
  PRIMARY KEY (NProvincia)
);

CREATE TABLE Municipio
(
  NMunicipio VARCHAR(40) NOT NULL,
  NProvincia VARCHAR(20) NOT NULL,
  PRIMARY KEY (NMunicipio),
  FOREIGN KEY (NProvincia) REFERENCES Provincia(NProvincia)
);

CREATE TABLE Calle
(
  NCalle VARCHAR(40) NOT NULL,
  NMunicipio VARCHAR(40) NOT NULL,
  PRIMARY KEY (NCalle),
  FOREIGN KEY (NMunicipio) REFERENCES Municipio(NMunicipio)
);

CREATE TABLE Direccion
(
  Numero INT NOT NULL,
  Piso INT NOT NULL,
  Letra INT NOT NULL,
  Portal INT NOT NULL,
  NCalle VARCHAR(40) NOT NULL,
  PRIMARY KEY (Numero, Piso, Letra, Portal),
  FOREIGN KEY (NCalle) REFERENCES Calle(NCalle),
  UNIQUE (Numero, Piso, Letra, Portal)
);

CREATE TABLE Centro_C
(
  Cod_CC VARCHAR(9) NOT NULL,
  NombreCC VARCHAR(20) NOT NULL,
  Max_pq INT NOT NULL,
  Max_ct INT NOT NULL,
  NMunicipio VARCHAR(40) NOT NULL,
  PRIMARY KEY (Cod_CC),
  FOREIGN KEY (NMunicipio) REFERENCES Municipio(NMunicipio)
);

CREATE TABLE Segmento
(
  N_ini INT NOT NULL,
  N_fin INT NOT NULL,
  ID_Seg VARCHAR(9) NOT NULL,
  NCalle VARCHAR(40) NOT NULL,
  PRIMARY KEY (ID_Seg),
  FOREIGN KEY (NCalle) REFERENCES Calle(NCalle)
);

CREATE TABLE Usuario_Gen
(
  ID_Gen INT NOT NULL,
  Nom_Gen VARCHAR(20) NOT NULL,
  Apellidos_Gen VARCHAR(30) NOT NULL,
  Numero INT NOT NULL,
  Piso INT NOT NULL,
  Letra INT NOT NULL,
  Portal INT NOT NULL,
  PRIMARY KEY (ID_Gen),
  FOREIGN KEY (Numero, Piso, Letra, Portal) REFERENCES Direccion(Numero, Piso, Letra, Portal)
);

CREATE TABLE Ruta_Incuye_Seg
(
  NOrden INT NOT NULL,
  ID_Seg VARCHAR(9) NOT NULL,
  ID_Ruta VARCHAR(9) NOT NULL,
  PRIMARY KEY (ID_Seg, ID_Ruta),
  FOREIGN KEY (ID_Seg) REFERENCES Segmento(ID_Seg),
  FOREIGN KEY (ID_Ruta) REFERENCES Ruta(ID_Ruta),
  UNIQUE (ID_Seg, ID_Ruta)
);

CREATE TABLE Oficina
(
  Cod_O VARCHAR(9) NOT NULL,
  NMunicipio VARCHAR(40) NOT NULL,
  Cod_CC VARCHAR(9) NOT NULL,
  PRIMARY KEY (Cod_O),
  FOREIGN KEY (NMunicipio) REFERENCES Municipio(NMunicipio),
  FOREIGN KEY (Cod_CC) REFERENCES Centro_C(Cod_CC)
);

CREATE TABLE Coche
(
  Capacidad INT NOT NULL,
  Matricula VARCHAR(7) NOT NULL,
  Cod_O VARCHAR(9) NOT NULL,
  PRIMARY KEY (Matricula),
  FOREIGN KEY (Cod_O) REFERENCES Oficina(Cod_O)
);

CREATE TABLE Reparto
(
  FechaR DATE NOT NULL,
  ID_Reparto VARCHAR(9) NOT NULL,
  DNI VARCHAR(9) NOT NULL,
  ID_Ruta VARCHAR(9) NOT NULL,
  Matricula VARCHAR(7) NOT NULL,
  PRIMARY KEY (ID_Reparto),
  FOREIGN KEY (DNI) REFERENCES Cartero(DNI_Car),
  FOREIGN KEY (ID_Ruta) REFERENCES Ruta(ID_Ruta),
  FOREIGN KEY (Matricula) REFERENCES Coche(Matricula)
);

CREATE TABLE Area_envio
(
  ID_Area VARCHAR(9) NOT NULL,
  Cod_O VARCHAR(9) NOT NULL,
  PRIMARY KEY (ID_Area),
  FOREIGN KEY (Cod_O) REFERENCES Oficina(Cod_O)
);

CREATE TABLE Trabajo
(
  Fecha_ini DATE NOT NULL,
  Jornada VARCHAR(30) NOT NULL,
  Cod_O VARCHAR(9) NOT NULL,
  DNI_Car VARCHAR(9) NOT NULL,
  PRIMARY KEY (Jornada, Cod_O, DNI_Car),
  FOREIGN KEY (Jornada) REFERENCES Turno(Jornada),
  FOREIGN KEY (Cod_O) REFERENCES Oficina(Cod_O),
  FOREIGN KEY (DNI_Car) REFERENCES Cartero(DNI_Car)
);

CREATE TABLE Area_Incluye_Seg
(
  ID_Area VARCHAR(9) NOT NULL,
  ID_Seg VARCHAR(9) NOT NULL,
  PRIMARY KEY (ID_Area, ID_Seg),
  FOREIGN KEY (ID_Area) REFERENCES Area_envio(ID_Area),
  FOREIGN KEY (ID_Seg) REFERENCES Segmento(ID_Seg)
);

CREATE TABLE Area_Incluye_Area
(
  ID_Padre VARCHAR(9) NOT NULL,
  ID_Hijo VARCHAR(9) NOT NULL,
  PRIMARY KEY (ID_Padre, ID_Hijo),
  FOREIGN KEY (ID_Padre) REFERENCES Area_envio(ID_Area),
  FOREIGN KEY (ID_Hijo) REFERENCES Area_envio(ID_Area)
);

CREATE TABLE Cartero_Reparte_Area
(
  ID_Area VARCHAR(9) NOT NULL,
  DNI_Car VARCHAR(9) NOT NULL,
  PRIMARY KEY (ID_Area, DNI_Car),
  FOREIGN KEY (ID_Area) REFERENCES Area_envio(ID_Area),
  FOREIGN KEY (DNI_Car) REFERENCES Cartero(DNI_Car)
);

CREATE TABLE Carta
(
  CT VARCHAR (12) NOT NULL,
  Formato VARCHAR(2) NOT NULL,
  DNI_Car VARCHAR(9) NOT NULL,
  ID_Emisor INT NOT NULL,
  ID_Receptor INT NOT NULL,
  ID_Reparto VARCHAR(9) NOT NULL,
  PRIMARY KEY (CT),
  FOREIGN KEY (DNI_Car) REFERENCES Cartero(DNI_Car),
  FOREIGN KEY (ID_Emisor) REFERENCES Usuario_Gen(ID_Gen),
  FOREIGN KEY (ID_Receptor) REFERENCES Usuario_Gen(ID_Gen),
  FOREIGN KEY (ID_Reparto) REFERENCES Reparto(ID_Reparto)
);

CREATE TABLE Usuario_Iden
(
  eMail VARCHAR(20) NOT NULL,
  Apellidos_Iden VARCHAR(20) NOT NULL,
  DNI_Usuario VARCHAR(9) NOT NULL,
  Nom_Iden VARCHAR(20) NOT NULL,
  DNI_Autorizado VARCHAR(9) NOT NULL,
  PRIMARY KEY (DNI_Usuario),
  FOREIGN KEY (DNI_Autorizado) REFERENCES Usuario_Iden(DNI_Usuario)
);

CREATE TABLE Recogida
(
  ID_Rec VARCHAR(9) NOT NULL,
  Fecha_Rec DATE NOT NULL,
  Numero INT NOT NULL,
  Piso INT NOT NULL,
  Letra INT NOT NULL,
  Portal INT NOT NULL,
  DNI_Usuario VARCHAR(9) NOT NULL,
  DNI_Car VARCHAR(9) NOT NULL,
  PRIMARY KEY (ID_Rec),
  FOREIGN KEY (Numero, Piso, Letra, Portal) REFERENCES Direccion(Numero, Piso, Letra, Portal),
  FOREIGN KEY (DNI_Usuario) REFERENCES Usuario_Iden(DNI_Usuario),
  FOREIGN KEY (DNI_Car) REFERENCES Cartero(DNI_Car)
);

CREATE TABLE Paquete
(
  PQ VARCHAR (12) NOT NULL,
  Dimensiones VARCHAR(20) NOT NULL,
  Peso FLOAT NOT NULL,
  ID_Rec VARCHAR(9),
  ID_Emisor INT NOT NULL,
  ID_Receptor INT NOT NULL,
  DNI_Car VARCHAR(9) NOT NULL,
  ID_Reparto VARCHAR(9) NOT NULL,
  PRIMARY KEY (PQ),
  FOREIGN KEY (ID_Rec) REFERENCES Recogida(ID_Rec),
  FOREIGN KEY (ID_Emisor) REFERENCES Usuario_Gen(ID_Gen),
  FOREIGN KEY (ID_Receptor) REFERENCES Usuario_Gen(ID_Gen),
  FOREIGN KEY (DNI_Car) REFERENCES Cartero(DNI_Car),
  FOREIGN KEY (ID_Reparto) REFERENCES Reparto(ID_Reparto)
);

CREATE TABLE Certificada
(
  CE VARCHAR (12) NOT NULL,
  Urgencia VARCHAR(10) NOT NULL,
  DNI_Emisor VARCHAR(9) NOT NULL,
  DNI_Receptor VARCHAR(9) NOT NULL,
  DNI_Car VARCHAR(9) NOT NULL,
  ID_Reparto VARCHAR(9) NOT NULL,
  PRIMARY KEY (CE),
  FOREIGN KEY (DNI_Emisor) REFERENCES Usuario_Iden(DNI_Usuario),
  FOREIGN KEY (DNI_Receptor) REFERENCES Usuario_Iden(DNI_Usuario),
  FOREIGN KEY (DNI_Car) REFERENCES Cartero(DNI_Car),
  FOREIGN KEY (ID_Reparto) REFERENCES Reparto(ID_Reparto)
);

CREATE TABLE Entrega_Cert
(
  Hora TIME NOT NULL,
  Fecha DATE NOT NULL,
  DNI_Usuario VARCHAR(9) NOT NULL,
  CE VARCHAR (12) NOT NULL,
  DNI_Car VARCHAR(9) NOT NULL,
  PRIMARY KEY (DNI_Usuario, CE, DNI_Car),
  FOREIGN KEY (DNI_Usuario) REFERENCES Usuario_Iden(DNI_Usuario),
  FOREIGN KEY (CE) REFERENCES Certificada(CE),
  FOREIGN KEY (DNI_Car) REFERENCES Cartero(DNI_Car)
);

CREATE TABLE Iden_Vive_Dir
(
  DNI_Usuario VARCHAR(9) NOT NULL,
  Numero INT NOT NULL,
  Piso INT NOT NULL,
  Letra INT NOT NULL,
  Portal INT NOT NULL,
  PRIMARY KEY (DNI_Usuario, Numero, Piso, Letra, Portal),
  FOREIGN KEY (DNI_Usuario) REFERENCES Usuario_Iden(DNI_Usuario),
  FOREIGN KEY (Numero, Piso, Letra, Portal) REFERENCES Direccion(Numero, Piso, Letra, Portal)
);