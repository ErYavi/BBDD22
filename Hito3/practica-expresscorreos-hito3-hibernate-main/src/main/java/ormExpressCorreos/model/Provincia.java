package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table
public class Provincia {

    @Id
    @Column(nullable = false)
    private String nProvincia;

    public Provincia(String nProvincia) {
        this.nProvincia = nProvincia;
    }

    public String getnProvincia() {
        return nProvincia;
    }
}
