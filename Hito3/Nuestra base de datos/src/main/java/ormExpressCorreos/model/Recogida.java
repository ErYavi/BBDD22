package ormExpressCorreos.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "Recogida")
public class Recogida {

    @Id
    @Column(name = "Id_Rec", nullable = false,unique = true)
    private String Id_Recogida;

    @Column(name = "FechaRec", nullable = false)
    private Date FechaRec;



    public Recogida(String id_Recogida, Date fechaRec) {
        Id_Recogida = id_Recogida;
        FechaRec = fechaRec;

    }

    public String getId_Recogida() {
        return Id_Recogida;
    }

    public Date getFechaRec() {
        return FechaRec;
    }

    public void setId_Recogida(String id_Recogida) {
        Id_Recogida = id_Recogida;
    }

    public void setFechaRec(Date fechaRec) {
        FechaRec = fechaRec;
    }

    @OneToMany(mappedBy = "Paquete_Pertenece_Recogida")
    private Set<Paquete> paquetes;

    @ManyToOne
    @JoinColumn(name = "Iden_Ordena_Recogida")
    private UsuarioGenerico idenordenaRec;

    @ManyToOne
    @JoinColumn(name = "Recogida_Realiza_En")
    private Direccion recogidaEnDireccion;

    @ManyToOne
    @JoinColumn(name = "Cartero_Realiza_Recogida")
    private Cartero recogidaTieneCartero;
}
