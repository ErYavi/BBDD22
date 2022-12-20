package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table
public class Centro_C {

    @Id
    @Column(nullable = false)
    private String Cod_CC;

    @Column(nullable = false)
    private String NombreCC;

    @Column(nullable = false)
    private Integer Max_ct;

    @Column(nullable = false)
    private Integer Max_pq;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Municipio")
    private Municipio municipio;

    public Centro_C(String cod_CC, String nombreCC, Integer max_ct, Integer max_pq, Municipio municipio) {
        Cod_CC = cod_CC;
        NombreCC = nombreCC;
        Max_ct = max_ct;
        Max_pq = max_pq;
        this.municipio = municipio;
    }

    public String getCod_CC() {
        return Cod_CC;
    }

    public String getNombreCC() {
        return NombreCC;
    }

    public Integer getMax_ct() {
        return Max_ct;
    }

    public Integer getMax_pq() {
        return Max_pq;
    }

    public Municipio getMunicipio() {
        return municipio;
    }
}
