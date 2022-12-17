package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table (name = "Cartero")
public class Cartero {

    @Id
    @Column (name = "Dni_Cartero",nullable = false)
    private String DNI_Cartero;

    @Column (name = "nombre_C",nullable = false)
    private String nombreC;

    @Column (name = "apellidos_C",nullable = false)
    private String apellidos;

    public Cartero(String DNI_Cartero, String nombre, String apellidos) {
        this.DNI_Cartero = DNI_Cartero;
        this.nombreC = nombre;
        this.apellidos = apellidos;
    }

    public String getDNI_Cartero() {
        return DNI_Cartero;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombreC() {
        return nombreC;
    }
}
