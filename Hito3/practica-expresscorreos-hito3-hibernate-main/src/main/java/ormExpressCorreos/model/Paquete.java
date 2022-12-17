package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table (name = "Paquete")
public class Paquete {

    @Id
    @Column (name = "PQ",nullable = false)
    private String PQ;

    @Column (name = "Id_Rec")
    private String Id_Recogida;

    @Column (name = "Id_emisor",nullable = false)
    private Integer Id_Emisor;

    @Column (name = "Id_Receptor",nullable = false)
    private Integer Id_Receptor;

    @Column (name = "DNI_Car",nullable = false)
    private String DNI_Car;

    @Column (name = "Dimensiones",nullable = false)
    private String Dimensiones;

    @Column (name = "Id_Reparto")
    private String ID_Reparto;

    @Column (name = "peso")
    private float peso;

    public Paquete(String PQ, String id_Recogida, Integer id_Emisor, Integer id_Receptor, String DNI_Car, String dimensiones, String ID_Reparto, float peso) {
        this.PQ = PQ;
        Id_Recogida = id_Recogida;
        Id_Emisor = id_Emisor;
        Id_Receptor = id_Receptor;
        this.DNI_Car = DNI_Car;
        Dimensiones = dimensiones;
        this.ID_Reparto = ID_Reparto;
        this.peso = peso;
    }

    public String getID_Reparto() {
        return ID_Reparto;
    }

    public String getPQ() {
        return PQ;
    }

    public String getId_Recogida() {
        return Id_Recogida;
    }

    public Integer getId_Emisor() {
        return Id_Emisor;
    }

    public Integer getId_Receptor() {
        return Id_Receptor;
    }

    public String getDNI_Car() {
        return DNI_Car;
    }

    public String getDimensiones() {
        return Dimensiones;
    }

    public float getPeso() {
        return peso;
    }
}
