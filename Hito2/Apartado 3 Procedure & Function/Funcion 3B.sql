DELIMITER $$
CREATE DEFINER = 'root'@'%' FUNCTION funcion_b(reparto VARCHAR(9))
RETURNS VARCHAR(11)
DETERMINISTIC
BEGIN
	DECLARE mejor, actual INT;
    DECLARE done INT DEFAULT FALSE;
    DECLARE b VARCHAR(11);
	DECLARE ruta_optima VARCHAR(11);
	DECLARE cur1 CURSOR FOR SELECT Id_ruta DATA FROM Ruta_Incluye_Seg;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;
    SET mejor = 0;
		OPEN cur1;
        bucle : LOOP
        FETCH cur1 INTO b;
         SELECT COUNT(*) INTO actual
		 FROM Ruta_Incluye_Seg
		 WHERE ID_Ruta = b AND ID_seg IN (SELECT DISTINCT Segmento.ID_seg
											   FROM Segmento
                                               WHERE Segmento.Ncalle IN (SELECT Usuario_Gen.Ncalle 
																		 FROM Usuario_Gen
																		 WHERE Usuario_Gen.ID_Gen IN (SELECT Carta.ID_Receptor
																								  FROM Carta
																								  WHERE Carta.ID_Reparto = reparto))
											   OR Segmento.Ncalle IN (SELECT Usuario_Gen.Ncalle 
																	  FROM Usuario_Gen
																	  WHERE Usuario_Gen.ID_Gen IN (SELECT Paquete.ID_Receptor
																								   FROM Paquete
																								   WHERE Paquete.ID_Reparto = reparto))
											   OR Segmento.Ncalle IN (SELECT Usuario_Gen.Ncalle 
																	  FROM Usuario_Gen
																	  WHERE Usuario_Gen.ID_Gen IN (SELECT Certificada.DNI_Receptor
																								   FROM Certificada
																								   WHERE Certificada.ID_Reparto = reparto)));
		  IF actual < mejor THEN
		  SET ruta_optima = b;
		  SET mejor = actual;
		  END IF;		
        IF done THEN
			LEAVE bucle;
		END IF;
		END LOOP;
    CLOSE cur1;
    RETURN(ruta_optima);
END$$