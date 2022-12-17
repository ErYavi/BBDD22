package ormExpressCorreos.model;

// @TODO completar las anotaciones de la clase

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UsuarioIden")
public class UsuarioIdentificado {

    // @TODO completar las anotaciones de todos los atributos

    @Id
    @Column(name = "DNIiden", nullable = false)
    private String DNI;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellidos", nullable = false)
    private String apellidos;

    @Column(name = "email", nullable = false)
    private String email;

    public UsuarioIdentificado(String DNI, String nombre, String apellidos, String email) {  // @TODO: completar
        // @TODO completar el constructor de la clase.
        //  Para ello son necesarios strings con el DNI, el nombre, los apellidos y el email del usuario
        //  Cree e inicialice el resto de atributos a los valores que considere oportunos
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.nombre = nombre;
        this.email = email;
    }

    public String getDNI() {
        return this.DNI;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public String getEmail() {
        return this.email;
    }
}
