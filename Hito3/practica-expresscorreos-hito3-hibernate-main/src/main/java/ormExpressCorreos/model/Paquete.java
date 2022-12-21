package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table (name = "Paquete")
public class Paquete {

    @Id
    @Column (name = "PQ",nullable = false)
    private String PQ;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Recogida")
    private Recogida recogida;

    @Column (name = "Id_emisor",nullable = false)
    private Integer Id_Emisor;

    @Column (name = "Id_Receptor",nullable = false)
    private Integer Id_Receptor;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Cartero")
    private Cartero cartero;

    @Column (name = "Dimensiones",nullable = false)
    private String Dimensiones;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Reparto")
    private Reparto reparto;

    @Column (name = "peso")
    private float peso;

    public Paquete(String PQ, Recogida recogida, Integer id_Emisor, Integer id_Receptor, Cartero cartero, String dimensiones, Reparto reparto, float peso) {
        this.PQ = PQ;
        this.recogida = recogida;
        Id_Emisor = id_Emisor;
        Id_Receptor = id_Receptor;
        this.cartero = cartero;
        Dimensiones = dimensiones;
        this.reparto = reparto;
        this.peso = peso;
    }


    public String getPQ() {
        return PQ;
    }



    public Integer getId_Emisor() {
        return Id_Emisor;
    }

    public Integer getId_Receptor() {
        return Id_Receptor;
    }

    public Recogida getRecogida() {
        return recogida;
    }

    public Cartero getCartero() {
        return cartero;
    }

    public Reparto getReparto() {
        return reparto;
    }

    public String getDimensiones() {
        return Dimensiones;
    }

    public float getPeso() {
        return peso;
    }
}
