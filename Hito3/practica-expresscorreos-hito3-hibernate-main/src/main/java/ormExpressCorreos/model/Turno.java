package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table (name = "Turno")
public class Turno {

    @Id
    @Column (name = "Jornada",nullable = false)
    private String jornada;

    @Column (name = "Horario",nullable = false)
    private String horario;

    public Turno(String jornada, String horario) {
        this.jornada = jornada;
        this.horario = horario;
    }

    public String getJornada() {
        return jornada;
    }

    public String getHorario() {
        return horario;
    }
}
