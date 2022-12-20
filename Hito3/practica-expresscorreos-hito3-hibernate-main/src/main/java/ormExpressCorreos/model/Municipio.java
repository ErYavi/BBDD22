package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table
public class Municipio {

     @Id
     @Column(nullable = false)
    private String nMunicipio;

    @ManyToOne
    @JoinColumn(name = "Provincia")
    private Provincia provincia;

    public Municipio(String nMunicipio, Provincia provincia) {
        this.nMunicipio = nMunicipio;
        this.provincia = provincia;
    }

    public String getnMunicipio() {
        return nMunicipio;
    }

    public Provincia getProvincia() {
        return provincia;
    }
}
