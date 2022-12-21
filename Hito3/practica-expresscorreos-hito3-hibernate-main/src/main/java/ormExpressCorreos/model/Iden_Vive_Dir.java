package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table(name = "Iden_Vive_Dir")
public class Iden_Vive_Dir {

    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "Direccion")
    private Direccion direccion;

    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "Usuario_iden")
    private UsuarioIdentificado usuarioIdentificado;

    public Iden_Vive_Dir(Direccion direccion, UsuarioIdentificado usuarioIdentificado) {
        this.direccion = direccion;
        this.usuarioIdentificado = usuarioIdentificado;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public UsuarioIdentificado getUsuarioIdentificado() {
        return usuarioIdentificado;
    }
}
