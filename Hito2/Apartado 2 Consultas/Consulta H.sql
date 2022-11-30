SELECT 
    ID_Area
FROM
    area_envio
WHERE
    Cod_O IN (SELECT 
            Cod_O
        FROM
            (SELECT 
                COUNT(DISTINCT jornada) AS Njornadas, Cod_O
            FROM
                trabajo
            GROUP BY (Cod_O)) AS totales
        WHERE
            totales.Njornadas >= ALL (SELECT 
                    COUNT(DISTINCT jornada)
                FROM
                    trabajo))