package ormExpressCorreos.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Recogida")
public class Recogida {

    @Id
    @Column(name = "Id_Rec", nullable = false)
    private String Id_Recogida;

    @Column(name = "FechaRec", nullable = false)
    private Date FechaRec;

    @Column(name = "DNI_Car", nullable = false)
    private String DNI_Cartero;

    @Column(name = "DNI_Usuario", nullable = false)
    private String DNI_Usuario;

    @Column(name = "Direccion")
    private Integer numero;

    @Column(name = "piso", nullable = false)
    private Integer piso;

    @Column(name = "letra", nullable = false)
    private String letra;

    @Column(name = "portal", nullable = false)
    private String portal;

    @Column(name = "nMunicipio", nullable = false)
    private String nMunicipio;

    @Column(name = "nCalle", nullable = false)
    private String nCalle;


    public Recogida(String id_Recogida, Date fechaRec, String DNI_Cartero, String DNI_Usuario, Integer numero, Integer piso, String letra, String portal, String nMunicipio, String nCalle) {
        Id_Recogida = id_Recogida;
        FechaRec = fechaRec;
        this.DNI_Cartero = DNI_Cartero;
        this.DNI_Usuario = DNI_Usuario;
        this.numero = numero;
        this.piso = piso;
        this.letra = letra;
        this.portal = portal;
        this.nMunicipio = nMunicipio;
        this.nCalle = nCalle;
    }

    public String getId_Recogida() {
        return Id_Recogida;
    }

    public Date getFechaRec() {
        return FechaRec;
    }

    public String getDNI_Cartero() {
        return DNI_Cartero;
    }

    public String getDNI_Usuario() {
        return DNI_Usuario;
    }

    public Integer getNumero() {
        return numero;
    }

    public Integer getPiso() {
        return piso;
    }

    public String getLetra() {
        return letra;
    }

    public String getPortal() {
        return portal;
    }

    public String getnMunicipio() {
        return nMunicipio;
    }

    public String getnCalle() {
        return nCalle;
    }
}
