package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table (name = "Area_Incluye_Seg")
public class Area_Incluye_Seg {


    @Id
    @Column (name = "ID_Area",nullable = false)
    private String ID_Area;

    @ManyToOne(optional = false)
    @JoinColumn (name = "Segmento")
    private Segmento segmento;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Municipio")
    private Municipio municipio;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Calle")
    private Calle calle;

    public Area_Incluye_Seg(String ID_Area, Segmento segmento, Municipio municipio, Calle calle) {
        this.ID_Area = ID_Area;
        this.segmento = segmento;
        this.municipio = municipio;
        this.calle = calle;
    }

    public String getID_Area() {
        return ID_Area;
    }

    public Segmento getSegmento() {
        return segmento;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public Calle getCalle() {
        return calle;
    }
}
