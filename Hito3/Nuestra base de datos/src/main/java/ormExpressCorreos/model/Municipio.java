package ormExpressCorreos.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Municipio {

     @Id
     @Column(nullable = false,unique = true)
    private String nMunicipio;

    @Column(name = "Provincia",nullable = false)
    private String provincia;

    public Municipio(String nMunicipio, String provincia) {
        this.nMunicipio = nMunicipio;
        this.provincia = provincia;
    }

    public Municipio(String nMunicipio) {
        this.nMunicipio = nMunicipio;
    }

    public String getnMunicipio() {
        return nMunicipio;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setnMunicipio(String nMunicipio) {
        this.nMunicipio = nMunicipio;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @OneToMany(mappedBy = "Oficina_Pertenece_Municipio")
    private Set<Oficina> hayoficina;

    @OneToMany(mappedBy = "Calle_Pertenece_Municipio")
    private Set<Calle> haycalle;

    @OneToMany(mappedBy = "CentroC_Pertenece_Municipio")
    private Set<Centro_C> haycentro;
}
