USE Correos;

SELECT id_ruta FROM Ruta
WHERE NOT EXISTS (
					SELECT * FROM Segmento
                    WHERE Ncalle='Avenida de America' AND NMunicipio='Alcorcon' AND NOT EXISTS(
                    SELECT * FROM Ruta_Incluye_Seg
                    WHERE Ruta.Id_ruta=Ruta_Incluye_Seg.Id_ruta
                    AND Ruta_Incluye_Seg.Id_Seg=Segmento.Id_Seg)
                    
				)
AND Id_ruta IN(
				SELECT Id_Ruta From Reparto
                GROUP BY ID_Ruta Having COUNT(DISTINCT Id_reparto)>3);