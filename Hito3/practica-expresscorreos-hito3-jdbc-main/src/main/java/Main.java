import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import expresscorreos.model.Cartero;
import expresscorreos.model.Oficina;
import expresscorreos.model.Coche;
import expresscorreos.model.Reparto;
import expresscorreos.model.Municipio;
import expresscorreos.model.Calle;


public class Main {
    // @TODO: Sustituya xxxx por los parámetros de su conexión

    private static final String DB_SERVER = "xxxx";

    private static final int DB_PORT = 3306;

    private static final String DB_NAME = "xxxx";

    private static final String DB_USER = "xxxx";

    private static final String DB_PASS = "xxxx";

    private static Connection conn;

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://" + DB_SERVER + ":" + DB_PORT + "/" + DB_NAME;
        conn = DriverManager.getConnection(url, DB_USER, DB_PASS);

        // @TODO pruebe sus funciones
        nuevoCartero("12345678B","Pedro","Perez");
        carterosRepartoCochePeriodo(7);
        oficinasAsociadasCalle("Alcala");
        cochesSinUtilizarPeriodo(30);

        conn.close();
    }

    // @TODO resuelva las siguientes funciones...

    public static void nuevoCartero(String DNI, String nombre, String apellidos) {
        // @TODO: complete este método para que cree un nuevo cartero en la base de datos

    }

    public static List<Cartero> carterosRepartoCochePeriodo(int periodo) {
        // @TODO: complete este método para que muestre por pantalla una lista de carteros que han
        // realizado un reparto con coche en el periodo comprendido por los últimos "periodo" días
        // (implementar para periodo=7)
        // Tenga en cuenta que la consulta a la base de datos le devolverá un ResultSet sobre el que deberá
        // ir iterando y creando un objeto con cada Cartero que cumpla con las condiciones,
        // y añadirlos a la lista

        return lista;
    }

    public static List<Oficina> oficinasAsociadasCalle(String calle) {
        // @TODO: complete este método para que muestre por pantalla una lista de las oficinas que
        // dan servicio a la C/Alcalá de Madrid.
        // Tenga en cuenta que la consulta a la base de datos le devolverá un ResultSet sobre el que deberá
        // ir iterando y creando un objeto con cada Oficina que tenga asociada algún segmento de esa calle,
        // y añadirlos a la lista

        return lista;
    }

    public static String cochesSinUtilizarPeriodo(int periodo) {
        // @TODO: complete este método para que muestre por pantalla una lista de los coches que no se han
        // utilizado en los últimos "periodo" días (implementar para periodo=30)

        return lista;
    }

}
