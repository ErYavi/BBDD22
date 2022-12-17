package expresscorreos.model;

public class Calle {

    private String NMunicipio;
    private String NCalle;

    public Calle(String NMunicipio,String NCalle){
        this.NCalle=NCalle;
        this.NMunicipio=NMunicipio;
    }

    public String getNMunicipio() {
        return NMunicipio;
    }

    public String getNCalle() {
        return NCalle;
    }
}
