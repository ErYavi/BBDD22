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

    @Column(nullable = false)
    private String nMunicipio;

    @Column(nullable = false)
    private String nCalle;

    @Id
    @Column(nullable = false)
    private String Id_Ruta;

    public Ruta_Incluye_Seg(Integer norden, String id_Seg, String nMunicipio, String nCalle, String id_Ruta) {
        Norden = norden;
        Id_Seg = id_Seg;
        this.nMunicipio = nMunicipio;
        this.nCalle = nCalle;
        Id_Ruta = id_Ruta;
    }

    public Integer getNorden() {
        return Norden;
    }

    public String getId_Seg() {
        return Id_Seg;
    }

    public String getnMunicipio() {
        return nMunicipio;
    }

    public String getnCalle() {
        return nCalle;
    }

    public String getId_Ruta() {
        return Id_Ruta;
    }
}
