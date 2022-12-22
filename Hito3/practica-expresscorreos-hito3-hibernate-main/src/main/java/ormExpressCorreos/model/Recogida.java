package ormExpressCorreos.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Calendar;

@Entity
@Table(name = "Recogida")
public class Recogida {

    @Id
    @Column(name = "Id_Rec", nullable = false)
    private String Id_Recogida;

    @Column(name = "FechaRec", nullable = false)
    private Date FechaRec;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Cartero")
    private Cartero cartero;

    @Column(name = "DNI_Usuario", nullable = false)
    private String DNI_Usuario;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Direccion")
    private Direccion direccion;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Municipio")
    private Municipio municipio;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Calle")
    private Calle calle;

    public Recogida(String id_Recogida, Date fechaRec, Cartero cartero, String DNI_Usuario, Direccion direccion,
            Municipio municipio, Calle calle) {
        Id_Recogida = id_Recogida;
        FechaRec = fechaRec;
        this.cartero = cartero;
        this.DNI_Usuario = DNI_Usuario;
        this.direccion = direccion;
        this.municipio = municipio;
        this.calle = calle;
    }

    public String getId_Recogida() {
        return Id_Recogida;
    }

    public Date getFechaRec() {
        return FechaRec;
    }

    public String getDNI_Usuario() {
        return DNI_Usuario;
    }

    public Cartero getCartero() {
        return cartero;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public Calle getCalle() {
        return calle;
    }
}
