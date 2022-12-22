package ormExpressCorreos.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Segmento {

    @Column(nullable = false)
    private Integer N_ini;

    @Column(nullable = false)
    private Integer N_fin;

    @Id
    @Column(nullable = false)
    private String Id_Seg;


    public Segmento(Integer n_ini, Integer n_fin, String id_Seg) {
        N_ini = n_ini;
        N_fin = n_fin;
        Id_Seg = id_Seg;

    }

    public Integer getN_ini() {
        return N_ini;
    }

    public Integer getN_fin() {
        return N_fin;
    }

    public String getId_Seg() {
        return Id_Seg;
    }

    public void setN_ini(Integer n_ini) {
        N_ini = n_ini;
    }

    public void setN_fin(Integer n_fin) {
        N_fin = n_fin;
    }

    public void setId_Seg(String id_Seg) {
        Id_Seg = id_Seg;
    }

    @ManyToOne
    @JoinColumn(name = "Segemento_Pertenece_Area")
    private Area_envio segmentoArea;

    @ManyToOne
    @JoinColumn(name = "Segmento_Pertenece_Calle")
    private Calle segmentoCalle;

    @ManyToMany(mappedBy = "Segmentos_En_Ruta")
    private Set<Ruta> rutas;
}
