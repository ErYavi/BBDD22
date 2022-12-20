package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table (name = "Cartero_Reparte_Area")
public class Cartero_Reparte_Area {

    @Id
    @Column (name = "Id_Area",nullable = false)
    private String Id_Area;

    @ManyToMany
    @JoinColumn(name = "Cartero")
    private Cartero cartero;

    public Cartero_Reparte_Area(String id_Area, Cartero cartero) {
        Id_Area = id_Area;
        this.cartero = cartero;
    }

    public String getId_Area() {
        return Id_Area;
    }

    public Cartero getCartero() {
        return cartero;
    }
}
