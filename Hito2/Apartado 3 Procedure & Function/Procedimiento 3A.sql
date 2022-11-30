DELIMITER $$
CREATE PROCEDURE getUsuarios( IN Certificada varchar(12))
BEGIN
	SELECT CONCAT( DNI_Receptor,'#',DNI_Autorizado)
    FROM Certificada
    JOIN Autorizacion  WHERE CE=Certificada AND Autorizacion.DNI_Autoriza=Certificada.DNI_Receptor;
END $$
DELIMITER #

CALL getUsuarios('CE9369559254');

