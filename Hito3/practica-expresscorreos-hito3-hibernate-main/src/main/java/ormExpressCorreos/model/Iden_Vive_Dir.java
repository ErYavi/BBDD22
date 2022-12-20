package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table(name = "Iden_Vive_Dir")
public class Iden_Vive_Dir {

    @Id
    @Column(name = "numero", nullable = false)
    private Integer numero;

    @Id
    @Column(name = "piso", nullable = false)
    private Integer piso;

    @Id
    @Column(name = "letra", nullable = false)
    private String letra;

    @Id
    @Column(name = "portal")
    private String portal;

    @Id
    @Column(name = "DNI_Usuario", nullable = false)
    private String DNI_Usuario;

    public Iden_Vive_Dir(Integer numero, Integer piso, String letra, String portal, String DNI_Usuario) {
        this.numero = numero;
        this.piso = piso;
        this.letra = letra;
        this.portal = portal;
        this.DNI_Usuario = DNI_Usuario;
    }

    public Iden_Vive_Dir(Direccion dir, UsuarioIdentificado usuario) {
        this.numero = dir.getNumero();
        this.piso = dir.getPiso();
        this.letra = dir.getLetra();
        this.portal = dir.getPortal();
        this.DNI_Usuario = usuario.getDNI();
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

    public String getDNI_Usuario() {
        return DNI_Usuario;
    }
}
