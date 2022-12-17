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

    @Column(name = "DNI_Cartero", nullable = false)
    private String DNI_Cartero;

    @Column(name = "Id_Reparto", nullable = false)
    private String Id_Reparto;

    public Certificada(String DNI_emisor,String DNI_Cartero,String DNI_receptor, Integer urgencia, String Id_Reparto, String CE){
        this.DNI_emisor=DNI_emisor;
        this.DNI_Cartero=DNI_Cartero;
        this.DNI_receptor=DNI_receptor;
        this.urgencia=urgencia;
        this.Id_Reparto=Id_Reparto;
        this.CE=CE;
    }

    public Integer getUrgencia() {
        return urgencia;
    }

    public String getCE() {
        return CE;
    }

    public String getDNI_Cartero() {
        return DNI_Cartero;
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
