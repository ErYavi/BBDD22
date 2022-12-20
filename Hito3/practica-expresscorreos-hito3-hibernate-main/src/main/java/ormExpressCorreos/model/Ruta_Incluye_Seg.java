package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table
public class Ruta_Incluye_Seg {

    @Column(nullable = false)
    private Integer Norden;

    @Id
    @Column(nullable = false)
    private String Id_Seg;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Municipio")
    private Municipio municipio;

    @ManyToMany
    @JoinColumn(name = "Calle")
    private Calle calle;

    @Id
    @Column(nullable = false)
    private String Id_Ruta;

    public Ruta_Incluye_Seg(Integer norden, String id_Seg, Municipio municipio, Calle calle, String id_Ruta) {
        Norden = norden;
        Id_Seg = id_Seg;
        this.municipio = municipio;
        this.calle = calle;
        Id_Ruta = id_Ruta;
    }

    public Integer getNorden() {
        return Norden;
    }

    public String getId_Seg() {
        return Id_Seg;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public Calle getCalle() {
        return calle;
    }

    public String getId_Ruta() {
        return Id_Ruta;
    }
}
