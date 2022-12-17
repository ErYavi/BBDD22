package expresscorreos.model;

/**
 * Modela un cartero. No es necesario modificar esta clase. Pero debe crear tantas clases como entidades
 * necesite para llevar a cabo esta parte del hito 3. Inclúyalas en el paquete "expresscorreos.model"
 */
public class Cartero {

    private String DNI_Car;
    private String nombre;
    private String apellidos;

    public Cartero(String DNI, String nombre, String apellidos) {
        this.DNI_Car = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getDNI_Car() {
        return this.DNI_Car;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }
}
