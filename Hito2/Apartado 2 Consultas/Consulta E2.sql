SELECT 
    SUM(peso), MAX(urgencia)
FROM
    paquete
        JOIN
    reparto ON paquete.ID_Reparto = reparto.ID_Reparto
        JOIN
    certificada ON certificada.ID_Reparto = reparto.ID_Reparto
WHERE
    reparto.FechaR BETWEEN DATE_ADD(NOW(), INTERVAL - 7 DAY) AND NOW()
        AND reparto.Matricula IN (SELECT 
            Matricula
        FROM
            coche
        WHERE
            Cod_O = 'OF-MAD-01')