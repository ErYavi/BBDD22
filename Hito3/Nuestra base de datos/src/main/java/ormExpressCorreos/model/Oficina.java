package ormExpressCorreos.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table (name = "Oficina")
public class Oficina {

    @Id
    @Column (name = "Cod_0",nullable = false,unique = true)
    private String Cod_O;


    public Oficina(String cod_O) {
        Cod_O = cod_O;

    }

    public String getCod_O() {
        return Cod_O;
    }

    public void setCod_O(String cod_O) {
        Cod_O = cod_O;
    }

    @OneToMany(mappedBy = "Coche_Pertence_Oficina")
    private Set<Coche> oficinaTieneCoche;

    @OneToMany(mappedBy = "Area_Pertence_Oficina")
    private Set<Area_envio> hayarea;

    @ManyToOne
    @JoinColumn(name = "Oficina_Pertenece_Municipio")
    private Municipio oficinaPerteneceMunicipio;

    @ManyToOne
    @JoinColumn(name = "Oficina_Es_Referencia")
    private Centro_C oficinaEsReferenciaCentro;

    @OneToMany(mappedBy = "Turno_Pertence_Oficina")
    private Set<Turno> tieneTurnos;

    @ManyToMany()
    @JoinTable(name = "Cartero_Trabaja_Oficina")
    private Set<Cartero> carterosO;

    @ManyToMany(mappedBy = "Centro_Tiene_Oficina")
    private Set<Centro_C> centros;
}
