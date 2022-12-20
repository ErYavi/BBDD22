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

    @ManyToOne(optional = false)
    @JoinColumn(name = "Municipio")
    private Municipio municipio;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Calle")
    private Calle calle;

    public Segmento(Integer n_ini, Integer n_fin, String id_Seg, Municipio municipio, Calle calle) {
        N_ini = n_ini;
        N_fin = n_fin;
        Id_Seg = id_Seg;
        this.municipio = municipio;
        this.calle = calle;
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

    public Municipio getMunicipio() {
        return municipio;
    }

    public Calle getCalle() {
        return calle;
    }
}
