package ormExpressCorreos.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table (name = "Trabajo")
public class Trabajo {

    @Column (name = "Fecha_ini",nullable = false)
    private Date Fecha_ini;

    @Id
    @Column (name = "Jornada",nullable = false)
    private String jornada;

    @Id
    @Column (name = "Cod:O",nullable = false)
    private String Cod_O;

    @Id
    @Column (name = "DNI_Car",nullable = false)
    private String DNI_Car;

    public Trabajo(Date fecha_ini, String jornada, String cod_O, String DNI_Car) {
        Fecha_ini = fecha_ini;
        this.jornada = jornada;
        Cod_O = cod_O;
        this.DNI_Car = DNI_Car;
    }

    public Date getFecha_ini() {
        return Fecha_ini;
    }

    public String getJornada() {
        return jornada;
    }

    public String getCod_O() {
        return Cod_O;
    }

    public String getDNI_Car() {
        return DNI_Car;
    }
}
