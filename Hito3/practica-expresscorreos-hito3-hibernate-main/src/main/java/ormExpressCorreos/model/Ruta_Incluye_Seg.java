package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table
public class Ruta_Incluye_Seg {

    @Column(nullable = false)
    private Integer Norden;

    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "Segmento")
    private Segmento segmento;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Municipio")
    private Municipio municipio;

    @ManyToMany
    @JoinColumn(name = "Calle")
    private Calle calle;

    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "Ruta")
    private Ruta ruta;

    public Ruta_Incluye_Seg(Integer norden, Segmento segmento, Municipio municipio, Calle calle, Ruta ruta) {
        Norden = norden;
        this.segmento = segmento;
        this.municipio = municipio;
        this.calle = calle;
        this.ruta = ruta;
    }

    public Integer getNorden() {
        return Norden;
    }


    public Municipio getMunicipio() {
        return municipio;
    }

    public Calle getCalle() {
        return calle;
    }

    public Segmento getSegmento() {
        return segmento;
    }

    public Ruta getRuta() {
        return ruta;
    }
}
