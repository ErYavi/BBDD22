UPDATE coche 
SET 
    capacidad = (capacidad + capacidad * 0.1)
WHERE
    matricula IN (SELECT 
            matricula
        FROM
            Reparto
        WHERE
            matricula NOT IN (SELECT 
                    Reparto.Matricula
                FROM
                    paquete
                        JOIN
                    reparto
                WHERE
                    reparto.ID_reparto = paquete.ID_reparto))
