package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table
public class Ruta {

    @Id
    @Column(nullable = false)
    private String Id_Ruta;

    public Ruta(String id_Ruta) {
        Id_Ruta = id_Ruta;
    }

    public String getId_Ruta() {
        return Id_Ruta;
    }
}
