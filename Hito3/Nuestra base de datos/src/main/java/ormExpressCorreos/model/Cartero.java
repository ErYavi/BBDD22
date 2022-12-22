package ormExpressCorreos.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table (name = "Cartero")
public class Cartero {

    @Id
    @Column (name = "Dni_Cartero",nullable = false,unique = true)
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

    public void setDNI_Cartero(String DNI_Cartero) {
        this.DNI_Cartero = DNI_Cartero;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @OneToMany(mappedBy = "Cartero_Recoge_Carta")
    private Set<Carta> cartas;

    @OneToMany(mappedBy = "Cartero_Recoge_paquete")
    private Set<Paquete> paquetes;

    @OneToMany(mappedBy = "Cartero_Recoge_Certificada")
    private Set<Certificada> certificadas;

    @OneToMany(mappedBy = "Cartero_Realiza_Reparto")
    private Set<Reparto> repartos;

    @OneToMany(mappedBy = "Cartero_Realiza_Recogida")
    private Set<Recogida> recogidas;

    @ManyToMany(mappedBy = "Cartero_Reparte_Area")
    private Set<Area_envio> area_envios;

    @ManyToMany(mappedBy = "Cartero_Tiene_Turno")
    private Set<Turno> turnos;

    @ManyToMany(mappedBy = "Cartero_Trabaja_Oficina")
    private Set<Oficina> oficinas;
}
