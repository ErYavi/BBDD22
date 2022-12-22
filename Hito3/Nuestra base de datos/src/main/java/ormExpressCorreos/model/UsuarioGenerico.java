package ormExpressCorreos.model;

import javax.persistence.*;
import java.util.Set;

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



    public UsuarioGenerico(Long id, String nombre, String apellidos) {
        // @TODO completar el constructor de la clase.
        // Para ello es necesario un "long"" con la ID, un string con el nombre del
        // usuario y otro string con el apellido
        // Cree e inicialice el resto de atributos a los valores que considere oportunos
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;

    }

    public UsuarioGenerico(Long id, String nombre, String apellidos, Direccion dir) {
        // Añadimos un segundo constructor para que se pueda introducir la direccion de
        // manera directa o indirecta.

        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
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

    @OneToMany(mappedBy = "Usuario_Envia_Paquete")
    private Set<Paquete> paquetesEnviados;

    @OneToMany(mappedBy = "Usuario_Recibe_Paquete")
    private Set<Paquete> paquetesRecibidos;

    @OneToMany(mappedBy = "Usuario_Envia_Carta")
    private Set<Carta> cartasEnviadas;

    @OneToMany(mappedBy = "Usuario_Recibe_Carta")
    private Set<Carta> cartasRecibidas;


    @ManyToOne
    @JoinTable(name = "Usuario_Vive_En")
    private Direccion usuariosvivenDir;
}
