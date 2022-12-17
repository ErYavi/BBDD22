package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table (name = "Coche")
public class Coche {

    @Id
    @Column (name = "Matricula",nullable = false)
    private String matricula;

    @Column (name = "Capacidad",nullable = false)
    private float capacidad;

    @Column (name = "Cod_O",nullable = false)
    private String Cod_O;

    public Coche(String matricula, float capacidad, String cod_O) {
        this.matricula = matricula;
        this.capacidad = capacidad;
        Cod_O = cod_O;
    }

    public String getMatricula() {
        return matricula;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public String getCod_O() {
        return Cod_O;
    }
}
