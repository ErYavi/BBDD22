DELIMITER $$
CREATE TRIGGER BDD4A	
BEFORE INSERT ON paquete
FOR EACH ROW
BEGIN
	IF (NEW.PQ  NOT LIKE = 'PQ__________' )
		THEN SIGNAL SQLSTATE '02000'
		SET MESSAGE_TEXT = 'Error: el ID del paquete ha de empezar por "PQ"';
	END IF;
	ELSEIF(NEW.PQ NOT LIKE = '__[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]')
		THEN SIGNAL SQLSTATE '02000'
		SET MESSAGE_TEXT = 'Error: el ID del paquete ha de ser "PQ" seguido de 10 digitos';
	END IF;
	ELSEIF(NEW.Dimensiones NOT LIKE = '[5-25]X[5-25]')
		THEN SIGNAL SQLSTATE '02000'
		SET MESSAGE_TEXT = 'Error: Las medidas no estan dentro del limite comprendido(5x5-25x25)';
	END IF;
	ELSE IF(NEW.Peso > 100 || NEW.Peso < 1)
		THEN SIGNAL SQLSTATE '02000'
		SET MESSAGE_TEXT = 'Error: el peso no esta dentro del limite comprendido(1-100)';
	END IF;
END 
DELIMITER $$
