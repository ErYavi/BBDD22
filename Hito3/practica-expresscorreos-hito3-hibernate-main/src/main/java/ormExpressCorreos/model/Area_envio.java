package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table (name = "Area_envio")
public class Area_envio {

    @Id
    @Column (name = "Id_area",nullable = false)
    private String Id_Area;

    @Column (name = "Cod_O",nullable = false)
    private String Cod_O;

    public Area_envio(String id_Area, String cod_O) {
        Id_Area = id_Area;
        Cod_O = cod_O;
    }

    public String getId_Area() {
        return Id_Area;
    }

    public String getCod_O() {
        return Cod_O;
    }
}
