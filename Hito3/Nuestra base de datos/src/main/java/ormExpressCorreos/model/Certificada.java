package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table(name = "Certificada")
public class Certificada {

    @Id
    @Column(name = "CE", nullable = false,unique = true)
    private String CE;

    @Column(name = "Urgencia", nullable = false)
    private Integer urgencia;


    public Certificada(Integer urgencia, String CE){
        this.urgencia=urgencia;
        this.CE=CE;
    }

    public Integer getUrgencia() {
        return urgencia;
    }

    public String getCE() {
        return CE;
    }

    public void setCE(String CE) {
        this.CE = CE;
    }

    public void setUrgencia(Integer urgencia) {
        this.urgencia = urgencia;
    }

    @ManyToOne
    @JoinColumn(name = "Identificado_Envia_Certificada")
    private UsuarioIdentificado Identificadoenvia;

    @ManyToOne
    @JoinColumn(name = "Identificado_Recibe_Certificada")
    private UsuarioIdentificado Identificadorecibe;

    @ManyToOne
    @JoinColumn(name = "Cartero_Recoge_certificada")
    private Cartero carteroCE;

    @ManyToOne
    @JoinColumn(name = "Certificada_Pertenece_Reparto")
    private Reparto repartoCE;
}
