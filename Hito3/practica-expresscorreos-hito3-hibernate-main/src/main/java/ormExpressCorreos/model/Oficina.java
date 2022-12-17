package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table (name = "Oficina")
public class Oficina {

    @Id
    @Column (name = "Cod_0",nullable = false)
    private String Cod_O;

    @Column (name = "nMunicipio",nullable = false)
    private String nMunicipio;

    @Column (name = "Cod_CC",nullable = false)
    private String Cod_CC;

    public Oficina(String cod_O, String nMunicipio, String cod_CC) {
        Cod_O = cod_O;
        this.nMunicipio = nMunicipio;
        Cod_CC = cod_CC;
    }

    public String getCod_O() {
        return Cod_O;
    }

    public String getnMunicipio() {
        return nMunicipio;
    }

    public String getCod_CC() {
        return Cod_CC;
    }
}
