package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table (name = "Carta")
public class Carta {

    @Id
    @Column (name = "CT",nullable = false)
    private Integer CT;

    @Column (name = "Id_Emisor",nullable = false)
    private Integer ID_Emisor;

    @Column (name = "Id_Receptor",nullable = false)
    private String ID_Receptor;

    @Column (name = "DNI_Car",nullable = false)
    private String DNI_Cartero;

    @Column (name = "Formato",nullable = false)
    private String Formato;

    @Column (name = "Id_Reparto",nullable = false)
    private String Id_Reparto;

    public Carta(Integer CT, Integer ID_Emisor, String ID_Receptor, String DNI_Cartero, String formato,String Id_Reparto) {
        this.CT = CT;
        this.ID_Emisor = ID_Emisor;
        this.ID_Receptor = ID_Receptor;
        this.DNI_Cartero = DNI_Cartero;
        Formato = formato;
        this.Id_Reparto=Id_Reparto;
    }

    public String getDNI_Cartero() {
        return DNI_Cartero;
    }

    public Integer getCT() {
        return CT;
    }

    public Integer getID_Emisor() {
        return ID_Emisor;
    }

    public String getFormato() {
        return Formato;
    }

    public String getID_Receptor() {
        return ID_Receptor;
    }

    public String getId_Reparto() {
        return Id_Reparto;
    }
}
