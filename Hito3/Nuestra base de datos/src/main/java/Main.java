import ormExpressCorreos.Controller;
import ormExpressCorreos.model.*;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        try {
            Controller controlador = new Controller();

            Municipio madrid= controlador.createMunicipio("Madrid");

            Calle calle= controlador.createCalle("Calle de Guzman el Bueno",madrid);

            Calle calle2= controlador.createCalle("Calle Alcala",madrid);

            Direccion direccion = controlador.createDireccion(32, 1, "B", "N/A", calle);

            Direccion direccion2 = controlador.createDireccion(5, 3, "C", "A", calle2);

            UsuarioIdentificado usuario = controlador.createUsuarioIdentificado("05264852F", "Juan", "Paredes Mira",
                    "jotapm@gmail.com");

            UsuarioIdentificado usuario1 = controlador.addDireccionUsuario(direccion,usuario);

            UsuarioGenerico usergen= controlador.createUsuarioGenerico((long)32,"Juan","Picapiedra",direccion2);

            // @TODO añada las llamadas a las funciones de la clase Controller.java
            // necesarias
            // para la creación del usuario identificado y la direccion.

            if (usuario != null && direccion != null) {
                System.out.println("Se ha creado el usuario identificado " + usuario1.getNombre() + " con DNI "
                        + usuario1.getDNI() + " que vive en " + direccion.getDireccionCompleta());
            } else
                throw new SQLException();
        } catch (SQLException e) {
            System.err.println("Se ha producido un error en la conexión con la base de datos");
            e.printStackTrace();
        }
    }
}
