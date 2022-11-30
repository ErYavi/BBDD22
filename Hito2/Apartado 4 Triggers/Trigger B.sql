DELIMITER $$
CREATE TRIGGER ComprobarlPaq AFTER INSERT ON Paquete
FOR EACH ROW
BEGIN

DECLARE pesoPaq INTEGER DEFAULT 0; -- Meter siempre en integer
DECLARE OficinaCod VARCHAR(15);
DECLARE CarteroDisponible VARCHAR(9);
DECLARE cont INTEGER DEFAULT 0;

SELECT 
    SUM(Paquete.Peso)
INTO pesoPaq FROM
    Paquetes
WHERE
    Paquete.IdReparto = NEW.IdReparto;


SELECT 
    Oficina.CodOficina
INTO OficinaCod FROM
    Oficina
        INNER JOIN
    Coche ON Oficina.CodOficina = Coche.CodOficina
WHERE
    Coche.Matricula = NEW.Matricula;

SELECT 
    Cartero.DNI
INTO cont FROM
    Cartero
        INNER JOIN
    Trabaja ON Cartero.DNI = Trabaja.DNIcartero
WHERE
    Trabaja.CodOficina = OficinaCod
        AND Cartero.DNI NOT IN (SELECT 
            Reparto.DNIcartero
        FROM
            Reparto
        WHERE
            FechaCreacion = CURRENT_TIMESTAMP());

SELECT COUNT(CarteroDisponible) INTO cont; -- Me dice si hay un cartero disponible o no (0 o 1)

IF (cont = 1 AND pesoPaq > 500) THEN 
SET Reparto.DNICartero = CarteroDisponible;
END IF;

END$$
DELIMITER ;