package ormExpressCorreos.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Reparto")
public class Reparto {

    @Id
    @Column (name = "ID_Reparto",nullable = false)
    private String ID_Reparto;

    @Column (name = "FechaR",nullable = false)
    private Date FechaR;

    @Column (name = "DNI_Cartero",nullable = false)
    private String DNI_Cartero;

    @Column (name = "Matricula",nullable = false)
    private String Matricula;

    @Column (name = "ID_Ruta",nullable = false)
    private String ID_Ruta;

    public Reparto(String ID_Reparto, Date fechaR, String DNI_Cartero, String matricula, String ID_Ruta) {
        this.ID_Reparto = ID_Reparto;
        FechaR = fechaR;
        this.DNI_Cartero = DNI_Cartero;
        Matricula = matricula;
        this.ID_Ruta = ID_Ruta;
    }

    public String getDNI_Cartero() {
        return DNI_Cartero;
    }

    public Date getFechaR() {
        return FechaR;
    }

    public String getID_Reparto() {
        return ID_Reparto;
    }

    public String getID_Ruta() {
        return ID_Ruta;
    }

    public String getMatricula() {
        return Matricula;
    }
}
