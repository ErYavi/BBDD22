import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

    private static final String DB_SERVER = "localhost";

    private static final int DB_PORT = 3306;

    private static final String DB_NAME = "Correos";

    private static final String DB_USER = "root";

    private static final String DB_PASS = "";

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
        try{
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Cartero (DNI_Car, Nom_C, Apellidos_C) VALUES (?, ?, ?)");
            stmt.setString(1, DNI);
            stmt.setString(2, nombre);
            stmt.setString(3, apellidos);
            stmt.executeUpdate();
        }catch (SQLException exception){
            System.out.println(exception.getMessage());
        }
    }

    public static List<Cartero> carterosRepartoCochePeriodo(int periodo) {
        // @TODO: complete este método para que muestre por pantalla una lista de carteros que han
        // realizado un reparto con coche en el periodo comprendido por los últimos "periodo" días
        // (implementar para periodo=7)
        // Tenga en cuenta que la consulta a la base de datos le devolverá un ResultSet sobre el que deberá
        // ir iterando y creando un objeto con cada Cartero que cumpla con las condiciones,
        // y añadirlos a la lista
        System.out.println("carterosRepartoCochePeriodo");
        ArrayList<Cartero> lista = new ArrayList<Cartero>();
        try{
            int anio = 2022, mes = 10, dia = 6;
            if(mes > 1){
                if(dia > periodo)
                    dia -= periodo;
                else if(mes == 3){
                    periodo -= dia;
                    mes--;
                    dia = 28;
                    dia -= periodo;
                }else if(mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11){
                    periodo -= dia;
                    mes--;
                    dia = 31;
                    dia -= periodo;
                }else if(mes == 5 || mes == 7 || mes == 10 || mes == 12){
                    periodo -= dia;
                    mes--;
                    dia = 31;
                    dia -= periodo;
                }
            }else if(dia > periodo)
                dia -= periodo;
            else{
                anio--;
                mes = 12;
                periodo -= dia;
                dia = 31;
                dia -= periodo;
            }
            String s = anio + "-" + mes + "-" + dia;
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Cartero WHERE Cartero.DNI_Car IN (SELECT DNI_Car FROM Reparto WHERE FechaR > ?)");
            stmt.setString(1, s);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                String DNI = rs.getString("DNI_Car");
                String nombre = rs.getString("Nom_C");
                String apellidos = rs.getString("Apellidos_C");
                lista.add(new Cartero(DNI, nombre, apellidos));
            }
            for (int i = 0; i < lista.size(); i++){
                System.out.println((i+1) + ":");
                System.out.println(lista.get(i).getNombre() + " " + lista.get(i).getApellidos() + ", " + lista.get(i).getDNI_Car());
            }
        }catch (SQLException exception){
            System.out.println(exception.getMessage());
        }
        return lista;
    }

    public static List<Oficina> oficinasAsociadasCalle(String calle) {
        // @TODO: complete este método para que muestre por pantalla una lista de las oficinas que
        // dan servicio a la C/Alcalá de Madrid.
        // Tenga en cuenta que la consulta a la base de datos le devolverá un ResultSet sobre el que deberá
        // ir iterando y creando un objeto con cada Oficina que tenga asociada algún segmento de esa calle,
        // y añadirlos a la lista
        System.out.println("\noficinasAsociadasCalle");
        ArrayList<Oficina> lista = new ArrayList<>();
        String municipio = "Madrid";
        try{
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Oficina WHERE Oficina.Cod_O IN (SELECT Area_envio.Cod_O FROM Area_envio WHERE Area_envio.ID_Area IN (SELECT Area_Incluye_Seg.ID_Area FROM Area_Incluye_Seg WHERE Area_Incluye_Seg.ID_Seg IN (SELECT ID_Seg FROM Segmento WHERE Segmento.NCalle LIKE ? AND Segmento.NMunicipio LIKE ?)))");
            stmt.setString(1,calle);
            stmt.setString(2,municipio);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                String Cod_O = rs.getString("Cod_O");
                String NMunicipio = rs.getString("Nmunicipio");
                String Cod_CC = rs.getString("Cod_CC");
                lista.add(new Oficina(Cod_O,NMunicipio,Cod_CC));
            }
            for (int i = 0; i < lista.size(); i++){
                System.out.println((i+1) + ":");
                System.out.println(lista.get(i).getCod_O() + ", " + lista.get(i).getNMunicipio() + ", " + lista.get(i).getCod_CC());
            }
            if (lista.size() == 0)
                System.out.println("");
        }catch (SQLException exception){
            System.out.println(exception.getMessage());
        }
        return lista;
    }

    public static String cochesSinUtilizarPeriodo(int periodo) {
        // @TODO: complete este método para que muestre por pantalla una lista de los coches que no se han
        // utilizado en los últimos "periodo" días (implementar para periodo=30)
        System.out.println("cochesSinUtilizarPeriodo");
        String lista = new String();
        try{
            int anio = 2022, mes = 10, dia = 2;
            if(mes > 1) {
                if (dia > periodo)
                    dia -= periodo;
                else if (mes == 3) {
                    periodo -= dia;
                    mes--;
                    dia = 28;
                    dia -= periodo;
                } else if (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                    periodo -= dia;
                    mes--;
                    dia = 31;
                    dia -= periodo;
                } else if (mes == 5 || mes == 7 || mes == 10 || mes == 12) {
                    periodo -= dia;
                    mes--;
                    dia = 31;
                    dia -= periodo;
                }
            }else if(dia > periodo)
                dia -= periodo;
            String s = anio + "-" + mes + "-" + dia;
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Coche WHERE Coche.Matricula IN (SELECT Reparto.Matricula FROM Reparto WHERE Reparto.FechaR > ?)");
            stmt.setString(1,s);
            ResultSet rs = stmt.executeQuery();
            int i = 1;
            while(rs.next()){
                float Capacidad = rs.getFloat("Capacidad");
                String Matricula = rs.getString("Matricula");
                String Cod_O = rs.getString("Cod_O");
                lista = lista + "\n" + i + ":\n" + Capacidad + ", " + Matricula + ", " + Cod_O + "\n";
                i++;
            }
            System.out.println(lista);
        }catch (SQLException exception){
            System.out.println(exception.getMessage());
        }
        return lista;
    }

}
