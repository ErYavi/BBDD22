SELECT 
    Usuario_Gen.Nom_Gen,
    Usuario_Gen.Apellidos_Gen,
    Usuario_Gen.NMunicipio,
    Usuario_Gen.Ncalle,
    Usuario_Gen.Numero,
    Usuario_Gen.Portal,
    Usuario_Gen.Piso,
    Usuario_Gen.Letra
FROM
    Usuario_Gen
        JOIN
    Carta ON Usuario_Gen.ID_Gen = Carta.ID_Emisor
        JOIN
    Reparto ON Carta.ID_reparto = Reparto.ID_Reparto
        JOIN
    Ruta_Incluye_Seg ON Ruta_Incluye_Seg.ID_ruta = Reparto.ID_ruta
        JOIN
    Area_Incluye_Seg ON Ruta_Incluye_Seg.Id_seg = Area_Incluye_Seg.Id_seg
WHERE
    Area_Incluye_Seg.ID_area = 'AR-MAD-03' 
UNION SELECT 
    Usuario_Iden.Nom_Iden,
    Usuario_Iden.Apellidos_Iden,
    Iden_Vive_Dir.NMunicipio,
    Iden_Vive_Dir.Ncalle,
    Iden_Vive_Dir.Numero,
    Iden_Vive_Dir.Portal,
    Iden_Vive_Dir.Piso,
    Iden_Vive_Dir.Letra
FROM
    Usuario_Iden
        JOIN
    Iden_Vive_Dir ON Iden_Vive_Dir.DNI_Usuario = Usuario_Iden.DNI_Usuario
        JOIN
    Certificada ON Usuario_Iden.DNI_Usuario = Certificada.DNI_Emisor
        JOIN
    Reparto ON Certificada.ID_reparto = Reparto.ID_Reparto
        JOIN
    Ruta_Incluye_Seg ON Ruta_Incluye_Seg.ID_ruta = Reparto.ID_ruta
        JOIN
    Area_Incluye_Seg ON Ruta_Incluye_Seg.Id_seg = Area_Incluye_Seg.Id_seg
WHERE
    Area_Incluye_Seg.ID_area = 'AR-MAD-03'