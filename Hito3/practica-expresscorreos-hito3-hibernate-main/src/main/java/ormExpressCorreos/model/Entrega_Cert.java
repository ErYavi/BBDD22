package ormExpressCorreos.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table (name = "Entrega_Cert")
public class Entrega_Cert {

    @Id
    @Column (name = "DNI_Usuario",nullable = false)
    private String DNI_Usuario;

    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "Cartero")
    private Cartero cartero;

    @Id
    @Column (name = "CE",nullable = false)
    private String CE;

    @Column (name = "fecha",nullable = false)
    private Date fecha;

    @Column (name = "hora",nullable = false)
    private Time hora;

    public Entrega_Cert(String DNI_Usuario, Cartero cartero, String CE, Date fecha, Time hora) {
        this.DNI_Usuario = DNI_Usuario;
        this.cartero = cartero;
        this.CE = CE;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getDNI_Usuario() {
        return DNI_Usuario;
    }

    public Cartero getCartero() {
        return cartero;
    }

    public String getCE() {
        return CE;
    }

    public Date getFecha() {
        return fecha;
    }

    public Time getHora() {
        return hora;
    }
}
