package ormExpressCorreos.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table (name = "Area_envio")
public class Area_envio {

    @Id
    @Column (name = "Id_area",nullable = false,unique = true)
    private String Id_Area;

    public Area_envio(String id_Area) {
        Id_Area = id_Area;
    }

    public String getId_Area() {
        return Id_Area;
    }

    public void setId_Area(String id_Area) {
        Id_Area = id_Area;
    }

    @OneToMany(mappedBy = "Area_Incluye_Seg")
    private Set<Segmento> segmento;

    @ManyToMany()
    @JoinColumn(name = "Cartero_Reparte_Area")
    private Set<Cartero> cartero;

    @ManyToOne
    @JoinColumn(name = "Area_Incluye_Area")
    private Area_envio area_envio;
    @OneToMany(mappedBy = "Area_Inluye_Area")
    private Set<Area_envio> area_envios;

    @ManyToOne
    @JoinColumn(name = "Area_Incluye_Oficina")
    private Oficina oficina;
}
