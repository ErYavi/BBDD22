import ormExpressCorreos.Controller;
import ormExpressCorreos.model.UsuarioIdentificado;
import ormExpressCorreos.model.Direccion;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        try {
            Controller controlador = new Controller();
            UsuarioIdentificado usuario = controlador.createUsuarioIdentificado("05264852F", "Juan", "Paredes Mira",
                    "jotapm@gmail.com");
            UsuarioIdentificado usuarioIdentificado = controlador.createDireccion(32, 1, "B", "N/A",
                    "Calle de Guzman el Bueno",
                    "Madrid", "Madrid", usuario);
            Direccion direccion = UsuarioIdentificado.getDireccion();
            // @TODO añada las llamadas a las funciones de la clase Controller.java
            // necesarias
            // para la creación del usuario identificado y la direccion.

            if (usuario != null && direccion != null) {
                System.out.println("Se ha creado el usuario identificado " + usuario.getNombre() + " con DNI "
                        + usuario.getDNI() + " que vive en " + direccion.getDireccionCompleta());
            }

        } catch (SQLException e) {
            System.err.println("Se ha producido un error en la conexión con la base de datos");
            e.printStackTrace();
        }
    }
}
