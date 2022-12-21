package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table(name = "Certificada")
public class Certificada {

    @Column(name = "DNI_Emisor", nullable = false)
    private String DNI_emisor;

    @Column(name = "DNI_Receptor", nullable = false)
    private String DNI_receptor;

    @Id
    @Column(name = "CE", nullable = false)
    private String CE;

    @Column(name = "Urgencia", nullable = false)
    private Integer urgencia;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Cartero")
    private Cartero cartero;

    @Column(name = "Id_Reparto", nullable = false)
    private String Id_Reparto;

    public Certificada(String DNI_emisor, String DNI_receptor, String CE, Integer urgencia, Cartero cartero, String id_Reparto) {
        this.DNI_emisor = DNI_emisor;
        this.DNI_receptor = DNI_receptor;
        this.CE = CE;
        this.urgencia = urgencia;
        this.cartero = cartero;
        Id_Reparto = id_Reparto;
    }

    public Integer getUrgencia() {
        return urgencia;
    }

    public String getCE() {
        return CE;
    }

    public Cartero getCartero() {
        return cartero;
    }

    public String getDNI_emisor() {
        return DNI_emisor;
    }

    public String getDNI_receptor() {
        return DNI_receptor;
    }

    public String getId_Reparto() {
        return Id_Reparto;
    }
}
