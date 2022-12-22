package ormExpressCorreos.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Ruta {

    @Id
    @Column(nullable = false)
    private String Id_Ruta;

    public Ruta(String id_Ruta) {
        Id_Ruta = id_Ruta;
    }

    public String getId_Ruta() {
        return Id_Ruta;
    }


    @OneToMany(mappedBy = "Reparto_Tiene_Ruta")
    private Set<Reparto> hayReparto;

    @ManyToMany()
    @JoinTable(name = "Ruta_Incluye_Segmentos")
    private Set<Segmento> segmetos;
}
