package ormExpressCorreos.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table (name = "Coche")
public class Coche {

    @Id
    @Column (name = "Matricula",nullable = false,unique = true)
    private String matricula;

    @Column (name = "Capacidad",nullable = false)
    private float capacidad;


    public Coche(String matricula, float capacidad) {
        this.matricula = matricula;
        this.capacidad = capacidad;

    }

    public String getMatricula() {
        return matricula;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    @OneToMany(mappedBy = "Reparto_Usa_Coche")
    private Set<Reparto> cocherepartos;

    @ManyToOne
    @JoinColumn(name = "Coche_Pertenece_Oficina")
    private Oficina cocheoficina;
}
