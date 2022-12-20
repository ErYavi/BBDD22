package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table (name = "Area_envio")
public class Area_envio {

    @Id
    @Column (name = "Id_area",nullable = false)
    private String Id_Area;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Oficina")
    private Oficina oficina;

    public Area_envio(String id_Area, Oficina oficina) {
        Id_Area = id_Area;
        this.oficina = oficina;
    }

    public String getId_Area() {
        return Id_Area;
    }

    public Oficina getOficina() {
        return oficina;
    }
}
