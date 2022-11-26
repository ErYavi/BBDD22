SELECT Nom_C, Apellidos_C, Matricula as Coche, Peso as 'Peso del paquete (kg)'
FROM cartero JOIN reparto ON cartero.DNI_Car = reparto.DNI_Car JOIN paquete ON paquete.ID_Reparto = reparto.ID_Reparto
WHERE paquete.pq IN (
						SELECT pq
						FROM paquete 
						WHERE peso IN (SELECT MIN(peso) FROM paquete)
					)