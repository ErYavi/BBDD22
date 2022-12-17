package expresscorreos.model;

public class Reparto {

    private String ID_Reparto;
    private String Matricula;
    private String ID_Ruta;
    private String DNI_Car;
    private String FechaR;

    public Reparto(String ID_Reparto,String Matricula,String ID_Ruta, String DNI_Car,String FechaR){
        this.DNI_Car=DNI_Car;
        this.ID_Reparto=ID_Reparto;
        this.ID_Ruta=ID_Ruta;
        this.FechaR=FechaR;
        this.Matricula=Matricula;
    }

    public String getMatricula() {
        return Matricula;
    }

    public String getDNI_Car() {
        return DNI_Car;
    }

    public String getFechaR() {
        return FechaR;
    }

    public String getID_Reparto() {
        return ID_Reparto;
    }

    public String getID_Ruta() {
        return ID_Ruta;
    }

}
