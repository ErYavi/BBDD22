SELECT 
    DNI_Car, Cod_O, COUNT(ID_Reparto) AS numero_repartos
FROM
    reparto
        JOIN
    coche ON reparto.Matricula = coche.Matricula
GROUP BY Cod_O , DNI_Car
ORDER BY numero_repartos DESC






