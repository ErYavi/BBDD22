package expresscorreos.model;

public class Coche {

    private float capacidad;
    private String matricula;
    private String Cod_O;

    public Coche(float capacidad,String matricula,String Cod_O){
        this.capacidad=capacidad;
        this.matricula=matricula;
        this.Cod_O=Cod_O;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public String getCod_O() {
        return Cod_O;
    }

    public String getMatricula() {
        return matricula;
    }
}
