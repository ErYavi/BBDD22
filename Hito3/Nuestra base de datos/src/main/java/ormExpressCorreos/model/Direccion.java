package ormExpressCorreos.model;

import jdk.nashorn.internal.codegen.CompilerConstants;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


// @TODO completar las anotaciones de la clase
@Entity
@Table(name = "Direccion")
public class Direccion {
    @Id
    @Column(name = "numero")
    private Integer numero;
    @Id
    @Column(name = "piso")
    private Integer piso;
    @Id
    @Column(name = "letra")
    private String letra;
    @Id
    @Column(name = "portal")
    private String portal;


    // @TODO completar las anotaciones de todos los atributos

    public Direccion(Integer numero, Integer piso, String letra, String portal, Calle dirpertenececalle) {  // @TODO: completar
        // @TODO completar el constructor de la clase.
        //  Para ello son necesarios dos enteros con el número y el piso, y dos strings
        // con la letra y el portal
        //  Cree e inicialice el resto de atributos a los valores que considere oportunos
        this.letra = letra;
        this.numero = numero;
        this.piso = piso;
        this.portal = portal;
        this.dirpertenececalle=dirpertenececalle;

    }

    public Integer getNumero() {
        return this.numero;
    }

    public Integer getPiso() {
        return this.piso;
    }

    public String getLetra() {
        return this.letra;
    }

    public String getPortal() {
        return this.portal;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public void setPortal(String portal) {
        this.portal = portal;
    }

    public String getDireccionCompleta() {
        // @TODO completar para que devuelva la dirección completa de un usuario
        String direccionCompleta = getNumero() + getPiso() + getLetra() + getPortal();
        return direccionCompleta;
    }

    @OneToMany(mappedBy = "Usuario_Vive_En")
    private Set<UsuarioGenerico> usuariovive;

    @OneToMany(mappedBy = "Recogida_Realiza_En")
    private Set<Recogida> recogidas;

    @ManyToOne
    @JoinColumn(name = "Direccion_Pertenece_Calle")
    private Calle dirpertenececalle;

    @ManyToMany(mappedBy = "Iden_Vive_En")
    private Set<UsuarioIdentificado> usuarioIdentificados= new HashSet<>();
}
