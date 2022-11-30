SELECT 
    SUM(peso) AS 'peso total', MAX(urgencia)
FROM
    Paquete
        JOIN
    Reparto ON Paquete.ID_Reparto = Reparto.ID_Reparto
        JOIN
    Certificada ON Paquete.ID_Reparto = Certificada.ID_Reparto
        JOIN
    Coche ON Reparto.Matricula = Coche.Matricula
WHERE
    Coche.Cod_O = 'OF-MAD-01'
        AND FechaR BETWEEN DATE_ADD(NOW(), INTERVAL - 7 DAY) AND NOW()