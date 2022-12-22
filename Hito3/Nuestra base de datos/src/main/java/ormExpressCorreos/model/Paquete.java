package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table (name = "Paquete")
public class Paquete {

    @Id
    @Column (name = "PQ",nullable = false,unique = true)
    private String PQ;

    @Column (name = "Dimensiones",nullable = false)
    private String Dimensiones;

    @Column (name = "peso")
    private float peso;

    public Paquete(String PQ, String dimensiones, float peso) {
        this.PQ = PQ;
        Dimensiones = dimensiones;
        this.peso = peso;
    }


    public String getPQ() {
        return PQ;
    }

    public String getDimensiones() {
        return Dimensiones;
    }

    public float getPeso() {
        return peso;
    }

    public void setPQ(String PQ) {
        this.PQ = PQ;
    }

    public void setDimensiones(String dimensiones) {
        Dimensiones = dimensiones;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @ManyToOne
    @JoinColumn(name = "Usuario_Envia_Paquete")
    private UsuarioGenerico usuarioenviaPQ;

    @ManyToOne
    @JoinColumn(name = "Usuario_Recibe_Paquete")
    private UsuarioGenerico usuariorecibePQ;

    @ManyToOne
    @JoinColumn(name = "Paquete_Pertenece_Recogida")
    private Recogida recogidaPQ;

    @ManyToOne
    @JoinColumn(name = "Cartero_Recoge_Paquete")
    private Cartero carteroPQ;

    @ManyToOne
    @JoinColumn(name = "Paquete_Pertenece_Reparto")
    private Reparto repartoPQ;
}
