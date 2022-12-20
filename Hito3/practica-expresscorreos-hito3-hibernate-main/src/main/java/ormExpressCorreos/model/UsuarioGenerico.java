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

    @ManyToOne(optional = false)
    @JoinColumn(name = "Direccion")
    private Direccion direccion;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Calle")
    private Calle calle;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Municipio")
    private Municipio municipio;

    public UsuarioGenerico(Long id, String nombre, String apellidos, Direccion direccion, Calle calle, Municipio municipio) {
        // @TODO completar el constructor de la clase.
        // Para ello es necesario un "long"" con la ID, un string con el nombre del
        // usuario y otro string con el apellido
        // Cree e inicialice el resto de atributos a los valores que considere oportunos

        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.calle = calle;
        this.municipio = municipio;
    }

    public UsuarioGenerico(Long id, String nombre, String apellidos, Direccion dir) {
        // Añadimos un segundo constructor para que se pueda introducir la direccion de
        // manera directa o indirecta.

        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion=dir;
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

    public Direccion getDireccion() {
        return direccion;
    }

    public Calle getCalle() {
        return calle;
    }

    public Municipio getMunicipio() {
        return municipio;
    }
}
