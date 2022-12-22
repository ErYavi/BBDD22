package ormExpressCorreos.model;

// @TODO completar las anotaciones de la clase

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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

    @OneToMany(mappedBy = "Iden_Envia_Certificadas")
    private Set<Certificada> CertificadaEnviadas;

    @OneToMany(mappedBy = "Iden_Recibe_Certificada")
    private Set<Certificada> CertificadaRecibidas;

    @OneToMany(mappedBy = "Iden_Ordena_recogida")
    private Set<Recogida> recogidasOrdenadas;

    @ManyToMany()
    @JoinTable(name = "Iden_Vive_Dir")
    private Set<Direccion> direccionId = new HashSet<>();

    @ManyToMany(mappedBy = "uIdentificados")
    private Set<UsuarioIdentificado> identificados;

    @ManyToMany()
    @JoinTable(name = "Iden_Autoriza_Iden")
    private Set<UsuarioIdentificado> idenautorizados ;

    public Set<Direccion> getDireccionIden() {
        return direccionId;
    }
}
