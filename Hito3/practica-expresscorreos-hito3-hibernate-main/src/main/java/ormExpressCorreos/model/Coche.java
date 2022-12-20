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

    @ManyToOne(optional = false)
    @JoinColumn(name = "Oficina")
    private Oficina oficina;

    public Coche(String matricula, float capacidad, Oficina oficina) {
        this.matricula = matricula;
        this.capacidad = capacidad;
        this.oficina = oficina;
    }

    public String getMatricula() {
        return matricula;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public Oficina getOficina() {
        return oficina;
    }
}
