package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table (name = "Area_Incluye_Area")
public class Area_Incluye_Area {

    @Id
    @Column (name = "Id_Padre",nullable = false)
    private String ID_Padre;

    @Id
    @Column (name = "ID_hijo",nullable = false)
    private String ID_hijo;

    public Area_Incluye_Area(String ID_Padre, String ID_hijo) {
        this.ID_Padre = ID_Padre;
        this.ID_hijo = ID_hijo;
    }

    public String getID_Padre() {
        return ID_Padre;
    }

    public String getID_hijo() {
        return ID_hijo;
    }
}
