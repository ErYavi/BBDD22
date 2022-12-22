package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table (name = "Carta")
public class Carta {

    @Id
    @Column (name = "CT",nullable = false,unique = true)
    private Integer CT;


    @Column (name = "Formato",nullable = false)
    private String Formato;



    public Carta(Integer CT, String formato) {
        this.CT = CT;
        Formato = formato;
    }


    public Integer getCT() {
        return CT;
    }

    public String getFormato() {
        return Formato;
    }

    public void setCT(Integer CT) {
        this.CT = CT;
    }

    public void setFormato(String formato) {
        Formato = formato;
    }

    @ManyToOne
    @JoinColumn(name = "Usuario_envia_Carta")
    private UsuarioGenerico usuarioenviaCT;

    @ManyToOne
    @JoinColumn(name = "Usuario_Recibe_Carta")
    private UsuarioGenerico usuariorecibeCT;

    @ManyToOne
    @JoinColumn(name = "Cartero_Recoge_Carta")
    private Cartero carteroCT;

    @ManyToOne
    @JoinColumn(name = "Carta_Pertenece_Reparto")
    private Reparto repartoCT;
}
