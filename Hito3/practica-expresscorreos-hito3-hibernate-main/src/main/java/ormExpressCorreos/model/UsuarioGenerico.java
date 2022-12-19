package ormExpressCorreos.model;

import javax.persistence.*;

// @TODO completar las anotaciones de la clase
@Entity
@Table(name = "UsuarioGen")
public class UsuarioGenerico {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellidos", nullable = false)
    private String apellidos;

    @Column(name = "numero")
    private Integer numero;

    @Column(name = "piso")
    private Integer piso;

    @Column(name = "letra")
    private String letra;

    @Column(name = "portal")
    private String portal;

    @Column(nullable = false)
    private String Ncalle;

    @Column(nullable = false)
    private String NMunicipio;

    // @TODO completar las anotaciones de todos los atributos
    public UsuarioGenerico(Long id, String nombre, String apellidos, Integer numero, Integer piso, String letra,
            String portal, String ncalle, String NMunicipio) { // @TODO: completar
        // @TODO completar el constructor de la clase.
        // Para ello es necesario un "long"" con la ID, un string con el nombre del
        // usuario y otro string con el apellido
        // Cree e inicialice el resto de atributos a los valores que considere oportunos
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numero = numero;
        this.piso = piso;
        this.letra = letra;
        this.portal = portal;
        Ncalle = ncalle;
        this.NMunicipio = NMunicipio;
    }

    public UsuarioGenerico(Long id, String nombre, String apellidos, Direccion dir) {
        // Añadimos un segundo constructor para que se pueda introducir la direccion de
        // manera directa o indirecta.

        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numero = dir.getNumero();
        this.piso = dir.getPiso();
        this.letra = dir.getLetra();
        this.portal = dir.getPortal();
        Ncalle = dir.getNcalle();
        this.NMunicipio = dir.getNMunicipio();
    }

    public Long getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public Integer getNumero() {
        return numero;
    }

    public Integer getPiso() {
        return piso;
    }

    public String getLetra() {
        return letra;
    }

    public String getPortal() {
        return portal;
    }

    public String getNcalle() {
        return Ncalle;
    }

    public String getNMunicipio() {
        return NMunicipio;
    }
}
