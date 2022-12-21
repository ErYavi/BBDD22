package ormExpressCorreos.model;

import javax.persistence.*;

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

    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "Calle")
    private Calle calle;

    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "Municipio")
    private Municipio municipio;

    // @TODO completar las anotaciones de todos los atributos

    public Direccion(Integer numero, Integer piso, String letra, String portal, Calle calle, Municipio municipio) { // @TODO:
                                                                                                                      // completar
        // @TODO completar el constructor de la clase.
        // Para ello son necesarios dos enteros con el número y el piso, y dos strings
        // con la letra y el portal
        // Cree e inicialice el resto de atributos a los valores que considere oportunos
        this.letra = letra;
        this.numero = numero;
        this.piso = piso;
        this.portal = portal;
        this.calle = calle;
        this.municipio = municipio;
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

    public Calle getCalle() {
        return calle;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public String getDireccionCompleta() {
        // @TODO completar para que devuelva la dirección completa de un usuario
        String direccionCompleta = getNumero() + getPiso() + getLetra() + getPortal();
        return direccionCompleta;
    }
}
