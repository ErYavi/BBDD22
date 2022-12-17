package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table
public class Segmento {

    @Column(nullable = false)
    private Integer N_ini;

    @Column(nullable = false)
    private Integer N_fin;

    @Id
    @Column(nullable = false)
    private String Id_Seg;

    @Column(nullable = false)
    private String nMunicipio;

    @Column(nullable = false)
    private String nCalle;

    public Segmento(Integer n_ini, Integer n_fin, String id_Seg, String nMunicipio, String nCalle) {
        N_ini = n_ini;
        N_fin = n_fin;
        Id_Seg = id_Seg;
        this.nMunicipio = nMunicipio;
        this.nCalle = nCalle;
    }

    public Integer getN_ini() {
        return N_ini;
    }

    public Integer getN_fin() {
        return N_fin;
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
}
