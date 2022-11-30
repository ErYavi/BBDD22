SELECT 
    Cartero.Nom_C, Cartero.Apellidos_C
FROM
    Cartero
WHERE
    Cartero.DNI_Car NOT IN (SELECT DISTINCT
            Recogida.DNI_Car
        FROM
            Recogida
        GROUP BY Recogida.DNI_Car , Recogida.Numero , Recogida.Piso , Recogida.Letra , Recogida.Portal , Recogida.NCalle , Recogida.NMunicipio
        HAVING COUNT(*) > 1)