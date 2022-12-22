package ormExpressCorreos.model;

// @TODO completar las anotaciones de la clase

import javax.persistence.*;

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

    @ManyToOne(optional = false)
    @JoinColumn(name = "Direccion")
    private Iden_Vive_Dir iden_vive_dir;

    public UsuarioIdentificado(String DNI, String nombre, String apellidos, String email, Iden_Vive_Dir iden_vive_dir) { // @TODO:
                                                                                                                         // completar
        // @TODO completar el constructor de la clase.
        // Para ello son necesarios strings con el DNI, el nombre, los apellidos y el
        // email del usuario
        // Cree e inicialice el resto de atributos a los valores que considere oportunos
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.nombre = nombre;
        this.email = email;
        this.iden_vive_dir = iden_vive_dir;
    }

    public UsuarioIdentificado() {
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

    public void setDNI(String dni) {
        this.DNI = dni;
    }

    public Iden_Vive_Dir getIden_vive_dir() {
        return iden_vive_dir;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIden_Vive_Dir(Iden_Vive_Dir vive) {
        this.iden_vive_dir = vive;
    }

}
