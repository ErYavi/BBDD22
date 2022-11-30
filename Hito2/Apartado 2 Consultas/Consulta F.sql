SELECT DISTINCT
    reparto.Matricula,
    coche.capacidad + (coche.capacidad / 10) AS capacidad_actualizada
FROM
    reparto
        JOIN
    carta ON carta.ID_reparto = reparto.ID_reparto
        JOIN
    coche ON reparto.Matricula = coche.Matricula
        JOIN
    paquete
HAVING reparto.Matricula NOT IN (SELECT 
        reparto.Matricula
    FROM
        paquete
            JOIN
        reparto
    WHERE
        reparto.ID_reparto = paquete.ID_reparto)






