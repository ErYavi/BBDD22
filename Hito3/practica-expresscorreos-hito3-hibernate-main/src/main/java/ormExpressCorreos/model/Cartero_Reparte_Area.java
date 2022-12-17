package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table (name = "Cartero_Reparte_Area")
public class Cartero_Reparte_Area {

    @Id
    @Column (name = "Id_Area",nullable = false)
    private String Id_Area;

    @Id
    @Column (name = "DNI_Car",nullable = false)
    private String DNI_Car;

    public Cartero_Reparte_Area(String id_Area, String DNI_Car) {
        Id_Area = id_Area;
        this.DNI_Car = DNI_Car;
    }

    public String getId_Area() {
        return Id_Area;
    }

    public String getDNI_Car() {
        return DNI_Car;
    }
}
