package ormExpressCorreos.model;

import javax.persistence.*;
import java.util.Set;

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

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @ManyToOne
    @JoinColumn(name = "Turno_Pertence_Oficina")
    private Oficina turnoenOficina;

    @ManyToMany()
    @JoinTable(name = "Cartero_Tiene_Turno")
    private Set<Cartero> carterosTurno;
}
