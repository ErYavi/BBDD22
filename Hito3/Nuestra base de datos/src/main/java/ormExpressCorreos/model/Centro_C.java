package ormExpressCorreos.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Centro_C {

    @Id
    @Column(nullable = false,unique = true)
    private String Cod_CC;

    @Column(nullable = false)
    private String NombreCC;

    @Column(nullable = false)
    private Integer Max_ct;

    @Column(nullable = false)
    private Integer Max_pq;


    public Centro_C(String cod_CC, String nombreCC, Integer max_ct, Integer max_pq) {
        Cod_CC = cod_CC;
        NombreCC = nombreCC;
        Max_ct = max_ct;
        Max_pq = max_pq;
    }

    public String getCod_CC() {
        return Cod_CC;
    }

    public String getNombreCC() {
        return NombreCC;
    }

    public Integer getMax_ct() {
        return Max_ct;
    }

    public Integer getMax_pq() {
        return Max_pq;
    }

    public void setCod_CC(String cod_CC) {
        Cod_CC = cod_CC;
    }

    public void setNombreCC(String nombreCC) {
        NombreCC = nombreCC;
    }

    public void setMax_ct(Integer max_ct) {
        Max_ct = max_ct;
    }

    public void setMax_pq(Integer max_pq) {
        Max_pq = max_pq;
    }

    @ManyToOne
    @JoinColumn(name = "Centro_Pertenece_Municipio")
    private Municipio municipio;

    @OneToMany(mappedBy = "Oficina_Es_Referencia")
    private Set<Oficina> referencia;

    @ManyToMany()
    @JoinColumn(name = "Centro_Tiene_Oficina")
    private Set<Oficina> oficinas;
}
