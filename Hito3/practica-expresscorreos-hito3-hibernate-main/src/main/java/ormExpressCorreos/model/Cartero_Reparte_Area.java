package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table (name = "Cartero_Reparte_Area")
public class Cartero_Reparte_Area {

    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "Area")
    private Area_envio area_envio;

    @ManyToMany
    @JoinColumn(name = "Cartero")
    private Cartero cartero;

    public Cartero_Reparte_Area(Area_envio area_envio, Cartero cartero) {
        this.area_envio = area_envio;
        this.cartero = cartero;
    }

    public Area_envio getArea_envio() {
        return area_envio;
    }

    public Cartero getCartero() {
        return cartero;
    }
}
