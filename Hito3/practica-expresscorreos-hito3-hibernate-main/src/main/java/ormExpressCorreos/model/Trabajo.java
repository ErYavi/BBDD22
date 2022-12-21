package ormExpressCorreos.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table (name = "Trabajo")
public class Trabajo {

    @Column (name = "Fecha_ini",nullable = false)
    private Date Fecha_ini;

    @Id
    @Column (name = "Jornada",nullable = false)
    private String jornada;

    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "Oficina")
    private Oficina oficina;

    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "Cartero")
    private Cartero cartero;

    public Trabajo(Date fecha_ini, String jornada, Oficina oficina, Cartero cartero) {
        Fecha_ini = fecha_ini;
        this.jornada = jornada;
        this.oficina = oficina;
        this.cartero = cartero;
    }

    public Date getFecha_ini() {
        return Fecha_ini;
    }

    public String getJornada() {
        return jornada;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public Cartero getCartero() {
        return cartero;
    }
}
