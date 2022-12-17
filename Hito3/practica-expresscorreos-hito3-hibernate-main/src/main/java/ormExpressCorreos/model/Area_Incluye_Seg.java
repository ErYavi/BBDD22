package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table (name = "Area_Incluye_Seg")
public class Area_Incluye_Seg {


    @Id
    @Column (name = "ID_Area",nullable = false)
    private String ID_Area;

    @Id
    @Column (name = "ID_seg",nullable = false)
    private String ID_Seg;

    @Column (name = "nMunicipio",nullable = false)
    private  String nMunicipio;

    @Column (name = "nCalle",nullable = false)
    private String nCalle;

    public Area_Incluye_Seg(String ID_Area, String ID_Seg, String nMunicipio, String nCalle) {
        this.ID_Area = ID_Area;
        this.ID_Seg = ID_Seg;
        this.nMunicipio = nMunicipio;
        this.nCalle = nCalle;
    }

    public String getID_Area() {
        return ID_Area;
    }

    public String getID_Seg() {
        return ID_Seg;
    }

    public String getnMunicipio() {
        return nMunicipio;
    }

    public String getnCalle() {
        return nCalle;
    }
}
