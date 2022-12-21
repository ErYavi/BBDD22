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

    @ManyToOne(optional = false)
    @JoinColumn(name = "Cartero")
    private Cartero cartero;

    @Column (name = "Formato",nullable = false)
    private String Formato;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Reparto")
    private Reparto reparto;

    public Carta(Integer CT, Integer ID_Emisor, String ID_Receptor, Cartero cartero, String formato, Reparto reparto) {
        this.CT = CT;
        this.ID_Emisor = ID_Emisor;
        this.ID_Receptor = ID_Receptor;
        this.cartero = cartero;
        Formato = formato;
        this.reparto = reparto;
    }

    public Cartero getCartero() {
        return cartero;
    }

    public Reparto getReparto() {
        return reparto;
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


}
