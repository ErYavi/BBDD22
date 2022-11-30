SELECT 
    Oficina.Cod_O AS 'Oficina'
FROM
    Oficina
        INNER JOIN
    Segmento ON Ncalle LIKE '%Paseo de%'
        INNER JOIN
    Area_Incluye_Seg ON Area_Incluye_Seg.ID_Seg = Segmento.Id_Seg
        INNER JOIN
    Area_envio ON Area_envio.Id_Area = Area_Incluye_Seg.Id_area
        AND Oficina.COd_O = Area_envio.Cod_O
        AND Oficina.NMunicipio = 'Alcobendas';
