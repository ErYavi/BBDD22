package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table
public class Municipio {

     @Id
     @Column(nullable = false)
    private String nMunicipio;

    @Column(nullable = false)
    private String nProvincia;

    public Municipio(String nMunicipio, String nProvincia) {
        this.nMunicipio = nMunicipio;
        this.nProvincia = nProvincia;
    }

    public String getnMunicipio() {
        return nMunicipio;
    }

    public String getnProvincia() {
        return nProvincia;
    }
}
