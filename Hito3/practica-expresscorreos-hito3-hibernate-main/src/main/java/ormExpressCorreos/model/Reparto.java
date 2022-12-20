package ormExpressCorreos.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Reparto")
public class Reparto {

    @Id
    @Column (name = "ID_Reparto",nullable = false)
    private String ID_Reparto;

    @Column (name = "FechaR",nullable = false)
    private Date FechaR;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Cartero")
    private Cartero cartero;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Coche")
    private Coche coche;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Ruta")
    private Ruta ruta;

    public Reparto(String ID_Reparto, Date fechaR, Cartero cartero, Coche coche, Ruta ruta) {
        this.ID_Reparto = ID_Reparto;
        FechaR = fechaR;
        this.cartero = cartero;
        this.coche = coche;
        this.ruta = ruta;
    }

    public String getID_Reparto() {
        return ID_Reparto;
    }

    public Date getFechaR() {
        return FechaR;
    }

    public Cartero getCartero() {
        return cartero;
    }

    public Coche getCoche() {
        return coche;
    }

    public Ruta getRuta() {
        return ruta;
    }
}
