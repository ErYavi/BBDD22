package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table (name = "Oficina")
public class Oficina {

    @Id
    @Column (name = "Cod_0",nullable = false)
    private String Cod_O;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Municipio")
    private Municipio municipio;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Centro_C")
    private Centro_C centro_c;

    public Oficina(String cod_O, Municipio municipio, Centro_C centro_c) {
        Cod_O = cod_O;
        this.municipio = municipio;
        this.centro_c = centro_c;
    }

    public String getCod_O() {
        return Cod_O;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public Centro_C getCentro_c() {
        return centro_c;
    }
}
